import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee testEmployee = new Employee("Steeve", "Male", "Canada", 5200, 123);

    @BeforeAll
    public static void debutDesTests () {
        System.out.println("D.but des tests");
    }

    @Test
    void testClassEmployee (){

        Assertions.assertEquals("Steeve", testEmployee.getName(), "Le nom est bien Steeve");
    }

    @AfterAll
    public static void finDesTests (){
        System.out.println("Fin de l'exécution des tests");
    }
}