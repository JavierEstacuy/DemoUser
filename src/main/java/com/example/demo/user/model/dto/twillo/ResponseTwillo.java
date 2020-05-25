package com.example.demo.user.model.dto.twillo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sid",
    "date_created",
    "date_updated",
    "date_sent",
    "account_sid",
    "to",
    "from",
    "messaging_service_sid",
    "body",
    "status",
    "num_segments",
    "num_media",
    "direction",
    "api_version",
    "price",
    "price_unit",
    "error_code",
    "error_message",
    "uri",
    "subresource_uris"
})
public class ResponseTwillo {

    @JsonProperty("sid")
    private String sid;
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("date_updated")
    private String dateUpdated;
    @JsonProperty("date_sent")
    private Object dateSent;
    @JsonProperty("account_sid")
    private String accountSid;
    @JsonProperty("to")
    private String to;
    @JsonProperty("from")
    private String from;
    @JsonProperty("messaging_service_sid")
    private Object messagingServiceSid;
    @JsonProperty("body")
    private String body;
    @JsonProperty("status")
    private String status;
    @JsonProperty("num_segments")
    private String numSegments;
    @JsonProperty("num_media")
    private String numMedia;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("api_version")
    private String apiVersion;
    @JsonProperty("price")
    private Object price;
    @JsonProperty("price_unit")
    private String priceUnit;
    @JsonProperty("error_code")
    private Object errorCode;
    @JsonProperty("error_message")
    private Object errorMessage;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("subresource_uris")
    private SubresourceUris subresourceUris;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sid")
    public String getSid() {
        return sid;
    }

    @JsonProperty("sid")
    public void setSid(String sid) {
        this.sid = sid;
    }

    @JsonProperty("date_created")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("date_created")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("date_updated")
    public String getDateUpdated() {
        return dateUpdated;
    }

    @JsonProperty("date_updated")
    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @JsonProperty("date_sent")
    public Object getDateSent() {
        return dateSent;
    }

    @JsonProperty("date_sent")
    public void setDateSent(Object dateSent) {
        this.dateSent = dateSent;
    }

    @JsonProperty("account_sid")
    public String getAccountSid() {
        return accountSid;
    }

    @JsonProperty("account_sid")
    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    @JsonProperty("messaging_service_sid")
    public Object getMessagingServiceSid() {
        return messagingServiceSid;
    }

    @JsonProperty("messaging_service_sid")
    public void setMessagingServiceSid(Object messagingServiceSid) {
        this.messagingServiceSid = messagingServiceSid;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("num_segments")
    public String getNumSegments() {
        return numSegments;
    }

    @JsonProperty("num_segments")
    public void setNumSegments(String numSegments) {
        this.numSegments = numSegments;
    }

    @JsonProperty("num_media")
    public String getNumMedia() {
        return numMedia;
    }

    @JsonProperty("num_media")
    public void setNumMedia(String numMedia) {
        this.numMedia = numMedia;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("api_version")
    public String getApiVersion() {
        return apiVersion;
    }

    @JsonProperty("api_version")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("price")
    public Object getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Object price) {
        this.price = price;
    }

    @JsonProperty("price_unit")
    public String getPriceUnit() {
        return priceUnit;
    }

    @JsonProperty("price_unit")
    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    @JsonProperty("error_code")
    public Object getErrorCode() {
        return errorCode;
    }

    @JsonProperty("error_code")
    public void setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("error_message")
    public Object getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty("error_message")
    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("subresource_uris")
    public SubresourceUris getSubresourceUris() {
        return subresourceUris;
    }

    @JsonProperty("subresource_uris")
    public void setSubresourceUris(SubresourceUris subresourceUris) {
        this.subresourceUris = subresourceUris;
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
