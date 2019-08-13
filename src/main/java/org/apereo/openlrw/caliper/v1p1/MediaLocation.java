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
@JsonDeserialize(builder = MediaLocation.Builder.class)
public class MediaLocation extends DigitalResource {

  private static final long serialVersionUID = 1L;
 
  private String currentTime;
  
   public String getCurrentTime() {
    return currentTime;
  }
  
  public static class Builder {
   MediaLocation _mediaLocation = new MediaLocation();

    @JsonProperty("@context")
    public Builder withContext(String context) {
      _mediaLocation.context = context;
      return this;
    }
    
    public Builder withId(String id) {
      _mediaLocation.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _mediaLocation.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _mediaLocation.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _mediaLocation.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _mediaLocation.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _mediaLocation.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _mediaLocation.dateModified = dataModified;
      return this;
    }
    
    public Builder withCreators(List<Agent> creators) {
      _mediaLocation.creators = creators;
      return this;
    }
    public Builder withMediaType(String mediaType) {
      _mediaLocation.mediaType = mediaType;
      return this;
    }
    public Builder withKeywords(List<String> keywords) {
      _mediaLocation.keywords = keywords;
      return this;
    }
    public Builder withLearningObjectives(List<LearningObjective> learningObjectives) {
      _mediaLocation.learningObjectives = learningObjectives;
      return this;
    }
    public Builder withIsPartOf(Entity isPartOf) {
      _mediaLocation.isPartOf = isPartOf;
      return this;
    }
    
    public Builder withDatePublished(Instant datePublished) {
      _mediaLocation.datePublished = datePublished;
      return this;
    }
    public Builder withVersion(String version) {
      _mediaLocation.version = version;
      return this;
    }

     public Builder withCurrentTime(String currentTime) {
      _mediaLocation.currentTime = currentTime;
      return this;
    }
    
    public MediaLocation build() {
      if (StringUtils.isBlank(_mediaLocation.id) 
          || StringUtils.isBlank(_mediaLocation.type)) {
        throw new IllegalStateException(_mediaLocation.toString());
      }

      return _mediaLocation;
    }
  }


}
