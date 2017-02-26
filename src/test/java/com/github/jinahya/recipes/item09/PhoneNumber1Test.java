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
package com.github.jinahya.recipes.item09;

import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.assertNull;
import org.testng.annotations.Test;

public class PhoneNumber1Test {

    @Test
    public void test1() {
        final Map<PhoneNumber1, String> m = new HashMap<>();
        m.put(new PhoneNumber1(707, 867, 5309), "Jenny");
        assertNull(m.get(new PhoneNumber1(707, 867, 5309)));
    }
}
