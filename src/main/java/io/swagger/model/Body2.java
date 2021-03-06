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
 * Body2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class Body2   {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("imei")
  private String imei = null;

  @JsonProperty("client")
  private String client = null;

  @JsonProperty("ts")
  private Long ts = null;

  @JsonProperty("val")
  private String val = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("type")
  private Long type = null;

  public Body2 version(String version) {
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

  public Body2 imei(String imei) {
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

  public Body2 client(String client) {
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

  public Body2 ts(Long ts) {
    this.ts = ts;
    return this;
  }

   /**
   * Get ts
   * @return ts
  **/
  @ApiModelProperty(value = "")


  public Long getTs() {
    return ts;
  }

  public void setTs(Long ts) {
    this.ts = ts;
  }

  public Body2 val(String val) {
    this.val = val;
    return this;
  }

   /**
   * Get val
   * @return val
  **/
  @ApiModelProperty(value = "")


  public String getVal() {
    return val;
  }

  public void setVal(String val) {
    this.val = val;
  }

  public Body2 content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Body2 type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * 反馈类型 0=账号问题,1=付费问题,2=播放问题,3=会员问题
   * @return type
  **/
  @ApiModelProperty(value = "反馈类型 0=账号问题,1=付费问题,2=播放问题,3=会员问题")


  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body2 body2 = (Body2) o;
    return Objects.equals(this.version, body2.version) &&
        Objects.equals(this.imei, body2.imei) &&
        Objects.equals(this.client, body2.client) &&
        Objects.equals(this.ts, body2.ts) &&
        Objects.equals(this.val, body2.val) &&
        Objects.equals(this.content, body2.content) &&
        Objects.equals(this.type, body2.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, imei, client, ts, val, content, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body2 {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    val: ").append(toIndentedString(val)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

