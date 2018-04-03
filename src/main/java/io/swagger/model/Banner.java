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
 * 大图
 */
@ApiModel(description = "大图")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class Banner   {
  @JsonProperty("cover")
  private String cover = null;

  @JsonProperty("type")
  private Long type = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("order")
  private Long order = null;

  @JsonProperty("extraInfo1")
  private Long extraInfo1 = null;

  @JsonProperty("extraInfo2")
  private String extraInfo2 = null;

  @JsonProperty("extraInfo3")
  private String extraInfo3 = null;

  public Banner cover(String cover) {
    this.cover = cover;
    return this;
  }

   /**
   * Get cover
   * @return cover
  **/
  @ApiModelProperty(value = "")


  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }

  public Banner type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public Banner id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Banner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 跳转类型(0=大类 1=小类 2=专辑 3=书本 4=章节 5=站内wap 6=第三方链接)
   * @return name
  **/
  @ApiModelProperty(value = "跳转类型(0=大类 1=小类 2=专辑 3=书本 4=章节 5=站内wap 6=第三方链接)")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Banner order(Long order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")


  public Long getOrder() {
    return order;
  }

  public void setOrder(Long order) {
    this.order = order;
  }

  public Banner extraInfo1(Long extraInfo1) {
    this.extraInfo1 = extraInfo1;
    return this;
  }

   /**
   * 备用字段
   * @return extraInfo1
  **/
  @ApiModelProperty(value = "备用字段")


  public Long getExtraInfo1() {
    return extraInfo1;
  }

  public void setExtraInfo1(Long extraInfo1) {
    this.extraInfo1 = extraInfo1;
  }

  public Banner extraInfo2(String extraInfo2) {
    this.extraInfo2 = extraInfo2;
    return this;
  }

   /**
   * 备用字段
   * @return extraInfo2
  **/
  @ApiModelProperty(value = "备用字段")


  public String getExtraInfo2() {
    return extraInfo2;
  }

  public void setExtraInfo2(String extraInfo2) {
    this.extraInfo2 = extraInfo2;
  }

  public Banner extraInfo3(String extraInfo3) {
    this.extraInfo3 = extraInfo3;
    return this;
  }

   /**
   * 备用字段
   * @return extraInfo3
  **/
  @ApiModelProperty(value = "备用字段")


  public String getExtraInfo3() {
    return extraInfo3;
  }

  public void setExtraInfo3(String extraInfo3) {
    this.extraInfo3 = extraInfo3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Banner banner = (Banner) o;
    return Objects.equals(this.cover, banner.cover) &&
        Objects.equals(this.type, banner.type) &&
        Objects.equals(this.id, banner.id) &&
        Objects.equals(this.name, banner.name) &&
        Objects.equals(this.order, banner.order) &&
        Objects.equals(this.extraInfo1, banner.extraInfo1) &&
        Objects.equals(this.extraInfo2, banner.extraInfo2) &&
        Objects.equals(this.extraInfo3, banner.extraInfo3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cover, type, id, name, order, extraInfo1, extraInfo2, extraInfo3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Banner {\n");
    
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    extraInfo1: ").append(toIndentedString(extraInfo1)).append("\n");
    sb.append("    extraInfo2: ").append(toIndentedString(extraInfo2)).append("\n");
    sb.append("    extraInfo3: ").append(toIndentedString(extraInfo3)).append("\n");
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

