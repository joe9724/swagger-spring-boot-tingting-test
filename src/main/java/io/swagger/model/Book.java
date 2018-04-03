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
 * Book
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class Book   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("subTitle")
  private String subTitle = null;

  @JsonProperty("showIcon")
  private Boolean showIcon = null;

  @JsonProperty("subCategoryId")
  private Long subCategoryId = null;

  @JsonProperty("playCount")
  private Long playCount = null;

  @JsonProperty("clipsNumber")
  private Long clipsNumber = null;

  @JsonProperty("authorAvatar")
  private String authorAvatar = null;

  @JsonProperty("authorName")
  private String authorName = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("bookId")
  private Long bookId = null;

  public Book name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public Book subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

   /**
   * Get subTitle
   * @return subTitle
  **/
  @ApiModelProperty(value = "")


  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  public Book showIcon(Boolean showIcon) {
    this.showIcon = showIcon;
    return this;
  }

   /**
   * Get showIcon
   * @return showIcon
  **/
  @ApiModelProperty(value = "")


  public Boolean isShowIcon() {
    return showIcon;
  }

  public void setShowIcon(Boolean showIcon) {
    this.showIcon = showIcon;
  }

  public Book subCategoryId(Long subCategoryId) {
    this.subCategoryId = subCategoryId;
    return this;
  }

   /**
   * Get subCategoryId
   * @return subCategoryId
  **/
  @ApiModelProperty(value = "")


  public Long getSubCategoryId() {
    return subCategoryId;
  }

  public void setSubCategoryId(Long subCategoryId) {
    this.subCategoryId = subCategoryId;
  }

  public Book playCount(Long playCount) {
    this.playCount = playCount;
    return this;
  }

   /**
   * Get playCount
   * @return playCount
  **/
  @ApiModelProperty(value = "")


  public Long getPlayCount() {
    return playCount;
  }

  public void setPlayCount(Long playCount) {
    this.playCount = playCount;
  }

  public Book clipsNumber(Long clipsNumber) {
    this.clipsNumber = clipsNumber;
    return this;
  }

   /**
   * Get clipsNumber
   * @return clipsNumber
  **/
  @ApiModelProperty(value = "")


  public Long getClipsNumber() {
    return clipsNumber;
  }

  public void setClipsNumber(Long clipsNumber) {
    this.clipsNumber = clipsNumber;
  }

  public Book authorAvatar(String authorAvatar) {
    this.authorAvatar = authorAvatar;
    return this;
  }

   /**
   * Get authorAvatar
   * @return authorAvatar
  **/
  @ApiModelProperty(value = "")


  public String getAuthorAvatar() {
    return authorAvatar;
  }

  public void setAuthorAvatar(String authorAvatar) {
    this.authorAvatar = authorAvatar;
  }

  public Book authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

   /**
   * Get authorName
   * @return authorName
  **/
  @ApiModelProperty(value = "")


  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public Book summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Book bookId(Long bookId) {
    this.bookId = bookId;
    return this;
  }

   /**
   * Get bookId
   * @return bookId
  **/
  @ApiModelProperty(value = "")


  public Long getBookId() {
    return bookId;
  }

  public void setBookId(Long bookId) {
    this.bookId = bookId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.name, book.name) &&
        Objects.equals(this.icon, book.icon) &&
        Objects.equals(this.subTitle, book.subTitle) &&
        Objects.equals(this.showIcon, book.showIcon) &&
        Objects.equals(this.subCategoryId, book.subCategoryId) &&
        Objects.equals(this.playCount, book.playCount) &&
        Objects.equals(this.clipsNumber, book.clipsNumber) &&
        Objects.equals(this.authorAvatar, book.authorAvatar) &&
        Objects.equals(this.authorName, book.authorName) &&
        Objects.equals(this.summary, book.summary) &&
        Objects.equals(this.bookId, book.bookId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, icon, subTitle, showIcon, subCategoryId, playCount, clipsNumber, authorAvatar, authorName, summary, bookId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    showIcon: ").append(toIndentedString(showIcon)).append("\n");
    sb.append("    subCategoryId: ").append(toIndentedString(subCategoryId)).append("\n");
    sb.append("    playCount: ").append(toIndentedString(playCount)).append("\n");
    sb.append("    clipsNumber: ").append(toIndentedString(clipsNumber)).append("\n");
    sb.append("    authorAvatar: ").append(toIndentedString(authorAvatar)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
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

