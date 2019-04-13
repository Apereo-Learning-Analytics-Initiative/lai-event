/**
 * 
 */
package org.apereo.openlrw.caliper;

import java.time.Instant;

/**
 * @author ggilbert
 *
 */
public interface Caliper1p0Event extends CaliperEvent {
  Agent getAgent();
  Entity getObject();
  Entity getTarget();
  Agent getEdApp();
  Entity getGenerated();
  Group getGroup();
  Membership getMembership();
  String getFederatedSession();
  Instant getEventTime();
}
