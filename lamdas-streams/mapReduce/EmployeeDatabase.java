package lambdas-streams.mapReduce;

import java.util.*;

public class EmployeeDatabase {


    public static List<Employee> getEmployees(){
        return  Stream.of(new Employee(101,"john",60000),
                        new Employee(109,"peter",30000),
                        new Employee(102,"mak",80000),
                        new Employee(103,"kim",90000),
                        new Employee(104,"json",15000))
                .collect(Collectors.toList());
    }
}
