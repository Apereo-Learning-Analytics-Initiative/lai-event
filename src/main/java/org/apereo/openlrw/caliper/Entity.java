package org.apereo.openlrw.caliper;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * @author ggilbert
 * @author xchopin <xavier.chopin@univ-lorraine.fr>
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Entity.Builder.class)
public class Entity implements Serializable {

  private static final long serialVersionUID = 1L;

  @NotNull
  @JsonProperty("@id")
  private String id;
  
  @JsonProperty("@type")
  private String type;
  
  @JsonProperty("@context")
  private String context;

  private String name;
  private String description;
  private Map<String, String> extensions;
  private Instant dateCreated;
  private Instant dateModified;
  
  private List<String> objectType;
  private List<LearningObject> alignedLearningObjective;
  private List<String> keywords;
  private Entity isPartOf;
  private Instant datePublished;
  private String version;
  private String duration;
  private String currentTime;
  
  private String assignable;
  private String actor;
  private Double normalScore;
  private Double penaltyScore;
  private Double totalScore;
  private Double extraCreditScore;
  private Double curvedTotalScore;
  private String curveFactor; 
  private String comment;
  private Agent scoredBy;
  
  private Entity() {}

  public String getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public String getContext() {
    return context;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Map<String, String> getExtensions() {
    return extensions;
  }

  public Instant getDateCreated() {
    return dateCreated;
  }

  public Instant getDateModified() {
    return dateModified;
  }
  
  public List<String> getObjectType() {
    return objectType;
  }

  public List<LearningObject> getAlignedLearningObjective() {
    return alignedLearningObjective;
  }

  public List<String> getKeywords() {
    return keywords;
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

  public String getDuration() {
    return duration;
  }

  public String getCurrentTime() {
    return currentTime;
  }

  public String getAssignable() {
    return assignable;
  }

  public String getActor() {
    return actor;
  }

  public Double getNormalScore() {
    return normalScore;
  }

  public Double getPenaltyScore() {
    return penaltyScore;
  }

  public Double getTotalScore() {
    return totalScore;
  }

  public Double getExtraCreditScore() {
    return extraCreditScore;
  }

  public Double getCurvedTotalScore() {
    return curvedTotalScore;
  }

  public String getCurveFactor() {
    return curveFactor;
  }

  public String getComment() {
    return comment;
  }

  public Agent getScoredBy() {
    return scoredBy;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((actor == null) ? 0 : actor.hashCode());
    result = prime * result + ((alignedLearningObjective == null) ? 0 : alignedLearningObjective.hashCode());
    result = prime * result + ((assignable == null) ? 0 : assignable.hashCode());
    result = prime * result + ((comment == null) ? 0 : comment.hashCode());
    result = prime * result + ((context == null) ? 0 : context.hashCode());
    result = prime * result + ((currentTime == null) ? 0 : currentTime.hashCode());
    result = prime * result + ((curveFactor == null) ? 0 : curveFactor.hashCode());
    result = prime * result + ((curvedTotalScore == null) ? 0 : curvedTotalScore.hashCode());
    result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
    result = prime * result + ((dateModified == null) ? 0 : dateModified.hashCode());
    result = prime * result + ((datePublished == null) ? 0 : datePublished.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((duration == null) ? 0 : duration.hashCode());
    result = prime * result + ((extensions == null) ? 0 : extensions.hashCode());
    result = prime * result + ((extraCreditScore == null) ? 0 : extraCreditScore.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((isPartOf == null) ? 0 : isPartOf.hashCode());
    result = prime * result + ((keywords == null) ? 0 : keywords.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((normalScore == null) ? 0 : normalScore.hashCode());
    result = prime * result + ((objectType == null) ? 0 : objectType.hashCode());
    result = prime * result + ((penaltyScore == null) ? 0 : penaltyScore.hashCode());
    result = prime * result + ((scoredBy == null) ? 0 : scoredBy.hashCode());
    result = prime * result + ((totalScore == null) ? 0 : totalScore.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    result = prime * result + ((version == null) ? 0 : version.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Entity other = (Entity) obj;
    if (actor == null) {
      if (other.actor != null)
        return false;
    } else if (!actor.equals(other.actor))
      return false;
    if (alignedLearningObjective == null) {
      if (other.alignedLearningObjective != null)
        return false;
    } else if (!alignedLearningObjective.equals(other.alignedLearningObjective))
      return false;
    if (assignable == null) {
      if (other.assignable != null)
        return false;
    } else if (!assignable.equals(other.assignable))
      return false;
    if (comment == null) {
      if (other.comment != null)
        return false;
    } else if (!comment.equals(other.comment))
      return false;
    if (context == null) {
      if (other.context != null)
        return false;
    } else if (!context.equals(other.context))
      return false;
    if (currentTime == null) {
      if (other.currentTime != null)
        return false;
    } else if (!currentTime.equals(other.currentTime))
      return false;
    if (curveFactor == null) {
      if (other.curveFactor != null)
        return false;
    } else if (!curveFactor.equals(other.curveFactor))
      return false;
    if (curvedTotalScore == null) {
      if (other.curvedTotalScore != null)
        return false;
    } else if (!curvedTotalScore.equals(other.curvedTotalScore))
      return false;
    if (dateCreated == null) {
      if (other.dateCreated != null)
        return false;
    } else if (!dateCreated.equals(other.dateCreated))
      return false;
    if (dateModified == null) {
      if (other.dateModified != null)
        return false;
    } else if (!dateModified.equals(other.dateModified))
      return false;
    if (datePublished == null) {
      if (other.datePublished != null)
        return false;
    } else if (!datePublished.equals(other.datePublished))
      return false;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (duration == null) {
      if (other.duration != null)
        return false;
    } else if (!duration.equals(other.duration))
      return false;
    if (extensions == null) {
      if (other.extensions != null)
        return false;
    } else if (!extensions.equals(other.extensions))
      return false;
    if (extraCreditScore == null) {
      if (other.extraCreditScore != null)
        return false;
    } else if (!extraCreditScore.equals(other.extraCreditScore))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (isPartOf == null) {
      if (other.isPartOf != null)
        return false;
    } else if (!isPartOf.equals(other.isPartOf))
      return false;
    if (keywords == null) {
      if (other.keywords != null)
        return false;
    } else if (!keywords.equals(other.keywords))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (normalScore == null) {
      if (other.normalScore != null)
        return false;
    } else if (!normalScore.equals(other.normalScore))
      return false;
    if (objectType == null) {
      if (other.objectType != null)
        return false;
    } else if (!objectType.equals(other.objectType))
      return false;
    if (penaltyScore == null) {
      if (other.penaltyScore != null)
        return false;
    } else if (!penaltyScore.equals(other.penaltyScore))
      return false;
    if (scoredBy == null) {
      if (other.scoredBy != null)
        return false;
    } else if (!scoredBy.equals(other.scoredBy))
      return false;
    if (totalScore == null) {
      if (other.totalScore != null)
        return false;
    } else if (!totalScore.equals(other.totalScore))
      return false;
    if (type == null) {
      if (other.type != null)
        return false;
    } else if (!type.equals(other.type))
      return false;
    if (version == null) {
      if (other.version != null)
        return false;
    } else if (!version.equals(other.version))
      return false;
    return true;
  }

  public static class Builder {
    Entity _entity = new Entity();
    
    @JsonProperty("@id")
    public Builder withId(String id) {
      _entity.id = id;
      return this;
    }
    
    @JsonProperty("@type")
    public Builder withType(String type) {
      _entity.type = type;
      return this;
    }
    
    @JsonProperty("id")
    public Builder withV11Id(String id) {
      _entity.id = id;
      return this;
    }
    
    @JsonProperty("type")
    public Builder withV11Type(String type) {
      _entity.type = type;
      return this;
    }
    
    @JsonProperty("@context")
    public Builder withContext(String context) {
      _entity.context = context;
      return this;
    }
    
    public Builder withName(String name) {
      _entity.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _entity.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _entity.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _entity.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _entity.dateModified = dataModified;
      return this;
    }
    
    public Builder withObjectType(List<String> objectType) {
      _entity.objectType = objectType;
      return this;
    }
    
    public Builder withAlignedLearningObjective(List<LearningObject> alignedLearningObjective) {
      _entity.alignedLearningObjective = alignedLearningObjective;
      return this;
    }
    
    public Builder withKeywords(List<String> keywords) {
      _entity.keywords = keywords;
      return this;
    }
    
    public Builder withIsPartOf(Entity isPartOf) {
      _entity.isPartOf = isPartOf;
      return this;
    }
    
    public Builder withDatePublished(Instant datePublished) {
      _entity.datePublished = datePublished;
      return this;
    }
    
    public Builder withVersion(String version) {
      _entity.version = version;
      return this;
    }
    
    public Builder withDuration(String duration) {
      _entity.duration = duration;
      return this;
    }
    
    public Builder withCurrentTime(String currentTime) {
      _entity.currentTime = currentTime;
      return this;
    }
    
    public Builder withAssignable(String assignable) {
      _entity.assignable = assignable;
      return this;
    }
    
    public Builder withActor(String actor) {
      _entity.actor = actor;
      return this;
    }
    
    public Builder withNormalScore(Double normalScore) {
      _entity.normalScore = normalScore;
      return this;
    }
    
    public Builder withPenaltyScore(Double penaltyScore) {
      _entity.penaltyScore = penaltyScore;
      return this;
    }
    
    public Builder withTotalScore(Double totalScore) {
      _entity.totalScore = totalScore;
      return this;
    }
    
    public Builder withExtraCreditScore(Double extraCreditScore) {
      _entity.extraCreditScore = extraCreditScore;
      return this;
    }
    
    public Builder withCurvedTotalScore(Double curvedTotalScore) {
      _entity.curvedTotalScore = curvedTotalScore;
      return this;
    }
    
    public Builder withCurveFactor(String curveFactor) {
      _entity.curveFactor = curveFactor;
      return this;
    }
    
    public Builder withComment(String comment) {
      _entity.comment = comment;
      return this;
    }
    
    public Builder withScoredBy(Agent scoredBy) {
      _entity.scoredBy = scoredBy;
      return this;
    }

    public Entity build() {
      if (StringUtils.isBlank(_entity.id) 
          || StringUtils.isBlank(_entity.type)) {
        throw new IllegalStateException(_entity.toString());
      }

      return _entity;
    }
  }
}
