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

import javax.xml.namespace.QName;

/**
 * Holder for <code>QName</code>s.
 *
 * @version $Rev: 467553 $ $Date: 2006-10-25 00:01:51 -0400 (Wed, 25 Oct 2006) $
 */
public final class QNameHolder implements Holder {

    /** The <code>QName</code> contained by this holder. */
    public QName value;

    /**
     * Make a new <code>QNameHolder</code> with a <code>null</code> value.
     */
    public QNameHolder() {}

    /**
     * Make a new <code>QNameHolder</code> with <code>value</code> as
     * the value.
     *
     * @param value the <code>QName</code> to hold
     */
    public QNameHolder(QName value) {
        this.value = value;
    }
}
