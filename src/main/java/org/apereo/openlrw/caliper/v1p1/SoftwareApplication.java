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
@JsonDeserialize(builder = SoftwareApplication.Builder.class)
public class SoftwareApplication extends Entity {

  private static final long serialVersionUID = 1L;
  
  private String version;

  public String getVersion() {
    return version;
  }
  
  public static class Builder {
    SoftwareApplication _softwareapplication = new SoftwareApplication();

    @JsonProperty("@context")
      public Builder withContext(String context) {
        _softwareapplication.context = context;
        return this;
    }

    
    public Builder withId(String id) {
      _softwareapplication.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _softwareapplication.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _softwareapplication.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _softwareapplication.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _softwareapplication.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _softwareapplication.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _softwareapplication.dateModified = dataModified;
      return this;
    }
    
    public Builder withVersion(String version) {
      _softwareapplication.version = version;
      return this;
    }
    
    public SoftwareApplication build() {
      if (StringUtils.isBlank(_softwareapplication.id) 
          || StringUtils.isBlank(_softwareapplication.type)) {
        throw new IllegalStateException(_softwareapplication.toString());
      }

      return _softwareapplication;
    }
  }

}
