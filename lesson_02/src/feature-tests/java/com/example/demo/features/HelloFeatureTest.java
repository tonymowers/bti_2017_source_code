package com.example.demo.features;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloFeatureTest {

    @Test
    public void test_sees_greeting() {
        // Given
        ActorWhoSeesGreetings actor = new ActorWhoSeesGreetings();
        String name = "Tony";

        // When
        String greeting = actor.sees_hello_greeting(name);

        // Then
        assertThat(greeting, is("Hello Tony!"));
    }
}
