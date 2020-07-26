public class EmployeeTest {
    public static void main(String[] args) {
    Employee emp1 = new Employee();
    emp1.setName("Vamshi");

    Employee emp2 = new Employee();
    emp2.setName("Krishna");

    Employee emp3 = emp1;

    changeName(emp3);

    String emp1Name = emp1.getName();
    String emp2Name = emp2.getName();

    System.out.println("Emp1 Name .."+emp1Name);
        System.out.println("Emp2 Name .."+emp2Name);


    }
    private static void changeName(Employee emp){
        emp.setName("Test");
    }
}
