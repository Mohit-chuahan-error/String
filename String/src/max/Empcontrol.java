package max;

import java.util.ArrayList;
import java.util.Comparator;

public class Empcontrol {
public static void main(String[] args) {
	ArrayList<Employee> Ar=new ArrayList<>();
	Ar.add(new Employee(21,"mohit","gajraula"));
	Ar.add(new Employee(11,"nishant","Rampur"));
	Ar.add(new Employee(31,"Shiavam","moradabad"));
	Ar.add(new Employee(28,"tushar","gajraula"));
	
	Ar.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	
}
}
