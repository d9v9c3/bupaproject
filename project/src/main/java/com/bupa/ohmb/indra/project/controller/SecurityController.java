package com.bupa.ohmb.indra.project.controller;

import javax.ws.rs.core.MediaType;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bupa.ohmb.indra.project.dtosend.Rules;
import com.bupa.ohmb.indra.project.dtosend.Login;
import com.bupa.ohmb.indra.project.dtosend.Pass;
import com.bupa.ohmb.indra.project.dtosend.PassReq;
import com.bupa.ohmb.indra.project.dtosend.RPass;
import com.bupa.ohmb.indra.project.dtosend.Registrate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class SecurityController {
	private String token;

		
	@PostMapping("/token")
	public String auth(@RequestBody Login log) {

		RestTemplate restTemplate = new RestTemplate();
		String urlacces = "https://sandbox-apimgt.azure-api.net/token";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", MediaType.APPLICATION_JSON);
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
	
		//headers.add("Authorization", token);
		
		HttpEntity<String> request = new HttpEntity<String>(headers);
		
		ResponseEntity<String> response = restTemplate.exchange(urlacces, HttpMethod.POST, request, String.class);
		String responseBody = response.getBody();
		
		
		return responseBody;

	}

	@PostMapping("/registers/newRegister")
	public String newReg(@RequestBody Registrate reg) throws JsonMappingException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();
		String urlreg = "https://sandbox-apimgt.azure-api.net/registers/newRegister";

		HttpHeaders headers = new HttpHeaders();
		
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		
		HttpEntity<String> request = new HttpEntity<String>(headers);
		
		ResponseEntity<String> response = restTemplate.exchange(urlreg, HttpMethod.POST, request, String.class);
		String responseBody = response.getBody();

		
		return responseBody;

	}

	@PatchMapping("/passwords/{userId}")
	public String newPassmeth(@RequestBody RPass rp, @PathVariable("userId") String userId) {

		RestTemplate restTemplate = new RestTemplate();
		String urlnewp = "https://sandbox-apimgt.azure-api.net/passwords/" + userId;

		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(urlnewp, HttpMethod.PATCH, request, String.class);
		String responseBody = response.getBody();

		return responseBody;
	}

	@GetMapping("/passwords/rules")
	public Rules methodRules() throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String urlrule = "https://sandbox-apimgt.azure-api.net/passwords/rules";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemplate.exchange(urlrule, HttpMethod.GET, request, String.class);
		String responseBody = response.getBody();

		ObjectMapper mapper = new ObjectMapper();
		Rules myrule = new Rules();
		myrule = mapper.readValue(responseBody, Rules.class);

		return myrule;
	}
	
	@PostMapping ("​/passwords​/newPasswordRequest")
	public String newPass(@RequestBody PassReq pr) {
		RestTemplate restTemplate = new RestTemplate();
		String urlrule = "https://sandbox-apimgt.azure-api.net/passwords/newPasswordRequest";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		//headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemplate.exchange(urlrule, HttpMethod.POST, request, String.class);
		String responseBody = response.getBody();

		
		return responseBody;
	}
	
	@PostMapping("/passwords/newPassword")
	public String yournewPass(@RequestBody Pass pass) {
		
		return null;
	}
	
	@PostMapping("/accounts/activationAccount")
	public String active() {
		return null;
	}
}
