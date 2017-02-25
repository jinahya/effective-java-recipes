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

/**
 *
 * @author Jin Kwon &lt;onacit at gmail.com&gt;
 */
public class DummyUser {

    public DummyUser(final String name, final int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // -------------------------------------------------------------------- name
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public DummyUser name(final String name) {
        setName(name);
        return this;
    }

    // --------------------------------------------------------------------- age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DummyUser age(final int age) {
        setAge(age);
        return this;
    }

    // -------------------------------------------------------------------------
    private String name;

    private int age;
}
