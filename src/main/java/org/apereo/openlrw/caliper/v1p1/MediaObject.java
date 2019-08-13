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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author ggilbert
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = MediaObject.Builder.class)
public class MediaObject extends DigitalResource {

  private static final long serialVersionUID = 1L;
 
  private String duration;
   
  public String getDuration() {
    return duration;
  }

 
  
  public static class Builder {
    MediaObject _mediaObject = new MediaObject();

    @JsonProperty("@context")
    public Builder withContext(String context) {
      _mediaObject.context = context;
      return this;
    }
    
    public Builder withId(String id) {
      _mediaObject.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _mediaObject.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _mediaObject.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _mediaObject.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _mediaObject.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _mediaObject.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _mediaObject.dateModified = dataModified;
      return this;
    }
    
    public Builder withCreators(List<Agent> creators) {
      _mediaObject.creators = creators;
      return this;
    }
    public Builder withMediaType(String mediaType) {
      _mediaObject.mediaType = mediaType;
      return this;
    }
    public Builder withKeywords(List<String> keywords) {
      _mediaObject.keywords = keywords;
      return this;
    }
    public Builder withLearningObjectives(List<LearningObjective> learningObjectives) {
      _mediaObject.learningObjectives = learningObjectives;
      return this;
    }
    public Builder withIsPartOf(Entity isPartOf) {
      _mediaObject.isPartOf = isPartOf;
      return this;
    }
 
    public Builder withDatePublished(Instant datePublished) {
      _mediaObject.datePublished = datePublished;
      return this;
    }
    public Builder withVersion(String version) {
      _mediaObject.version = version;
      return this;
    }

    public Builder withDuration(String duration) {
      _mediaObject.duration = duration;
      return this;
    }

    public MediaObject build() {
      if (StringUtils.isBlank(_mediaObject.id) 
          || StringUtils.isBlank(_mediaObject.type)) {
        throw new IllegalStateException(_mediaObject.toString());
      }

      return _mediaObject;
    }
  }


}
