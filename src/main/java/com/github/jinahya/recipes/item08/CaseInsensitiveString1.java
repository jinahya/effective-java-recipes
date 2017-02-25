/*
 * Copyright 2017 Jin Kwon &lt;onacit at gmail.com&gt;.
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
package com.github.jinahya.recipes.item08;

import static java.util.Objects.requireNonNull;

public class CaseInsensitiveString1 {

    public CaseInsensitiveString1(final String s) {
        super();
        this.s = requireNonNull(s);
    }

    // Broken - violates symmetry!
    @Override
    public boolean equals(final Object o) {
        if (o instanceof CaseInsensitiveString1) {
            return s.equalsIgnoreCase(((CaseInsensitiveString1) o).s);
        }
        if (o instanceof String) { // One-way interoperability!
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }

    protected final String s;
}
