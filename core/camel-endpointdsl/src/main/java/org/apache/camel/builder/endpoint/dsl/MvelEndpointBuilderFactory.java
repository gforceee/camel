/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Transforms the message using a MVEL template.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MvelEndpointBuilderFactory {


    /**
     * Builder for endpoint for the MVEL component.
     */
    public interface MvelEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedMvelEndpointBuilder advanced() {
            return (AdvancedMvelEndpointBuilder) this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default MvelEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default MvelEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Character encoding of the resource content.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MvelEndpointBuilder encoding(String encoding) {
            doSetProperty("encoding", encoding);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the MVEL component.
     */
    public interface AdvancedMvelEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MvelEndpointBuilder basic() {
            return (MvelEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMvelEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMvelEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMvelEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMvelEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * MVEL (camel-mvel)
     * Transforms the message using a MVEL template.
     * 
     * Category: transformation,script
     * Available as of version: 2.12
     * Maven coordinates: org.apache.camel:camel-mvel
     * 
     * Syntax: <code>mvel:resourceUri</code>
     * 
     * Path parameter: resourceUri (required)
     * Path to the resource. You can prefix with: classpath, file, http, ref, or
     * bean. classpath, file and http loads the resource using these protocols
     * (classpath is default). ref will lookup the resource in the registry.
     * bean will call a method on a bean to be used as the resource. For bean
     * you can specify the method name after dot, eg bean:myBean.myMethod.
     */
    default MvelEndpointBuilder mvel(String path) {
        class MvelEndpointBuilderImpl extends AbstractEndpointBuilder implements MvelEndpointBuilder, AdvancedMvelEndpointBuilder {
            public MvelEndpointBuilderImpl(String path) {
                super("mvel", path);
            }
        }
        return new MvelEndpointBuilderImpl(path);
    }
}