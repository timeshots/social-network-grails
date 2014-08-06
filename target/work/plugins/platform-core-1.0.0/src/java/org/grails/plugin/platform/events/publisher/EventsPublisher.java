/* Copyright 2011-2013 the original author or authors:
 *
 *    Marc Palmer (marc@grailsrocks.com)
 *    Stéphane Maldini (smaldini@vmware.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.plugin.platform.events.publisher;

import java.util.Map;

import org.grails.plugin.platform.events.EventMessage;
import org.grails.plugin.platform.events.EventReply;

/**
 * @author Stephane Maldini <smaldini@vmware.com>
 * @version 1.0
 * @file
 * @date 02/01/12
 * @section DESCRIPTION
 * <p/>
 * [Does stuff]
 */
public interface EventsPublisher {

    String ON_REPLY = "onReply";
    String ON_ERROR = "onError";
    String FORK = "fork";
    String GORM = "gormSession";
    String NAMESPACE = "namespace";
    String TIMEOUT = "timeout";
    String HEADERS = "headers";

    EventReply event(final EventMessage<?> event);
    EventReply eventAsync(final EventMessage<?> event, Map<String, Object> params);
}
