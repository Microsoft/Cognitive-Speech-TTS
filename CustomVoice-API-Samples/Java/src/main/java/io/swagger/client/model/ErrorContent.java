/*
 * Speech Services API v3.0-beta1
 * Speech Services API v3.0-beta1.
 *
 * OpenAPI spec version: v3.0-beta1
 * Contact: crservice@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ErrorDetail;
import io.swagger.client.model.InnerError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The interface represents the content of an error response defined in the OneAPI v2.1 documentation.
 */
@ApiModel(description = "The interface represents the content of an error response defined in the OneAPI v2.1 documentation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class ErrorContent {
  @SerializedName("details")
  private List<ErrorDetail> details = null;

  @SerializedName("innererror")
  private InnerError innererror = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("target")
  private String target = null;

  public ErrorContent details(List<ErrorDetail> details) {
    this.details = details;
    return this;
  }

  public ErrorContent addDetailsItem(ErrorDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<ErrorDetail>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * An array of details representing distinct related errors that occured during the request
   * @return details
  **/
  @ApiModelProperty(value = "An array of details representing distinct related errors that occured during the request")
  public List<ErrorDetail> getDetails() {
    return details;
  }

  public void setDetails(List<ErrorDetail> details) {
    this.details = details;
  }

  public ErrorContent innererror(InnerError innererror) {
    this.innererror = innererror;
    return this;
  }

   /**
   * The stack trace of the error. The payload is service-defined.  If the error is not at the root level, the object contains a Code  and an InnerError property
   * @return innererror
  **/
  @ApiModelProperty(value = "The stack trace of the error. The payload is service-defined.  If the error is not at the root level, the object contains a Code  and an InnerError property")
  public InnerError getInnererror() {
    return innererror;
  }

  public void setInnererror(InnerError innererror) {
    this.innererror = innererror;
  }

  public ErrorContent code(String code) {
    this.code = code;
    return this;
  }

   /**
   * A service-defined error code that should be human-readable.  This code serves as a more specific indicator of the error than  the HTTP error code specified in the response
   * @return code
  **/
  @ApiModelProperty(required = true, value = "A service-defined error code that should be human-readable.  This code serves as a more specific indicator of the error than  the HTTP error code specified in the response")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorContent message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human-readable representation of the error. It is intended as  an aid to developers and is not suitable for exposure to end users
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A human-readable representation of the error. It is intended as  an aid to developers and is not suitable for exposure to end users")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorContent target(String target) {
    this.target = target;
    return this;
  }

   /**
   * The target of the particular error (e.g., the name of the property in error)
   * @return target
  **/
  @ApiModelProperty(value = "The target of the particular error (e.g., the name of the property in error)")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorContent errorContent = (ErrorContent) o;
    return Objects.equals(this.details, errorContent.details) &&
        Objects.equals(this.innererror, errorContent.innererror) &&
        Objects.equals(this.code, errorContent.code) &&
        Objects.equals(this.message, errorContent.message) &&
        Objects.equals(this.target, errorContent.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, innererror, code, message, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorContent {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    innererror: ").append(toIndentedString(innererror)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

