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


@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DigitalResourceCollection.Builder.class)
public class DigitalResourceCollection extends DigitalResource {

  private static final long serialVersionUID = 1L;
 
  protected List<DigitalResource> items;
  
  public List<DigitalResource> getItems() {
    return items;
  }
      
  public static class Builder {
    DigitalResourceCollection _digitalresources = new DigitalResourceCollection();

    @JsonProperty("@context")
    public Builder withContext(String context) {
      _digitalresources.context = context;
      return this;
    }
    
    public Builder withId(String id) {
      _digitalresources.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _digitalresources.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _digitalresources.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _digitalresources.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _digitalresources.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _digitalresources.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _digitalresources.dateModified = dataModified;
      return this;
    }
    
    public Builder withCreators(List<Agent> creators) {
      _digitalresources.creators = creators;
      return this;
    }
    public Builder withMediaType(String mediaType) {
      _digitalresources.mediaType = mediaType;
      return this;
    }
    public Builder withKeywords(List<String> keywords) {
      _digitalresources.keywords = keywords;
      return this;
    }
    public Builder withLearningObjectives(List<LearningObjective> learningObjectives) {
      _digitalresources.learningObjectives = learningObjectives;
      return this;
    }
    public Builder withIsPartOf(Entity isPartOf) {
      _digitalresources.isPartOf = isPartOf;
      return this;
    }
/*    public Builder withIsPartOf(String isPartOf) {
       _digitalresources.isPartOf = null;
      if(isPartOf != null && !isPartOf.isEmpty()) {  
        _digitalresources.isPartOf = new Entity.Builder()
                                    .withId(isPartOf)
                                    .withType("Entity")
                                    .build();
      }
      return this;
    }
    */
    public Builder withDatePublished(Instant datePublished) {
      _digitalresources.datePublished = datePublished;
      return this;
    }
    public Builder withVersion(String version) {
      _digitalresources.version = version;
      return this;
    }

    public Builder withItems(List<DigitalResource> items) {
      _digitalresources.items = items;
      return this;
    }

        
    public DigitalResourceCollection build() {
      if (StringUtils.isBlank(_digitalresources.id) 
          || StringUtils.isBlank(_digitalresources.type)) {
        throw new IllegalStateException(_digitalresources.toString());
      }

      return _digitalresources;
    }
  }


}
