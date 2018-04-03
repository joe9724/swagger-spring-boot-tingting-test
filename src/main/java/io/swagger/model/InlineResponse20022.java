package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Chapter;
import io.swagger.model.Response;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20022
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InlineResponse20022   {
  @JsonProperty("status")
  private Response status = null;

  @JsonProperty("chapters")
  @Valid
  private List<Chapter> chapters = null;

  public InlineResponse20022 status(Response status) {
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

  public InlineResponse20022 chapters(List<Chapter> chapters) {
    this.chapters = chapters;
    return this;
  }

  public InlineResponse20022 addChaptersItem(Chapter chaptersItem) {
    if (this.chapters == null) {
      this.chapters = new ArrayList<Chapter>();
    }
    this.chapters.add(chaptersItem);
    return this;
  }

   /**
   * Get chapters
   * @return chapters
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Chapter> getChapters() {
    return chapters;
  }

  public void setChapters(List<Chapter> chapters) {
    this.chapters = chapters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20022 inlineResponse20022 = (InlineResponse20022) o;
    return Objects.equals(this.status, inlineResponse20022.status) &&
        Objects.equals(this.chapters, inlineResponse20022.chapters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, chapters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20022 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    chapters: ").append(toIndentedString(chapters)).append("\n");
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

