/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.datastax.sparql.gremlin.plugin;

import org.apache.tinkerpop.gremlin.groovy.plugin.*;

import java.util.Optional;

/**
 * @author Daniel Kuppitz (http://gremlin.guru)
 */
public class SparqlGremlinPlugin extends AbstractGremlinPlugin {

    final static String NAME = "datastax.sparql";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public boolean requireRestart() {
        return false;
    }

    @Override
    public Optional<RemoteAcceptor> remoteAcceptor() {
        return Optional.of(new SparqlRemoteAcceptor(this.shell));
    }

    @Override
    public void afterPluginTo(PluginAcceptor pluginAcceptor) throws IllegalEnvironmentException, PluginInitializationException {
    }
}
