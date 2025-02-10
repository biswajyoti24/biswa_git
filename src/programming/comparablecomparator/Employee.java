package programming.comparablecomparator;

public class Employee  implements Comparable<Employee> {
    Integer empId;
    String empName;
    Integer empAge;
    public Employee(Integer id,String name,Integer age){
        this.empId=id;
        this.empName=name;
        this.empAge=age;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    @Override
    public int compareTo(Employee o) {
        if(empAge == o.empAge){
            return 0;
        } else if (empAge>o.empAge) {
            return  1;
        }else{
            return -1;
        }

    }
}
