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
@JsonDeserialize(builder = Person.Builder.class)
public class Person extends Agent {

  private static final long serialVersionUID = 1L;
  
  public static class Builder {
    Person _person = new Person();
   
    @JsonProperty("@context")
    public Builder withContext(String context) {
      _person.context = context;
      return this;
    }

    public Builder withId(String id) {
      _person.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _person.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _person.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _person.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _person.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _person.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _person.dateModified = dataModified;
      return this;
    }
    
    public Person build() {
      if (StringUtils.isBlank(_person.id) 
          || StringUtils.isBlank(_person.type)) {
        throw new IllegalStateException(_person.toString());
      }

      return _person;
    }
  }

}
