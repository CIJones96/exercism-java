package helloworld;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {

    @Test
    @DisplayName("Say Hi!")
    public void testThatGreeterReturnsTheCorrectGreeting() {
        assertThat(new HelloWorld().getGreeting()).isEqualTo("Hello, World!");
    }

}
