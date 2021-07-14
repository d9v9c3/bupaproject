package com.bupa.ohmb.indra.project.security;

import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.http.ResponseEntity;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import org.springframework.web.client.RestTemplate;

public class Authentication {

	public Authentication() {

	}

	public String getAuth() {

		RestTemplate restTemplate = new RestTemplate();

		String url = "https://sandbox-apimgt.azure-api.net/login/login";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED);

		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("client_id", "oh_mobile");
		map.add("deviceId", "76");
		map.add("deviceIp", "99.8355");
		map.add("login", "jimmy@rowland.com");
		map.add("password", "cGFzc3dvcmQ");
		map.add("client_secret", "ee55d544-c947-4235-aada-ad8962cbe8dd");

		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, headers);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
		String responseBody = response.getBody();

		return responseBody;

	}

}
