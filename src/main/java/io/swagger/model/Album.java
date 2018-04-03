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
 * Album
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class Album   {
  @JsonProperty("albumName")
  private String albumName = null;

  @JsonProperty("albumId")
  private Long albumId = null;

  public Album albumName(String albumName) {
    this.albumName = albumName;
    return this;
  }

   /**
   * Get albumName
   * @return albumName
  **/
  @ApiModelProperty(value = "")


  public String getAlbumName() {
    return albumName;
  }

  public void setAlbumName(String albumName) {
    this.albumName = albumName;
  }

  public Album albumId(Long albumId) {
    this.albumId = albumId;
    return this;
  }

   /**
   * Get albumId
   * @return albumId
  **/
  @ApiModelProperty(value = "")


  public Long getAlbumId() {
    return albumId;
  }

  public void setAlbumId(Long albumId) {
    this.albumId = albumId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Album album = (Album) o;
    return Objects.equals(this.albumName, album.albumName) &&
        Objects.equals(this.albumId, album.albumId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(albumName, albumId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Album {\n");
    
    sb.append("    albumName: ").append(toIndentedString(albumName)).append("\n");
    sb.append("    albumId: ").append(toIndentedString(albumId)).append("\n");
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

