package org.schema.kotlin
import org.schema.*
class MutableRsvpAction {
  private val map = HashMap<String,Any>()
  var additionalNumberOfGuests: Any by map
  var rsvpResponse: RsvpResponseType by map
  var comment: Comment by map
  fun comment(builder: MutableComment.() -> Unit) { comment = MutableComment().apply(builder).build() }
  var event: Event by map
  fun event(builder: MutableEvent.() -> Unit) { event = MutableEvent().apply(builder).build() }
  var about: Thing by map
  fun about(builder: MutableThing.() -> Unit) { about = MutableThing().apply(builder).build() }
  var inLanguage: Any by map
  fun inLanguageLanguage(builder: MutableLanguage.() -> Unit) { inLanguage = MutableLanguage().apply(builder).build() }
  var recipient: Any by map
  fun recipientAudience(builder: MutableAudience.() -> Unit) { recipient = MutableAudience().apply(builder).build() }
  fun recipientOrganization(builder: MutableOrganization.() -> Unit) { recipient = MutableOrganization().apply(builder).build() }
  fun recipientPerson(builder: MutablePerson.() -> Unit) { recipient = MutablePerson().apply(builder).build() }
  var agent: Any by map
  fun agentOrganization(builder: MutableOrganization.() -> Unit) { agent = MutableOrganization().apply(builder).build() }
  fun agentPerson(builder: MutablePerson.() -> Unit) { agent = MutablePerson().apply(builder).build() }
  var endTime: java.util.Date by map
  var startTime: java.util.Date by map
  var actionStatus: ActionStatusType by map
  var error: Thing by map
  fun error(builder: MutableThing.() -> Unit) { error = MutableThing().apply(builder).build() }
  var target: EntryPoint by map
  fun target(builder: MutableEntryPoint.() -> Unit) { target = MutableEntryPoint().apply(builder).build() }
  var additionalType: String by map
  var alternateName: String by map
  var disambiguatingDescription: String by map
  var mainEntityOfPage: Any by map
  fun mainEntityOfPageCreativeWork(builder: MutableCreativeWork.() -> Unit) { mainEntityOfPage = MutableCreativeWork().apply(builder).build() }
  var name: String by map
  var sameAs: String by map
  var url: String by map
  var potentialAction: Action by map
  fun potentialAction(builder: MutableAction.() -> Unit) { potentialAction = MutableAction().apply(builder).build() }
  var id: String by map
  fun build() = org.schema.RsvpAction.Builder(map).build()
}
