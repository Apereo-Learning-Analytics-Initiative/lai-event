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
@JsonDeserialize(builder = Score.Builder.class)
public class Score extends Entity {

    protected Attempt attempt;
    protected double maxScore;
    protected double scoreGiven;
    protected String comment;
    protected Agent scoredBy;
  

    public Attempt getAttempt() {
        return attempt;
    }
   
    public double getMaxScore() {
        return maxScore;
    }
    public double getScoreGiven() {
        return scoreGiven;
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
        Score _score = new Score(); 

        public Builder withId(String id) {
        _score.id = id;
        return this;
        }
        
        public Builder withType(String type) {
        _score.type = type;
        return this;
        }

        @JsonProperty("@context")
        public Builder withContext(String context) {
        _score.context = context;
        return this;
        }
        
        public Builder withName(String name) {
        _score.name = name;
        return this;
        }
        
        public Builder withDescription(String description) {
        _score.description = description;
        return this;
        }
        
        public Builder withExtensions(Map<String,String> extensions) {
        _score.extensions = extensions;
        return this;
        }
        
        public Builder withDateCreated(Instant dateCreated) {
        _score.dateCreated = dateCreated;
        return this;
        }
        
        public Builder withDateModified(Instant dataModified) {
        _score.dateModified = dataModified;
        return this;
        }

         public Builder withAttempt(Attempt attempt) {
            _score.attempt = attempt;
            return  this;
        }
        

        public Builder withMaxScore(double maxScore) {
        _score.maxScore = maxScore;
        return this;
        }
        
        public Builder withScoreGiven(double scoreGiven) {
        _score.scoreGiven = scoreGiven;
        return this;
        }

        public Builder withComment(String comment) {
        _score.comment = comment;
        return this;
        }

        public Builder withScoredBy(Agent scoredBy) {
        _score.scoredBy = scoredBy;
        return this;
        }

        public Score build() {
        if (StringUtils.isBlank(_score.id) 
            || StringUtils.isBlank(_score.type)) {
            throw new IllegalStateException(_score.toString());
        }

        return _score;
        }
    }
}
