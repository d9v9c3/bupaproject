
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
    "permissionId",
    "name",
    "description"
})
@Generated("jsonschema2pojo")
public class Permission {

    @JsonProperty("permissionId")
    private String permissionId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Permission() {
    }

    /**
     * 
     * @param permissionId
     * @param name
     * @param description
     */
    public Permission(String permissionId, String name, String description) {
        super();
        this.permissionId = permissionId;
        this.name = name;
        this.description = description;
    }

    @JsonProperty("permissionId")
    public String getPermissionId() {
        return permissionId;
    }

    @JsonProperty("permissionId")
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
