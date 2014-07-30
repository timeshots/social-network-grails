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
package org.grails.plugin.platform.conventions

import org.slf4j.LoggerFactory

/**
 * Builder that evaluates a DSL Closure and produces a structure representing the
 * method calls and property access, with child nodes for methods taking a closure
 *
 * Just instantiate this and call build() with the DSL closure.
 * Iteratate over the List<DSLCommand> you get back, checking the type of nodes
 * to see what calls were made.
 *
 * NOTE: DSLCommand is polymorphic so if using in if/switch statements be careful
 * of ordering - put more specific types FIRST to avoid surprises
 */
class StandardDSLBuilder {

    final log = LoggerFactory.getLogger(StandardDSLBuilder)
    def grailsApplication

    List<DSLCommand> build(Closure c, args = null) {
        List<DSLCommand> results = []
        def delegateBuilder = new StandardDSLDelegate(results, grailsApplication)
        c.delegate = delegateBuilder
        c.resolveStrategy = Closure.DELEGATE_FIRST
        if (args) {
            c(*args)
        } else {
            c(args)
        }
        return results
    }
}
