import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;

import java.util.function.BiFunction;

@Data
class Employee{
    private String name;
    private int age;
}
public class App {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println("Hello World");
        System.out.println("Current date time is: " + dateTime);

//        using lombok dependencies
        Employee employee = new Employee();
        employee.setName("Pawan");
        employee.setAge(21);
        System.out.println(employee);

//        using runtime dependency
        Logger logger = LoggerFactory.getLogger(App.class);

        BiFunction<Integer, Integer, Integer> divide = (a, b)->{
            if(b == 0){
                logger.warn("You are dividing a number by zero");
                return null;
            }
            return a/b;
        };
        System.out.println(divide.apply(10,0));

//        using compile time dependency
        String str = "";

        if (StringUtils.isEmpty(str)) {
            System.out.println("String is empty");
        }

        String reversed = StringUtils.reverse("Hello");
        System.out.println("Reversed: " + reversed);
    }
}