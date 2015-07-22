/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

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
   * Builder for {@see ParentAudience}
   */
  public static final class Builder {
    public ParentAudience build() {
      return new ParentAudience(mainEntityOfPage, requiredMinAge, geographicArea, healthCondition, audienceType, childMaxAge, potentialAction, alternateName, suggestedMinAge, suggestedMaxAge, url, additionalType, sameAs, suggestedGender, childMinAge, name, image, requiredMaxAge, requiredGender, description);
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
    public Builder mainEntityOfPage(CreativeWork value) {
      mainEntityOfPage = value;
      return this;
    }
    /**
     * Audiences defined by a person's minimum age.
     */
    public Builder requiredMinAge(Integer value) {
      requiredMinAge = value;
      return this;
    }
    /**
     * The geographic area associated with the audience.
     */
    public Builder geographicArea(AdministrativeArea value) {
      geographicArea = value;
      return this;
    }
    /**
     * Expectations for health conditions of target audience.
     */
    public Builder healthCondition(MedicalCondition value) {
      healthCondition = value;
      return this;
    }
    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     */
    public Builder audienceType(String value) {
      audienceType = value;
      return this;
    }
    /**
     * Maximal age of the child.
     */
    public Builder childMaxAge(Number value) {
      childMaxAge = value;
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    public Builder potentialAction(Action value) {
      potentialAction = value;
      return this;
    }
    /**
     * An alias for the item.
     */
    public Builder alternateName(String value) {
      alternateName = value;
      return this;
    }
    /**
     * Minimal age recommended for viewing content.
     */
    public Builder suggestedMinAge(Number value) {
      suggestedMinAge = value;
      return this;
    }
    /**
     * Maximal age recommended for viewing content.
     */
    public Builder suggestedMaxAge(Number value) {
      suggestedMaxAge = value;
      return this;
    }
    /**
     * URL of the item.
     */
    public Builder url(String value) {
      url = value;
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    public Builder additionalType(String value) {
      additionalType = value;
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
     */
    public Builder sameAs(String value) {
      sameAs = value;
      return this;
    }
    /**
     * The gender of the person or audience.
     */
    public Builder suggestedGender(String value) {
      suggestedGender = value;
      return this;
    }
    /**
     * Minimal age of the child.
     */
    public Builder childMinAge(Number value) {
      childMinAge = value;
      return this;
    }
    /**
     * The name of the item.
     */
    public Builder name(String value) {
      name = value;
      return this;
    }
    public Builder image(Image value) {
      image = value;
      return this;
    }
    /**
     * Audiences defined by a person's maximum age.
     */
    public Builder requiredMaxAge(Integer value) {
      requiredMaxAge = value;
      return this;
    }
    /**
     * Audiences defined by a person's gender.
     */
    public Builder requiredGender(String value) {
      requiredGender = value;
      return this;
    }
    /**
     * A short description of the item.
     */
    public Builder description(String value) {
      description = value;
      return this;
    }
    private CreativeWork mainEntityOfPage;
    private Integer requiredMinAge;
    private AdministrativeArea geographicArea;
    private MedicalCondition healthCondition;
    private String audienceType;
    private Number childMaxAge;
    private Action potentialAction;
    private String alternateName;
    private Number suggestedMinAge;
    private Number suggestedMaxAge;
    private String url;
    private String additionalType;
    private String sameAs;
    private String suggestedGender;
    private Number childMinAge;
    private String name;
    private Image image;
    private Integer requiredMaxAge;
    private String requiredGender;
    private String description;
  }

  protected ParentAudience(CreativeWork mainEntityOfPage, Integer requiredMinAge, AdministrativeArea geographicArea, MedicalCondition healthCondition, String audienceType, Number childMaxAge, Action potentialAction, String alternateName, Number suggestedMinAge, Number suggestedMaxAge, String url, String additionalType, String sameAs, String suggestedGender, Number childMinAge, String name, Image image, Integer requiredMaxAge, String requiredGender, String description) {
    super(requiredMinAge, mainEntityOfPage, geographicArea, healthCondition, audienceType, potentialAction, alternateName, suggestedMinAge, suggestedMaxAge, additionalType, url, sameAs, suggestedGender, image, name, requiredMaxAge, requiredGender, description);
    myChildMaxAge = childMaxAge;
    myChildMinAge = childMinAge;
  }
  private Number myChildMaxAge;
  private Number myChildMinAge;
}