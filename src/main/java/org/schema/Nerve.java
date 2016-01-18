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
 * A common pathway for the electrochemical nerve impulses that are transmitted along each of the axons.
 * Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_WikiDoc
 */
public class Nerve extends AnatomicalStructure {
  /**
   * The branches that delineate from the nerve bundle.
   */
  public AnatomicalStructure getBranch() {
    return myBranch;
  }
  /**
   * The neurological pathway extension that involves muscle control.
   */
  public Muscle getNerveMotor() {
    return myNerveMotor;
  }
  /**
   * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
   */
  public AnatomicalStructureOrSuperficialAnatomy getSensoryUnit() {
    return mySensoryUnit;
  }
  /**
   * The neurological pathway that originates the neurons.
   */
  public BrainStructure getSourcedFrom() {
    return mySourcedFrom;
  }
  /**
   * Builder for {@link Nerve}
   */
  static final class NerveThingBuilder implements Builder {
    /**
     * Creates new {@link Nerve} instance.
     */
    public Nerve build() {
      return new Nerve(branch, nerveMotor, sensoryUnit, sourcedFrom, associatedPathophysiology, bodyLocation, connectedTo, diagram, function, partOfSystem, relatedCondition, relatedTherapy, subStructure, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    }
    /**
     * The branches that delineate from the nerve bundle.
     */
    @NotNull public Builder branch(AnatomicalStructure anatomicalStructure) {
      this.branch = anatomicalStructure;
      return this;
    }
    /**
     * The branches that delineate from the nerve bundle.
     */
    @NotNull public Builder branch(AnatomicalStructure.Builder anatomicalStructure) {
      return this.branch(anatomicalStructure.build());
    }
    /**
     * The neurological pathway extension that involves muscle control.
     */
    @NotNull public Builder nerveMotor(Muscle muscle) {
      this.nerveMotor = muscle;
      return this;
    }
    /**
     * The neurological pathway extension that involves muscle control.
     */
    @NotNull public Builder nerveMotor(Muscle.Builder muscle) {
      return this.nerveMotor(muscle.build());
    }
    /**
     * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
     */
    @NotNull public Builder sensoryUnit(AnatomicalStructure anatomicalStructure) {
      if (this.sensoryUnit == null) this.sensoryUnit = new AnatomicalStructureOrSuperficialAnatomy();
      this.sensoryUnit.setAnatomicalStructure(anatomicalStructure);
      return this;
    }
    /**
     * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
     */
    @NotNull public Builder sensoryUnit(AnatomicalStructure.Builder anatomicalStructure) {
      return this.sensoryUnit(anatomicalStructure.build());
    }
    /**
     * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
     */
    @NotNull public Builder sensoryUnit(SuperficialAnatomy superficialAnatomy) {
      if (this.sensoryUnit == null) this.sensoryUnit = new AnatomicalStructureOrSuperficialAnatomy();
      this.sensoryUnit.setSuperficialAnatomy(superficialAnatomy);
      return this;
    }
    /**
     * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
     */
    @NotNull public Builder sensoryUnit(SuperficialAnatomy.Builder superficialAnatomy) {
      return this.sensoryUnit(superficialAnatomy.build());
    }
    /**
     * The neurological pathway that originates the neurons.
     */
    @NotNull public Builder sourcedFrom(BrainStructure brainStructure) {
      this.sourcedFrom = brainStructure;
      return this;
    }
    /**
     * The neurological pathway that originates the neurons.
     */
    @NotNull public Builder sourcedFrom(BrainStructure.Builder brainStructure) {
      return this.sourcedFrom(brainStructure.build());
    }
    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     */
    @NotNull public Builder associatedPathophysiology(String associatedPathophysiology) {
      this.associatedPathophysiology = associatedPathophysiology;
      return this;
    }
    /**
     * Location in the body of the anatomical structure.
     */
    @NotNull public Builder bodyLocation(String bodyLocation) {
      this.bodyLocation = bodyLocation;
      return this;
    }
    /**
     * Other anatomical structures to which this structure is connected.
     */
    @NotNull public Builder connectedTo(AnatomicalStructure anatomicalStructure) {
      this.connectedTo = anatomicalStructure;
      return this;
    }
    /**
     * Other anatomical structures to which this structure is connected.
     */
    @NotNull public Builder connectedTo(AnatomicalStructure.Builder anatomicalStructure) {
      return this.connectedTo(anatomicalStructure.build());
    }
    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     */
    @NotNull public Builder diagram(ImageObject imageObject) {
      this.diagram = imageObject;
      return this;
    }
    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     */
    @NotNull public Builder diagram(ImageObject.Builder imageObject) {
      return this.diagram(imageObject.build());
    }
    /**
     * Function of the anatomical structure.
     */
    @NotNull public Builder function(String function) {
      this.function = function;
      return this;
    }
    /**
     * The anatomical or organ system that this structure is part of.
     */
    @NotNull public Builder partOfSystem(IsPartOf isPartOf) {
      this.partOfSystem = isPartOf;
      return this;
    }
    /**
     * A medical condition associated with this anatomy.
     */
    @NotNull public Builder relatedCondition(MedicalCondition medicalCondition) {
      this.relatedCondition = medicalCondition;
      return this;
    }
    /**
     * A medical condition associated with this anatomy.
     */
    @NotNull public Builder relatedCondition(MedicalCondition.Builder medicalCondition) {
      return this.relatedCondition(medicalCondition.build());
    }
    /**
     * A medical therapy related to this anatomy.
     */
    @NotNull public Builder relatedTherapy(MedicalTherapy medicalTherapy) {
      this.relatedTherapy = medicalTherapy;
      return this;
    }
    /**
     * A medical therapy related to this anatomy.
     */
    @NotNull public Builder relatedTherapy(MedicalTherapy.Builder medicalTherapy) {
      return this.relatedTherapy(medicalTherapy.build());
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     */
    @NotNull public Builder subStructure(AnatomicalStructure anatomicalStructure) {
      this.subStructure = anatomicalStructure;
      return this;
    }
    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     */
    @NotNull public Builder subStructure(AnatomicalStructure.Builder anatomicalStructure) {
      return this.subStructure(anatomicalStructure.build());
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(MedicalCode medicalCode) {
      this.code = medicalCode;
      return this;
    }
    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     */
    @NotNull public Builder code(MedicalCode.Builder medicalCode) {
      return this.code(medicalCode.build());
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(MedicalGuideline medicalGuideline) {
      this.guideline = medicalGuideline;
      return this;
    }
    /**
     * A medical guideline related to this entity.
     */
    @NotNull public Builder guideline(MedicalGuideline.Builder medicalGuideline) {
      return this.guideline(medicalGuideline.build());
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(MedicineSystem medicineSystem) {
      this.medicineSystem = medicineSystem;
      return this;
    }
    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     */
    @NotNull public Builder medicineSystem(MedicineSystem.Builder medicineSystem) {
      return this.medicineSystem(medicineSystem.build());
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(Organization organization) {
      this.recognizingAuthority = organization;
      return this;
    }
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @NotNull public Builder recognizingAuthority(Organization.Builder organization) {
      return this.recognizingAuthority(organization.build());
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(MedicalSpecialty medicalSpecialty) {
      this.relevantSpecialty = medicalSpecialty;
      return this;
    }
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @NotNull public Builder relevantSpecialty(MedicalSpecialty.Builder medicalSpecialty) {
      return this.relevantSpecialty(medicalSpecialty.build());
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(MedicalStudy medicalStudy) {
      this.study = medicalStudy;
      return this;
    }
    /**
     * A medical study or trial related to this entity.
     */
    @NotNull public Builder study(MedicalStudy.Builder medicalStudy) {
      return this.study(medicalStudy.build());
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
    private AnatomicalStructure branch;
    private Muscle nerveMotor;
    private AnatomicalStructureOrSuperficialAnatomy sensoryUnit;
    private BrainStructure sourcedFrom;
    private String associatedPathophysiology;
    private String bodyLocation;
    private AnatomicalStructure connectedTo;
    private ImageObject diagram;
    private String function;
    private IsPartOf partOfSystem;
    private MedicalCondition relatedCondition;
    private MedicalTherapy relatedTherapy;
    private AnatomicalStructure subStructure;
    private MedicalCode code;
    private MedicalGuideline guideline;
    private MedicineSystem medicineSystem;
    private Organization recognizingAuthority;
    private MedicalSpecialty relevantSpecialty;
    private MedicalStudy study;
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
  public interface Builder extends ThingBuilder<Nerve> {
    @NotNull Builder branch(AnatomicalStructure anatomicalStructure);
    @NotNull Builder branch(AnatomicalStructure.Builder anatomicalStructure);
    @NotNull Builder nerveMotor(Muscle muscle);
    @NotNull Builder nerveMotor(Muscle.Builder muscle);
    @NotNull Builder sensoryUnit(AnatomicalStructure anatomicalStructure);
    @NotNull Builder sensoryUnit(AnatomicalStructure.Builder anatomicalStructure);
    @NotNull Builder sensoryUnit(SuperficialAnatomy superficialAnatomy);
    @NotNull Builder sensoryUnit(SuperficialAnatomy.Builder superficialAnatomy);
    @NotNull Builder sourcedFrom(BrainStructure brainStructure);
    @NotNull Builder sourcedFrom(BrainStructure.Builder brainStructure);
    @NotNull Builder associatedPathophysiology(String associatedPathophysiology);
    @NotNull Builder bodyLocation(String bodyLocation);
    @NotNull Builder connectedTo(AnatomicalStructure anatomicalStructure);
    @NotNull Builder connectedTo(AnatomicalStructure.Builder anatomicalStructure);
    @NotNull Builder diagram(ImageObject imageObject);
    @NotNull Builder diagram(ImageObject.Builder imageObject);
    @NotNull Builder function(String function);
    @NotNull Builder partOfSystem(IsPartOf isPartOf);
    @NotNull Builder relatedCondition(MedicalCondition medicalCondition);
    @NotNull Builder relatedCondition(MedicalCondition.Builder medicalCondition);
    @NotNull Builder relatedTherapy(MedicalTherapy medicalTherapy);
    @NotNull Builder relatedTherapy(MedicalTherapy.Builder medicalTherapy);
    @NotNull Builder subStructure(AnatomicalStructure anatomicalStructure);
    @NotNull Builder subStructure(AnatomicalStructure.Builder anatomicalStructure);
    @NotNull Builder code(MedicalCode medicalCode);
    @NotNull Builder code(MedicalCode.Builder medicalCode);
    @NotNull Builder guideline(MedicalGuideline medicalGuideline);
    @NotNull Builder guideline(MedicalGuideline.Builder medicalGuideline);
    @NotNull Builder medicineSystem(MedicineSystem medicineSystem);
    @NotNull Builder medicineSystem(MedicineSystem.Builder medicineSystem);
    @NotNull Builder recognizingAuthority(Organization organization);
    @NotNull Builder recognizingAuthority(Organization.Builder organization);
    @NotNull Builder relevantSpecialty(MedicalSpecialty medicalSpecialty);
    @NotNull Builder relevantSpecialty(MedicalSpecialty.Builder medicalSpecialty);
    @NotNull Builder study(MedicalStudy medicalStudy);
    @NotNull Builder study(MedicalStudy.Builder medicalStudy);
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

  protected Nerve(AnatomicalStructure branch, Muscle nerveMotor, AnatomicalStructureOrSuperficialAnatomy sensoryUnit, BrainStructure sourcedFrom, String associatedPathophysiology, String bodyLocation, AnatomicalStructure connectedTo, ImageObject diagram, String function, IsPartOf partOfSystem, MedicalCondition relatedCondition, MedicalTherapy relatedTherapy, AnatomicalStructure subStructure, MedicalCode code, MedicalGuideline guideline, MedicineSystem medicineSystem, Organization recognizingAuthority, MedicalSpecialty relevantSpecialty, MedicalStudy study, String additionalType, String alternateName, String description, CreativeWorkOrString mainEntityOfPage, String name, String sameAs, String url, Action potentialAction, String id) {
    super(associatedPathophysiology, bodyLocation, connectedTo, diagram, function, partOfSystem, relatedCondition, relatedTherapy, subStructure, code, guideline, medicineSystem, recognizingAuthority, relevantSpecialty, study, additionalType, alternateName, description, mainEntityOfPage, name, sameAs, url, potentialAction, id);
    myBranch = branch;
    myNerveMotor = nerveMotor;
    mySensoryUnit = sensoryUnit;
    mySourcedFrom = sourcedFrom;
  }
  private AnatomicalStructure myBranch;
  private Muscle myNerveMotor;
  private AnatomicalStructureOrSuperficialAnatomy mySensoryUnit;
  private BrainStructure mySourcedFrom;
}
