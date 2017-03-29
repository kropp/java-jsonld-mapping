/*
 * Copyright 2015-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * An intangible item that describes an alignment between a learning resource and a node in an educational framework.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_LRMIClass
 */
public class AlignmentObject extends Intangible {
  /**
   * A category of alignment between the learning resource and the framework node. Recommended values include: 'assesses', 'teaches', 'requires', 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationalLevel'.
   */
  @JsonIgnore public String getAlignmentType() {
    return (String) getValue("alignmentType");
  }
  /**
   * A category of alignment between the learning resource and the framework node. Recommended values include: 'assesses', 'teaches', 'requires', 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationalLevel'.
   */
  @JsonIgnore public Collection<String> getAlignmentTypes() {
    final Object current = myData.get("alignmentType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The framework to which the resource being described is aligned.
   */
  @JsonIgnore public String getEducationalFramework() {
    return (String) getValue("educationalFramework");
  }
  /**
   * The framework to which the resource being described is aligned.
   */
  @JsonIgnore public Collection<String> getEducationalFrameworks() {
    final Object current = myData.get("educationalFramework");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The description of a node in an established educational framework.
   */
  @JsonIgnore public String getTargetDescription() {
    return (String) getValue("targetDescription");
  }
  /**
   * The description of a node in an established educational framework.
   */
  @JsonIgnore public Collection<String> getTargetDescriptions() {
    final Object current = myData.get("targetDescription");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The name of a node in an established educational framework.
   */
  @JsonIgnore public String getTargetName() {
    return (String) getValue("targetName");
  }
  /**
   * The name of a node in an established educational framework.
   */
  @JsonIgnore public Collection<String> getTargetNames() {
    final Object current = myData.get("targetName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The URL of a node in an established educational framework.
   */
  @JsonIgnore public String getTargetUrl() {
    return (String) getValue("targetUrl");
  }
  /**
   * The URL of a node in an established educational framework.
   */
  @JsonIgnore public Collection<String> getTargetUrls() {
    final Object current = myData.get("targetUrl");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected AlignmentObject(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link AlignmentObject}
   */
  public static class Builder extends Intangible.Builder {
    @NotNull public AlignmentObject build() {
      return new AlignmentObject(myData);
    }
    /**
     * A category of alignment between the learning resource and the framework node. Recommended values include: 'assesses', 'teaches', 'requires', 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationalLevel'.
     */
    @NotNull public Builder alignmentType(@NotNull String alignmentType) {
      putValue("alignmentType", alignmentType);
      return this;
    }
    /**
     * The framework to which the resource being described is aligned.
     */
    @NotNull public Builder educationalFramework(@NotNull String educationalFramework) {
      putValue("educationalFramework", educationalFramework);
      return this;
    }
    /**
     * The description of a node in an established educational framework.
     */
    @NotNull public Builder targetDescription(@NotNull String targetDescription) {
      putValue("targetDescription", targetDescription);
      return this;
    }
    /**
     * The name of a node in an established educational framework.
     */
    @NotNull public Builder targetName(@NotNull String targetName) {
      putValue("targetName", targetName);
      return this;
    }
    /**
     * The URL of a node in an established educational framework.
     */
    @NotNull public Builder targetUrl(@NotNull String targetUrl) {
      putValue("targetUrl", targetUrl);
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     */
    @NotNull public Builder disambiguatingDescription(@NotNull String disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("alignmentType".equals(key) && value instanceof String) { alignmentType((String)value); return; }
      if ("alignmentTypes".equals(key) && value instanceof String) { alignmentType((String)value); return; }
      if ("educationalFramework".equals(key) && value instanceof String) { educationalFramework((String)value); return; }
      if ("educationalFrameworks".equals(key) && value instanceof String) { educationalFramework((String)value); return; }
      if ("targetDescription".equals(key) && value instanceof String) { targetDescription((String)value); return; }
      if ("targetDescriptions".equals(key) && value instanceof String) { targetDescription((String)value); return; }
      if ("targetName".equals(key) && value instanceof String) { targetName((String)value); return; }
      if ("targetNames".equals(key) && value instanceof String) { targetName((String)value); return; }
      if ("targetUrl".equals(key) && value instanceof String) { targetUrl((String)value); return; }
      if ("targetUrls".equals(key) && value instanceof String) { targetUrl((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
