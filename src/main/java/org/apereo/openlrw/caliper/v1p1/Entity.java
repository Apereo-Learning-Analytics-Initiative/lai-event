/**
 * 
 */
package org.apereo.openlrw.caliper.v1p1;

import java.io.Serializable;
import java.time.Instant;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author ggilbert
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Entity.Builder.class)
public class Entity implements Serializable {

  private static final long serialVersionUID = 1L;
  
  @NotNull protected String id;
  @NotNull protected String type;
  protected String name;
  protected String description;
  protected Instant dateCreated;
  protected Instant dateModified;
  protected Map<String,String> extensions;
  
  public String getId() {
    return id;
  }
  public String getType() {
    return type;
  }
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }
  public Instant getDateCreated() {
    return dateCreated;
  }
  public Instant getDateModified() {
    return dateModified;
  }
  public Map<String, String> getExtensions() {
    return extensions;
  }
  
  // Annotation
  protected Person annotator;
  protected DigitalResource annotated;
  
  public Person getAnnotator() {
    return annotator;
  }
  public DigitalResource getAnnotated() {
    return annotated;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((annotated == null) ? 0 : annotated.hashCode());
    result = prime * result + ((annotator == null) ? 0 : annotator.hashCode());
    result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
    result = prime * result + ((dateModified == null) ? 0 : dateModified.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((extensions == null) ? 0 : extensions.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
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
    if (annotated == null) {
      if (other.annotated != null)
        return false;
    } else if (!annotated.equals(other.annotated))
      return false;
    if (annotator == null) {
      if (other.annotator != null)
        return false;
    } else if (!annotator.equals(other.annotator))
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
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (extensions == null) {
      if (other.extensions != null)
        return false;
    } else if (!extensions.equals(other.extensions))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (type == null) {
      if (other.type != null)
        return false;
    } else if (!type.equals(other.type))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  public static class Builder {
    Entity _entity = new Entity();
    
    public Builder withId(String id) {
      _entity.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _entity.type = type;
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
    
    public Entity build() {
      if (StringUtils.isBlank(_entity.id) 
          || StringUtils.isBlank(_entity.type)) {
        throw new IllegalStateException(_entity.toString());
      }

      return _entity;
    }
  }
}
