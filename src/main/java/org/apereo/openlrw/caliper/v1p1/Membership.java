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
@JsonDeserialize(builder = Membership.Builder.class)
public class Membership extends Entity {

  private static final long serialVersionUID = 1L;
  
  private Organization organization;
  private Person member;
  private List<String> roles;
  private String status;
  public Organization getOrganization() {
    return organization;
  }
  public Person getMember() {
    return member;
  }
  public List<String> getRoles() {
    return roles;
  }
  public String getStatus() {
    return status;
  }

  public static class Builder {
    Membership _membership = new Membership();
    
    public Builder withId(String id) {
      _membership.id = id;
      return this;
    }
    
    public Builder withType(String type) {
      _membership.type = type;
      return this;
    }
    
    public Builder withName(String name) {
      _membership.name = name;
      return this;
    }
    
    public Builder withDescription(String description) {
      _membership.description = description;
      return this;
    }
    
    public Builder withExtensions(Map<String,String> extensions) {
      _membership.extensions = extensions;
      return this;
    }
    
    public Builder withDateCreated(Instant dateCreated) {
      _membership.dateCreated = dateCreated;
      return this;
    }
    
    public Builder withDateModified(Instant dataModified) {
      _membership.dateModified = dataModified;
      return this;
    }
     
    public Builder withOrganization(Organization organization) {
      _membership.organization = organization;
      return this;
    }
    
    public Builder withMember(Person member) {
      _membership.member = member;
      return this;
    }
    
    public Builder withRoles(List<String> roles) {
      _membership.roles = roles;
      return this;
    }
    
    public Builder withStatus(String status) {
      _membership.status = status;
      return this;
    }
    
    public Membership build() {
      if (StringUtils.isBlank(_membership.id) 
          || StringUtils.isBlank(_membership.type)) {
        throw new IllegalStateException(_membership.toString());
      }

      return _membership;
    }
  }

}
