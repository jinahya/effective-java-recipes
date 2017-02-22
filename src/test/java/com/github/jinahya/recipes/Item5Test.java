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
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class Item5Test {

    @Test
    public void compareStrings() {
        assertEquals("aaa", "aaa");
        assertEquals(new String("aaa"), new String("aaa"));
        assertSame("aaa", "aaa");
        assertTrue("aaa" == "aaa");
        assertNotSame(new String("aaa"), new String("aaa"));
        assertFalse(new String("aaa") == new String("aaa"));
    }

    @Test
    public void compareIntegers() {
        assertEquals(127, 127);
        assertEquals(new Integer(127), new Integer(127));
        assertSame(127, 127); // 127 == 127
        assertNotSame(new Integer(127), new Integer(127));
        assertSame(Integer.valueOf(127), Integer.valueOf(127));
    }
}
