/*
 * Copyright (c) 2016 The original author or authors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *      The Eclipse Public License is available at
 *      http://www.eclipse.org/legal/epl-v10.html
 *
 *      The Apache License v2.0 is available at
 *      http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */

package io.engagingspaces.servicediscovery.graphql.events;

import io.engagingspaces.servicediscovery.graphql.discovery.Registration;

/**
 * Event handler that is invoked on publishers, when a new schema definition has been published.
 *
 * @author Arnold Schrijver
 * @param <T> the registration type of the event data
 */
@FunctionalInterface
public interface SchemaPublishedHandler<T extends Registration> {

    /**
     * Event handler that is invoked when a schema has been published by a schema publisher.
     *
     * @param registration the schema registration of the schema that was published
     */
    void schemaPublished(T registration);
}
