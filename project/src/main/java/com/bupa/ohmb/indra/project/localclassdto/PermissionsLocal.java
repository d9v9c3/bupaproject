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
@JsonPropertyOrder({ "permissionId", "name", "description", "resourceId" })
@Generated("jsonschema2pojo")
public class PermissionsLocal {

	@JsonProperty("permissionId")
	private Integer permissionId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("resourceId")
	private String resourceId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public PermissionsLocal() {
	}

	/**
	 *
	 * @param permissionId
	 * @param resourceId
	 * @param name
	 * @param description
	 */
	public PermissionsLocal(Integer permissionId, String name, String description, String resourceId) {
		super();
		this.permissionId = permissionId;
		this.name = name;
		this.description = description;
		this.resourceId = resourceId;
	}

	@JsonProperty("permissionId")
	public Integer getPermissionId() {
		return permissionId;
	}

	@JsonProperty("permissionId")
	public void setPermissionId(Integer permissionId) {
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

	@JsonProperty("resourceId")
	public String getResourceId() {
		return resourceId;
	}

	@JsonProperty("resourceId")
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
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