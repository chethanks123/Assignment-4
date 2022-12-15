package net.javaguides.springboot.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class ResourceNotFoundExceptionTest {
    /**
     * Method under test: {@link ResourceNotFoundException#ResourceNotFoundException(String)}
     */
    @Test
    void testConstructor() {
        ResourceNotFoundException actualResourceNotFoundException = new ResourceNotFoundException("An error occurred");
        assertNull(actualResourceNotFoundException.getCause());
        assertEquals(0, actualResourceNotFoundException.getSuppressed().length);
        assertEquals("An error occurred", actualResourceNotFoundException.getMessage());
        assertEquals("An error occurred", actualResourceNotFoundException.getLocalizedMessage());
    }
}

