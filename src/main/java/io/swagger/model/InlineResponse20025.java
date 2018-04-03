package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Category;
import io.swagger.model.Response;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20025
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InlineResponse20025   {
  @JsonProperty("status")
  private Response status = null;

  @JsonProperty("data")
  private Category data = null;

  @JsonProperty("isFav")
  private Boolean isFav = null;

  public InlineResponse20025 status(Response status) {
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

  public InlineResponse20025 data(Category data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Category getData() {
    return data;
  }

  public void setData(Category data) {
    this.data = data;
  }

  public InlineResponse20025 isFav(Boolean isFav) {
    this.isFav = isFav;
    return this;
  }

   /**
   * Get isFav
   * @return isFav
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsFav() {
    return isFav;
  }

  public void setIsFav(Boolean isFav) {
    this.isFav = isFav;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20025 inlineResponse20025 = (InlineResponse20025) o;
    return Objects.equals(this.status, inlineResponse20025.status) &&
        Objects.equals(this.data, inlineResponse20025.data) &&
        Objects.equals(this.isFav, inlineResponse20025.isFav);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data, isFav);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20025 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isFav: ").append(toIndentedString(isFav)).append("\n");
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

