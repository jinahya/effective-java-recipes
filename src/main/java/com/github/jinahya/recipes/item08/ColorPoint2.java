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

public class ColorPoint2 extends ColorPoint1 {

    public ColorPoint2(final int x, final int y, final Color color) {
        super(x, y, color);
    }

    // Broken - violates transitivity!
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }
        // If o is a normal Point, do a color-blind comparison
        if (!(o instanceof ColorPoint2)) {
            return o.equals(this);
        }
        // o is a ColorPoint; do a full comparison
        return super.equals(o) && ((ColorPoint2) o).color == color;
    }
}
