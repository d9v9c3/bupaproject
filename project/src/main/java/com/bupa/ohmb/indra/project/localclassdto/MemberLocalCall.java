
package com.bupa.ohmb.indra.project.localclassdto;





public class MemberLocalCall {

   
    private Integer memberId;
    
    private String firstName;
    
    private String middleName;
    
    private String lastName;
    
    private String dob;
    
    private String memberStatus;
    
    private Integer memberStatusId;
    
    private Double premiumValue;
    
    private Integer relationTypeId;
    
    private String relationType;
    
    private Integer genderId;
    
    private String gender;
    
    private String benefitCurrencyCode;
    
    private Double deductibleValue;
   
    private String maximumCoverageValue;
    
    private String plan;
    
    private Boolean wWperiod;
    
    private String planDescription;
 
    private String startDate;
   
    private String endDate;
    

   
    public MemberLocalCall() {
    }

    public MemberLocalCall(Integer memberId, String firstName, String middleName,
    		String lastName, String dob, String memberStatus, Integer memberStatusId,
    		Double premiumValue, Integer relationTypeId, String relationType, Integer genderId, 
    		String gender, String benefitCurrencyCode, Double deductibleValue, String maximumCoverageValue, 
    		String plan, Boolean wWperiod, String planDescription, String startDate, String endDate) {
        super();
        this.memberId = memberId;
        this.firstName = firstName;
        this.middleName = middleName;
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
    }

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	public Integer getMemberStatusId() {
		return memberStatusId;
	}

	public void setMemberStatusId(Integer memberStatusId) {
		this.memberStatusId = memberStatusId;
	}

	public Double getPremiumValue() {
		return premiumValue;
	}

	public void setPremiumValue(Double premiumValue) {
		this.premiumValue = premiumValue;
	}

	public Integer getRelationTypeId() {
		return relationTypeId;
	}

	public void setRelationTypeId(Integer relationTypeId) {
		this.relationTypeId = relationTypeId;
	}

	public String getRelationType() {
		return relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public Integer getGenderId() {
		return genderId;
	}

	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBenefitCurrencyCode() {
		return benefitCurrencyCode;
	}

	public void setBenefitCurrencyCode(String benefitCurrencyCode) {
		this.benefitCurrencyCode = benefitCurrencyCode;
	}

	public Double getDeductibleValue() {
		return deductibleValue;
	}

	public void setDeductibleValue(Double deductibleValue) {
		this.deductibleValue = deductibleValue;
	}

	public String getMaximumCoverageValue() {
		return maximumCoverageValue;
	}

	public void setMaximumCoverageValue(String maximumCoverageValue) {
		this.maximumCoverageValue = maximumCoverageValue;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public Boolean getwWperiod() {
		return wWperiod;
	}

	public void setwWperiod(Boolean wWperiod) {
		this.wWperiod = wWperiod;
	}

	public String getPlanDescription() {
		return planDescription;
	}

	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

    
}
