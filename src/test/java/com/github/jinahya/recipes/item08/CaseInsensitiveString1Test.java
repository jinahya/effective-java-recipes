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
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class CaseInsensitiveString1Test {
    
    private static final Logger logger = getLogger(lookup().lookupClass());

    @Test
    public void notSymmetric() {
        final CaseInsensitiveString1 cis = new CaseInsensitiveString1("Polish");
        final String s = "polish";
        assertTrue(cis.equals(s));
        assertFalse(s.equals(cis));
        final List<CaseInsensitiveString1> list = new ArrayList<>();
        list.add(cis);
        final boolean contains = list.contains(s);
        logger.debug("contains: {}", contains);
    }
}
