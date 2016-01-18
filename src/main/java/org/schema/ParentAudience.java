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

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.*;

/**
 * A set of characteristics describing parents, who can be interested in viewing some content.
 */
public class ParentAudience extends PeopleAudience {
  /**
   * Maximal age of the child.
   */
  public Number getChildMaxAge() {
    return myChildMaxAge;
  }
  /**
   * Minimal age of the child.
   */
  public Number getChildMinAge() {
    return myChildMinAge;
  }
  /**
   * Builder for {@link ParentAudience}
   */
  static final class ParentAudienceThingBuilder implements Builder {
    /**
     * Creates new {@link ParentAudience} instance.
     */
    public ParentAudience build() {
      return new ParentAudience(childMaxAge, childMinAge, healthCondition, requiredGender, requiredMaxAge, requiredMinAge, suggestedGender, suggestedMaxAge, suggestedMinAge, audienceType, geographicArea, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * Maximal age of the child.
     */
    @NotNull public Builder childMaxAge(int childMaxAge) {
      if (this.childMaxAge == null) this.childMaxAge = new Number();
      this.childMaxAge.setInt(childMaxAge);
      return this;
    }
    /**
     * Maximal age of the child.
     */
    @NotNull public Builder childMaxAge(long childMaxAge) {
      if (this.childMaxAge == null) this.childMaxAge = new Number();
      this.childMaxAge.setLong(childMaxAge);
      return this;
    }
    /**
     * Maximal age of the child.
     */
    @NotNull public Builder childMaxAge(float childMaxAge) {
      if (this.childMaxAge == null) this.childMaxAge = new Number();
      this.childMaxAge.setFloat(childMaxAge);
      return this;
    }
    /**
     * Maximal age of the child.
     */
    @NotNull public Builder childMaxAge(double childMaxAge) {
      if (this.childMaxAge == null) this.childMaxAge = new Number();
      this.childMaxAge.setDouble(childMaxAge);
      return this;
    }
    /**
     * Maximal age of the child.
     */
    @NotNull public Builder childMaxAge(String childMaxAge) {
      if (this.childMaxAge == null) this.childMaxAge = new Number();
      this.childMaxAge.setString(childMaxAge);
      return this;
    }
    /**
     * Minimal age of the child.
     */
    @NotNull public Builder childMinAge(int childMinAge) {
      if (this.childMinAge == null) this.childMinAge = new Number();
      this.childMinAge.setInt(childMinAge);
      return this;
    }
    /**
     * Minimal age of the child.
     */
    @NotNull public Builder childMinAge(long childMinAge) {
      if (this.childMinAge == null) this.childMinAge = new Number();
      this.childMinAge.setLong(childMinAge);
      return this;
    }
    /**
     * Minimal age of the child.
     */
    @NotNull public Builder childMinAge(float childMinAge) {
      if (this.childMinAge == null) this.childMinAge = new Number();
      this.childMinAge.setFloat(childMinAge);
      return this;
    }
    /**
     * Minimal age of the child.
     */
    @NotNull public Builder childMinAge(double childMinAge) {
      if (this.childMinAge == null) this.childMinAge = new Number();
      this.childMinAge.setDouble(childMinAge);
      return this;
    }
    /**
     * Minimal age of the child.
     */
    @NotNull public Builder childMinAge(String childMinAge) {
      if (this.childMinAge == null) this.childMinAge = new Number();
      this.childMinAge.setString(childMinAge);
      return this;
    }
    /**
     * Expectations for health conditions of target audience.
     */
    @NotNull public Builder healthCondition(MedicalCondition medicalCondition) {
      this.healthCondition = medicalCondition;
      return this;
    }
    /**
     * Expectations for health conditions of target audience.
     */
    @NotNull public Builder healthCondition(MedicalCondition.Builder medicalCondition) {
      return this.healthCondition(medicalCondition.build());
    }
    /**
     * Audiences defined by a person's gender.
     */
    @NotNull public Builder requiredGender(String requiredGender) {
      this.requiredGender = requiredGender;
      return this;
    }
    /**
     * Audiences defined by a person's maximum age.
     */
    @NotNull public Builder requiredMaxAge(int requiredMaxAge) {
      this.requiredMaxAge = requiredMaxAge;
      return this;
    }
    /**
     * Audiences defined by a person's minimum age.
     */
    @NotNull public Builder requiredMinAge(int requiredMinAge) {
      this.requiredMinAge = requiredMinAge;
      return this;
    }
    /**
     * The gender of the person or audience.
     */
    @NotNull public Builder suggestedGender(String suggestedGender) {
      this.suggestedGender = suggestedGender;
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(int suggestedMaxAge) {
      if (this.suggestedMaxAge == null) this.suggestedMaxAge = new Number();
      this.suggestedMaxAge.setInt(suggestedMaxAge);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(long suggestedMaxAge) {
      if (this.suggestedMaxAge == null) this.suggestedMaxAge = new Number();
      this.suggestedMaxAge.setLong(suggestedMaxAge);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(float suggestedMaxAge) {
      if (this.suggestedMaxAge == null) this.suggestedMaxAge = new Number();
      this.suggestedMaxAge.setFloat(suggestedMaxAge);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(double suggestedMaxAge) {
      if (this.suggestedMaxAge == null) this.suggestedMaxAge = new Number();
      this.suggestedMaxAge.setDouble(suggestedMaxAge);
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMaxAge(String suggestedMaxAge) {
      if (this.suggestedMaxAge == null) this.suggestedMaxAge = new Number();
      this.suggestedMaxAge.setString(suggestedMaxAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(int suggestedMinAge) {
      if (this.suggestedMinAge == null) this.suggestedMinAge = new Number();
      this.suggestedMinAge.setInt(suggestedMinAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(long suggestedMinAge) {
      if (this.suggestedMinAge == null) this.suggestedMinAge = new Number();
      this.suggestedMinAge.setLong(suggestedMinAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(float suggestedMinAge) {
      if (this.suggestedMinAge == null) this.suggestedMinAge = new Number();
      this.suggestedMinAge.setFloat(suggestedMinAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(double suggestedMinAge) {
      if (this.suggestedMinAge == null) this.suggestedMinAge = new Number();
      this.suggestedMinAge.setDouble(suggestedMinAge);
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    @NotNull public Builder suggestedMinAge(String suggestedMinAge) {
      if (this.suggestedMinAge == null) this.suggestedMinAge = new Number();
      this.suggestedMinAge.setString(suggestedMinAge);
      return this;
    }
    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     */
    @NotNull public Builder audienceType(String audienceType) {
      this.audienceType = audienceType;
      return this;
    }
    /**
     * The geographic area associated with the audience.
     */
    @NotNull public Builder geographicArea(AdministrativeArea administrativeArea) {
      this.geographicArea = administrativeArea;
      return this;
    }
    /**
     * The geographic area associated with the audience.
     */
    @NotNull public Builder geographicArea(AdministrativeArea.Builder administrativeArea) {
      return this.geographicArea(administrativeArea.build());
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(String additionalType) {
      this.additionalType = additionalType;
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(String alternateName) {
      this.alternateName = alternateName;
      return this;
    }
    /**
     * A short description of the item.
     */
    @NotNull public Builder description(String description) {
      this.description = description;
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
      <br /><br />
      Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
      example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
      represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
      between the page and the primary entity.
      <br /><br />

      Related properties include sameAs, about, and url.
      <br /><br />

      The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
      official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
      to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
      serves more to clarify which of several entities is the main one for that page.
      <br /><br />

      mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
      for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
      mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
      <br /><br />

      about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
      while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
      describes some other entity. For example, one web page may display a news article about a particular person.
      Another page may display a product review for a particular product. In these cases, mainEntity for the pages
      should refer to the news article or review, respectively, while about would more properly refer to the person or product.
      
     */
    @NotNull public Builder mainEntityOfPage(CreativeWork creativeWork) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setCreativeWork(creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
      <br /><br />
      Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
      example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
      represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
      between the page and the primary entity.
      <br /><br />

      Related properties include sameAs, about, and url.
      <br /><br />

      The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
      official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
      to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
      serves more to clarify which of several entities is the main one for that page.
      <br /><br />

      mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
      for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
      mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
      <br /><br />

      about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
      while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
      describes some other entity. For example, one web page may display a news article about a particular person.
      Another page may display a product review for a particular product. In these cases, mainEntity for the pages
      should refer to the news article or review, respectively, while about would more properly refer to the person or product.
      
     */
    @NotNull public Builder mainEntityOfPage(CreativeWork.Builder creativeWork) {
      return this.mainEntityOfPage(creativeWork.build());
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
      <br /><br />
      Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
      example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
      represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
      between the page and the primary entity.
      <br /><br />

      Related properties include sameAs, about, and url.
      <br /><br />

      The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
      official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
      to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
      serves more to clarify which of several entities is the main one for that page.
      <br /><br />

      mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
      for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
      mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
      <br /><br />

      about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
      while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
      describes some other entity. For example, one web page may display a news article about a particular person.
      Another page may display a product review for a particular product. In these cases, mainEntity for the pages
      should refer to the news article or review, respectively, while about would more properly refer to the person or product.
      
     */
    @NotNull public Builder mainEntityOfPage(String mainEntityOfPage) {
      if (this.mainEntityOfPage == null) this.mainEntityOfPage = new CreativeWorkOrString();
      this.mainEntityOfPage.setString(mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(String name) {
      this.name = name;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    @NotNull public Builder sameAs(String sameAs) {
      this.sameAs = sameAs;
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(String url) {
      this.url = url;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action action) {
      this.potentialAction = action;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(Action.Builder action) {
      return this.potentialAction(action.build());
    }
    @NotNull public Builder id(String id) {
      this.id = id;
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    private Number childMaxAge;
    private Number childMinAge;
    private MedicalCondition healthCondition;
    private String requiredGender;
    private int requiredMaxAge;
    private int requiredMinAge;
    private String suggestedGender;
    private Number suggestedMaxAge;
    private Number suggestedMinAge;
    private String audienceType;
    private AdministrativeArea geographicArea;
    private String additionalType;
    private String alternateName;
    private String description;
    private CreativeWorkOrString mainEntityOfPage;
    private String name;
    private String sameAs;
    private String url;
    private Action potentialAction;
    private String id;
  }
  public interface Builder extends ThingBuilder<ParentAudience> {
    @NotNull Builder childMaxAge(int childMaxAge);
    @NotNull Builder childMaxAge(long childMaxAge);
    @NotNull Builder childMaxAge(float childMaxAge);
    @NotNull Builder childMaxAge(double childMaxAge);
    @NotNull Builder childMaxAge(String childMaxAge);
    @NotNull Builder childMinAge(int childMinAge);
    @NotNull Builder childMinAge(long childMinAge);
    @NotNull Builder childMinAge(float childMinAge);
    @NotNull Builder childMinAge(double childMinAge);
    @NotNull Builder childMinAge(String childMinAge);
    @NotNull Builder healthCondition(MedicalCondition medicalCondition);
    @NotNull Builder healthCondition(MedicalCondition.Builder medicalCondition);
    @NotNull Builder requiredGender(String requiredGender);
    @NotNull Builder requiredMaxAge(int requiredMaxAge);
    @NotNull Builder requiredMinAge(int requiredMinAge);
    @NotNull Builder suggestedGender(String suggestedGender);
    @NotNull Builder suggestedMaxAge(int suggestedMaxAge);
    @NotNull Builder suggestedMaxAge(long suggestedMaxAge);
    @NotNull Builder suggestedMaxAge(float suggestedMaxAge);
    @NotNull Builder suggestedMaxAge(double suggestedMaxAge);
    @NotNull Builder suggestedMaxAge(String suggestedMaxAge);
    @NotNull Builder suggestedMinAge(int suggestedMinAge);
    @NotNull Builder suggestedMinAge(long suggestedMinAge);
    @NotNull Builder suggestedMinAge(float suggestedMinAge);
    @NotNull Builder suggestedMinAge(double suggestedMinAge);
    @NotNull Builder suggestedMinAge(String suggestedMinAge);
    @NotNull Builder audienceType(String audienceType);
    @NotNull Builder geographicArea(AdministrativeArea administrativeArea);
    @NotNull Builder geographicArea(AdministrativeArea.Builder administrativeArea);
    @NotNull Builder additionalType(String additionalType);
    @NotNull Builder alternateName(String alternateName);
    @NotNull Builder description(String description);
    @NotNull Builder mainEntityOfPage(CreativeWork creativeWork);
    @NotNull Builder mainEntityOfPage(CreativeWork.Builder creativeWork);
    @NotNull Builder mainEntityOfPage(String mainEntityOfPage);
    @NotNull Builder name(String name);
    @NotNull Builder sameAs(String sameAs);
    @NotNull Builder url(String url);
    @NotNull Builder potentialAction(Action action);
    @NotNull Builder potentialAction(Action.Builder action);
    @NotNull Builder id(String id);
  }

  protected ParentAudience(Number childMaxAge, Number childMinAge, MedicalCondition healthCondition, String requiredGender, int requiredMaxAge, int requiredMinAge, String suggestedGender, Number suggestedMaxAge, Number suggestedMinAge, String audienceType, AdministrativeArea geographicArea, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(healthCondition, requiredGender, requiredMaxAge, requiredMinAge, suggestedGender, suggestedMaxAge, suggestedMinAge, audienceType, geographicArea, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myChildMaxAge = childMaxAge;
    myChildMinAge = childMinAge;
  }
  private Number myChildMaxAge;
  private Number myChildMinAge;
}
