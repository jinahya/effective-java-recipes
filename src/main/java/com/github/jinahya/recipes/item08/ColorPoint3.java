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

public class ColorPoint3 {

    public ColorPoint3(final int x, final int y, final Color color) {
        if (color == null) {
            throw new NullPointerException();
        }
        point = new Point(x, y);
        this.color = color;
    }

    /**
     * Returns the point-view of this color point.
     */
    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ColorPoint3)) {
            return false;
        }
        final ColorPoint3 cp = (ColorPoint3) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    private final Point point;

    private final Color color;
}
