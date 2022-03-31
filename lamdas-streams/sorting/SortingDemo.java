package lambdas-streams.sorting;

import java.util.*;

class SortingDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        List<lambda_Streams.Employee> employees = DataBase.getEmployees();



        Collections.sort(employees, ( o1,  o2) ->(int) (o1.getSalary() - o2.getSalary()));

        employees.stream().sorted(( o1,  o2) ->(int) (o2.getSalary() - o1.getSalary())).forEach(t->System.out.println(t));

    }
}
