package org.acme;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeServiceAResourceIT extends ServiceAResourceTest {

    // Execute the same tests but in native mode.
}