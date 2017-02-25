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
import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class DummyUserTest {

    private static final Logger logger = getLogger(lookup().lookupClass());

    // -------------------------------------------------------------------------
    @Test
    public void test1() {
        final DummyUser user1 = new DummyUser("John", 23);
        final DummyUser user2 = user1;
        logger.info("user1: {}", user1);
        logger.info("user2: {}", user2);
        assertTrue(user1 == user2);
        assertTrue(user1.equals(user2));
    }

    @Test
    public void test2() {
        final DummyUser user1 = new DummyUser("John", 23);
        final DummyUser user2 = new DummyUser("John", 23);
        logger.info("user1: {}", user1);
        logger.info("user2: {}", user2);
        assertFalse(user1 == user2);
        assertFalse(user1.equals(user2));
    }

    @Test
    public void test3() {
        final Set<DummyUser> set = new HashSet<>();
        final int count = 10;
        for (int i = 0; i < count; i++) {
            set.add(new DummyUser("John", 23));
        }
        logger.debug("set.size: {}", set.size());
        assertEquals(set.size(), count);
    }
}
