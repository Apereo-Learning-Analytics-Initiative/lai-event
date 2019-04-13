/**
 * 
 */
package org.apereo.openlrw.caliper.v1p1;

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
@JsonDeserialize(builder = LearningObjective.Builder.class)
public class LearningObjective extends Entity {

  private static final long serialVersionUID = 1L;

  public static class Builder {
    LearningObjective _learningobjective = new LearningObjective();
    
    public Builder withId(String id) {
      _learningobjective.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _learningobjective.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _learningobjective.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _learningobjective.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _learningobjective.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _learningobjective.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _learningobjective.dateModified = dataModified;
      return this;
    }
    
    public LearningObjective build() {
      if (StringUtils.isBlank(_learningobjective.id) 
          || StringUtils.isBlank(_learningobjective.type)) {
        throw new IllegalStateException(_learningobjective.toString());
      }

      return _learningobjective;
    }
  }

}
