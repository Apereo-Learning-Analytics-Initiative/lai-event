package org.apereo.openlrw.caliper.v1p1;

import java.time.Instant;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Event.Builder.class)
public class Event implements Caliper1p1Event {

  private static final long serialVersionUID = 1L;
  
  @JsonProperty("@context")
  private String context;   // Todo :  make JsonldContext
 
  private String id;
  private String type;
  private Agent actor;
  private String action;
  private Entity object;
  private Instant eventTime;
  private Entity target;
  private Entity generated;
  private SoftwareApplication edApp;
  private Entity referrer;
  private Membership membership;
  private Organization group;
  private Session session;
  private LtiSession federatedSession;
  private Map<String, String> extensions;

  public String getContext() {
    return context;
  }

  public String getId() {
    return id;
  }
  public String getType() {
    return type;
  }
  public Agent getActor() {
    return actor;
  }
  public String getAction() {
    return action;
  }
  public Entity getObject() {
    return object;
  }
  public Instant getEventTime() {
    return eventTime;
  }
  public Entity getTarget() {
    return target;
  }
  public Entity getGenerated() {
    return generated;
  }
  public SoftwareApplication getEdApp() {
    return edApp;
  }
  public Entity getReferrer() {
    return referrer;
  }
  public Membership getMembership() {
    return membership;
  }
  public Organization getGroup() {
    return group;
  }
  public Session getSession() {
    return session;
  }
  public LtiSession getFederatedSession() {
    return federatedSession;
  }
  public Map<String, String> getExtensions() {
    return extensions;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((action == null) ? 0 : action.hashCode());
    result = prime * result + ((actor == null) ? 0 : actor.hashCode());
    result = prime * result + ((edApp == null) ? 0 : edApp.hashCode());
    result = prime * result + ((eventTime == null) ? 0 : eventTime.hashCode());
    result = prime * result + ((extensions == null) ? 0 : extensions.hashCode());
    result = prime * result + ((federatedSession == null) ? 0 : federatedSession.hashCode());
    result = prime * result + ((generated == null) ? 0 : generated.hashCode());
    result = prime * result + ((group == null) ? 0 : group.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((membership == null) ? 0 : membership.hashCode());
    result = prime * result + ((object == null) ? 0 : object.hashCode());
    result = prime * result + ((referrer == null) ? 0 : referrer.hashCode());
    result = prime * result + ((session == null) ? 0 : session.hashCode());
    result = prime * result + ((target == null) ? 0 : target.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Event other = (Event) obj;
    if (action == null) {
      if (other.action != null)
        return false;
    } else if (!action.equals(other.action))
      return false;
    if (actor == null) {
      if (other.actor != null)
        return false;
    } else if (!actor.equals(other.actor))
      return false;
    if (edApp == null) {
      if (other.edApp != null)
        return false;
    } else if (!edApp.equals(other.edApp))
      return false;
    if (eventTime == null) {
      if (other.eventTime != null)
        return false;
    } else if (!eventTime.equals(other.eventTime))
      return false;
    if (extensions == null) {
      if (other.extensions != null)
        return false;
    } else if (!extensions.equals(other.extensions))
      return false;
    if (federatedSession == null) {
      if (other.federatedSession != null)
        return false;
    } else if (!federatedSession.equals(other.federatedSession))
      return false;
    if (generated == null) {
      if (other.generated != null)
        return false;
    } else if (!generated.equals(other.generated))
      return false;
    if (group == null) {
      if (other.group != null)
        return false;
    } else if (!group.equals(other.group))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (membership == null) {
      if (other.membership != null)
        return false;
    } else if (!membership.equals(other.membership))
      return false;
    if (object == null) {
      if (other.object != null)
        return false;
    } else if (!object.equals(other.object))
      return false;
    if (referrer == null) {
      if (other.referrer != null)
        return false;
    } else if (!referrer.equals(other.referrer))
      return false;
    if (session == null) {
      if (other.session != null)
        return false;
    } else if (!session.equals(other.session))
      return false;
    if (target == null) {
      if (other.target != null)
        return false;
    } else if (!target.equals(other.target))
      return false;
    if (type == null) {
      if (other.type != null)
        return false;
    } else if (!type.equals(other.type))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  public static class Builder {
    Event _basicEvent = new Event();

    @JsonProperty("@context")
    public Builder withContext(String context) {
      _basicEvent.context = context;
      return this;
    }
    
    public Builder withId(String id) {
      _basicEvent.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _basicEvent.type = type;
      return this;
    }
    
    public Builder withActor(Agent agent) {
      _basicEvent.actor = agent;
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
    
    public Builder withEdApp(SoftwareApplication edApp) {
      _basicEvent.edApp = edApp;
      return this;
    }
    
    public Builder withGenerated(Entity generated) {
      _basicEvent.generated = generated;
      return this;
    }
    
    public Builder withReferrer(Entity referrer) {
      _basicEvent.referrer = referrer;
      return this;
    }
    
    public Builder withGroup(Organization group) {
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
    
    public Builder withFederatedSession(LtiSession federatedSession) {
      _basicEvent.federatedSession = federatedSession;
      return this;
    }
    
    public Builder withSession(Session session) {
      _basicEvent.session = session;
      return this;
    }

    public Event build() {
      
      if (_basicEvent.actor == null || StringUtils.isBlank(_basicEvent.action)
          || _basicEvent.object == null
          || _basicEvent.eventTime == null) {
        throw new IllegalStateException("Actor, Action, Object and EventTime must be filled with a value.");
      }
      
      return _basicEvent;
    }
  }


}
