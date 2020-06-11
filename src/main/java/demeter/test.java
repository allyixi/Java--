package demeter;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        SchoolManager schoolManager=new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("C_emp" + i);
            list.add(emp);
        }
        return list;
    }

    public void printEmployee(){
        List<CollegeEmployee> list1=getAllEmployee();
        System.out.println("----");
        for(CollegeEmployee ce:list1){
            System.out.println(ce.getId());
        }
    }
}

//直接朋友：Employee、CollegeManager
//不是直接的朋友：CollegeEmployee 违背了迪米特法则
class SchoolManager {
    public List<Employee> getAllEmployee() {
        List list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("id" + i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManager cm){
        cm.printEmployee();
        List<Employee> list2=this.getAllEmployee();
        System.out.println("----");
        for(Employee e:list2){
            System.out.println(e.getId());
        }
    }
}

