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
@JsonDeserialize(builder = Result.Builder.class)
public class Result extends Entity {

    protected Attempt attempt;
    protected double maxResultScore;
    protected double resultScore;
    protected String comment;
    protected Agent scoredBy;
  

    public Attempt getAttempt() {
        return attempt;
    }
   
    public double getMaxResultScore() {
        return maxResultScore;
    }
    public double getResultScore() {
        return resultScore;
    }

    public String getComment() {
        return comment;
    }

    public Agent getScoredBy() {
        return scoredBy;
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
        Result _result = new Result(); 

        public Builder withId(String id) {
        _result.id = id;
        return this;
        }
        
        public Builder withType(String type) {
        _result.type = type;
        return this;
        }

        @JsonProperty("@context")
        public Builder withContext(String context) {
        _result.context = context;
        return this;
        }
        
        public Builder withName(String name) {
        _result.name = name;
        return this;
        }
        
        public Builder withDescription(String description) {
        _result.description = description;
        return this;
        }
        
        public Builder withExtensions(Map<String,String> extensions) {
        _result.extensions = extensions;
        return this;
        }
        
        public Builder withDateCreated(Instant dateCreated) {
        _result.dateCreated = dateCreated;
        return this;
        }
        
        public Builder withDateModified(Instant dataModified) {
        _result.dateModified = dataModified;
        return this;
        }

        public Builder withAttempt(Attempt attempt) {
            _result.attempt = attempt;
            return  this;
        }
        
        public Builder withMaxResultScore(double maxResultScore) {
        _result.maxResultScore = maxResultScore;
        return this;
        }
        
        public Builder withResultScore(double resultScore) {
        _result.resultScore = resultScore;
        return this;
        }

        public Builder withComment(String comment) {
        _result.comment = comment;
        return this;
        }

        public Builder withScoredBy(Agent scoredBy) {
        _result.scoredBy = scoredBy;
        return this;
        }

        public Result build() {
        if (StringUtils.isBlank(_result.id) 
            || StringUtils.isBlank(_result.type)) {
            throw new IllegalStateException(_result.toString());
        }

        return _result;
        }
    }
}
