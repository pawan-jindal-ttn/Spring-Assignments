import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.function.BiFunction;

public class AppTest {

    private static Employee employee;

    @BeforeClass
    public static void setup() {
        employee = new Employee();
    }

    @Test
    public void testEmployeeGetterAndSetter() {
        employee.setName("Pawan");
        employee.setAge(21);

        assertEquals("Pawan", employee.getName());
        assertEquals(21, employee.getAge());
    }

    @Test
    public void testDateTimeInitialization() {
        DateTime dateTime = new DateTime();
        assertNotNull(dateTime);
    }

    @Test
    public void testStringUtilsMethods() {
        assertTrue(StringUtils.isEmpty(""));
        assertEquals("olleH", StringUtils.reverse("Hello"));
    }

    @Test
    public void testDivideFunction() {
        BiFunction<Integer, Integer, Integer> divide = (a, b) -> {
            if (b == 0) {
                return null;
            }
            return a / b;
        };

        Integer expected = 2;
        Integer actual = divide.apply(10, 5);
        assertEquals(expected, actual);
        assertNull(divide.apply(10, 0));
    }
}
