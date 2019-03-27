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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author ggilbert
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Organization.Builder.class)
public class Organization extends Agent {

  private static final long serialVersionUID = 1L;
  
  private Organization subOrganizationOf;
  private List<Agent> members;
  public Organization getSubOrganizationOf() {
    return subOrganizationOf;
  }
  public List<Agent> getMembers() {
    return members;
  }
  
  // CourseOffering
  private String courseNumber;
  private String academicSession;

  public String getCourseNumber() {
    return courseNumber;
  }
  public String getAcademicSession() {
    return academicSession;
  }
  
  // CourseSection
  private String category;

  public String getCategory() {
    return category;
  }

  public static class Builder {
    Organization _organization = new Organization();
    
    public Builder withId(String id) {
      _organization.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _organization.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _organization.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _organization.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _organization.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _organization.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _organization.dateModified = dataModified;
      return this;
    }
    
    public Builder withSubOrganizationOf(Organization organization) {
      _organization.subOrganizationOf = organization;
      return this;
    }
    
    public Builder withMembers(List<Agent> members) {
      _organization.members = members;
      return this;
    }
    
    public Builder withCourseNumber(String courseNumber) {
      _organization.courseNumber = courseNumber;
      return this;
    }
    public Builder withAcademicSession(String academicSession) {
      _organization.academicSession = academicSession;
      return this;
    }
    
    public Builder withCategory(String category) {
      _organization.category = category;
      return this;
    }
    
    public Organization build() {
      if (StringUtils.isBlank(_organization.id) 
          || StringUtils.isBlank(_organization.type)) {
        throw new IllegalStateException(_organization.toString());
      }

      return _organization;
    }
  }

}
