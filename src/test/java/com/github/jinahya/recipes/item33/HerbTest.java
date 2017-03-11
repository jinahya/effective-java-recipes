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

import org.testng.annotations.Test;

public class HerbTest {

    @Test
    public static void applyFunction() {
        for (final Herb.Type type : Herb.Type.values()) {
            Herb.applyHerbsOfType(
                type,
                herbs -> {
                    herbs.forEach(System.out::println);
                    return null;
                }
            );
        }
    }

    @Test
    public static void applyBiFunction() {
        for (final Herb.Type type : Herb.Type.values()) {
            Herb.applyHerbsOfType(
                type,
                (herbs, u) -> {
                    herbs.forEach(System.out::println);
                    return null;
                },
                null
            );
        }
    }

    @Test
    public static void acceptConsumer() {
        for (final Herb.Type type : Herb.Type.values()) {
            Herb.acceptHerbsOfType(
                type,
                herbs -> {
                    herbs.forEach(System.out::println);
                });
        }
    }

    @Test
    public static void acceptBiConsumer() {
        for (final Herb.Type type : Herb.Type.values()) {
            Herb.acceptHerbsOfType(
                type,
                (herbs, u) -> {
                    herbs.forEach(System.out::println);
                },
                null);
        }
    }
}
