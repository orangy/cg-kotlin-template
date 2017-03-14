package com.yourself

import org.junit.*
import java.io.*

class ExampleTest {
    @Test
    fun test() {
        Assert.assertEquals("Did you return Hello World?", "Hello World!", helloWorld())
    }

    @Test
    @Throws(IOException::class)
    fun visualisation() {
        println("CG> open -s /project/answer/src/main/resources HelloWorld.html")
    }
}