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
@JsonDeserialize(builder = LtiSession.Builder.class)
public class LtiSession extends Session {

  private static final long serialVersionUID = 1L;
  
  protected Map<String,String> messageParameters;

  public Map<String, String> getMessageParameters() {
    return messageParameters;
  }

  public static class Builder {
    LtiSession _ltisession = new LtiSession();
    
    public Builder withId(String id) {
      _ltisession.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _ltisession.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _ltisession.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _ltisession.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _ltisession.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _ltisession.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _ltisession.dateModified = dataModified;
      return this;
    }
    
    public Builder withUser(Agent user) {
      _ltisession.user = user;
      return this;
    }
    
    public Builder withStartedAtTime(Instant startedAtTime) {
      _ltisession.startedAtTime = startedAtTime;
      return this;
    }
    
    public Builder withEndedAtTime(Instant endedAtTime) {
      _ltisession.endedAtTime = endedAtTime;
      return this;
    }

    public Builder withDuration(Duration duration) {
      _ltisession.duration = duration;
      return this;
    }
    
    public Builder withMessageParameters(Map<String,String> messageParameters) {
      _ltisession.messageParameters = messageParameters;
      return this;
    }
    
    public LtiSession build() {
      if (StringUtils.isBlank(_ltisession.id) 
          || StringUtils.isBlank(_ltisession.type)) {
        throw new IllegalStateException(_ltisession.toString());
      }

      return _ltisession;
    }
  }

}
