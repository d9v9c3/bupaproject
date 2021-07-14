
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
    "memberId",
    "firstName",
    "middleName",
    "lastName",
    "dob",
    "relationTypeId",
    "relationType",
    "genderId",
    "gender"
})
@Generated("jsonschema2pojo")
public class UserMemberLocal {

    @JsonProperty("memberId")
    private Integer memberId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("relationTypeId")
    private Integer relationTypeId;
    @JsonProperty("relationType")
    private String relationType;
    @JsonProperty("genderId")
    private Integer genderId;
    @JsonProperty("gender")
    private String gender;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserMemberLocal() {
    }

    /**
     * 
     * @param relationType
     * @param firstName
     * @param lastName
     * @param gender
     * @param dob
     * @param genderId
     * @param middleName
     * @param relationTypeId
     * @param memberId
     */
    public UserMemberLocal(Integer memberId, String firstName, String middleName, String lastName, String dob, Integer relationTypeId, String relationType, Integer genderId, String gender) {
        super();
        this.memberId = memberId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.relationTypeId = relationTypeId;
        this.relationType = relationType;
        this.genderId = genderId;
        this.gender = gender;
    }

    @JsonProperty("memberId")
    public Integer getMemberId() {
        return memberId;
    }

    @JsonProperty("memberId")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    @JsonProperty("dob")
    public void setDob(String dob) {
        this.dob = dob;
    }

    @JsonProperty("relationTypeId")
    public Integer getRelationTypeId() {
        return relationTypeId;
    }

    @JsonProperty("relationTypeId")
    public void setRelationTypeId(Integer relationTypeId) {
        this.relationTypeId = relationTypeId;
    }

    @JsonProperty("relationType")
    public String getRelationType() {
        return relationType;
    }

    @JsonProperty("relationType")
    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    @JsonProperty("genderId")
    public Integer getGenderId() {
        return genderId;
    }

    @JsonProperty("genderId")
    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
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
