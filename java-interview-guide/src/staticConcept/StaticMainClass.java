package staticConcept;

import java.util.ArrayList;

public class StaticMainClass {
	public static void main(String[] args) {
       Employee em1 = new Employee(1, "Mike", 10000);
       Employee em2 = new Employee(2, "Pence", 20000);
       System.out.println(Employee.getCompanyName());
       ArrayList<Employee> al = new ArrayList<>();
       al.add(em1);al.add(em2);
       System.out.println(al);
	}
}
