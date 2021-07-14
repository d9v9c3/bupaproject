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
"pass",
"newPass"
})
@Generated("jsonschema2pojo")
public class RPass {

@JsonProperty("pass")
private String pass;
@JsonProperty("newPass")
private String newPass;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public RPass() {
}

/**
*
* @param pass
* @param newPass
*/
public RPass(String pass, String newPass) {
super();
this.pass = pass;
this.newPass = newPass;
}

@JsonProperty("pass")
public String getPass() {
return pass;
}

@JsonProperty("pass")
public void setPass(String pass) {
this.pass = pass;
}

@JsonProperty("newPass")
public String getNewPass() {
return newPass;
}

@JsonProperty("newPass")
public void setNewPass(String newPass) {
this.newPass = newPass;
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