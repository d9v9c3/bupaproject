
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
    "policyDateID",
    "policyID",
    "policyDateValue",
    "policyDateName"
})
@Generated("jsonschema2pojo")
public class PolicyDate {

    @JsonProperty("policyDateID")
    private Integer policyDateID;
    @JsonProperty("policyID")
    private Integer policyID;
    @JsonProperty("policyDateValue")
    private String policyDateValue;
    @JsonProperty("policyDateName")
    private String policyDateName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PolicyDate() {
    }

    /**
     * 
     * @param policyDateName
     * @param policyID
     * @param policyDateID
     * @param policyDateValue
     */
    public PolicyDate(Integer policyDateID, Integer policyID, String policyDateValue, String policyDateName) {
        super();
        this.policyDateID = policyDateID;
        this.policyID = policyID;
        this.policyDateValue = policyDateValue;
        this.policyDateName = policyDateName;
    }

    @JsonProperty("policyDateID")
    public Integer getPolicyDateID() {
        return policyDateID;
    }

    @JsonProperty("policyDateID")
    public void setPolicyDateID(Integer policyDateID) {
        this.policyDateID = policyDateID;
    }

    @JsonProperty("policyID")
    public Integer getPolicyID() {
        return policyID;
    }

    @JsonProperty("policyID")
    public void setPolicyID(Integer policyID) {
        this.policyID = policyID;
    }

    @JsonProperty("policyDateValue")
    public String getPolicyDateValue() {
        return policyDateValue;
    }

    @JsonProperty("policyDateValue")
    public void setPolicyDateValue(String policyDateValue) {
        this.policyDateValue = policyDateValue;
    }

    @JsonProperty("policyDateName")
    public String getPolicyDateName() {
        return policyDateName;
    }

    @JsonProperty("policyDateName")
    public void setPolicyDateName(String policyDateName) {
        this.policyDateName = policyDateName;
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
