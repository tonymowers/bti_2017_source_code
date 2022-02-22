package example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class SomethingTest {

    @Test
    void alwaysPasses() {
        assertThat(true, is(true));
    }

}
