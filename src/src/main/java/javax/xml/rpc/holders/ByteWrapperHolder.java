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

package javax.xml.rpc.holders;

/**
 * Holder for <code>Byte</code>s.
 *
 * @version $Rev: 467553 $ $Date: 2006-10-25 00:01:51 -0400 (Wed, 25 Oct 2006) $
 */
public final class ByteWrapperHolder implements Holder {

    /** The <code>Byte</code> contained by this holder. */
    public Byte value;

    /**
     * Make a new <code>ByteWrapperHolder</code> with a <code>null</code> value.
     */
    public ByteWrapperHolder() {}

    /**
     * Make a new <code>ByteWrapperHolder</code> with <code>value</code> as
     * the value.
     *
     * @param value the <code>Byte</code> to hold
     */
    public ByteWrapperHolder(Byte value) {
        this.value = value;
    }
}
