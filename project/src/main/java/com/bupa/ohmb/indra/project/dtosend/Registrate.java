
package com.bupa.ohmb.indra.project.dtosend;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "policyId",
    "email",
    "memberId",
    "groupId",
    "relationTypeId",
    "genderId",
    "deviceId",
    "deviceIp",
    "firstName",
    "middleName",
    "paternalLastName",
    "maternalLastName",
    "lastName",
    "birthDate",
    "rfc",
    "curp",
    "areaCodeId",
    "phoneNumber",
    "pass"
})
@Generated("jsonschema2pojo")
public class Registrate {

    @JsonProperty("policyId")
    private Integer policyId;
    @JsonProperty("email")
    private String email;
    @JsonProperty("memberId")
    private Integer memberId;
    @JsonProperty("groupId")
    private Integer groupId;
    @JsonProperty("relationTypeId")
    private Integer relationTypeId;
    @JsonProperty("genderId")
    private Integer genderId;
    @JsonProperty("deviceId")
    private String deviceId;
    @JsonProperty("deviceIp")
    private String deviceIp;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("paternalLastName")
    private String paternalLastName;
    @JsonProperty("maternalLastName")
    private String maternalLastName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("rfc")
    private String rfc;
    @JsonProperty("curp")
    private String curp;
    @JsonProperty("areaCodeId")
    private Integer areaCodeId;
    @JsonProperty("phoneNumber")
    private Long phoneNumber;
    @JsonProperty("pass")
    private String pass;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Registrate() {
    }

    /**
     * 
     * @param deviceIp
     * @param lastName
     * @param pass
     * @param groupId
     * @param genderId
     * @param deviceId
     * @param birthDate
     * @param rfc
     * @param maternalLastName
     * @param firstName
     * @param phoneNumber
     * @param policyId
     * @param areaCodeId
     * @param paternalLastName
     * @param middleName
     * @param relationTypeId
     * @param email
     * @param curp
     * @param memberId
     */
    public Registrate(Integer policyId, String email, Integer memberId, Integer groupId, Integer relationTypeId, Integer genderId, String deviceId, String deviceIp, String firstName, String middleName, String paternalLastName, String maternalLastName, String lastName, String birthDate, String rfc, String curp, Integer areaCodeId, Long phoneNumber, String pass) {
        super();
        this.policyId = policyId;
        this.email = email;
        this.memberId = memberId;
        this.groupId = groupId;
        this.relationTypeId = relationTypeId;
        this.genderId = genderId;
        this.deviceId = deviceId;
        this.deviceIp = deviceIp;
        this.firstName = firstName;
        this.middleName = middleName;
        this.paternalLastName = paternalLastName;
        this.maternalLastName = maternalLastName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.rfc = rfc;
        this.curp = curp;
        this.areaCodeId = areaCodeId;
        this.phoneNumber = phoneNumber;
        this.pass = pass;
    }

    @JsonProperty("policyId")
    public Integer getPolicyId() {
        return policyId;
    }

    @JsonProperty("policyId")
    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("memberId")
    public Integer getMemberId() {
        return memberId;
    }

    @JsonProperty("memberId")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @JsonProperty("groupId")
    public Integer getGroupId() {
        return groupId;
    }

    @JsonProperty("groupId")
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("relationTypeId")
    public Integer getRelationTypeId() {
        return relationTypeId;
    }

    @JsonProperty("relationTypeId")
    public void setRelationTypeId(Integer relationTypeId) {
        this.relationTypeId = relationTypeId;
    }

    @JsonProperty("genderId")
    public Integer getGenderId() {
        return genderId;
    }

    @JsonProperty("genderId")
    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    @JsonProperty("deviceId")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("deviceId")
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @JsonProperty("deviceIp")
    public String getDeviceIp() {
        return deviceIp;
    }

    @JsonProperty("deviceIp")
    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("rfc")
    public String getRfc() {
        return rfc;
    }

    @JsonProperty("rfc")
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @JsonProperty("curp")
    public String getCurp() {
        return curp;
    }

    @JsonProperty("curp")
    public void setCurp(String curp) {
        this.curp = curp;
    }

    @JsonProperty("areaCodeId")
    public Integer getAreaCodeId() {
        return areaCodeId;
    }

    @JsonProperty("areaCodeId")
    public void setAreaCodeId(Integer areaCodeId) {
        this.areaCodeId = areaCodeId;
    }

    @JsonProperty("phoneNumber")
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("pass")
    public String getPass() {
        return pass;
    }

    @JsonProperty("pass")
    public void setPass(String pass) {
        this.pass = pass;
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
