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
 * InitDataExtraInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InitDataExtraInfo   {
  @JsonProperty("specialUrl")
  private String specialUrl = null;

  @JsonProperty("versionUrl")
  private String versionUrl = null;

  @JsonProperty("aboutUsUrl")
  private String aboutUsUrl = null;

  public InitDataExtraInfo specialUrl(String specialUrl) {
    this.specialUrl = specialUrl;
    return this;
  }

   /**
   * Get specialUrl
   * @return specialUrl
  **/
  @ApiModelProperty(value = "")


  public String getSpecialUrl() {
    return specialUrl;
  }

  public void setSpecialUrl(String specialUrl) {
    this.specialUrl = specialUrl;
  }

  public InitDataExtraInfo versionUrl(String versionUrl) {
    this.versionUrl = versionUrl;
    return this;
  }

   /**
   * Get versionUrl
   * @return versionUrl
  **/
  @ApiModelProperty(value = "")


  public String getVersionUrl() {
    return versionUrl;
  }

  public void setVersionUrl(String versionUrl) {
    this.versionUrl = versionUrl;
  }

  public InitDataExtraInfo aboutUsUrl(String aboutUsUrl) {
    this.aboutUsUrl = aboutUsUrl;
    return this;
  }

   /**
   * Get aboutUsUrl
   * @return aboutUsUrl
  **/
  @ApiModelProperty(value = "")


  public String getAboutUsUrl() {
    return aboutUsUrl;
  }

  public void setAboutUsUrl(String aboutUsUrl) {
    this.aboutUsUrl = aboutUsUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitDataExtraInfo initDataExtraInfo = (InitDataExtraInfo) o;
    return Objects.equals(this.specialUrl, initDataExtraInfo.specialUrl) &&
        Objects.equals(this.versionUrl, initDataExtraInfo.versionUrl) &&
        Objects.equals(this.aboutUsUrl, initDataExtraInfo.aboutUsUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialUrl, versionUrl, aboutUsUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitDataExtraInfo {\n");
    
    sb.append("    specialUrl: ").append(toIndentedString(specialUrl)).append("\n");
    sb.append("    versionUrl: ").append(toIndentedString(versionUrl)).append("\n");
    sb.append("    aboutUsUrl: ").append(toIndentedString(aboutUsUrl)).append("\n");
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

