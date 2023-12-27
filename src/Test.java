import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Employee> employees= new ArrayList<>();
     //   employees.stream().map(Employee::getEmployyeName).collect(Collectors.toList());
        String name="AbdulAzeeGani";
      List<String>  myChar= Arrays.asList(name.split(""));
        Map<String, Long> result = myChar.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        Optional<Map.Entry<String, Long>> res = result.entrySet().stream().max(Comparator.comparing(x -> x.getValue().longValue()));
        System.out.println(res.get().getKey()+"----->"+res.get().getValue());
    }
}




class Employee{
    private int id;
    private int age;
    private String gender;
    private long salary;

}

