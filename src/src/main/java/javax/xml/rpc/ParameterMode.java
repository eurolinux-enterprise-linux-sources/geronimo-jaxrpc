/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package javax.xml.rpc;

/**
 * The <code>javax.xml.rpc.ParameterMode</code> is a type-safe
 * enumeration for parameter mode. This class is used in the
 * <code>Call</code>API to specify parameter passing modes.
 *
 * @version $Rev: 467553 $ $Date: 2006-10-25 00:01:51 -0400 (Wed, 25 Oct 2006) $
 */
public class ParameterMode {

    /** Mode name. */
    private final String mode;

    /** The mode is 'IN'. */
    public static final ParameterMode IN = new ParameterMode("IN");

    /** The mode is 'INOUT'. */
    public static final ParameterMode INOUT = new ParameterMode("INOUT");

    /** The mode is 'OUT'. */
    public static final ParameterMode OUT = new ParameterMode("OUT");

    /**
     * Make a new mode.
     *
     * @param mode  name for the mode
     */
    private ParameterMode(String mode) {
        this.mode = mode;
    }

    public String toString() {
        return mode;
    }
}

