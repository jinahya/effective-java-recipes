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

import static java.lang.invoke.MethodHandles.lookup;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;
import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

public class CaseInsensitiveString2Test {

    private static final Logger logger = getLogger(lookup().lookupClass());

    @Test
    public void notSymmetric() {
        final CaseInsensitiveString2 cis1
            = new CaseInsensitiveString2("Polish");
        final String s = "polish";
        assertFalse(cis1.equals(s));
        assertFalse(s.equals(cis1));
        final List<CaseInsensitiveString1> list = new ArrayList<>();
        list.add(cis1);
        final CaseInsensitiveString2 cis2
            = new CaseInsensitiveString2("polish");
        final boolean contains = list.contains(cis2);
        logger.debug("contains: {}", contains);
    }
}
