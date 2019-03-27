/**
 * 
 */
package org.apereo.openlrw.caliper.v1p1;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author ggilbert
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Session.Builder.class)
public class Session extends Entity {

  private static final long serialVersionUID = 1L;
  
  protected Agent user;
  protected Instant startedAtTime;
  protected Instant endedAtTime;
  protected Duration duration;
  
  public Agent getUser() {
    return user;
  }

  public Instant getStartedAtTime() {
    return startedAtTime;
  }

  public Instant getEndedAtTime() {
    return endedAtTime;
  }

  public Duration getDuration() {
    return duration;
  }

  public static class Builder {
    Session _session = new Session();
    
    public Builder withId(String id) {
      _session.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _session.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _session.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _session.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _session.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _session.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _session.dateModified = dataModified;
      return this;
    }
    
    public Builder withUser(Agent user) {
      _session.user = user;
      return this;
    }
    
    public Builder withStartedAtTime(Instant startedAtTime) {
      _session.startedAtTime = startedAtTime;
      return this;
    }
    
    public Builder withEndedAtTime(Instant endedAtTime) {
      _session.endedAtTime = endedAtTime;
      return this;
    }

    public Builder withDuration(Duration duration) {
      _session.duration = duration;
      return this;
    }
    
    public Session build() {
      if (StringUtils.isBlank(_session.id) 
          || StringUtils.isBlank(_session.type)) {
        throw new IllegalStateException(_session.toString());
      }

      return _session;
    }
  }


}
