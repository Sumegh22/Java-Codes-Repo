import java.util.ArrayList;
import java.util.List;

public class CompareEmployeeByAge{



    public static void main(String[] args) {
        
        Employee e1 = new Employee(7, "Sumegh");
        Employee e2 = new Employee(19, "Gayu");

        List<Employee> ls = new ArrayList<>();
        ls.add(e2); ls.add(e1); 

        // ls.sort(new Comparator<Employee> (e1,e2)-> e1.compareTo(e2));
        

    }
}