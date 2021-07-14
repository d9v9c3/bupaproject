package com.bupa.ohmb.indra.project.localclassdto;

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
"agreementId",
"version",
"accepted"
})
@Generated("jsonschema2pojo")
public class AgreementCollect {

@JsonProperty("agreementId")
private Integer agreementId;
@JsonProperty("version")
private Integer version;
@JsonProperty("accepted")
private Boolean accepted;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public AgreementCollect() {
}

/**
*
* @param agreementId
* @param accepted
* @param version
*/
public AgreementCollect(Integer agreementId, Integer version, Boolean accepted) {
super();
this.agreementId = agreementId;
this.version = version;
this.accepted = accepted;
}

@JsonProperty("agreementId")
public Integer getAgreementId() {
return agreementId;
}

@JsonProperty("agreementId")
public void setAgreementId(Integer agreementId) {
this.agreementId = agreementId;
}

@JsonProperty("version")
public Integer getVersion() {
return version;
}

@JsonProperty("version")
public void setVersion(Integer version) {
this.version = version;
}

@JsonProperty("accepted")
public Boolean getAccepted() {
return accepted;
}

@JsonProperty("accepted")
public void setAccepted(Boolean accepted) {
this.accepted = accepted;
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