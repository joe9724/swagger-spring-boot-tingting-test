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
 * 充值结果
 */
@ApiModel(description = "充值结果")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class Recharge   {
  @JsonProperty("code")
  private Long code = null;

  @JsonProperty("msg")
  private String msg = null;

  @JsonProperty("serialNumber")
  private String serialNumber = null;

  @JsonProperty("memberId")
  private String memberId = null;

  @JsonProperty("type")
  private Long type = null;

  @JsonProperty("order_no")
  private String orderNo = null;

  @JsonProperty("status")
  private Long status = null;

  @JsonProperty("time")
  private Long time = null;

  @JsonProperty("value")
  private Long value = null;

  public Recharge code(Long code) {
    this.code = code;
    return this;
  }

   /**
   * 0=等待 1=成功 2=失败 3=其他
   * @return code
  **/
  @ApiModelProperty(value = "0=等待 1=成功 2=失败 3=其他")


  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public Recharge msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @ApiModelProperty(value = "")


  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Recharge serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * 支付平台产生的流水号
   * @return serialNumber
  **/
  @ApiModelProperty(value = "支付平台产生的流水号")


  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Recharge memberId(String memberId) {
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

  public Recharge type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public Recharge orderNo(String orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(value = "")


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public Recharge status(Long status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public Recharge time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")


  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public Recharge value(Long value) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recharge recharge = (Recharge) o;
    return Objects.equals(this.code, recharge.code) &&
        Objects.equals(this.msg, recharge.msg) &&
        Objects.equals(this.serialNumber, recharge.serialNumber) &&
        Objects.equals(this.memberId, recharge.memberId) &&
        Objects.equals(this.type, recharge.type) &&
        Objects.equals(this.orderNo, recharge.orderNo) &&
        Objects.equals(this.status, recharge.status) &&
        Objects.equals(this.time, recharge.time) &&
        Objects.equals(this.value, recharge.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, msg, serialNumber, memberId, type, orderNo, status, time, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recharge {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

