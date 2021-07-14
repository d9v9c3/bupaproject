
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
"name",
"application",
"agreementTypeName",
"agreementTypedescription",
"required"
})
@Generated("jsonschema2pojo")
public class AgreementsLocal {

@JsonProperty("agreementId")
private Integer agreementId;
@JsonProperty("version")
private Integer version;
@JsonProperty("name")
private String name;
@JsonProperty("application")
private String application;
@JsonProperty("agreementTypeName")
private String agreementTypeName;
@JsonProperty("agreementTypedescription")
private String agreementTypedescription;
@JsonProperty("required")
private Boolean required;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public AgreementsLocal() {
}

/**
*
* @param application
* @param agreementTypeName
* @param agreementTypedescription
* @param agreementId
* @param name
* @param version
* @param required
*/
public AgreementsLocal(Integer agreementId, Integer version, String name, String application, String agreementTypeName, String agreementTypedescription, Boolean required) {
super();
this.agreementId = agreementId;
this.version = version;
this.name = name;
this.application = application;
this.agreementTypeName = agreementTypeName;
this.agreementTypedescription = agreementTypedescription;
this.required = required;
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

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("application")
public String getApplication() {
return application;
}

@JsonProperty("application")
public void setApplication(String application) {
this.application = application;
}

@JsonProperty("agreementTypeName")
public String getAgreementTypeName() {
return agreementTypeName;
}

@JsonProperty("agreementTypeName")
public void setAgreementTypeName(String agreementTypeName) {
this.agreementTypeName = agreementTypeName;
}

@JsonProperty("agreementTypedescription")
public String getAgreementTypedescription() {
return agreementTypedescription;
}

@JsonProperty("agreementTypedescription")
public void setAgreementTypedescription(String agreementTypedescription) {
this.agreementTypedescription = agreementTypedescription;
}

@JsonProperty("required")
public Boolean getRequired() {
return required;
}

@JsonProperty("required")
public void setRequired(Boolean required) {
this.required = required;
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
