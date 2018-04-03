package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubCategoryItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Category
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class Category   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("subCategory")
  @Valid
  private List<SubCategoryItem> subCategory = null;

  public Category name(String name) {
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

  public Category summary(String summary) {
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

  public Category subCategory(List<SubCategoryItem> subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  public Category addSubCategoryItem(SubCategoryItem subCategoryItem) {
    if (this.subCategory == null) {
      this.subCategory = new ArrayList<SubCategoryItem>();
    }
    this.subCategory.add(subCategoryItem);
    return this;
  }

   /**
   * Get subCategory
   * @return subCategory
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SubCategoryItem> getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(List<SubCategoryItem> subCategory) {
    this.subCategory = subCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.name, category.name) &&
        Objects.equals(this.summary, category.summary) &&
        Objects.equals(this.subCategory, category.subCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, summary, subCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
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

