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
@JsonDeserialize(builder = Message.Builder.class)
public class Message extends DigitalResource {

  private static final long serialVersionUID = 1L;
 
  protected Message replyTo;
  protected String body;
  protected List<DigitalResource> attachments;
  
  public Message getReplyTo() {
    return replyTo;
  }
  public String getBody() {
    return body;
  }
  public List<DigitalResource> getAttachments() {
    return attachments;
  }
    
  public static class Builder {
    Message _message = new Message();

    @JsonProperty("@context")
    public Builder withContext(String context) {
      _message.context = context;
      return this;
    }
    
    public Builder withId(String id) {
      _message.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _message.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _message.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _message.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _message.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _message.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _message.dateModified = dataModified;
      return this;
    }
    
    public Builder withCreators(List<Agent> creators) {
      _message.creators = creators;
      return this;
    }
    public Builder withMediaType(String mediaType) {
      _message.mediaType = mediaType;
      return this;
    }
    public Builder withKeywords(List<String> keywords) {
      _message.keywords = keywords;
      return this;
    }
    public Builder withLearningObjectives(List<LearningObjective> learningObjectives) {
      _message.learningObjectives = learningObjectives;
      return this;
    }
    public Builder withIsPartOf(Entity isPartOf) {
      _message.isPartOf = isPartOf;
      return this;
    }
    public Builder withDatePublished(Instant datePublished) {
      _message.datePublished = datePublished;
      return this;
    }
    public Builder withVersion(String version) {
      _message.version = version;
      return this;
    }

    public Builder withReplyTo(Message replyTo) {
      _message.replyTo = replyTo;
      return this;
    }
        public Builder withBody(String body) {
      _message.body = body;
      return this;
    }
    public Builder withAttachments(List<DigitalResource> attachments) {
      _message.attachments = attachments;
      return this;
    }
         
    public Message build() {
      if (StringUtils.isBlank(_message.id) 
          || StringUtils.isBlank(_message.type)) {
        throw new IllegalStateException(_message.toString());
      }

      return _message;
    }
  }


}
