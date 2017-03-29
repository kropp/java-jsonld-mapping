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
 * The act of notifying an event organizer as to whether you expect to attend the event.
 */
public class RsvpAction extends InformAction {
  /**
   * If responding yes, the number of guests who will attend in addition to the invitee.
   */
  @JsonIgnore public Integer getAdditionalNumberOfGuestsInteger() {
    return (Integer) getValue("additionalNumberOfGuests");
  }
  /**
   * If responding yes, the number of guests who will attend in addition to the invitee.
   */
  @JsonIgnore public Collection<Integer> getAdditionalNumberOfGuestsIntegers() {
    final Object current = myData.get("additionalNumberOfGuests");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * If responding yes, the number of guests who will attend in addition to the invitee.
   */
  @JsonIgnore public Long getAdditionalNumberOfGuestsLong() {
    return (Long) getValue("additionalNumberOfGuests");
  }
  /**
   * If responding yes, the number of guests who will attend in addition to the invitee.
   */
  @JsonIgnore public Collection<Long> getAdditionalNumberOfGuestsLongs() {
    final Object current = myData.get("additionalNumberOfGuests");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * If responding yes, the number of guests who will attend in addition to the invitee.
   */
  @JsonIgnore public Float getAdditionalNumberOfGuestsFloat() {
    return (Float) getValue("additionalNumberOfGuests");
  }
  /**
   * If responding yes, the number of guests who will attend in addition to the invitee.
   */
  @JsonIgnore public Collection<Float> getAdditionalNumberOfGuestsFloats() {
    final Object current = myData.get("additionalNumberOfGuests");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * If responding yes, the number of guests who will attend in addition to the invitee.
   */
  @JsonIgnore public Double getAdditionalNumberOfGuestsDouble() {
    return (Double) getValue("additionalNumberOfGuests");
  }
  /**
   * If responding yes, the number of guests who will attend in addition to the invitee.
   */
  @JsonIgnore public Collection<Double> getAdditionalNumberOfGuestsDoubles() {
    final Object current = myData.get("additionalNumberOfGuests");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * If responding yes, the number of guests who will attend in addition to the invitee.
   */
  @JsonIgnore public String getAdditionalNumberOfGuestsString() {
    return (String) getValue("additionalNumberOfGuests");
  }
  /**
   * If responding yes, the number of guests who will attend in addition to the invitee.
   */
  @JsonIgnore public Collection<String> getAdditionalNumberOfGuestsStrings() {
    final Object current = myData.get("additionalNumberOfGuests");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The response (yes, no, maybe) to the RSVP.
   */
  @JsonIgnore public RsvpResponseType getRsvpResponse() {
    return (RsvpResponseType) getValue("rsvpResponse");
  }
  /**
   * The response (yes, no, maybe) to the RSVP.
   */
  @JsonIgnore public Collection<RsvpResponseType> getRsvpResponses() {
    final Object current = myData.get("rsvpResponse");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<RsvpResponseType>) current;
    }
    return Arrays.asList((RsvpResponseType) current);
  }
  /**
   * Comments, typically from users.
   */
  @JsonIgnore public Comment getComment() {
    return (Comment) getValue("comment");
  }
  /**
   * Comments, typically from users.
   */
  @JsonIgnore public Collection<Comment> getComments() {
    final Object current = myData.get("comment");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Comment>) current;
    }
    return Arrays.asList((Comment) current);
  }
  protected RsvpAction(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link RsvpAction}
   */
  public static class Builder extends InformAction.Builder {
    @NotNull public RsvpAction build() {
      return new RsvpAction(myData);
    }
    /**
     * If responding yes, the number of guests who will attend in addition to the invitee.
     */
    @NotNull public Builder additionalNumberOfGuests(@NotNull Integer integer) {
      putValue("additionalNumberOfGuests", integer);
      return this;
    }
    /**
     * If responding yes, the number of guests who will attend in addition to the invitee.
     */
    @NotNull public Builder additionalNumberOfGuests(@NotNull Long additionalNumberOfGuests) {
      putValue("additionalNumberOfGuests", additionalNumberOfGuests);
      return this;
    }
    /**
     * If responding yes, the number of guests who will attend in addition to the invitee.
     */
    @NotNull public Builder additionalNumberOfGuests(@NotNull Float additionalNumberOfGuests) {
      putValue("additionalNumberOfGuests", additionalNumberOfGuests);
      return this;
    }
    /**
     * If responding yes, the number of guests who will attend in addition to the invitee.
     */
    @NotNull public Builder additionalNumberOfGuests(@NotNull Double additionalNumberOfGuests) {
      putValue("additionalNumberOfGuests", additionalNumberOfGuests);
      return this;
    }
    /**
     * If responding yes, the number of guests who will attend in addition to the invitee.
     */
    @NotNull public Builder additionalNumberOfGuests(@NotNull String additionalNumberOfGuests) {
      putValue("additionalNumberOfGuests", additionalNumberOfGuests);
      return this;
    }
    /**
     * The response (yes, no, maybe) to the RSVP.
     */
    @NotNull public Builder rsvpResponse(@NotNull RsvpResponseType rsvpResponseType) {
      putValue("rsvpResponse", rsvpResponseType);
      return this;
    }
    /**
     * Comments, typically from users.
     */
    @NotNull public Builder comment(@NotNull Comment comment) {
      putValue("comment", comment);
      return this;
    }
    /**
     * Comments, typically from users.
     */
    @NotNull public Builder comment(@NotNull Comment.Builder comment) {
      putValue("comment", comment.build());
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event event) {
      putValue("event", event);
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      putValue("event", event.build());
      return this;
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing thing) {
      putValue("about", thing);
      return this;
    }
    /**
     * The subject matter of the content.
     */
    @NotNull public Builder about(@NotNull Thing.Builder thing) {
      putValue("about", thing.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull Language language) {
      putValue("inLanguage", language);
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull Language.Builder language) {
      putValue("inLanguage", language.build());
      return this;
    }
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @NotNull public Builder inLanguage(@NotNull String inLanguage) {
      putValue("inLanguage", inLanguage);
      return this;
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Audience audience) {
      putValue("recipient", audience);
      return this;
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Audience.Builder audience) {
      putValue("recipient", audience.build());
      return this;
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Organization organization) {
      putValue("recipient", organization);
      return this;
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Organization.Builder organization) {
      putValue("recipient", organization.build());
      return this;
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Person person) {
      putValue("recipient", person);
      return this;
    }
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @NotNull public Builder recipient(@NotNull Person.Builder person) {
      putValue("recipient", person.build());
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization organization) {
      putValue("agent", organization);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Organization.Builder organization) {
      putValue("agent", organization.build());
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person person) {
      putValue("agent", person);
      return this;
    }
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     */
    @NotNull public Builder agent(@NotNull Person.Builder person) {
      putValue("agent", person.build());
      return this;
    }
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder endTime(@NotNull java.util.Date date) {
      putValue("endTime", date);
      return this;
    }
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @NotNull public Builder startTime(@NotNull java.util.Date date) {
      putValue("startTime", date);
      return this;
    }
    /**
     * Indicates the current disposition of the Action.
     */
    @NotNull public Builder actionStatus(@NotNull ActionStatusType actionStatusType) {
      putValue("actionStatus", actionStatusType);
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing thing) {
      putValue("error", thing);
      return this;
    }
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @NotNull public Builder error(@NotNull Thing.Builder thing) {
      putValue("error", thing.build());
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint entryPoint) {
      putValue("target", entryPoint);
      return this;
    }
    /**
     * Indicates a target EntryPoint for an Action.
     */
    @NotNull public Builder target(@NotNull EntryPoint.Builder entryPoint) {
      putValue("target", entryPoint.build());
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
      if ("additionalNumberOfGuests".equals(key) && value instanceof Integer) { additionalNumberOfGuests((Integer)value); return; }
      if ("additionalNumberOfGuestss".equals(key) && value instanceof Integer) { additionalNumberOfGuests((Integer)value); return; }
      if ("additionalNumberOfGuests".equals(key) && value instanceof Long) { additionalNumberOfGuests((Long)value); return; }
      if ("additionalNumberOfGuestss".equals(key) && value instanceof Long) { additionalNumberOfGuests((Long)value); return; }
      if ("additionalNumberOfGuests".equals(key) && value instanceof Float) { additionalNumberOfGuests((Float)value); return; }
      if ("additionalNumberOfGuestss".equals(key) && value instanceof Float) { additionalNumberOfGuests((Float)value); return; }
      if ("additionalNumberOfGuests".equals(key) && value instanceof Double) { additionalNumberOfGuests((Double)value); return; }
      if ("additionalNumberOfGuestss".equals(key) && value instanceof Double) { additionalNumberOfGuests((Double)value); return; }
      if ("additionalNumberOfGuests".equals(key) && value instanceof String) { additionalNumberOfGuests((String)value); return; }
      if ("additionalNumberOfGuestss".equals(key) && value instanceof String) { additionalNumberOfGuests((String)value); return; }
      if ("rsvpResponse".equals(key) && value instanceof RsvpResponseType) { rsvpResponse((RsvpResponseType)value); return; }
      if ("rsvpResponses".equals(key) && value instanceof RsvpResponseType) { rsvpResponse((RsvpResponseType)value); return; }
      if ("comment".equals(key) && value instanceof Comment) { comment((Comment)value); return; }
      if ("comments".equals(key) && value instanceof Comment) { comment((Comment)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
