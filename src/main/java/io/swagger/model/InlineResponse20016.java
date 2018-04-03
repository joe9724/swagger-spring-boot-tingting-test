package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Recommend;
import io.swagger.model.Response;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20016
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InlineResponse20016   {
  @JsonProperty("status")
  private Response status = null;

  @JsonProperty("recommend")
  private Recommend recommend = null;

  public InlineResponse20016 status(Response status) {
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

  public InlineResponse20016 recommend(Recommend recommend) {
    this.recommend = recommend;
    return this;
  }

   /**
   * Get recommend
   * @return recommend
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Recommend getRecommend() {
    return recommend;
  }

  public void setRecommend(Recommend recommend) {
    this.recommend = recommend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20016 inlineResponse20016 = (InlineResponse20016) o;
    return Objects.equals(this.status, inlineResponse20016.status) &&
        Objects.equals(this.recommend, inlineResponse20016.recommend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, recommend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20016 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recommend: ").append(toIndentedString(recommend)).append("\n");
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

