package com.bupa.ohmb.indra.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.SessionScope;

import com.bupa.ohmb.indra.project.localclassdto.MemberLocalCall;
import com.bupa.ohmb.indra.project.remoteclassdto.MemberCardRemote;
import com.bupa.ohmb.indra.project.remoteclassdto.MemberRemoteCall;
import com.bupa.ohmb.indra.project.remoteclassdto.MsgClass;
import com.bupa.ohmb.indra.project.remoteclassdto.PolicyRemote;
import com.bupa.ohmb.indra.project.security.Authentication;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;



@RestController
public class PolicyResponse {

	//Authentication auth = new Authentication();
	String token = "";

	@GetMapping("/policies/{policyId}")
	public PolicyRemote getByPolicy(@PathVariable("policyId") int policyId, @Context HttpHeaders headers)
			throws JsonMappingException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();
		PolicyRemote mypol = new PolicyRemote();
		String urlpolicy = "https://sandbox-apimgt.azure-api.net/policies/" + policyId;
		//HttpHeaders headers = new HttpHeaders();
		//headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		//headers.add("Authorization", token.getAuth());
		HttpEntity<String> request = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemplate.exchange(urlpolicy, HttpMethod.GET, request, String.class);
		if (response.getStatusCodeValue() == 404) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
		if (response.getStatusCodeValue() == 401) {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}
		String responseBody = response.getBody();

		ObjectMapper mapper = new ObjectMapper();

		mypol = mapper.readValue(responseBody, PolicyRemote.class);

		return mypol;

	}

	@GetMapping("/policies/{policyId}/validate") // devolver campo completo
	public boolean getValidate(@PathVariable("policyId") int policyId, @Context HttpHeaders headers)
			throws JsonMappingException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();
		PolicyRemote mypol = new PolicyRemote();
		String urlvalid = "https://sandbox-apimgt.azure-api.net/policies/" + policyId + "/validate";

		
		HttpEntity<String> request = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemplate.exchange(urlvalid, HttpMethod.GET, request, String.class);
		if (response.getStatusCodeValue() == 404) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
		if (response.getStatusCodeValue() == 401) {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}
		String responseBody = response.getBody();

		ObjectMapper mapper = new ObjectMapper();
		mypol = mapper.readValue(responseBody, PolicyRemote.class);

		return mypol.getIsGroupPolicy();

	}

	@GetMapping("/policies/{policyId}/members/searchValidMembers")
	public ArrayList<MemberLocalCall> valid(@PathVariable("policyId") int policyId, @RequestParam String dob,
			@RequestParam String issueDate) throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String urlvalidm = "https://sandbox-apimgt.azure-api.net/policies/" + policyId
				+ "/members/searchValidMembers?dob=" + dob + "&issueDate=" + issueDate;
		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(urlvalidm, HttpMethod.GET, request, String.class);
		if (response.getStatusCodeValue() == 404) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
		if (response.getStatusCodeValue() == 401) {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}
		String responseBody = response.getBody();
		ObjectMapper JSON_MAPPER = new ObjectMapper();

		ArrayList<MemberLocalCall> validMember = JSON_MAPPER.readValue(responseBody,
				JSON_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, MemberLocalCall.class));

		return validMember;
	}

	@GetMapping("/policies/{policyId}/members/{memberId}")
	public MemberLocalCall getPolMember(@PathVariable("policyId") int policyId, @PathVariable("memberId") int memberId)
			throws JsonMappingException, JsonProcessingException {

		RestTemplate restTemplate = new RestTemplate();
		String urlmembers = "https://sandbox-apimgt.azure-api.net/policies/" + policyId + "/members/" + memberId;

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

		ObjectMapper mapper = new ObjectMapper();
		MemberRemoteCall myremote = new MemberRemoteCall();
		myremote = mapper.readValue(responseBody, MemberRemoteCall.class);

		MemberLocalCall mymember = new MemberLocalCall(myremote.getMemberId(), myremote.getFirstName(),
				myremote.getMiddleName(), myremote.getLastName(), myremote.getDob(), myremote.getMemberStatus(),
				myremote.getMemberStatusId(), myremote.getPremiumValue(), myremote.getRelationTypeId(),
				myremote.getRelationType(), myremote.getGenderId(), myremote.getGender(),
				myremote.getBenefitCurrencyCode(), myremote.getDeductibleValue(), myremote.getMaximumCoverageValue(),
				myremote.getPlan(), myremote.getwWperiod(), myremote.getPlanDescription(), myremote.getStartDate(),
				myremote.getEndDate());

		return mymember;

	}

	@GetMapping("policies/{policyId}/members/{memberId}/card")
	public MemberCardRemote getCardmember(@PathVariable("policyId") int policyId,
			@PathVariable("memberId") int memberId) throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String urlcard = "https://sandbox-apimgt.azure-api.net/policies/" + policyId + "/members/" + memberId + "/card";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Ocp-Apim-Subscription-Key", "d90d521804c84fcf86f130a31c5dfdeb");
		headers.add("Authorization", token);

		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(urlcard, HttpMethod.GET, request, String.class);
		if (response.getStatusCodeValue() == 404) {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
		if (response.getStatusCodeValue() == 401) {
			throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
		}
		String responseBody = response.getBody();

		ObjectMapper mapper = new ObjectMapper();
		MemberCardRemote mycard = new MemberCardRemote();
		mycard = mapper.readValue(responseBody, MemberCardRemote.class);

		return mycard;
	}
	@ExceptionHandler
	public String handleHttpClientErrorException(HttpClientErrorException exception) {
		return exception.getMessage();
	}
}
