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
 * Body1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class Body1   {
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

  @JsonProperty("value")
  private Long value = null;

  @JsonProperty("memberId")
  private Long memberId = null;

  public Body1 version(String version) {
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

  public Body1 imei(String imei) {
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

  public Body1 client(String client) {
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

  public Body1 ts(Long ts) {
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

  public Body1 val(String val) {
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

  public Body1 content(String content) {
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

  public Body1 type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * 支付厂家类型 0=支付宝,1=微信,3=appPay,4=银联,5=其他
   * @return type
  **/
  @ApiModelProperty(value = "支付厂家类型 0=支付宝,1=微信,3=appPay,4=银联,5=其他")


  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public Body1 value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public Body1 memberId(Long memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Get memberId
   * @return memberId
  **/
  @ApiModelProperty(value = "")


  public Long getMemberId() {
    return memberId;
  }

  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body1 body1 = (Body1) o;
    return Objects.equals(this.version, body1.version) &&
        Objects.equals(this.imei, body1.imei) &&
        Objects.equals(this.client, body1.client) &&
        Objects.equals(this.ts, body1.ts) &&
        Objects.equals(this.val, body1.val) &&
        Objects.equals(this.content, body1.content) &&
        Objects.equals(this.type, body1.type) &&
        Objects.equals(this.value, body1.value) &&
        Objects.equals(this.memberId, body1.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, imei, client, ts, val, content, type, value, memberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    val: ").append(toIndentedString(val)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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

