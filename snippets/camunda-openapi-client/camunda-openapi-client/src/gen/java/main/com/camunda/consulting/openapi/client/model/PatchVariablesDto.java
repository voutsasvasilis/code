/*
 * Camunda BPM REST API
 * OpenApi Spec for Camunda BPM REST API.
 *
 * The version of the OpenAPI document: 7.13.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.openapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.camunda.consulting.openapi.client.model.VariableValueDto;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PatchVariablesDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-14T01:59:23.608853+02:00[Europe/Berlin]")
public class PatchVariablesDto {
  public static final String SERIALIZED_NAME_MODIFICATIONS = "modifications";
  @SerializedName(SERIALIZED_NAME_MODIFICATIONS)
  private Map<String, VariableValueDto> modifications = null;

  public static final String SERIALIZED_NAME_DELETIONS = "deletions";
  @SerializedName(SERIALIZED_NAME_DELETIONS)
  private List<String> deletions = null;


  public PatchVariablesDto modifications(Map<String, VariableValueDto> modifications) {
    
    this.modifications = modifications;
    return this;
  }

  public PatchVariablesDto putModificationsItem(String key, VariableValueDto modificationsItem) {
    if (this.modifications == null) {
      this.modifications = new HashMap<String, VariableValueDto>();
    }
    this.modifications.put(key, modificationsItem);
    return this;
  }

   /**
   * A JSON object containing variable key-value pairs.
   * @return modifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object containing variable key-value pairs.")

  public Map<String, VariableValueDto> getModifications() {
    return modifications;
  }


  public void setModifications(Map<String, VariableValueDto> modifications) {
    this.modifications = modifications;
  }


  public PatchVariablesDto deletions(List<String> deletions) {
    
    this.deletions = deletions;
    return this;
  }

  public PatchVariablesDto addDeletionsItem(String deletionsItem) {
    if (this.deletions == null) {
      this.deletions = new ArrayList<String>();
    }
    this.deletions.add(deletionsItem);
    return this;
  }

   /**
   * An array of String keys of variables to be deleted.
   * @return deletions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of String keys of variables to be deleted.")

  public List<String> getDeletions() {
    return deletions;
  }


  public void setDeletions(List<String> deletions) {
    this.deletions = deletions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchVariablesDto patchVariablesDto = (PatchVariablesDto) o;
    return Objects.equals(this.modifications, patchVariablesDto.modifications) &&
        Objects.equals(this.deletions, patchVariablesDto.deletions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifications, deletions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchVariablesDto {\n");
    sb.append("    modifications: ").append(toIndentedString(modifications)).append("\n");
    sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
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

