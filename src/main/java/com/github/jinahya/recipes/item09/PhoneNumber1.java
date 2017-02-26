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

public class PhoneNumber1 {

    private static void rangeCheck(final int arg, final int max,
                                   final String name) {
        if (arg < 0 || arg > max) {
            throw new IllegalArgumentException(name + ": " + arg);
        }
    }

    public PhoneNumber1(final int areaCode, final int prefix,
                        final int lineNumber) {
        super();
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PhoneNumber1)) {
            return false;
        }
        final PhoneNumber1 pn = (PhoneNumber1) o;
        return pn.lineNumber == lineNumber && pn.prefix == prefix
               && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    protected final short areaCode;

    protected final short prefix;

    protected final short lineNumber;
}
