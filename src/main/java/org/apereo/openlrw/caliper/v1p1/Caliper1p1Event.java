/**
 * 
 */
package org.apereo.openlrw.caliper.v1p1;

import java.time.Instant;
import java.util.Map;

import org.apereo.openlrw.caliper.CaliperEvent;

/**
 * @author ggilbert
 *
 */
public interface Caliper1p1Event extends CaliperEvent {
  Agent getActor();
  Entity getObject();
  Instant getEventTime();
  Entity getTarget();
  Entity getGenerated();
  SoftwareApplication getEdApp();
  Entity getReferrer();
  Membership getMembership();
  Organization getGroup();
  Session getSession();
  LtiSession getFederatedSession();
  Map<String, String> getExtensions();
}
