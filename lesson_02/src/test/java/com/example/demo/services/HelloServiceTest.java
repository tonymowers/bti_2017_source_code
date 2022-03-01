package com.example.demo.services;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloServiceTest {

    @Test
    void testHello() {
        HelloService service = new HelloService();
        assertThat(service.get_hello_message("Tony"), is("Hello Tony!"));
    }
}
