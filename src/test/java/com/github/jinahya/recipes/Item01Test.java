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

import static java.lang.invoke.MethodHandles.lookup;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;
import org.testng.annotations.Test;

public class Item01Test {

    private static final Logger logger = getLogger(lookup().lookupClass());

    @Test
    public void booleanTrue() {
        logger.info("Boolean#TRUE.hashCode: {}", Boolean.TRUE.hashCode());
        logger.info("Boolean#valueOf(true).hashCode: {}",
                    Boolean.valueOf(true).hashCode());
        logger.info("Boolean#valueOf(\"true\").hashCode: {}",
                    Boolean.valueOf("true").hashCode());
        logger.info("Boolean#valueOf(\"tRuE\").hashCode: {}",
                    Boolean.valueOf("tRuE").hashCode());
        logger.info("new Boolean(true).hashCode: {}",
                    new Boolean(true).hashCode());
        logger.info("new Boolean(\"true\").hashCode: {}",
                    new Boolean("true").hashCode());
        logger.info("new Boolean(\"tRuE\").hashCode: {}",
                    new Boolean("tRuE").hashCode());
    }

    @Test
    public void booleanFalse() {
        logger.info("Boolean#FALSE.hashCode: {}", Boolean.FALSE.hashCode());
        logger.info("Boolean#valueOf(flase).hashCode: {}",
                    Boolean.valueOf(false).hashCode());
        logger.info("Boolean#valueOf(\"false\").hashCode: {}",
                    Boolean.valueOf("false").hashCode());
        logger.info("Boolean#valueOf(\"FaLsE\").hashCode: {}",
                    Boolean.valueOf("FaLsE").hashCode());
        logger.info("Boolean#valueOf(null).hashCode: {}",
                    Boolean.valueOf(null).hashCode());
        logger.info("new Boolean(false).hashCode: {}",
                    new Boolean(false).hashCode());
        logger.info("new Boolean(\"false\").hashCode: {}",
                    new Boolean("false").hashCode());
        logger.info("new Boolean(\"FaLsE\").hashCode: {}",
                    new Boolean("FaLsE").hashCode());
        logger.info("new Boolean(null).hashCode: {}",
                    new Boolean(null).hashCode());
    }
}
