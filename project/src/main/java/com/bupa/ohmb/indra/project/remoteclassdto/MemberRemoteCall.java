
package com.bupa.ohmb.indra.project.remoteclassdto;

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
    "memberId",
    "firstName",
    "middleName",
    "maternalLastname",
    "paternalLastname",
    "lastName",
    "dob",
    "memberStatus",
    "memberStatusId",
    "premiumValue",
    "relationTypeId",
    "relationType",
    "genderId",
    "gender",
    "benefitCurrencyCode",
    "deductibleValue",
    "maximumCoverageValue",
    "plan",
    "wWperiod",
    "planDescription",
    "startDate",
    "endDate",
    "phones",
    "physicalAddress",
    "preferredEmail"
})
@Generated("jsonschema2pojo")
public class MemberRemoteCall {

    @JsonProperty("memberId")
    private Integer memberId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("maternalLastname")
    private String maternalLastname;
    @JsonProperty("paternalLastname")
    private String paternalLastname;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("memberStatus")
    private String memberStatus;
    @JsonProperty("memberStatusId")
    private Integer memberStatusId;
    @JsonProperty("premiumValue")
    private Double premiumValue;
    @JsonProperty("relationTypeId")
    private Integer relationTypeId;
    @JsonProperty("relationType")
    private String relationType;
    @JsonProperty("genderId")
    private Integer genderId;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("benefitCurrencyCode")
    private String benefitCurrencyCode;
    @JsonProperty("deductibleValue")
    private Double deductibleValue;
    @JsonProperty("maximumCoverageValue")
    private String maximumCoverageValue;
    @JsonProperty("plan")
    private String plan;
    @JsonProperty("wWperiod")
    private Boolean wWperiod;
    @JsonProperty("planDescription")
    private String planDescription;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("phones")
    private Object phones;
    @JsonProperty("physicalAddress")
    private PhysicalAddress physicalAddress;
    @JsonProperty("preferredEmail")
    private Object preferredEmail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MemberRemoteCall() {
    }

    /**
     * 
     * @param relationType
     * @param maternalLastname
     * @param lastName
     * @param gender
     * @param endDate
     * @param memberStatus
     * @param phones
     * @param wWperiod
     * @param memberStatusId
     * @param preferredEmail
     * @param maximumCoverageValue
     * @param benefitCurrencyCode
     * @param physicalAddress
     * @param plan
     * @param memberId
     * @param genderId
     * @param deductibleValue
     * @param paternalLastname
     * @param firstName
     * @param premiumValue
     * @param dob
     * @param middleName
     * @param planDescription
     * @param relationTypeId
     * @param startDate
     */
    public MemberRemoteCall(Integer memberId, String firstName, String middleName, String maternalLastname, String paternalLastname, String lastName, String dob, String memberStatus, Integer memberStatusId, Double premiumValue, Integer relationTypeId, String relationType, Integer genderId, String gender, String benefitCurrencyCode, Double deductibleValue, String maximumCoverageValue, String plan, Boolean wWperiod, String planDescription, String startDate, String endDate, Object phones, PhysicalAddress physicalAddress, Object preferredEmail) {
        super();
        this.memberId = memberId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.maternalLastname = maternalLastname;
        this.paternalLastname = paternalLastname;
        this.lastName = lastName;
        this.dob = dob;
        this.memberStatus = memberStatus;
        this.memberStatusId = memberStatusId;
        this.premiumValue = premiumValue;
        this.relationTypeId = relationTypeId;
        this.relationType = relationType;
        this.genderId = genderId;
        this.gender = gender;
        this.benefitCurrencyCode = benefitCurrencyCode;
        this.deductibleValue = deductibleValue;
        this.maximumCoverageValue = maximumCoverageValue;
        this.plan = plan;
        this.wWperiod = wWperiod;
        this.planDescription = planDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.phones = phones;
        this.physicalAddress = physicalAddress;
        this.preferredEmail = preferredEmail;
    }

    @JsonProperty("memberId")
    public Integer getMemberId() {
        return memberId;
    }

    @JsonProperty("memberId")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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

    @JsonProperty("maternalLastname")
    public String getMaternalLastname() {
        return maternalLastname;
    }

    @JsonProperty("maternalLastname")
    public void setMaternalLastname(String maternalLastname) {
        this.maternalLastname = maternalLastname;
    }

    @JsonProperty("paternalLastname")
    public String getPaternalLastname() {
        return paternalLastname;
    }

    @JsonProperty("paternalLastname")
    public void setPaternalLastname(String paternalLastname) {
        this.paternalLastname = paternalLastname;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    @JsonProperty("dob")
    public void setDob(String dob) {
        this.dob = dob;
    }

    @JsonProperty("memberStatus")
    public String getMemberStatus() {
        return memberStatus;
    }

    @JsonProperty("memberStatus")
    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    @JsonProperty("memberStatusId")
    public Integer getMemberStatusId() {
        return memberStatusId;
    }

    @JsonProperty("memberStatusId")
    public void setMemberStatusId(Integer memberStatusId) {
        this.memberStatusId = memberStatusId;
    }

    @JsonProperty("premiumValue")
    public Double getPremiumValue() {
        return premiumValue;
    }

    @JsonProperty("premiumValue")
    public void setPremiumValue(Double premiumValue) {
        this.premiumValue = premiumValue;
    }

    @JsonProperty("relationTypeId")
    public Integer getRelationTypeId() {
        return relationTypeId;
    }

    @JsonProperty("relationTypeId")
    public void setRelationTypeId(Integer relationTypeId) {
        this.relationTypeId = relationTypeId;
    }

    @JsonProperty("relationType")
    public String getRelationType() {
        return relationType;
    }

    @JsonProperty("relationType")
    public void setRelationType(String relationType) {
        this.relationType = relationType;
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

    @JsonProperty("benefitCurrencyCode")
    public String getBenefitCurrencyCode() {
        return benefitCurrencyCode;
    }

    @JsonProperty("benefitCurrencyCode")
    public void setBenefitCurrencyCode(String benefitCurrencyCode) {
        this.benefitCurrencyCode = benefitCurrencyCode;
    }

    @JsonProperty("deductibleValue")
    public Double getDeductibleValue() {
        return deductibleValue;
    }

    @JsonProperty("deductibleValue")
    public void setDeductibleValue(Double deductibleValue) {
        this.deductibleValue = deductibleValue;
    }

    @JsonProperty("maximumCoverageValue")
    public String getMaximumCoverageValue() {
        return maximumCoverageValue;
    }

    @JsonProperty("maximumCoverageValue")
    public void setMaximumCoverageValue(String maximumCoverageValue) {
        this.maximumCoverageValue = maximumCoverageValue;
    }

    @JsonProperty("plan")
    public String getPlan() {
        return plan;
    }

    @JsonProperty("plan")
    public void setPlan(String plan) {
        this.plan = plan;
    }

    @JsonProperty("wWperiod")
    public Boolean getwWperiod() {
        return wWperiod;
    }

    @JsonProperty("wWperiod")
    public void setwWperiod(Boolean wWperiod) {
        this.wWperiod = wWperiod;
    }

    @JsonProperty("planDescription")
    public String getPlanDescription() {
        return planDescription;
    }

    @JsonProperty("planDescription")
    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("phones")
    public Object getPhones() {
        return phones;
    }

    @JsonProperty("phones")
    public void setPhones(Object phones) {
        this.phones = phones;
    }

    @JsonProperty("physicalAddress")
    public PhysicalAddress getPhysicalAddress() {
        return physicalAddress;
    }

    @JsonProperty("physicalAddress")
    public void setPhysicalAddress(PhysicalAddress physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    @JsonProperty("preferredEmail")
    public Object getPreferredEmail() {
        return preferredEmail;
    }

    @JsonProperty("preferredEmail")
    public void setPreferredEmail(Object preferredEmail) {
        this.preferredEmail = preferredEmail;
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
