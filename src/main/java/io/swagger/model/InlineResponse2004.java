package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Icon;
import io.swagger.model.Response;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2004
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InlineResponse2004   {
  @JsonProperty("status")
  private Response status = null;

  @JsonProperty("icons")
  @Valid
  private List<Icon> icons = null;

  public InlineResponse2004 status(Response status) {
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

  public InlineResponse2004 icons(List<Icon> icons) {
    this.icons = icons;
    return this;
  }

  public InlineResponse2004 addIconsItem(Icon iconsItem) {
    if (this.icons == null) {
      this.icons = new ArrayList<Icon>();
    }
    this.icons.add(iconsItem);
    return this;
  }

   /**
   * Get icons
   * @return icons
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Icon> getIcons() {
    return icons;
  }

  public void setIcons(List<Icon> icons) {
    this.icons = icons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.status, inlineResponse2004.status) &&
        Objects.equals(this.icons, inlineResponse2004.icons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, icons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    icons: ").append(toIndentedString(icons)).append("\n");
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

