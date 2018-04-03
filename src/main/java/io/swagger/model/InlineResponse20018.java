package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Record;
import io.swagger.model.Response;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20018
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InlineResponse20018   {
  @JsonProperty("status")
  private Response status = null;

  @JsonProperty("recordList")
  @Valid
  private List<Record> recordList = null;

  public InlineResponse20018 status(Response status) {
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

  public InlineResponse20018 recordList(List<Record> recordList) {
    this.recordList = recordList;
    return this;
  }

  public InlineResponse20018 addRecordListItem(Record recordListItem) {
    if (this.recordList == null) {
      this.recordList = new ArrayList<Record>();
    }
    this.recordList.add(recordListItem);
    return this;
  }

   /**
   * Get recordList
   * @return recordList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Record> getRecordList() {
    return recordList;
  }

  public void setRecordList(List<Record> recordList) {
    this.recordList = recordList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018 inlineResponse20018 = (InlineResponse20018) o;
    return Objects.equals(this.status, inlineResponse20018.status) &&
        Objects.equals(this.recordList, inlineResponse20018.recordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, recordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recordList: ").append(toIndentedString(recordList)).append("\n");
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

