package com.bupa.ohmb.indra.project.interceptor;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.bupa.ohmb.indra.project.security.Authentication;

@WebFilter("/*")
public class AddResponseHeaderFilter implements Filter {

	public LocalTime timeReg;
	public int sectime;
	public String atoken;
	public int expires;
	public String rtoken;
	public String typetoken;
	public int caducidad;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		Authentication responseAuth = new Authentication();
		if (timeReg == null) {
			String resAuth = responseAuth.getAuth();
			timeReg = LocalTime.now();
			sectime = timeReg.toSecondOfDay();
			System.out.println(sectime);
			if (resAuth != null) {
				JSONObject ojsonBody = new JSONObject(resAuth);
				// obtengo las propiedades
				atoken = (String) ojsonBody.get("access_token");
				System.out.println("tienes asignado un token");
				expires = (int) ojsonBody.get("expires_in");
				rtoken = (String) ojsonBody.get("refresh_token");
				typetoken = (String) ojsonBody.get("token_type");

				caducidad = sectime + expires;

				HttpServletResponse httpServletResponse = (HttpServletResponse) response;
				httpServletResponse.setHeader("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
				httpServletResponse.setHeader("Authorization", typetoken + " " + atoken);

				chain.doFilter(request, response);
			

			}

		} else if (timeReg != null && sectime < caducidad) {
			System.out.println("tu token no cambia y sigue siendo:..." + atoken);
			HttpServletResponse httpServletResponse = (HttpServletResponse) response;
			httpServletResponse.setHeader("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
			httpServletResponse.setHeader("Authorization", typetoken + " " + atoken);

			chain.doFilter(request, response);
			
		} else {
			System.out.println("El token ha caducado");
			System.out.println("Ahora tienes el refresh " + rtoken);
		}

		
		
		
		
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// ...
	}

	@Override
	public void destroy() {
		// ...
	}

}
