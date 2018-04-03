package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InitDataExtraInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InitData   {
  @JsonProperty("downloadUrl")
  private String downloadUrl = null;

  @JsonProperty("force")
  private Integer force = null;

  @JsonProperty("number")
  private Long number = null;

  @JsonProperty("msg")
  private String msg = null;

  @JsonProperty("extraInfo")
  private InitDataExtraInfo extraInfo = null;

  public InitData downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @ApiModelProperty(example = "http://www.google.com/google.apk", value = "")


  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public InitData force(Integer force) {
    this.force = force;
    return this;
  }

   /**
   * Get force
   * @return force
  **/
  @ApiModelProperty(example = "0", value = "")


  public Integer getForce() {
    return force;
  }

  public void setForce(Integer force) {
    this.force = force;
  }

  public InitData number(Long number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")


  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public InitData msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @ApiModelProperty(example = "下载地址字段", value = "")


  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public InitData extraInfo(InitDataExtraInfo extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

   /**
   * Get extraInfo
   * @return extraInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InitDataExtraInfo getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(InitDataExtraInfo extraInfo) {
    this.extraInfo = extraInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitData initData = (InitData) o;
    return Objects.equals(this.downloadUrl, initData.downloadUrl) &&
        Objects.equals(this.force, initData.force) &&
        Objects.equals(this.number, initData.number) &&
        Objects.equals(this.msg, initData.msg) &&
        Objects.equals(this.extraInfo, initData.extraInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, force, number, msg, extraInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitData {\n");
    
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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

