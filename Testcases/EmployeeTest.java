package net.javaguides.springboot.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmployeeTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Employee#Employee()}
     *   <li>{@link Employee#setEmailId(String)}
     *   <li>{@link Employee#setFirstName(String)}
     *   <li>{@link Employee#setId(long)}
     *   <li>{@link Employee#setLastName(String)}
     *   <li>{@link Employee#getEmailId()}
     *   <li>{@link Employee#getFirstName()}
     *   <li>{@link Employee#getId()}
     *   <li>{@link Employee#getLastName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Employee actualEmployee = new Employee();
        actualEmployee.setEmailId("42");
        actualEmployee.setFirstName("Jane");
        actualEmployee.setId(123L);
        actualEmployee.setLastName("Doe");
        assertEquals("42", actualEmployee.getEmailId());
        assertEquals("Jane", actualEmployee.getFirstName());
        assertEquals(123L, actualEmployee.getId());
        assertEquals("Doe", actualEmployee.getLastName());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Employee#Employee(String, String, String)}
     *   <li>{@link Employee#setEmailId(String)}
     *   <li>{@link Employee#setFirstName(String)}
     *   <li>{@link Employee#setId(long)}
     *   <li>{@link Employee#setLastName(String)}
     *   <li>{@link Employee#getEmailId()}
     *   <li>{@link Employee#getFirstName()}
     *   <li>{@link Employee#getId()}
     *   <li>{@link Employee#getLastName()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Employee actualEmployee = new Employee("Jane", "Doe", "42");
        actualEmployee.setEmailId("42");
        actualEmployee.setFirstName("Jane");
        actualEmployee.setId(123L);
        actualEmployee.setLastName("Doe");
        assertEquals("42", actualEmployee.getEmailId());
        assertEquals("Jane", actualEmployee.getFirstName());
        assertEquals(123L, actualEmployee.getId());
        assertEquals("Doe", actualEmployee.getLastName());
    }
}

