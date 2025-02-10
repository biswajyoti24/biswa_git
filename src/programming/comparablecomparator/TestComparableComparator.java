package programming.comparablecomparator;

import java.util.*;
import java.util.stream.Collectors;

public class TestComparableComparator {
    public static void main(String[] args){
        System.out.println("Insert Employee Details:");
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(101,"RamLal Upadyhaya",34));
        employeeList.add(new Employee(102,"HariRam DeshMukh",24));
        employeeList.add(new Employee(103,"Priyambada Sen",29));
        employeeList.add(new Employee(104,"Gourikant Mishra",40));
        employeeList.add(new Employee(105,"Suryakant Dash",42));
        employeeList.add(new Employee(106,"Debanada Gupta",37));
        employeeList.add(new Employee(107,"Chandra Sekhar Pandit",28));
        employeeList.add(new Employee(108,"Amarnath Bansal",44));
        employeeList.add(new Employee(109,"Duggal Upadyhaya",34));
        employeeList.add(new Employee(110,"BalaKrushna Upadyhaya",42));

        Collections.sort(employeeList);

        System.out.println("Comparable age");
        for(Employee employee : employeeList){
            System.out.println("{"+ employee.empId+","+employee.empName+","+employee.empAge+"}");
        }

        Collections.sort(employeeList,new EmployeeAgeComparator());
        System.out.println("Comparator age");
        for(Employee employee : employeeList){
            System.out.println("{"+ employee.empId+","+employee.empName+","+employee.empAge+"}");
        }
        Collections.sort(employeeList,new EmployeeNameComparator());
        System.out.println("Comparator name wise");
        for(Employee employee : employeeList){
            System.out.println("{"+ employee.empId+","+employee.empName+","+employee.empAge+"}");
        }
        List<Employee> employeeStream = employeeList.stream().sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList());
        System.out.println("Using stream api");
        for(Employee employee : employeeStream){
            System.out.println("{"+ employee.empId+","+employee.empName+","+employee.empAge+"}");
        }
        ListIterator<Employee> it = employeeList.listIterator();
        while(it.hasNext()){
            if(it.next().getEmpId()!= null){

                System.out.print("{"+ it.next().empName+"}");

            }else{
                System.out.println("Empty List");
            }

        }
    }

}
