package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Recharge;
import io.swagger.model.Response;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2002
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InlineResponse2002   {
  @JsonProperty("status")
  private Response status = null;

  @JsonProperty("recharges")
  @Valid
  private List<Recharge> recharges = null;

  public InlineResponse2002 status(Response status) {
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

  public InlineResponse2002 recharges(List<Recharge> recharges) {
    this.recharges = recharges;
    return this;
  }

  public InlineResponse2002 addRechargesItem(Recharge rechargesItem) {
    if (this.recharges == null) {
      this.recharges = new ArrayList<Recharge>();
    }
    this.recharges.add(rechargesItem);
    return this;
  }

   /**
   * Get recharges
   * @return recharges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Recharge> getRecharges() {
    return recharges;
  }

  public void setRecharges(List<Recharge> recharges) {
    this.recharges = recharges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.status, inlineResponse2002.status) &&
        Objects.equals(this.recharges, inlineResponse2002.recharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, recharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recharges: ").append(toIndentedString(recharges)).append("\n");
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

