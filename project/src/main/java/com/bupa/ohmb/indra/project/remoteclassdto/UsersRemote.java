package com.bupa.ohmb.indra.project.remoteclassdto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "userId", "policyId", "memberId", "roles", "firstName", "lastName", "middleName",
		"paternalLastName", "maternalLastName", "genderId", "gender", "birthDate", "isInsured", "isSharingInfo" })
@Generated("jsonschema2pojo")
public class UsersRemote {

	@JsonProperty("userId")
	private String userId;
	@JsonProperty("policyId")
	private Integer policyId;
	@JsonProperty("memberId")
	private Integer memberId;
	@JsonProperty("roles")
	private List<Role> roles = null;
	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("lastName")
	private String lastName;
	@JsonProperty("middleName")
	private String middleName;
	@JsonProperty("paternalLastName")
	private String paternalLastName;
	@JsonProperty("maternalLastName")
	private String maternalLastName;
	@JsonProperty("genderId")
	private Integer genderId;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("birthDate")
	private String birthDate;
	@JsonProperty("isInsured")
	private Boolean isInsured;
	@JsonProperty("isSharingInfo")
	private Boolean isSharingInfo;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public UsersRemote() {
	}

	/**
	 * 
	 * @param isInsured
	 * @param lastName
	 * @param gender
	 * @param roles
	 * @param genderId
	 * @param isSharingInfo
	 * @param userId
	 * @param birthDate
	 * @param maternalLastName
	 * @param firstName
	 * @param policyId
	 * @param paternalLastName
	 * @param middleName
	 * @param memberId
	 */
	public UsersRemote(String userId, Integer policyId, Integer memberId, List<Role> roles, String firstName,
			String lastName, String middleName, String paternalLastName, String maternalLastName, Integer genderId,
			String gender, String birthDate, Boolean isInsured, Boolean isSharingInfo) {
		super();
		this.userId = userId;
		this.policyId = policyId;
		this.memberId = memberId;
		this.roles = roles;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.paternalLastName = paternalLastName;
		this.maternalLastName = maternalLastName;
		this.genderId = genderId;
		this.gender = gender;
		this.birthDate = birthDate;
		this.isInsured = isInsured;
		this.isSharingInfo = isSharingInfo;
	}

	@JsonProperty("userId")
	public String getUserId() {
		return userId;
	}

	@JsonProperty("userId")
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@JsonProperty("policyId")
	public Integer getPolicyId() {
		return policyId;
	}

	@JsonProperty("policyId")
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	@JsonProperty("memberId")
	public Integer getMemberId() {
		return memberId;
	}

	@JsonProperty("memberId")
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@JsonProperty("roles")
	public List<Role> getRoles() {
		return roles;
	}

	@JsonProperty("roles")
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("middleName")
	public String getMiddleName() {
		return middleName;
	}

	@JsonProperty("middleName")
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@JsonProperty("paternalLastName")
	public String getPaternalLastName() {
		return paternalLastName;
	}

	@JsonProperty("paternalLastName")
	public void setPaternalLastName(String paternalLastName) {
		this.paternalLastName = paternalLastName;
	}

	@JsonProperty("maternalLastName")
	public String getMaternalLastName() {
		return maternalLastName;
	}

	@JsonProperty("maternalLastName")
	public void setMaternalLastName(String maternalLastName) {
		this.maternalLastName = maternalLastName;
	}

	@JsonProperty("genderId")
	public Integer getGenderId() {
		return genderId;
	}

	@JsonProperty("genderId")
	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	@JsonProperty("gender")
	public String getGender() {
		return gender;
	}

	@JsonProperty("gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("birthDate")
	public String getBirthDate() {
		return birthDate;
	}

	@JsonProperty("birthDate")
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@JsonProperty("isInsured")
	public Boolean getIsInsured() {
		return isInsured;
	}

	@JsonProperty("isInsured")
	public void setIsInsured(Boolean isInsured) {
		this.isInsured = isInsured;
	}

	@JsonProperty("isSharingInfo")
	public Boolean getIsSharingInfo() {
		return isSharingInfo;
	}

	@JsonProperty("isSharingInfo")
	public void setIsSharingInfo(Boolean isSharingInfo) {
		this.isSharingInfo = isSharingInfo;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
