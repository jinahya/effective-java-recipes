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

import java.awt.Color;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class ColorPoint2Test {

    @Test
    public void test1() {
        final ColorPoint2 p1 = new ColorPoint2(1, 2, Color.RED);
        final Point p2 = new Point(1, 2);
        final ColorPoint2 p3 = new ColorPoint2(1, 2, Color.BLUE);
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p2));
        assertFalse(p1.equals(p3));
    }
}
