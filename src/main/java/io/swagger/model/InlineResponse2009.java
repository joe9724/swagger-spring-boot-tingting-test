package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Album;
import io.swagger.model.Response;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2009
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InlineResponse2009   {
  @JsonProperty("status")
  private Response status = null;

  @JsonProperty("albumList")
  @Valid
  private List<Album> albumList = null;

  public InlineResponse2009 status(Response status) {
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

  public InlineResponse2009 albumList(List<Album> albumList) {
    this.albumList = albumList;
    return this;
  }

  public InlineResponse2009 addAlbumListItem(Album albumListItem) {
    if (this.albumList == null) {
      this.albumList = new ArrayList<Album>();
    }
    this.albumList.add(albumListItem);
    return this;
  }

   /**
   * Get albumList
   * @return albumList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Album> getAlbumList() {
    return albumList;
  }

  public void setAlbumList(List<Album> albumList) {
    this.albumList = albumList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009 inlineResponse2009 = (InlineResponse2009) o;
    return Objects.equals(this.status, inlineResponse2009.status) &&
        Objects.equals(this.albumList, inlineResponse2009.albumList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, albumList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    albumList: ").append(toIndentedString(albumList)).append("\n");
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

