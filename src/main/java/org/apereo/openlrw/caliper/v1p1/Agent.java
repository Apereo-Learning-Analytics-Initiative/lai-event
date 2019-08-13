/**
 * 
 */
package org.apereo.openlrw.caliper.v1p1;

import java.time.Instant;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author ggilbert
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Agent.Builder.class)
public class Agent extends Entity {

  private static final long serialVersionUID = 1L;

   
  public static class Builder {
    Agent _agent = new Agent();

    
    public Builder withId(String id) {
      _agent.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _agent.type = type;
      return this;
    }

    @JsonProperty("@context")
    public Builder withContext(String context) {
      _agent.context = context;
      return this;
    }
    
    public Builder withName(String name) {
      _agent.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _agent.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _agent.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _agent.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _agent.dateModified = dataModified;
      return this;
    }
    
    public Agent build() {
      if (StringUtils.isBlank(_agent.id) 
          || StringUtils.isBlank(_agent.type)) {
        throw new IllegalStateException(_agent.toString());
      }

      return _agent;
    }
  }


}
