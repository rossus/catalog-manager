package com.rossus.catalogmanager.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EditPricePlanRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-09T19:30:30.590+03:00")

public class EditPricePlanRequest   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("since")
  private LocalDate since = null;

  @JsonProperty("until")
  private LocalDate until = null;

  public EditPricePlanRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Return of the king", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EditPricePlanRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Special plan to the anniversary of king Elessar's coronation", value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EditPricePlanRequest since(LocalDate since) {
    this.since = since;
    return this;
  }

   /**
   * Get since
   * @return since
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getSince() {
    return since;
  }

  public void setSince(LocalDate since) {
    this.since = since;
  }

  public EditPricePlanRequest until(LocalDate until) {
    this.until = until;
    return this;
  }

   /**
   * Get until
   * @return until
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getUntil() {
    return until;
  }

  public void setUntil(LocalDate until) {
    this.until = until;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditPricePlanRequest editPricePlanRequest = (EditPricePlanRequest) o;
    return Objects.equals(this.name, editPricePlanRequest.name) &&
        Objects.equals(this.description, editPricePlanRequest.description) &&
        Objects.equals(this.since, editPricePlanRequest.since) &&
        Objects.equals(this.until, editPricePlanRequest.until);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, since, until);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditPricePlanRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
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

