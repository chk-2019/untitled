package Day42;

import java.util.List;

public class GetImportance {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
//        solution5.getImportance()
    }
}
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}
class Solution5 {
    public int getImportance(List<Employee> employees, int id) {
        int j=0;
        while (employees.get(j).id!=id){
            j++;
        }
        return getImportance_helper(employees,employees.get(j));
    }
    public int getImportance_helper(List<Employee> employees,Employee employee){
        int res = 0;
        if (employee.subordinates.size()==0)
            return employee.importance;
        for (int i = 0; i < employee.subordinates.size(); i++) {
            int id = employee.subordinates.get(i);
            int j=0;
            while (employees.get(j).id!=id){
                j++;
            }
            res+=getImportance_helper(employees,employees.get(j));
        }
        return res+employee.importance;
    }
}