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
@JsonDeserialize(builder = Annotation.Builder.class)
public class Annotation extends Entity {

  private static final long serialVersionUID = 1L;

  protected Person annotator;
  protected DigitalResource annotated;
  
  public Person getAnnotator() {
    return annotator;
  }
  public DigitalResource getAnnotated() {
    return annotated;
  }

  // BookmarkAnnotation
  private String bookmarkNotes;
  public String getBookmarkNotes() {
        return bookmarkNotes;
  }

  //HighlightAnnotation
  private TextPositionSelector selection;  
  private String selectionText;

  public TextPositionSelector getSelection() {
        return selection;
   }
   public String getSelectionText() {
        return selectionText;
  }

  //SharedAnnotation
  protected List<Agent> withAgents;
  
  public List<Agent> getWithAgents() {
    return withAgents;
  }

  //TagAnnotation
  protected List<String> tags;
  
  public List<String> getTags() {
    return tags;
  }

  
  public static class Builder {
    Annotation _annotation = new Annotation();
    
    public Builder withId(String id) {
      _annotation.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _annotation.type = type;
      return this;
    }

    @JsonProperty("@context")
    public Builder withContext(String context) {
      _annotation.context = context;
      return this;
    }
    
    public Builder withName(String name) {
      _annotation.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _annotation.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _annotation.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _annotation.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _annotation.dateModified = dataModified;
      return this;
    }

    public Builder withAnnotator(Person annotator) {
        _annotation.annotator = annotator;
        return  this;
    }
    

    public Builder withAnnotated(DigitalResource annotated) {
        _annotation.annotated = annotated;
        return  this;
    }
       

    public Builder withBookmarkNotes(String bookmarkNotes) {
        _annotation.bookmarkNotes = bookmarkNotes;
        return  this;
    }

   public Builder withSelection(TextPositionSelector selection) {
        _annotation.selection = selection;
        return this;
   }
   public Builder withSelectionText(String selectionText) {
        _annotation.selectionText = selectionText;
        return this;
    }

    public Builder withWithAgents(List<Agent> withAgents) {
        _annotation.withAgents = withAgents;
        return this;
    }

    public Builder withTags(List<String> tags) {
        _annotation.tags = tags;
        return this;
    }
    
    public Annotation build() {
      if (StringUtils.isBlank(_annotation.id) 
          || StringUtils.isBlank(_annotation.type)) {
        throw new IllegalStateException(_annotation.toString());
      }

      return _annotation;
    }
  }
}
  