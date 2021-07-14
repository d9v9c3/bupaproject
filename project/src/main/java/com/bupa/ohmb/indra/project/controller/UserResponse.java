package com.bupa.ohmb.indra.project.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.SessionScope;

import com.bupa.ohmb.indra.project.localclassdto.UsersLocal;
import com.bupa.ohmb.indra.project.remoteclassdto.*;
import com.bupa.ohmb.indra.project.security.Authentication;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserResponse {

	//Authentication auth = new Authentication();
	String token = "";

	// private Authentication token;

	@GetMapping("/users")
	public ResponseEntity<UsersLocal> userInfo(String email, @Context HttpHeaders headers) throws JsonMappingException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();

		String url = "https://sandbox-apimgt.azure-api.net/users?email=" + email;
		
		HttpEntity<String> request = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
		
		if (response.getStatusCodeValue() == 404) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
		if (response.getStatusCodeValue() == 401) {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}

		String responseBody = response.getBody();

		ObjectMapper mapper = new ObjectMapper();
		UsersRemote myremoteuser = new UsersRemote();
		myremoteuser = mapper.readValue(responseBody, UsersRemote.class);

		UsersLocal mylocaluser = new UsersLocal(myremoteuser.getUserId(), myremoteuser.getPolicyId(),
				myremoteuser.getMemberId(), myremoteuser.getFirstName(), myremoteuser.getMiddleName(),
				myremoteuser.getLastName(), myremoteuser.getBirthDate(), myremoteuser.getIsSharingInfo());

		return new ResponseEntity(mylocaluser, HttpStatus.OK);

	}

	@GetMapping("/users/{userId}")
	public ResponseEntity<UsersLocal> userInfoId(@PathVariable("userId") String userId)
			throws JsonMappingException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();
		String urlusers = "https://sandbox-apimgt.azure-api.net/users/" + userId;

		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemplate.exchange(urlusers, HttpMethod.GET, request, String.class);
		if (response.getStatusCodeValue() == 404) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
		if (response.getStatusCodeValue() == 401) {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}
		String responseBody = response.getBody();

		ObjectMapper mapper = new ObjectMapper();
		UsersRemote myremoteuser = new UsersRemote();
		myremoteuser = mapper.readValue(responseBody, UsersRemote.class);

		UsersLocal mylocaluser = new UsersLocal(myremoteuser.getUserId(), myremoteuser.getPolicyId(),
				myremoteuser.getMemberId(), myremoteuser.getFirstName(), myremoteuser.getMiddleName(),
				myremoteuser.getLastName(), myremoteuser.getBirthDate(), myremoteuser.getIsSharingInfo());

		return new ResponseEntity(mylocaluser, HttpStatus.OK);

	}

	@GetMapping("/users/{userId}/roles")
	public ResponseEntity<ArrayList<Role>> userInfoRoles(@PathVariable("userId") String userId)
			throws JsonMappingException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();
		String urlroles = "https://sandbox-apimgt.azure-api.net/users/" + userId + "/roles";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemplate.exchange(urlroles, HttpMethod.GET, request, String.class);
		if (response.getStatusCodeValue() == 404) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
		if (response.getStatusCodeValue() == 401) {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}
		String responseBody = response.getBody();

		ObjectMapper JSON_MAPPER = new ObjectMapper();

		ArrayList<Role> myrol = JSON_MAPPER.readValue(responseBody,
				JSON_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, Role.class));

		return new ResponseEntity(myrol, HttpStatus.OK);

	}

	@GetMapping("users/{userId}/permissions")
	public ResponseEntity<ArrayList<Permission>> permissions(@PathVariable("userId") String userId) throws IOException {
		RestTemplate restTemplate = new RestTemplate();

		String urlpermissions = "https://sandbox-apimgt.azure-api.net/users/" + userId + "/permissions";
		System.out.println(urlpermissions);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemplate.exchange(urlpermissions, HttpMethod.GET, request, String.class);
		if (response.getStatusCodeValue() == 404) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
		if (response.getStatusCodeValue() == 401) {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}
		String responseBody = response.getBody();

		ObjectMapper JSON_MAPPER = new ObjectMapper();
		ArrayList<Permission> myper = JSON_MAPPER.readValue(responseBody,
				JSON_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, Permission.class));

		return new ResponseEntity(myper, HttpStatus.OK);

	}

	@GetMapping("users/{userId}/members")
	public ResponseEntity<ArrayList<UserMemberRemote>> members(@PathVariable("userId") String userId)
			throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();

		String urlmembers = "https://sandbox-apimgt.azure-api.net/users/" + userId + "/members";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemplate.exchange(urlmembers, HttpMethod.GET, request, String.class);
		if (response.getStatusCodeValue() == 404) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
		if (response.getStatusCodeValue() == 401) {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}
		String responseBody = response.getBody();

		ObjectMapper JSON_MAPPER = new ObjectMapper();
		ArrayList<UserMemberRemote> remotemember = JSON_MAPPER.readValue(responseBody,
				JSON_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, UserMemberRemote.class));

		return new ResponseEntity(remotemember, HttpStatus.OK);

	}

	@PatchMapping("users/{userId}/shareInfo") // por contrastar no viene en el

	public ResponseEntity<String> shareInfo(@PathVariable("userId") String userId)
			throws JsonMappingException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();

		String urlshinfo = "https://sandbox-apimgt.azure-api.net/users/" + userId + "/shareInfo";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemplate.exchange(urlshinfo, HttpMethod.PATCH, request, String.class);
		if (response.getStatusCodeValue() == 404) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
		if (response.getStatusCodeValue() == 401) {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}
		String responsebody = response.getBody();
		ObjectMapper JSON_MAPPER = new ObjectMapper();
		JSON_MAPPER.readValue(responsebody, String.class);

		return new ResponseEntity(JSON_MAPPER, HttpStatus.OK);

	}

	@ExceptionHandler
	public String handleHttpClientErrorException(HttpClientErrorException exception) {
		return exception.getMessage();
	}

}