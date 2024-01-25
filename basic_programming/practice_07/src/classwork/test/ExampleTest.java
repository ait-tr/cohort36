package classwork.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {
    @Test
    void stringBuilderAppendsProperly() {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        assertEquals("Hello", sb.toString());
    }

    @Test
    void stringBuilderNonEmptyAfterAppend() {
        StringBuilder sb = new StringBuilder();
        assertTrue(sb.toString().isEmpty());
        sb.append("a");
        assertFalse(sb.toString().isEmpty());
    }
}
