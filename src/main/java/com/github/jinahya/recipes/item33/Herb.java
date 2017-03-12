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
package com.github.jinahya.recipes.item33;

import static java.util.Arrays.asList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import static java.util.Objects.requireNonNull;
import java.util.Set;

public class Herb {

    public enum Type { // implicitly static
        ANNUAL, PERENNIAL, BIENNIAL
    }

    // -------------------------------------------------------------------------
    // @todo add more from http://extension.illinois.edu/herbs/directory.cfm
    public static final List<Herb> HERBS = asList(
        new Herb("Basil", Type.ANNUAL),
        new Herb("Bay Laurel", Type.PERENNIAL),
        new Herb("Borage", Type.ANNUAL),
        new Herb("Caraway", Type.BIENNIAL),
        new Herb("Catnip", Type.PERENNIAL),
        new Herb("Chervil", Type.ANNUAL),
        new Herb("Chives", Type.PERENNIAL)
    );

    private static final Map<Type, Set<Herb>> HERBS_BY_TYPE
        = new EnumMap<>(Type.class);

    static {
        for (final Type value : Type.values()) {
            HERBS_BY_TYPE.put(value, new HashSet<>());
        }
        for (final Herb herb : HERBS) {
            HERBS_BY_TYPE.get(herb.type).add(herb);
        }
    }

    // -------------------------------------------------------------------------
    public static Set<Herb> getHerbsByType(final Type type) {
        return new HashSet<>(HERBS_BY_TYPE.get(requireNonNull(type)));
    }

    // -------------------------------------------------------------------------
    Herb(final String name, final Type type) {
        super();
        this.name = requireNonNull(name);
        this.type = requireNonNull(type);
    }

    // -------------------------------------------------------------------------
    @Override
    public String toString() {
        return name;
    }

    // -------------------------------------------------------------------------
    final String name;

    final Type type;
}
