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
 * Body
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class Body   {
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

  @JsonProperty("type")
  private Long type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("openid")
  private String openid = null;

  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("smsCode")
  private String smsCode = null;

  @JsonProperty("phone")
  private String phone = null;

  public Body version(String version) {
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

  public Body imei(String imei) {
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

  public Body client(String client) {
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

  public Body ts(Long ts) {
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

  public Body val(String val) {
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

  public Body type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * 第三方类型 0=微信,1=微博,2=qq,3=手机号快捷登录,4=其他
   * @return type
  **/
  @ApiModelProperty(value = "第三方类型 0=微信,1=微博,2=qq,3=手机号快捷登录,4=其他")


  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public Body name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 登录返回信息
   * @return name
  **/
  @ApiModelProperty(value = "登录返回信息")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Body openid(String openid) {
    this.openid = openid;
    return this;
  }

   /**
   * Get openid
   * @return openid
  **/
  @ApiModelProperty(value = "")


  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public Body avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @ApiModelProperty(value = "")


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Body smsCode(String smsCode) {
    this.smsCode = smsCode;
    return this;
  }

   /**
   * Get smsCode
   * @return smsCode
  **/
  @ApiModelProperty(value = "")


  public String getSmsCode() {
    return smsCode;
  }

  public void setSmsCode(String smsCode) {
    this.smsCode = smsCode;
  }

  public Body phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.version, body.version) &&
        Objects.equals(this.imei, body.imei) &&
        Objects.equals(this.client, body.client) &&
        Objects.equals(this.ts, body.ts) &&
        Objects.equals(this.val, body.val) &&
        Objects.equals(this.type, body.type) &&
        Objects.equals(this.name, body.name) &&
        Objects.equals(this.openid, body.openid) &&
        Objects.equals(this.avatar, body.avatar) &&
        Objects.equals(this.smsCode, body.smsCode) &&
        Objects.equals(this.phone, body.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, imei, client, ts, val, type, name, openid, avatar, smsCode, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    val: ").append(toIndentedString(val)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openid: ").append(toIndentedString(openid)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    smsCode: ").append(toIndentedString(smsCode)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

