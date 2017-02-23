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
package com.github.jinahya.recipes.item03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.invoke.MethodHandles.lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;
import static org.testng.Assert.assertFalse;
import org.testng.annotations.Test;

public class Elvis3Test {

    private static final Logger logger = getLogger(lookup().lookupClass());

    // -------------------------------------------------------------------------
    @Test
    public void test() {
        logger.info("Elvis3.getInstance: {}", Elvis3.getInstance());
        logger.info("Elvis3.getInstance: {}", Elvis3.getInstance());
    }

    @Test(expectedExceptions = {InvocationTargetException.class})
    public void reflect() throws ReflectiveOperationException {
        final Constructor<Elvis3> constructor
            = Elvis3.class.getDeclaredConstructor();
        assertFalse(constructor.isAccessible());
        constructor.setAccessible(true);
        final Elvis3 instance = constructor.newInstance();
        logger.info("Elvis3.reflected: {}", instance);
    }

    @Test
    public void serialize() throws IOException, ClassNotFoundException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(Elvis3.getInstance());
        oos.flush();
        final ByteArrayInputStream bais
            = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream ois = new ObjectInputStream(bais);
        final Elvis3 instance = (Elvis3) ois.readObject();
        logger.info("Elvis3.serialized: {}", instance);
    }
}
