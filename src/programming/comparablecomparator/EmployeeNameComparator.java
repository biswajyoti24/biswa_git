package programming.comparablecomparator;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
//        if(o1.empName.length()==o2.empName.length()){
//            return 0;
//        } else if (o1.empName.length() > o2.empName.length()) {
//            return 1;
//        }else{
//            return -1;
//        }

        return o1.empName.compareTo(o2.getEmpName());

    }
}
