/**
 * 
 */
package org.apereo.openlrw.caliper.v1p1;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TextPositionSelector.Builder.class)
public class TextPositionSelector{

    @JsonProperty("type")
    private String type = "TextPositionSelector";

    @JsonProperty("start")
    private int start;

    @JsonProperty("end")
    private int end;

    // Constructor
    public TextPositionSelector() {

    }
    
    public String getType() {
        return type;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

   
     public static class Builder {
        TextPositionSelector _selection = new TextPositionSelector();
       
        public Builder withType(String type) {
            _selection.type = type;
            return this;
        }
        public Builder withStart(int start) {
            _selection.start = start;
            return this;
        }

        public Builder withEnd(int end) {
            _selection.end = end;
            return this;
        }

         public TextPositionSelector build() {
                return _selection;
        }
     }

}
