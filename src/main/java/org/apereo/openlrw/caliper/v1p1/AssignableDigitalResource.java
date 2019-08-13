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
@JsonDeserialize(builder = DigitalResource.Builder.class)
public class AssignableDigitalResource extends DigitalResource {

  private static final long serialVersionUID = 1L;
 
  protected Instant dateToActivate;
  protected Instant dateToShow;
  protected Instant dateToStartOn;
  protected Instant dateToSubmit;
  private int maxAttempts;
  private int maxSubmits;
  private int maxScore;
  
   
  public Instant getDateToActivate() {
        return dateToActivate;
  }

  public Instant getDateToShow() {
        return dateToShow;
  }
  public Instant getDateToStartOn() {
        return dateToStartOn;
  }
  public Instant getDateToSubmit() {
        return dateToSubmit;
  }

  public int getMaxAttempts() {
    return maxAttempts;
  }
  public int getSubmits() {
    return maxSubmits;
  }
  public int getScore() {
    return maxScore;
  }

  // For Assessment
  protected List<AssignableDigitalResource> items;
  
  public List<AssignableDigitalResource> getItems() {
    return items;
  }

  // For AssessmentItem
  protected Boolean isTimeDependent;
  
  public Boolean getIsTimeDependent() {
    return isTimeDependent;
  }
 
  
  public static class Builder {
    AssignableDigitalResource _digitalresource = new AssignableDigitalResource();

    @JsonProperty("@context")
    public Builder withContext(String context) {
      _digitalresource.context = context;
      return this;
    }
    
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

    public Builder withDateToActivate(Instant dateToActivate) {
      _digitalresource.dateToActivate = dateToActivate;
      return this;
    }
    public Builder withDateToShow(Instant dateToShow) {
      _digitalresource.dateToShow = dateToShow;
      return this;
    }
    public Builder withDateToStartOn(Instant dateToStartOn) {
      _digitalresource.dateToStartOn = dateToStartOn;
      return this;
    }
    
    public Builder withDateToSubmit(Instant dateToSubmit) {
      _digitalresource.dateToSubmit = dateToSubmit;
      return this;
    }

   public Builder withMaxScore(int maxScore) {
      _digitalresource.maxScore = maxScore;
      return this;
    }

    public Builder withMaxAttempts(int maxAttempts) {
      _digitalresource.maxAttempts = maxAttempts;
      return this;
    }

    public Builder withMaxSubmits(int maxSubmits) {
      _digitalresource.maxSubmits = maxSubmits;
      return this;
    }

    public Builder withItems(List<AssignableDigitalResource> items) {
      _digitalresource.items = items;
      return this;
    }

    public Builder withIsTimeDependent(Boolean isTimeDependent) {
      _digitalresource.isTimeDependent = isTimeDependent;
      return this;
    }
   
    
    public AssignableDigitalResource build() {
      if (StringUtils.isBlank(_digitalresource.id) 
          || StringUtils.isBlank(_digitalresource.type)) {
        throw new IllegalStateException(_digitalresource.toString());
      }

      return _digitalresource;
    }
  }


}
