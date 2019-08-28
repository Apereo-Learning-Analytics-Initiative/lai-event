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
@JsonDeserialize(builder = Attempt.Builder.class)
public class Attempt extends Entity {

    protected Person assignee;
    protected DigitalResource assignable;
    protected int count;
    protected Instant startedAtTime;
    protected Instant endedAtTime;
    protected String duration;
  

    public Person getAssignee() {
        return assignee;
    }
    public DigitalResource getAssignable() {
        return assignable;
    }
    public int getCount() {
        return count;
    }

    public Instant getStartedAtTime() {
        return startedAtTime;
    }
    public Instant getEndedAtTime() {
            return endedAtTime;
    }

    public String getDuration() {
        return duration;
    }

    public static class Builder {
        Attempt _attempt = new Attempt(); 

        public Builder withId(String id) {
        _attempt.id = id;
        return this;
        }
        
        public Builder withType(String type) {
        _attempt.type = type;
        return this;
        }

        @JsonProperty("@context")
        public Builder withContext(String context) {
        _attempt.context = context;
        return this;
        }
        
        public Builder withName(String name) {
        _attempt.name = name;
        return this;
        }
        
        public Builder withDescription(String description) {
        _attempt.description = description;
        return this;
        }
        
        public Builder withExtensions(Map<String,String> extensions) {
        _attempt.extensions = extensions;
        return this;
        }
        
        public Builder withDateCreated(Instant dateCreated) {
        _attempt.dateCreated = dateCreated;
        return this;
        }
        
        public Builder withDateModified(Instant dataModified) {
        _attempt.dateModified = dataModified;
        return this;
        }

        public Builder withAssignee(Person assignee) {
        _attempt.assignee = assignee;
        return  this;
        }
        
        public Builder withAssignable(DigitalResource assignable) {
            _attempt.assignable = assignable;
            return  this;
        }
        
        public Builder withCount(int count) {
        _attempt.count = count;
        return this;
        }
        public Builder withStartedAtTime(Instant startedAtTime) {
        _attempt.startedAtTime = startedAtTime;
        return this;
        }
        
        public Builder withEndedAtTime(Instant endedAtTime) {
        _attempt.endedAtTime = endedAtTime;
        return this;
        }

        public Builder withDuration(String duration) {
        _attempt.duration = duration;
        return this;
        }

       
        
        public Attempt build() {
        if (StringUtils.isBlank(_attempt.id) 
            || StringUtils.isBlank(_attempt.type)) {
            throw new IllegalStateException(_attempt.toString());
        }

        return _attempt;
        }
    }
}
