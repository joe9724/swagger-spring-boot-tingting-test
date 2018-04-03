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
 * SubCategoryItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class SubCategoryItem   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("showicon")
  private Boolean showicon = null;

  @JsonProperty("categoryId")
  private Long categoryId = null;

  public SubCategoryItem name(String name) {
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

  public SubCategoryItem summary(String summary) {
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

  public SubCategoryItem icon(String icon) {
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

  public SubCategoryItem showicon(Boolean showicon) {
    this.showicon = showicon;
    return this;
  }

   /**
   * Get showicon
   * @return showicon
  **/
  @ApiModelProperty(value = "")


  public Boolean isShowicon() {
    return showicon;
  }

  public void setShowicon(Boolean showicon) {
    this.showicon = showicon;
  }

  public SubCategoryItem categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(value = "")


  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubCategoryItem subCategoryItem = (SubCategoryItem) o;
    return Objects.equals(this.name, subCategoryItem.name) &&
        Objects.equals(this.summary, subCategoryItem.summary) &&
        Objects.equals(this.icon, subCategoryItem.icon) &&
        Objects.equals(this.showicon, subCategoryItem.showicon) &&
        Objects.equals(this.categoryId, subCategoryItem.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, summary, icon, showicon, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubCategoryItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    showicon: ").append(toIndentedString(showicon)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

