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
 * LoginRet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class LoginRet   {
  @JsonProperty("memberId")
  private Long memberId = null;

  @JsonProperty("Membername")
  private String membername = null;

  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("gender")
  private Long gender = null;

  public LoginRet memberId(Long memberId) {
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

  public LoginRet membername(String membername) {
    this.membername = membername;
    return this;
  }

   /**
   * Get membername
   * @return membername
  **/
  @ApiModelProperty(value = "")


  public String getMembername() {
    return membername;
  }

  public void setMembername(String membername) {
    this.membername = membername;
  }

  public LoginRet avatar(String avatar) {
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

  public LoginRet gender(Long gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")


  public Long getGender() {
    return gender;
  }

  public void setGender(Long gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginRet loginRet = (LoginRet) o;
    return Objects.equals(this.memberId, loginRet.memberId) &&
        Objects.equals(this.membername, loginRet.membername) &&
        Objects.equals(this.avatar, loginRet.avatar) &&
        Objects.equals(this.gender, loginRet.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, membername, avatar, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRet {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    membername: ").append(toIndentedString(membername)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

