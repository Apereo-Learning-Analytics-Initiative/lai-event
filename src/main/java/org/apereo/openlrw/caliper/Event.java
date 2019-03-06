package org.apereo.openlrw.caliper;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author ggilbert
 * @author xchopin <xavier.chopin@univ-lorraine.fr>
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Event.Builder.class)
public class Event implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private String id;
  
  @JsonProperty("@context")
  private String context;
  @JsonProperty("@type")
  private String type;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Event event = (Event) o;

    if (timeZoneOffset != event.timeZoneOffset) return false;
    if (id != null ? !id.equals(event.id) : event.id != null) return false;
    if (context != null ? !context.equals(event.context) : event.context != null) return false;
    if (type != null ? !type.equals(event.type) : event.type != null) return false;
    if (agent != null ? !agent.equals(event.agent) : event.agent != null) return false;
    if (action != null ? !action.equals(event.action) : event.action != null) return false;
    if (object != null ? !object.equals(event.object) : event.object != null) return false;
    if (target != null ? !target.equals(event.target) : event.target != null) return false;
    if (edApp != null ? !edApp.equals(event.edApp) : event.edApp != null) return false;
    if (generated != null ? !generated.equals(event.generated) : event.generated != null) return false;
    if (group != null ? !group.equals(event.group) : event.group != null) return false;
    if (membership != null ? !membership.equals(event.membership) : event.membership != null) return false;
    if (eventTime != null ? !eventTime.equals(event.eventTime) : event.eventTime != null) return false;
    return federatedSession != null ? federatedSession.equals(event.federatedSession) : event.federatedSession == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (context != null ? context.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (agent != null ? agent.hashCode() : 0);
    result = 31 * result + (action != null ? action.hashCode() : 0);
    result = 31 * result + (object != null ? object.hashCode() : 0);
    result = 31 * result + (target != null ? target.hashCode() : 0);
    result = 31 * result + (edApp != null ? edApp.hashCode() : 0);
    result = 31 * result + (generated != null ? generated.hashCode() : 0);
    result = 31 * result + (group != null ? group.hashCode() : 0);
    result = 31 * result + (membership != null ? membership.hashCode() : 0);
    result = 31 * result + (eventTime != null ? eventTime.hashCode() : 0);
    result = 31 * result + (int) (timeZoneOffset ^ (timeZoneOffset >>> 32));
    result = 31 * result + (federatedSession != null ? federatedSession.hashCode() : 0);
    return result;
  }

  @NotNull
  @JsonProperty("actor")
  private Agent agent;
  
  @NotNull
  private String action;
  
  @NotNull
  private Entity object;
  
  private Entity target;
  private Agent edApp;
  private Entity generated;
  private Group group;
  private Membership membership;
  private Instant eventTime;
  private long timeZoneOffset;
  private String federatedSession;
  
  private Event() {}

  public String getId() {
    return id;
  }

  public String getContext() {
    return context;
  }

  public String getType() {
    return type;
  }

  public Agent getAgent() {
    return agent;
  }

  public String getAction() {
    return action;
  }

  public Entity getObject() {
    return object;
  }

  public Entity getTarget() {
    return target;
  }

  public Agent getEdApp() {
    return edApp;
  }

  public Entity getGenerated() {
    return generated;
  }

  public Group getGroup() {
    return group;
  }

  public Membership getMembership() {
    return membership;
  }

  public String getFederatedSession() {
    return federatedSession;
  }

  public Instant getEventTime() {
    return eventTime;
  }

  public long getTimeZoneOffset() {
    return timeZoneOffset;
  }

  public void setTimeZoneOffset(long timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }
  
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }


  public static class Builder {
    Event _basicEvent = new Event();
    
    public Builder withId(String id) {
      _basicEvent.id = id;
      return this;
    }
    
    @JsonProperty("@context")
    public Builder withContext(String context) {
      _basicEvent.context = context;
      return this;
    }
    
    @JsonProperty("@type") 
    public Builder withType(String type) {
      _basicEvent.type = type;
      return this;
    }
    
    @JsonProperty("type")
    public Builder withV11Type(String type) {
      _basicEvent.type = type;
      return this;
    }
    
    @JsonProperty("actor")
    public Builder withAgent(Agent agent) {
      _basicEvent.agent = agent;
      return this;
    }
    
    public Builder withAction(String action) {
      _basicEvent.action = action;
      return this;
    }
    
    public Builder withObject(Entity entity) {
      _basicEvent.object = entity;
      return this;
    }
    
    public Builder withTarget(Entity target) {
      _basicEvent.target = target;
      return this;
    }
    
    public Builder withEdApp(Agent edApp) {
      _basicEvent.edApp = edApp;
      return this;
    }
    
    public Builder withGenerated(Entity generated) {
      _basicEvent.generated = generated;
      return this;
    }
    
    public Builder withGroup(Group group) {
      _basicEvent.group = group;
      return this;
    }
    
    public Builder withMembership(Membership membership) {
      _basicEvent.membership = membership;
      return this;
    }
    
    public Builder withEventTime(Instant eventTime) {
      _basicEvent.eventTime = eventTime;
      return this;
    }
    
    public Builder withFederatedSession(String federatedSession) {
      _basicEvent.federatedSession = federatedSession;
      return this;
    }

    public Builder withTimeZoneOffset(long timeZoneOffset) {
      _basicEvent.timeZoneOffset = timeZoneOffset;
      return this;
    }
    
    public Event build() {
      
      if (_basicEvent.agent == null || StringUtils.isBlank(_basicEvent.action)
          || _basicEvent.object == null
          || _basicEvent.eventTime == null) {
        throw new IllegalStateException("Agent, Action, Object and EventTime must be filled with a value.");
      }
      
      return _basicEvent;
    }
  }
  
}
