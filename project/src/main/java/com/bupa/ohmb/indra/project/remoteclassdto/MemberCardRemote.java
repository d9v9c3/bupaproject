
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
    "member",
    "policyId",
    "policy",
    "CardName",
    "effectiveDate",
    "Front",
    "Back"
})
@Generated("jsonschema2pojo")
public class MemberCardRemote {

    @JsonProperty("memberId")
    private Integer memberId;
    @JsonProperty("member")
    private String member;
    @JsonProperty("policyId")
    private Integer policyId;
    @JsonProperty("policy")
    private String policy;
    @JsonProperty("CardName")
    private String cardName;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("Front")
    private String front;
    @JsonProperty("Back")
    private String back;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MemberCardRemote() {
    }

    /**
     * 
     * @param policyId
     * @param cardName
     * @param member
     * @param back
     * @param front
     * @param effectiveDate
     * @param memberId
     * @param policy
     */
    public MemberCardRemote(Integer memberId, String member, Integer policyId, String policy, String cardName, String effectiveDate, String front, String back) {
        super();
        this.memberId = memberId;
        this.member = member;
        this.policyId = policyId;
        this.policy = policy;
        this.cardName = cardName;
        this.effectiveDate = effectiveDate;
        this.front = front;
        this.back = back;
    }

    @JsonProperty("memberId")
    public Integer getMemberId() {
        return memberId;
    }

    @JsonProperty("memberId")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @JsonProperty("member")
    public String getMember() {
        return member;
    }

    @JsonProperty("member")
    public void setMember(String member) {
        this.member = member;
    }

    @JsonProperty("policyId")
    public Integer getPolicyId() {
        return policyId;
    }

    @JsonProperty("policyId")
    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    @JsonProperty("policy")
    public String getPolicy() {
        return policy;
    }

    @JsonProperty("policy")
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    @JsonProperty("CardName")
    public String getCardName() {
        return cardName;
    }

    @JsonProperty("CardName")
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("Front")
    public String getFront() {
        return front;
    }

    @JsonProperty("Front")
    public void setFront(String front) {
        this.front = front;
    }

    @JsonProperty("Back")
    public String getBack() {
        return back;
    }

    @JsonProperty("Back")
    public void setBack(String back) {
        this.back = back;
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
