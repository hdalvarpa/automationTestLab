package com.examples.api_test;

import com.intuit.karate.junit5.Karate;

public class Runner {


    @Karate.Test
    Karate testAll() {
        return Karate.run("classpath:features/examples/api_test")
                .tags("@apitest_02_01")
                .relativeTo(getClass());
    }

}
