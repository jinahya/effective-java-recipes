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

import java.util.EnumMap;
import java.util.Map;
import static java.util.Objects.requireNonNull;

public enum Phase {
    /*
     * [JLS 8.9 Enum Types]
     * An enum declaration is implicitly final unless it contains at least one
     * enum constant that has a class body.
     */

    // @todo PLASMA // 플라즈마
    /**
     * 고체.
     */
    SOLID,
    /**
     * 액체.
     */
    LIQUID,
    /**
     * 기체.
     */
    GAS;

    // -------------------------------------------------------------------------
    public enum Transition {
        /*
         * [JLS 8.9. Enum Types]
         * A nested enum type is implicitly static. It is permitted for the
         * declaration of a nested enum type to redundantly specify the static
         * modifier.
         */
        // @todo add IONIZE(GAS, PLASMA) // 이온화, 전리(電離)
        // @todo add DEIONIZE(PLASMA, GAS) // 재결합
        /**
         * Melting / 용해(溶解).
         */
        MELT(SOLID, LIQUID),
        /**
         * Freezing / 응고(凝固).
         */
        FREEZE(LIQUID, SOLID),
        /**
         * Vaporization / 기화(氣化).
         */
        BOIL(LIQUID, GAS),
        /**
         * Condensation / 응축(凝縮).
         */
        CONDENSE(GAS, LIQUID),
        /**
         * Sublimation / 승화 (昇華).
         */
        SUBLIME(SOLID, GAS),
        /**
         * Deposition / 승화 (昇華).
         */
        DEPOSIT(GAS, SOLID);

        // ---------------------------------------------------------------------
        private static final Map<Phase, Map<Phase, Transition>> m
            = new EnumMap<>(Phase.class);

        static {
            for (final Phase value : Phase.values()) {
                m.put(value, new EnumMap<>(Phase.class));
            }
            for (final Transition value : Transition.values()) {
                m.get(value.src).put(value.dst, value);
            }
        }

        public static Transition from(final Phase src, final Phase dst) {
            return m.get(requireNonNull(src)).get(requireNonNull(dst));
        }

        // ---------------------------------------------------------------------
        Transition(final Phase src, final Phase dst) {
            /*
             * [JLS 8.9.2. Enum Body Declaration]
             * In an enum declaration, a constructor declaration with no access
             * modifiers is private.
             */
            this.src = requireNonNull(src);
            this.dst = requireNonNull(dst);
        }

        // ---------------------------------------------------------------------
        @Override
        public String toString() {
            return getClass().getSimpleName() + "@" + hashCode() + "/"
                   + super.toString() + "(" + src.name() + "->" + dst.name()
                   + ")";
        }

        // ---------------------------------------------------------------------
        final Phase src;

        final Phase dst;
    }

    // -------------------------------------------------------------------------
    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + hashCode() + "/"
               + super.toString();
    }
}
