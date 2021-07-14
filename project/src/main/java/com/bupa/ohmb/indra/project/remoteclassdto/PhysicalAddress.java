
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
    "addressTypeId",
    "type",
    "addressLine",
    "cityId",
    "city",
    "zipcode",
    "state",
    "countryId",
    "country",
    "isoAlpha",
    "fromDate",
    "toDate",
    "interior",
    "exterior",
    "colonyId",
    "municipality"
})
@Generated("jsonschema2pojo")
public class PhysicalAddress {

    @JsonProperty("addressTypeId")
    private Integer addressTypeId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("addressLine")
    private String addressLine;
    @JsonProperty("cityId")
    private Integer cityId;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("state")
    private String state;
    @JsonProperty("countryId")
    private Integer countryId;
    @JsonProperty("country")
    private String country;
    @JsonProperty("isoAlpha")
    private String isoAlpha;
    @JsonProperty("fromDate")
    private String fromDate;
    @JsonProperty("toDate")
    private Object toDate;
    @JsonProperty("interior")
    private String interior;
    @JsonProperty("exterior")
    private String exterior;
    @JsonProperty("colonyId")
    private Integer colonyId;
    @JsonProperty("municipality")
    private String municipality;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PhysicalAddress() {
    }

    /**
     * 
     * @param country
     * @param isoAlpha
     * @param city
     * @param toDate
     * @param exterior
     * @param municipality
     * @param cityId
     * @param type
     * @param addressLine
     * @param countryId
     * @param interior
     * @param zipcode
     * @param fromDate
     * @param addressTypeId
     * @param colonyId
     * @param state
     */
    public PhysicalAddress(Integer addressTypeId, String type, String addressLine, Integer cityId, String city, String zipcode, String state, Integer countryId, String country, String isoAlpha, String fromDate, Object toDate, String interior, String exterior, Integer colonyId, String municipality) {
        super();
        this.addressTypeId = addressTypeId;
        this.type = type;
        this.addressLine = addressLine;
        this.cityId = cityId;
        this.city = city;
        this.zipcode = zipcode;
        this.state = state;
        this.countryId = countryId;
        this.country = country;
        this.isoAlpha = isoAlpha;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.interior = interior;
        this.exterior = exterior;
        this.colonyId = colonyId;
        this.municipality = municipality;
    }

    @JsonProperty("addressTypeId")
    public Integer getAddressTypeId() {
        return addressTypeId;
    }

    @JsonProperty("addressTypeId")
    public void setAddressTypeId(Integer addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("addressLine")
    public String getAddressLine() {
        return addressLine;
    }

    @JsonProperty("addressLine")
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    @JsonProperty("cityId")
    public Integer getCityId() {
        return cityId;
    }

    @JsonProperty("cityId")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    @JsonProperty("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("countryId")
    public Integer getCountryId() {
        return countryId;
    }

    @JsonProperty("countryId")
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("isoAlpha")
    public String getIsoAlpha() {
        return isoAlpha;
    }

    @JsonProperty("isoAlpha")
    public void setIsoAlpha(String isoAlpha) {
        this.isoAlpha = isoAlpha;
    }

    @JsonProperty("fromDate")
    public String getFromDate() {
        return fromDate;
    }

    @JsonProperty("fromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    @JsonProperty("toDate")
    public Object getToDate() {
        return toDate;
    }

    @JsonProperty("toDate")
    public void setToDate(Object toDate) {
        this.toDate = toDate;
    }

    @JsonProperty("interior")
    public String getInterior() {
        return interior;
    }

    @JsonProperty("interior")
    public void setInterior(String interior) {
        this.interior = interior;
    }

    @JsonProperty("exterior")
    public String getExterior() {
        return exterior;
    }

    @JsonProperty("exterior")
    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    @JsonProperty("colonyId")
    public Integer getColonyId() {
        return colonyId;
    }

    @JsonProperty("colonyId")
    public void setColonyId(Integer colonyId) {
        this.colonyId = colonyId;
    }

    @JsonProperty("municipality")
    public String getMunicipality() {
        return municipality;
    }

    @JsonProperty("municipality")
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
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
