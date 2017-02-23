/*
 * Copyright 2017 Jin Kwon &gt;onacit@gmail.com&lt;.
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
package com.github.jinahya.recipes.item03;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Elvis2 implements Serializable {

    private static final Elvis2 INSTANCE = new Elvis2();

    public static final Elvis2 getInstance() {
        return INSTANCE;
    }

    // -------------------------------------------------------------------------
    private Elvis2() { // private
        super();
    }

    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }

    // -------------------------------------------------------------------------
    private final transient String name = "Presley";
}