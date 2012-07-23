/**
 * Helios, OpenSource Monitoring
 * Brought to you by the Helios Development Group
 *
 * Copyright 2007, Helios Development Group and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org. 
 *
 */
package org.helios.jzab.agent.net.active;

import org.json.JSONObject;

/**
 * <p>Title: ActiveServerResponseListener</p>
 * <p>Description: Defines a listener that performs some action when a response is received from the zabbix server</p> 
 * <p>Company: Helios Development Group LLC</p>
 * @author Whitehead (nwhitehead AT heliosdev DOT org)
 * <p><code>org.helios.jzab.agent.net.active.ActiveServerResponseListener</code></p>
 */
public interface ActiveServerResponseListener {
	/**
	 * Event fired from active server after a response is received from a zabbix server and standard handling has completed
	 * @param server The active server that processed the response
	 * @param response The json message received
	 */
	public void onResponse(ActiveServer server, JSONObject response);
	
	/**
	 * The listener indicates if it is interested in processing the response
	 * @param responseStatus The status of the response
	 * @param responseType The type of the response
	 * @return true to process, false to ignore
	 */
	public boolean process(String responseStatus, String responseType);
}
