import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<Employee, String> funcEmpToString = e -> e.getName();

        List<Employee> employeeList =
                Arrays.asList(new Employee("Tom Jones", 45),
                        new Employee("Harry Major", 25),
                        new Employee("Ethan Hardy", 65),
                        new Employee("Nancy Smith", 15),
                        new Employee("Deborah Sprightly", 29));

        List<String> empNames = Employee.convertEmpListToNamesList(employeeList, funcEmpToString);

        // print list of names

        empNames.stream()
                .forEach(name -> System.out.println("Name:\t" + name + ","));

        for(String e : empNames){
            System.out.println("Name: " + e);
        }

    }
}
