package programming.collectionpractice;

import programming.comparablecomparator.Employee;

import java.util.HashMap;
import java.util.Map;

public class mapProgramming1 {
    public static void main(String[] args){
        Map<Integer, Employee> empdetails = new HashMap<>();
        empdetails.put(1001,new Employee(201,"ramlal",45));
        empdetails.put(1002,new Employee(202,"harilal",47));
        empdetails.put(1003,new Employee(203,"gopallal",49));
        empdetails.put(1004,new Employee(204,"sambhulal",43));
        empdetails.put(1005,new Employee(205,"raptilal",40));

        for(Integer s: empdetails.keySet()){
            System.out.println(empdetails.get(s).getEmpName());
        }
    }
}
