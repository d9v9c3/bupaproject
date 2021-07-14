
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
@JsonPropertyOrder({
    "policyId",
    "policyReference",
    "legacyNumber",
    "statusId",
    "policyStatus",
    "modeOfPayment",
    "modeOfPaymentId",
    "policyCountry",
    "countryId",
    "isGroupPolicy",
    "policyPremium",
    "groupId",
    "groupName",
    "currencySymbol",
    "currencyId",
    "currencyCode",
    "exchangeRate",
    "plan",
    "planId",
    "deductibleId",
    "productId",
    "productName",
    "language",
    "languageId",
    "printIdCard",
    "hasGeoBlueIdCard",
    "fixedRate",
    "planDescription",
    "insuranceBusinessId",
    "insuranceBusinessIsOnShore",
    "benefitYear",
    "referencePolicyId",
    "referenceGroupId",
    "bupaInsurances",
    "lastEffectiveDate",
    "policyDates"
})
@Generated("jsonschema2pojo")
public class PolicyGroupalRemote {

    @JsonProperty("policyId")
    private Integer policyId;
    @JsonProperty("policyReference")
    private String policyReference;
    @JsonProperty("legacyNumber")
    private String legacyNumber;
    @JsonProperty("statusId")
    private Integer statusId;
    @JsonProperty("policyStatus")
    private String policyStatus;
    @JsonProperty("modeOfPayment")
    private String modeOfPayment;
    @JsonProperty("modeOfPaymentId")
    private Integer modeOfPaymentId;
    @JsonProperty("policyCountry")
    private String policyCountry;
    @JsonProperty("countryId")
    private Integer countryId;
    @JsonProperty("isGroupPolicy")
    private Boolean isGroupPolicy;
    @JsonProperty("policyPremium")
    private Double policyPremium;
    @JsonProperty("groupId")
    private Integer groupId;
    @JsonProperty("groupName")
    private String groupName;
    @JsonProperty("currencySymbol")
    private String currencySymbol;
    @JsonProperty("currencyId")
    private Integer currencyId;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("exchangeRate")
    private Double exchangeRate;
    @JsonProperty("plan")
    private String plan;
    @JsonProperty("planId")
    private Integer planId;
    @JsonProperty("deductibleId")
    private Integer deductibleId;
    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("language")
    private String language;
    @JsonProperty("languageId")
    private Integer languageId;
    @JsonProperty("printIdCard")
    private Integer printIdCard;
    @JsonProperty("hasGeoBlueIdCard")
    private Integer hasGeoBlueIdCard;
    @JsonProperty("fixedRate")
    private Object fixedRate;
    @JsonProperty("planDescription")
    private String planDescription;
    @JsonProperty("insuranceBusinessId")
    private Integer insuranceBusinessId;
    @JsonProperty("insuranceBusinessIsOnShore")
    private Boolean insuranceBusinessIsOnShore;
    @JsonProperty("benefitYear")
    private Integer benefitYear;
    @JsonProperty("referencePolicyId")
    private String referencePolicyId;
    @JsonProperty("referenceGroupId")
    private String referenceGroupId;
    @JsonProperty("bupaInsurances")
    private Object bupaInsurances;
    @JsonProperty("lastEffectiveDate")
    private String lastEffectiveDate;
    @JsonProperty("policyDates")
    private List<PolicyDate> policyDates = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PolicyGroupalRemote() {
    }

    /**
     * 
     * @param printIdCard
     * @param modeOfPayment
     * @param groupId
     * @param isGroupPolicy
     * @param bupaInsurances
     * @param language
     * @param policyStatus
     * @param benefitYear
     * @param countryId
     * @param productName
     * @param deductibleId
     * @param referenceGroupId
     * @param policyPremium
     * @param exchangeRate
     * @param lastEffectiveDate
     * @param planId
     * @param currencyId
     * @param plan
     * @param insuranceBusinessIsOnShore
     * @param hasGeoBlueIdCard
     * @param productId
     * @param languageId
     * @param currencySymbol
     * @param policyCountry
     * @param groupName
     * @param policyId
     * @param statusId
     * @param referencePolicyId
     * @param policyReference
     * @param fixedRate
     * @param legacyNumber
     * @param planDescription
     * @param modeOfPaymentId
     * @param insuranceBusinessId
     * @param policyDates
     * @param currencyCode
     */
    public PolicyGroupalRemote(Integer policyId, String policyReference, String legacyNumber, Integer statusId, String policyStatus, String modeOfPayment, Integer modeOfPaymentId, String policyCountry, Integer countryId, Boolean isGroupPolicy, Double policyPremium, Integer groupId, String groupName, String currencySymbol, Integer currencyId, String currencyCode, Double exchangeRate, String plan, Integer planId, Integer deductibleId, Integer productId, String productName, String language, Integer languageId, Integer printIdCard, Integer hasGeoBlueIdCard, Object fixedRate, String planDescription, Integer insuranceBusinessId, Boolean insuranceBusinessIsOnShore, Integer benefitYear, String referencePolicyId, String referenceGroupId, Object bupaInsurances, String lastEffectiveDate, List<PolicyDate> policyDates) {
        super();
        this.policyId = policyId;
        this.policyReference = policyReference;
        this.legacyNumber = legacyNumber;
        this.statusId = statusId;
        this.policyStatus = policyStatus;
        this.modeOfPayment = modeOfPayment;
        this.modeOfPaymentId = modeOfPaymentId;
        this.policyCountry = policyCountry;
        this.countryId = countryId;
        this.isGroupPolicy = isGroupPolicy;
        this.policyPremium = policyPremium;
        this.groupId = groupId;
        this.groupName = groupName;
        this.currencySymbol = currencySymbol;
        this.currencyId = currencyId;
        this.currencyCode = currencyCode;
        this.exchangeRate = exchangeRate;
        this.plan = plan;
        this.planId = planId;
        this.deductibleId = deductibleId;
        this.productId = productId;
        this.productName = productName;
        this.language = language;
        this.languageId = languageId;
        this.printIdCard = printIdCard;
        this.hasGeoBlueIdCard = hasGeoBlueIdCard;
        this.fixedRate = fixedRate;
        this.planDescription = planDescription;
        this.insuranceBusinessId = insuranceBusinessId;
        this.insuranceBusinessIsOnShore = insuranceBusinessIsOnShore;
        this.benefitYear = benefitYear;
        this.referencePolicyId = referencePolicyId;
        this.referenceGroupId = referenceGroupId;
        this.bupaInsurances = bupaInsurances;
        this.lastEffectiveDate = lastEffectiveDate;
        this.policyDates = policyDates;
    }

    @JsonProperty("policyId")
    public Integer getPolicyId() {
        return policyId;
    }

    @JsonProperty("policyId")
    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    @JsonProperty("policyReference")
    public String getPolicyReference() {
        return policyReference;
    }

    @JsonProperty("policyReference")
    public void setPolicyReference(String policyReference) {
        this.policyReference = policyReference;
    }

    @JsonProperty("legacyNumber")
    public String getLegacyNumber() {
        return legacyNumber;
    }

    @JsonProperty("legacyNumber")
    public void setLegacyNumber(String legacyNumber) {
        this.legacyNumber = legacyNumber;
    }

    @JsonProperty("statusId")
    public Integer getStatusId() {
        return statusId;
    }

    @JsonProperty("statusId")
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @JsonProperty("policyStatus")
    public String getPolicyStatus() {
        return policyStatus;
    }

    @JsonProperty("policyStatus")
    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    @JsonProperty("modeOfPayment")
    public String getModeOfPayment() {
        return modeOfPayment;
    }

    @JsonProperty("modeOfPayment")
    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    @JsonProperty("modeOfPaymentId")
    public Integer getModeOfPaymentId() {
        return modeOfPaymentId;
    }

    @JsonProperty("modeOfPaymentId")
    public void setModeOfPaymentId(Integer modeOfPaymentId) {
        this.modeOfPaymentId = modeOfPaymentId;
    }

    @JsonProperty("policyCountry")
    public String getPolicyCountry() {
        return policyCountry;
    }

    @JsonProperty("policyCountry")
    public void setPolicyCountry(String policyCountry) {
        this.policyCountry = policyCountry;
    }

    @JsonProperty("countryId")
    public Integer getCountryId() {
        return countryId;
    }

    @JsonProperty("countryId")
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @JsonProperty("isGroupPolicy")
    public Boolean getIsGroupPolicy() {
        return isGroupPolicy;
    }

    @JsonProperty("isGroupPolicy")
    public void setIsGroupPolicy(Boolean isGroupPolicy) {
        this.isGroupPolicy = isGroupPolicy;
    }

    @JsonProperty("policyPremium")
    public Double getPolicyPremium() {
        return policyPremium;
    }

    @JsonProperty("policyPremium")
    public void setPolicyPremium(Double policyPremium) {
        this.policyPremium = policyPremium;
    }

    @JsonProperty("groupId")
    public Integer getGroupId() {
        return groupId;
    }

    @JsonProperty("groupId")
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("groupName")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("currencySymbol")
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    @JsonProperty("currencySymbol")
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    @JsonProperty("currencyId")
    public Integer getCurrencyId() {
        return currencyId;
    }

    @JsonProperty("currencyId")
    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("exchangeRate")
    public Double getExchangeRate() {
        return exchangeRate;
    }

    @JsonProperty("exchangeRate")
    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @JsonProperty("plan")
    public String getPlan() {
        return plan;
    }

    @JsonProperty("plan")
    public void setPlan(String plan) {
        this.plan = plan;
    }

    @JsonProperty("planId")
    public Integer getPlanId() {
        return planId;
    }

    @JsonProperty("planId")
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    @JsonProperty("deductibleId")
    public Integer getDeductibleId() {
        return deductibleId;
    }

    @JsonProperty("deductibleId")
    public void setDeductibleId(Integer deductibleId) {
        this.deductibleId = deductibleId;
    }

    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("languageId")
    public Integer getLanguageId() {
        return languageId;
    }

    @JsonProperty("languageId")
    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    @JsonProperty("printIdCard")
    public Integer getPrintIdCard() {
        return printIdCard;
    }

    @JsonProperty("printIdCard")
    public void setPrintIdCard(Integer printIdCard) {
        this.printIdCard = printIdCard;
    }

    @JsonProperty("hasGeoBlueIdCard")
    public Integer getHasGeoBlueIdCard() {
        return hasGeoBlueIdCard;
    }

    @JsonProperty("hasGeoBlueIdCard")
    public void setHasGeoBlueIdCard(Integer hasGeoBlueIdCard) {
        this.hasGeoBlueIdCard = hasGeoBlueIdCard;
    }

    @JsonProperty("fixedRate")
    public Object getFixedRate() {
        return fixedRate;
    }

    @JsonProperty("fixedRate")
    public void setFixedRate(Object fixedRate) {
        this.fixedRate = fixedRate;
    }

    @JsonProperty("planDescription")
    public String getPlanDescription() {
        return planDescription;
    }

    @JsonProperty("planDescription")
    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    @JsonProperty("insuranceBusinessId")
    public Integer getInsuranceBusinessId() {
        return insuranceBusinessId;
    }

    @JsonProperty("insuranceBusinessId")
    public void setInsuranceBusinessId(Integer insuranceBusinessId) {
        this.insuranceBusinessId = insuranceBusinessId;
    }

    @JsonProperty("insuranceBusinessIsOnShore")
    public Boolean getInsuranceBusinessIsOnShore() {
        return insuranceBusinessIsOnShore;
    }

    @JsonProperty("insuranceBusinessIsOnShore")
    public void setInsuranceBusinessIsOnShore(Boolean insuranceBusinessIsOnShore) {
        this.insuranceBusinessIsOnShore = insuranceBusinessIsOnShore;
    }

    @JsonProperty("benefitYear")
    public Integer getBenefitYear() {
        return benefitYear;
    }

    @JsonProperty("benefitYear")
    public void setBenefitYear(Integer benefitYear) {
        this.benefitYear = benefitYear;
    }

    @JsonProperty("referencePolicyId")
    public String getReferencePolicyId() {
        return referencePolicyId;
    }

    @JsonProperty("referencePolicyId")
    public void setReferencePolicyId(String referencePolicyId) {
        this.referencePolicyId = referencePolicyId;
    }

    @JsonProperty("referenceGroupId")
    public String getReferenceGroupId() {
        return referenceGroupId;
    }

    @JsonProperty("referenceGroupId")
    public void setReferenceGroupId(String referenceGroupId) {
        this.referenceGroupId = referenceGroupId;
    }

    @JsonProperty("bupaInsurances")
    public Object getBupaInsurances() {
        return bupaInsurances;
    }

    @JsonProperty("bupaInsurances")
    public void setBupaInsurances(Object bupaInsurances) {
        this.bupaInsurances = bupaInsurances;
    }

    @JsonProperty("lastEffectiveDate")
    public String getLastEffectiveDate() {
        return lastEffectiveDate;
    }

    @JsonProperty("lastEffectiveDate")
    public void setLastEffectiveDate(String lastEffectiveDate) {
        this.lastEffectiveDate = lastEffectiveDate;
    }

    @JsonProperty("policyDates")
    public List<PolicyDate> getPolicyDates() {
        return policyDates;
    }

    @JsonProperty("policyDates")
    public void setPolicyDates(List<PolicyDate> policyDates) {
        this.policyDates = policyDates;
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
