/**
 * 
 */
package org.apereo.openlrw.caliper;

import java.io.Serializable;

/**
 * @author ggilbert
 *
 */
public interface CaliperEvent extends Serializable {
  String getId();
  String getType();
  String getAction();
}
