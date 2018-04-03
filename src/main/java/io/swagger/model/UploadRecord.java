package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UploadRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class UploadRecord   {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("imei")
  private String imei = null;

  @JsonProperty("client")
  private String client = null;

  @JsonProperty("memberId")
  private String memberId = null;

  @JsonProperty("recordFile")
  private Object recordFile = null;

  public UploadRecord version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public UploadRecord imei(String imei) {
    this.imei = imei;
    return this;
  }

   /**
   * Get imei
   * @return imei
  **/
  @ApiModelProperty(value = "")


  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public UploadRecord client(String client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(value = "")


  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public UploadRecord memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Get memberId
   * @return memberId
  **/
  @ApiModelProperty(value = "")


  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public UploadRecord recordFile(Object recordFile) {
    this.recordFile = recordFile;
    return this;
  }

   /**
   * Get recordFile
   * @return recordFile
  **/
  @ApiModelProperty(value = "")


  public Object getRecordFile() {
    return recordFile;
  }

  public void setRecordFile(Object recordFile) {
    this.recordFile = recordFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadRecord uploadRecord = (UploadRecord) o;
    return Objects.equals(this.version, uploadRecord.version) &&
        Objects.equals(this.imei, uploadRecord.imei) &&
        Objects.equals(this.client, uploadRecord.client) &&
        Objects.equals(this.memberId, uploadRecord.memberId) &&
        Objects.equals(this.recordFile, uploadRecord.recordFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, imei, client, memberId, recordFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadRecord {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    recordFile: ").append(toIndentedString(recordFile)).append("\n");
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

