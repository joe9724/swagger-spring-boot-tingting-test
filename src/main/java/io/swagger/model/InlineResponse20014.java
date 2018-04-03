package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Album;
import io.swagger.model.Book;
import io.swagger.model.Chapter;
import io.swagger.model.Record;
import io.swagger.model.Response;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20014
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InlineResponse20014   {
  @JsonProperty("status")
  private Response status = null;

  @JsonProperty("albumList")
  @Valid
  private List<Album> albumList = null;

  @JsonProperty("bookList")
  @Valid
  private List<Book> bookList = null;

  @JsonProperty("recordList")
  @Valid
  private List<Record> recordList = null;

  @JsonProperty("chapterList")
  @Valid
  private List<Chapter> chapterList = null;

  public InlineResponse20014 status(Response status) {
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

  public InlineResponse20014 albumList(List<Album> albumList) {
    this.albumList = albumList;
    return this;
  }

  public InlineResponse20014 addAlbumListItem(Album albumListItem) {
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

  public InlineResponse20014 bookList(List<Book> bookList) {
    this.bookList = bookList;
    return this;
  }

  public InlineResponse20014 addBookListItem(Book bookListItem) {
    if (this.bookList == null) {
      this.bookList = new ArrayList<Book>();
    }
    this.bookList.add(bookListItem);
    return this;
  }

   /**
   * Get bookList
   * @return bookList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Book> getBookList() {
    return bookList;
  }

  public void setBookList(List<Book> bookList) {
    this.bookList = bookList;
  }

  public InlineResponse20014 recordList(List<Record> recordList) {
    this.recordList = recordList;
    return this;
  }

  public InlineResponse20014 addRecordListItem(Record recordListItem) {
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

  public InlineResponse20014 chapterList(List<Chapter> chapterList) {
    this.chapterList = chapterList;
    return this;
  }

  public InlineResponse20014 addChapterListItem(Chapter chapterListItem) {
    if (this.chapterList == null) {
      this.chapterList = new ArrayList<Chapter>();
    }
    this.chapterList.add(chapterListItem);
    return this;
  }

   /**
   * Get chapterList
   * @return chapterList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Chapter> getChapterList() {
    return chapterList;
  }

  public void setChapterList(List<Chapter> chapterList) {
    this.chapterList = chapterList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014 inlineResponse20014 = (InlineResponse20014) o;
    return Objects.equals(this.status, inlineResponse20014.status) &&
        Objects.equals(this.albumList, inlineResponse20014.albumList) &&
        Objects.equals(this.bookList, inlineResponse20014.bookList) &&
        Objects.equals(this.recordList, inlineResponse20014.recordList) &&
        Objects.equals(this.chapterList, inlineResponse20014.chapterList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, albumList, bookList, recordList, chapterList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    albumList: ").append(toIndentedString(albumList)).append("\n");
    sb.append("    bookList: ").append(toIndentedString(bookList)).append("\n");
    sb.append("    recordList: ").append(toIndentedString(recordList)).append("\n");
    sb.append("    chapterList: ").append(toIndentedString(chapterList)).append("\n");
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

