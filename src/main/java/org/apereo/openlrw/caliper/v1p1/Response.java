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
@JsonDeserialize(builder = Response.Builder.class)
public class Response extends Entity {

    protected Attempt attempt;
    protected Instant startedAtTime;
    protected Instant endedAtTime;
    protected String duration;
  

    public Attempt getAttempt() {
        return attempt;
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

    // For FillInBlankResponse, MultipleResponseReponse, SelectTextResponse
    protected List<String> values;
    
    public List<String> getValues() {
        return values;
    }

    // For MultipleChoiseResponse, TrueFalseResponse
    protected String value;
    
    public String value() {
        return value;
    }


    public static class Builder {
        Response _response = new Response(); 

        public Builder withId(String id) {
        _response.id = id;
        return this;
        }
        
        public Builder withType(String type) {
        _response.type = type;
        return this;
        }

        @JsonProperty("@context")
        public Builder withContext(String context) {
        _response.context = context;
        return this;
        }
        
        public Builder withName(String name) {
        _response.name = name;
        return this;
        }
        
        public Builder withDescription(String description) {
        _response.description = description;
        return this;
        }
        
        public Builder withExtensions(Map<String,String> extensions) {
        _response.extensions = extensions;
        return this;
        }
        
        public Builder withDateCreated(Instant dateCreated) {
        _response.dateCreated = dateCreated;
        return this;
        }
        
        public Builder withDateModified(Instant dataModified) {
        _response.dateModified = dataModified;
        return this;
        }

        public Builder withAttempt(Attempt attempt) {
            _response.attempt = attempt;
            return  this;
        }
        
        public Builder withStartedAtTime(Instant startedAtTime) {
        _response.startedAtTime = startedAtTime;
        return this;
        }
        
        public Builder withEndedAtTime(Instant endedAtTime) {
        _response.endedAtTime = endedAtTime;
        return this;
        }

        public Builder withDuration(String duration) {
        _response.duration = duration;
        return this;
        }

        public Builder withValues(List<String> values) {
        _response.values = values;
        return this;
        }

         public Builder withValue(String value) {
        _response.value = value;
        return this;
        }

        public Response build() {
        if (StringUtils.isBlank(_response.id) 
            || StringUtils.isBlank(_response.type)) {
            throw new IllegalStateException(_response.toString());
        }

        return _response;
        }
    }
}
