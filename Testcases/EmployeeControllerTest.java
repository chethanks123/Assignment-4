package net.javaguides.springboot.controller;

import static org.mockito.Mockito.mock;

import net.javaguides.springboot.model.Employee;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class EmployeeControllerTest {
    /**
     * Method under test: {@link EmployeeController#getAllEmployees()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllEmployees() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new EmployeeController()).getAllEmployees();
    }

    /**
     * Method under test: {@link EmployeeController#createEmployee(Employee)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateEmployee() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        EmployeeController employeeController = new EmployeeController();
        employeeController.createEmployee(new Employee("Jane", "Doe", "42"));
    }

    /**
     * Method under test: {@link EmployeeController#createEmployee(Employee)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateEmployee2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new EmployeeController()).createEmployee(mock(Employee.class));
    }

    /**
     * Method under test: {@link EmployeeController#getEmployeeById(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetEmployeeById() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new EmployeeController()).getEmployeeById(123L);
    }

    /**
     * Method under test: {@link EmployeeController#updateEmployee(Long, Employee)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateEmployee() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        EmployeeController employeeController = new EmployeeController();
        employeeController.updateEmployee(123L, new Employee("Jane", "Doe", "42"));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmployee(Long, Employee)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateEmployee2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new EmployeeController()).updateEmployee(123L, mock(Employee.class));
    }

    /**
     * Method under test: {@link EmployeeController#deleteEmployee(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteEmployee() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new EmployeeController()).deleteEmployee(123L);
    }
}

