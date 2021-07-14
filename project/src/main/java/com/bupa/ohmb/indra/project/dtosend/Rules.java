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
"passwordRegex",
"specialCharacters",
"passwordExplanation",
"minLength",
"maxLength"
})
@Generated("jsonschema2pojo")
public class Rules {

@JsonProperty("passwordRegex")
private String passwordRegex;
@JsonProperty("specialCharacters")
private String specialCharacters;
@JsonProperty("passwordExplanation")
private String passwordExplanation;
@JsonProperty("minLength")
private Integer minLength;
@JsonProperty("maxLength")
private Integer maxLength;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public Rules() {
}

/**
*
* @param passwordRegex
* @param passwordExplanation
* @param minLength
* @param specialCharacters
* @param maxLength
*/
public Rules(String passwordRegex, String specialCharacters, String passwordExplanation, Integer minLength, Integer maxLength) {
super();
this.passwordRegex = passwordRegex;
this.specialCharacters = specialCharacters;
this.passwordExplanation = passwordExplanation;
this.minLength = minLength;
this.maxLength = maxLength;
}

@JsonProperty("passwordRegex")
public String getPasswordRegex() {
return passwordRegex;
}

@JsonProperty("passwordRegex")
public void setPasswordRegex(String passwordRegex) {
this.passwordRegex = passwordRegex;
}

@JsonProperty("specialCharacters")
public String getSpecialCharacters() {
return specialCharacters;
}

@JsonProperty("specialCharacters")
public void setSpecialCharacters(String specialCharacters) {
this.specialCharacters = specialCharacters;
}

@JsonProperty("passwordExplanation")
public String getPasswordExplanation() {
return passwordExplanation;
}

@JsonProperty("passwordExplanation")
public void setPasswordExplanation(String passwordExplanation) {
this.passwordExplanation = passwordExplanation;
}

@JsonProperty("minLength")
public Integer getMinLength() {
return minLength;
}

@JsonProperty("minLength")
public void setMinLength(Integer minLength) {
this.minLength = minLength;
}

@JsonProperty("maxLength")
public Integer getMaxLength() {
return maxLength;
}

@JsonProperty("maxLength")
public void setMaxLength(Integer maxLength) {
this.maxLength = maxLength;
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