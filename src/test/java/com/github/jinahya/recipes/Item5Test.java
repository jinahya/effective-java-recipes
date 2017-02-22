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
package com.github.jinahya.recipes;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class Item5Test {

    // http://java-performance.info/string-intern-in-java-6-7-8/
    @Test
    public void compareStrings() {
        assertEquals("aaa", "aaa");
        assertEquals("aaa", new String("aaa"));
        assertEquals(new String("aaa"), new String("aaa"));
        assertTrue("aaa" == "aaa");
        assertFalse(new String("aaa") == new String("aaa"));
    }

    @Test
    public void compareIntegers() {
        assertEquals(127, 127);
        assertEquals(new Integer(127), new Integer(127));
        assertTrue(127 == 127); // 127 == 127
        assertFalse(new Integer(127) == new Integer(127));
        assertTrue(Integer.valueOf(127) == Integer.valueOf(127)); // why?
        assertFalse(Integer.valueOf(128) == Integer.valueOf(128)); // why not?
    }
}
