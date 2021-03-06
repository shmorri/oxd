/*
 * oxd-server
 * oxd-server
 *
 * OpenAPI spec version: 4.0.0
 * Contact: yuriyz@gluu.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IntrospectAccessTokenResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-10T07:48:52.952Z")
public class IntrospectAccessTokenResponse {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("scope")
  private List<String> scope = new ArrayList<String>();

  @SerializedName("token_type")
  private String tokenType = null;

  @SerializedName("sub")
  private String sub = null;

  @SerializedName("aud")
  private String aud = null;

  @SerializedName("iss")
  private String iss = null;

  @SerializedName("exp")
  private Long exp = null;

  @SerializedName("iat")
  private Long iat = null;

  @SerializedName("nbf")
  private Long nbf = null;

  @SerializedName("jti")
  private String jti = null;

  @SerializedName("acr_values")
  private List<String> acrValues = new ArrayList<String>();

  @SerializedName("extension_field")
  private String extensionField = null;

  public IntrospectAccessTokenResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public IntrospectAccessTokenResponse clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "@!1736.179E.AA60.16B2!0001!8F7C.B9AB!0008!A2BB.9AE6.5F14.B387", required = true, value = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public IntrospectAccessTokenResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "John Black", required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public IntrospectAccessTokenResponse scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public IntrospectAccessTokenResponse addScopeItem(String scopeItem) {
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  public IntrospectAccessTokenResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @ApiModelProperty(example = "bearer", required = true, value = "")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public IntrospectAccessTokenResponse sub(String sub) {
    this.sub = sub;
    return this;
  }

   /**
   * Get sub
   * @return sub
  **/
  @ApiModelProperty(example = "jblack", required = true, value = "")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public IntrospectAccessTokenResponse aud(String aud) {
    this.aud = aud;
    return this;
  }

   /**
   * Get aud
   * @return aud
  **/
  @ApiModelProperty(example = "l238j323ds-23ij4", required = true, value = "")
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public IntrospectAccessTokenResponse iss(String iss) {
    this.iss = iss;
    return this;
  }

   /**
   * Get iss
   * @return iss
  **/
  @ApiModelProperty(example = "https://as.gluu.org/", required = true, value = "")
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public IntrospectAccessTokenResponse exp(Long exp) {
    this.exp = exp;
    return this;
  }

   /**
   * number of seconds since January 1 1970 UTC, indicating when this token will expire
   * @return exp
  **/
  @ApiModelProperty(example = "1535709072", required = true, value = "number of seconds since January 1 1970 UTC, indicating when this token will expire")
  public Long getExp() {
    return exp;
  }

  public void setExp(Long exp) {
    this.exp = exp;
  }

  public IntrospectAccessTokenResponse iat(Long iat) {
    this.iat = iat;
    return this;
  }

   /**
   * number of seconds since January 1 1970 UTC, indicating when the token was issued at
   * @return iat
  **/
  @ApiModelProperty(example = "1535709072", required = true, value = "number of seconds since January 1 1970 UTC, indicating when the token was issued at")
  public Long getIat() {
    return iat;
  }

  public void setIat(Long iat) {
    this.iat = iat;
  }

  public IntrospectAccessTokenResponse nbf(Long nbf) {
    this.nbf = nbf;
    return this;
  }

   /**
   * number of seconds since January 1 1970 UTC, indicating when the token not to be used before
   * @return nbf
  **/
  @ApiModelProperty(example = "1535709072", required = true, value = "number of seconds since January 1 1970 UTC, indicating when the token not to be used before")
  public Long getNbf() {
    return nbf;
  }

  public void setNbf(Long nbf) {
    this.nbf = nbf;
  }

  public IntrospectAccessTokenResponse jti(String jti) {
    this.jti = jti;
    return this;
  }

   /**
   * a unique identifier for the JWT
   * @return jti
  **/
  @ApiModelProperty(required = true, value = "a unique identifier for the JWT")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  public IntrospectAccessTokenResponse acrValues(List<String> acrValues) {
    this.acrValues = acrValues;
    return this;
  }

  public IntrospectAccessTokenResponse addAcrValuesItem(String acrValuesItem) {
    this.acrValues.add(acrValuesItem);
    return this;
  }

   /**
   * Get acrValues
   * @return acrValues
  **/
  @ApiModelProperty(example = "[\"basic\"]", required = true, value = "")
  public List<String> getAcrValues() {
    return acrValues;
  }

  public void setAcrValues(List<String> acrValues) {
    this.acrValues = acrValues;
  }

  public IntrospectAccessTokenResponse extensionField(String extensionField) {
    this.extensionField = extensionField;
    return this;
  }

   /**
   * Get extensionField
   * @return extensionField
  **/
  @ApiModelProperty(example = "twenty-seven", required = true, value = "")
  public String getExtensionField() {
    return extensionField;
  }

  public void setExtensionField(String extensionField) {
    this.extensionField = extensionField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntrospectAccessTokenResponse introspectAccessTokenResponse = (IntrospectAccessTokenResponse) o;
    return Objects.equals(this.active, introspectAccessTokenResponse.active) &&
        Objects.equals(this.clientId, introspectAccessTokenResponse.clientId) &&
        Objects.equals(this.username, introspectAccessTokenResponse.username) &&
        Objects.equals(this.scope, introspectAccessTokenResponse.scope) &&
        Objects.equals(this.tokenType, introspectAccessTokenResponse.tokenType) &&
        Objects.equals(this.sub, introspectAccessTokenResponse.sub) &&
        Objects.equals(this.aud, introspectAccessTokenResponse.aud) &&
        Objects.equals(this.iss, introspectAccessTokenResponse.iss) &&
        Objects.equals(this.exp, introspectAccessTokenResponse.exp) &&
        Objects.equals(this.iat, introspectAccessTokenResponse.iat) &&
        Objects.equals(this.nbf, introspectAccessTokenResponse.nbf) &&
        Objects.equals(this.jti, introspectAccessTokenResponse.jti) &&
        Objects.equals(this.acrValues, introspectAccessTokenResponse.acrValues) &&
        Objects.equals(this.extensionField, introspectAccessTokenResponse.extensionField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, clientId, username, scope, tokenType, sub, aud, iss, exp, iat, nbf, jti, acrValues, extensionField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntrospectAccessTokenResponse {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    nbf: ").append(toIndentedString(nbf)).append("\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
    sb.append("    acrValues: ").append(toIndentedString(acrValues)).append("\n");
    sb.append("    extensionField: ").append(toIndentedString(extensionField)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

