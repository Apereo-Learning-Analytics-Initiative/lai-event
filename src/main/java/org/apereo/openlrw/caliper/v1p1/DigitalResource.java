/**
 * 
 */
package org.apereo.openlrw.caliper.v1p1;

import java.time.Instant;
import java.util.List;
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
@JsonDeserialize(builder = DigitalResource.Builder.class)
public class DigitalResource extends Entity {

  private static final long serialVersionUID = 1L;
  
  private List<Agent> creators;
  private String mediaType;
  private List<String> keywords;
  private List<LearningObjective> learningObjectives;
  private Entity isPartOf;
  private Instant datePublished;
  private String version;
  
  public List<Agent> getCreators() {
    return creators;
  }
  public String getMediaType() {
    return mediaType;
  }
  public List<String> getKeywords() {
    return keywords;
  }
  public List<LearningObjective> getLearningObjectives() {
    return learningObjectives;
  }
  public Entity getIsPartOf() {
    return isPartOf;
  }
  public Instant getDatePublished() {
    return datePublished;
  }
  public String getVersion() {
    return version;
  }
  
  public static class Builder {
    DigitalResource _digitalresource = new DigitalResource();
    
    public Builder withId(String id) {
      _digitalresource.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _digitalresource.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _digitalresource.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _digitalresource.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _digitalresource.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _digitalresource.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _digitalresource.dateModified = dataModified;
      return this;
    }
    
    public Builder withCreators(List<Agent> creators) {
      _digitalresource.creators = creators;
      return this;
    }
    public Builder withMediaType(String mediaType) {
      _digitalresource.mediaType = mediaType;
      return this;
    }
    public Builder withKeywords(List<String> keywords) {
      _digitalresource.keywords = keywords;
      return this;
    }
    public Builder withLearningObjectives(List<LearningObjective> learningObjectives) {
      _digitalresource.learningObjectives = learningObjectives;
      return this;
    }
    public Builder withIsPartOf(Entity isPartOf) {
      _digitalresource.isPartOf = isPartOf;
      return this;
    }
    public Builder withDatePublished(Instant datePublished) {
      _digitalresource.datePublished = datePublished;
      return this;
    }
    public Builder withVersion(String version) {
      _digitalresource.version = version;
      return this;
    }
    
    public DigitalResource build() {
      if (StringUtils.isBlank(_digitalresource.id) 
          || StringUtils.isBlank(_digitalresource.type)) {
        throw new IllegalStateException(_digitalresource.toString());
      }

      return _digitalresource;
    }
  }


}
