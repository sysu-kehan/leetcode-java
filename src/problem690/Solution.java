package problem690;

/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
  public int getImportance1(List<Employee> employees, int id) {
    int index;
    for (index = 0; index < employees.size(); index++) {
      if (employees.get(index).id == id) {
        break;
      }
    }
    Employee employee = employees.get(index);
    int importance = employee.importance;
    for (int i = 0; i < employee.subordinates.size(); i++) {
      importance += getImportance1(employees, employee.subordinates.get(i));
    }
    return importance;
  }

  public int getImportance(List<Employee> employees, int id) {
    Queue<Employee> queue = new LinkedList<>();
    queue.add(getEmployee(employees,id));
    int importance = 0;
    while (!queue.isEmpty()) {
      Employee employee = queue.poll();
      for (int i = 0; i < employee.subordinates.size(); i++) {
        queue.add(getEmployee(employees, employee.subordinates.get(i)));
      }
      importance += employee.importance;
    }
    return importance;
  }

  private Employee getEmployee(List<Employee> employees, int id) {
    for (int index = 0; index < employees.size(); index++) {
      if (employees.get(index).id == id) {
        return employees.get(index);
      }
    }
    return null;
  }
}
