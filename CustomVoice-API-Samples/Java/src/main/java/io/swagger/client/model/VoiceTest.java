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
import io.swagger.client.model.Model;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * VoiceTest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class VoiceTest {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("audioUri")
  private String audioUri = null;

  @SerializedName("textUri")
  private String textUri = null;

  @SerializedName("createdDateTime")
  private OffsetDateTime createdDateTime = null;

  @SerializedName("lastActionDateTime")
  private OffsetDateTime lastActionDateTime = null;

  /**
   * The status of the object
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCEEDED("Succeeded"),
    
    NOTSTARTED("NotStarted"),
    
    RUNNING("Running"),
    
    FAILED("Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("model")
  private Model model = null;

  /**
   * The kind of this test (e.g. Text, SSML)
   */
  @JsonAdapter(VoiceTestKindEnum.Adapter.class)
  public enum VoiceTestKindEnum {
    NONE("None"),
    
    TEXT("Text"),
    
    SSML("SSML");

    private String value;

    VoiceTestKindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VoiceTestKindEnum fromValue(String text) {
      for (VoiceTestKindEnum b : VoiceTestKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VoiceTestKindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VoiceTestKindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VoiceTestKindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VoiceTestKindEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("voiceTestKind")
  private VoiceTestKindEnum voiceTestKind = null;

  public VoiceTest id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of this entity
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "The identifier of this entity")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public VoiceTest audioUri(String audioUri) {
    this.audioUri = audioUri;
    return this;
  }

   /**
   * The audio URI of the voice test
   * @return audioUri
  **/
  @ApiModelProperty(value = "The audio URI of the voice test")
  public String getAudioUri() {
    return audioUri;
  }

  public void setAudioUri(String audioUri) {
    this.audioUri = audioUri;
  }

  public VoiceTest textUri(String textUri) {
    this.textUri = textUri;
    return this;
  }

   /**
   * The text URI of the voice test
   * @return textUri
  **/
  @ApiModelProperty(required = true, value = "The text URI of the voice test")
  public String getTextUri() {
    return textUri;
  }

  public void setTextUri(String textUri) {
    this.textUri = textUri;
  }

  public VoiceTest createdDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * The time-stamp when the object was created
   * @return createdDateTime
  **/
  @ApiModelProperty(required = true, value = "The time-stamp when the object was created")
  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public VoiceTest lastActionDateTime(OffsetDateTime lastActionDateTime) {
    this.lastActionDateTime = lastActionDateTime;
    return this;
  }

   /**
   * The time-stamp when the current status was entered
   * @return lastActionDateTime
  **/
  @ApiModelProperty(required = true, value = "The time-stamp when the current status was entered")
  public OffsetDateTime getLastActionDateTime() {
    return lastActionDateTime;
  }

  public void setLastActionDateTime(OffsetDateTime lastActionDateTime) {
    this.lastActionDateTime = lastActionDateTime;
  }

  public VoiceTest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the object
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the object")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public VoiceTest model(Model model) {
    this.model = model;
    return this;
  }

   /**
   * Information about the models used in the voice test
   * @return model
  **/
  @ApiModelProperty(required = true, value = "Information about the models used in the voice test")
  public Model getModel() {
    return model;
  }

  public void setModel(Model model) {
    this.model = model;
  }

  public VoiceTest voiceTestKind(VoiceTestKindEnum voiceTestKind) {
    this.voiceTestKind = voiceTestKind;
    return this;
  }

   /**
   * The kind of this test (e.g. Text, SSML)
   * @return voiceTestKind
  **/
  @ApiModelProperty(required = true, value = "The kind of this test (e.g. Text, SSML)")
  public VoiceTestKindEnum getVoiceTestKind() {
    return voiceTestKind;
  }

  public void setVoiceTestKind(VoiceTestKindEnum voiceTestKind) {
    this.voiceTestKind = voiceTestKind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoiceTest voiceTest = (VoiceTest) o;
    return Objects.equals(this.id, voiceTest.id) &&
        Objects.equals(this.audioUri, voiceTest.audioUri) &&
        Objects.equals(this.textUri, voiceTest.textUri) &&
        Objects.equals(this.createdDateTime, voiceTest.createdDateTime) &&
        Objects.equals(this.lastActionDateTime, voiceTest.lastActionDateTime) &&
        Objects.equals(this.status, voiceTest.status) &&
        Objects.equals(this.model, voiceTest.model) &&
        Objects.equals(this.voiceTestKind, voiceTest.voiceTestKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, audioUri, textUri, createdDateTime, lastActionDateTime, status, model, voiceTestKind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceTest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    audioUri: ").append(toIndentedString(audioUri)).append("\n");
    sb.append("    textUri: ").append(toIndentedString(textUri)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    lastActionDateTime: ").append(toIndentedString(lastActionDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    voiceTestKind: ").append(toIndentedString(voiceTestKind)).append("\n");
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

