package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Msg;
import io.swagger.model.Response;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20017
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InlineResponse20017   {
  @JsonProperty("status")
  private Response status = null;

  @JsonProperty("msgList")
  @Valid
  private List<Msg> msgList = null;

  public InlineResponse20017 status(Response status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Response getStatus() {
    return status;
  }

  public void setStatus(Response status) {
    this.status = status;
  }

  public InlineResponse20017 msgList(List<Msg> msgList) {
    this.msgList = msgList;
    return this;
  }

  public InlineResponse20017 addMsgListItem(Msg msgListItem) {
    if (this.msgList == null) {
      this.msgList = new ArrayList<Msg>();
    }
    this.msgList.add(msgListItem);
    return this;
  }

   /**
   * Get msgList
   * @return msgList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Msg> getMsgList() {
    return msgList;
  }

  public void setMsgList(List<Msg> msgList) {
    this.msgList = msgList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20017 inlineResponse20017 = (InlineResponse20017) o;
    return Objects.equals(this.status, inlineResponse20017.status) &&
        Objects.equals(this.msgList, inlineResponse20017.msgList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, msgList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    msgList: ").append(toIndentedString(msgList)).append("\n");
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

