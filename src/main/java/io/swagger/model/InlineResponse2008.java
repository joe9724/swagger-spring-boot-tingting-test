package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Album;
import io.swagger.model.Response;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2008
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InlineResponse2008   {
  @JsonProperty("status")
  private Response status = null;

  @JsonProperty("data")
  private Album data = null;

  @JsonProperty("isFav")
  private Boolean isFav = null;

  public InlineResponse2008 status(Response status) {
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

  public InlineResponse2008 data(Album data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Album getData() {
    return data;
  }

  public void setData(Album data) {
    this.data = data;
  }

  public InlineResponse2008 isFav(Boolean isFav) {
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
    InlineResponse2008 inlineResponse2008 = (InlineResponse2008) o;
    return Objects.equals(this.status, inlineResponse2008.status) &&
        Objects.equals(this.data, inlineResponse2008.data) &&
        Objects.equals(this.isFav, inlineResponse2008.isFav);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data, isFav);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008 {\n");
    
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

