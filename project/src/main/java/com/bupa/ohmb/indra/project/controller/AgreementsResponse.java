package com.bupa.ohmb.indra.project.controller;

import java.util.ArrayList;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bupa.ohmb.indra.project.localclassdto.AgreementCollect;
import com.bupa.ohmb.indra.project.localclassdto.AgreementsLocal;
import com.bupa.ohmb.indra.project.remoteclassdto.LanguageRemote;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class AgreementsResponse {

	

	private String token = "Bearer " ;
	
	@GetMapping("/agreements")
	public ArrayList<AgreementsLocal> getAgreements() throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://sandbox-apimgt.azure-api.net/agreements?language=es-MX&applicationId=1";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
		String responseBody = response.getBody();

		ObjectMapper JSON_MAPPER = new ObjectMapper();
		ArrayList<AgreementsLocal> agree = JSON_MAPPER.readValue(responseBody,
				JSON_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, AgreementsLocal.class));

		return agree;
	}

	@GetMapping("/agreements/{agreementId}")
	public LanguageRemote languageMeth(@PathVariable("agreementId") int agreementId, @RequestParam String language)
			throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String urlSec = "https://sandbox-apimgt.azure-api.net/agreements/" + agreementId + "?language=" + language;

		HttpHeaders headers = new HttpHeaders();
		
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(urlSec, HttpMethod.GET, request, String.class);
		String responseBody = response.getBody();

		ObjectMapper mapper = new ObjectMapper();
		LanguageRemote lang = new LanguageRemote();
		lang = mapper.readValue(responseBody, LanguageRemote.class);

		return lang;
	}

	@GetMapping("/agreements/{agreementId}/versions")
	public String versions(@PathVariable("agreementId") int agreementId) {
		RestTemplate restTemplate = new RestTemplate();
		String urlS = "https://sandbox-apimgt.azure-api.net/agreements/" + agreementId + "/versions";

		HttpHeaders headers = new HttpHeaders();
		
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(urlS, HttpMethod.GET, request, String.class);
		String responseBody = response.getBody();

		return responseBody;
	}

	@GetMapping("/users/{userId}/agreements")
	public String userAgreementsmeth(@PathVariable("userId") String userId, @RequestParam int applicationId) {
		RestTemplate restTemplate = new RestTemplate();
		String urlSec = "https://sandbox-apimgt.azure-api.net/users/" + userId + "/agreements?applicationId="
				+ applicationId;
		System.out.println(urlSec);
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(urlSec, HttpMethod.GET, request, String.class);
		String responseBody = response.getBody();

		return responseBody;
	}

	@PostMapping("/users/{userId}/agreements")
	public String userAgreePost(@PathVariable("userId") String userId,
			@RequestBody ArrayList<AgreementCollect> ag) throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String urlSec = "https://sandbox-apimgt.azure-api.net/users/" + userId + "/agreements";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(urlSec, HttpMethod.GET, request, String.class);
		String responseBody = response.getBody();
		
		
		return responseBody;
	}

}
