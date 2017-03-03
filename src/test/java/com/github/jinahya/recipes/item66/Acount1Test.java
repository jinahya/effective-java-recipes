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
package com.github.jinahya.recipes.item66;

import static java.lang.invoke.MethodHandles.lookup;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static java.util.concurrent.ThreadLocalRandom.current;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;
import org.testng.annotations.Test;

public class Acount1Test {

    private static final Logger logger = getLogger(lookup().lookupClass());

    @Test
    public void test() throws InterruptedException {
        final Account1 account = new Account1();
        final int threads = 100;
        final ExecutorService executor = Executors.newFixedThreadPool(threads);
        final int rounds = 100;
        for (int i = 0; i < threads; i++) {
            executor.submit(() -> {
                for (int j = 0; j < rounds; j++) {
                    if ((j & 0x01) == 0x00) { // even
                        account.withdraw(100);
                    } else { // odd
                        account.deposit(100);
                    }
                    try {
                        Thread.sleep(current().nextLong(100L));
                    } catch (final InterruptedException ie) {
                        fail("interrupted", ie);
                        return;
                    }
                }
            });
        }
        executor.shutdown();
        assertTrue(executor.awaitTermination(60L, TimeUnit.SECONDS));
        logger.debug("account.balance: {}", account.getBalance());
    }
}
