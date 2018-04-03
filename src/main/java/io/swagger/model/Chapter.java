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
 * Chapter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class Chapter   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("subTitle")
  private String subTitle = null;

  @JsonProperty("showIcon")
  private Boolean showIcon = null;

  @JsonProperty("bigCover")
  private String bigCover = null;

  @JsonProperty("playCount")
  private Long playCount = null;

  @JsonProperty("duration")
  private Long duration = null;

  @JsonProperty("updateTips")
  private String updateTips = null;

  @JsonProperty("mp3Url")
  private String mp3Url = null;

  @JsonProperty("hlsUrl")
  private String hlsUrl = null;

  @JsonProperty("order")
  private Long order = null;

  @JsonProperty("summary")
  private String summary = null;

  public Chapter name(String name) {
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

  public Chapter icon(String icon) {
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

  public Chapter subTitle(String subTitle) {
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

  public Chapter showIcon(Boolean showIcon) {
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

  public Chapter bigCover(String bigCover) {
    this.bigCover = bigCover;
    return this;
  }

   /**
   * Get bigCover
   * @return bigCover
  **/
  @ApiModelProperty(value = "")


  public String getBigCover() {
    return bigCover;
  }

  public void setBigCover(String bigCover) {
    this.bigCover = bigCover;
  }

  public Chapter playCount(Long playCount) {
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

  public Chapter duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")


  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public Chapter updateTips(String updateTips) {
    this.updateTips = updateTips;
    return this;
  }

   /**
   * Get updateTips
   * @return updateTips
  **/
  @ApiModelProperty(value = "")


  public String getUpdateTips() {
    return updateTips;
  }

  public void setUpdateTips(String updateTips) {
    this.updateTips = updateTips;
  }

  public Chapter mp3Url(String mp3Url) {
    this.mp3Url = mp3Url;
    return this;
  }

   /**
   * Get mp3Url
   * @return mp3Url
  **/
  @ApiModelProperty(value = "")


  public String getMp3Url() {
    return mp3Url;
  }

  public void setMp3Url(String mp3Url) {
    this.mp3Url = mp3Url;
  }

  public Chapter hlsUrl(String hlsUrl) {
    this.hlsUrl = hlsUrl;
    return this;
  }

   /**
   * Get hlsUrl
   * @return hlsUrl
  **/
  @ApiModelProperty(value = "")


  public String getHlsUrl() {
    return hlsUrl;
  }

  public void setHlsUrl(String hlsUrl) {
    this.hlsUrl = hlsUrl;
  }

  public Chapter order(Long order) {
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

  public Chapter summary(String summary) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chapter chapter = (Chapter) o;
    return Objects.equals(this.name, chapter.name) &&
        Objects.equals(this.icon, chapter.icon) &&
        Objects.equals(this.subTitle, chapter.subTitle) &&
        Objects.equals(this.showIcon, chapter.showIcon) &&
        Objects.equals(this.bigCover, chapter.bigCover) &&
        Objects.equals(this.playCount, chapter.playCount) &&
        Objects.equals(this.duration, chapter.duration) &&
        Objects.equals(this.updateTips, chapter.updateTips) &&
        Objects.equals(this.mp3Url, chapter.mp3Url) &&
        Objects.equals(this.hlsUrl, chapter.hlsUrl) &&
        Objects.equals(this.order, chapter.order) &&
        Objects.equals(this.summary, chapter.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, icon, subTitle, showIcon, bigCover, playCount, duration, updateTips, mp3Url, hlsUrl, order, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chapter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    showIcon: ").append(toIndentedString(showIcon)).append("\n");
    sb.append("    bigCover: ").append(toIndentedString(bigCover)).append("\n");
    sb.append("    playCount: ").append(toIndentedString(playCount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    updateTips: ").append(toIndentedString(updateTips)).append("\n");
    sb.append("    mp3Url: ").append(toIndentedString(mp3Url)).append("\n");
    sb.append("    hlsUrl: ").append(toIndentedString(hlsUrl)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

