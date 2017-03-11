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

public class PhoneNumber3 extends PhoneNumber2 {

    public PhoneNumber3(final int areaCode, final int prefix,
                        final int lineNumber) {
        super(areaCode, prefix, lineNumber);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = super.hashCode();
            hashCode = result;
        }
        return result;
    }

    private volatile int hashCode;
}
