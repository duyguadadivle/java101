package employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Duygu", 2000, 45, 1997);
        Employee e2 = new Employee("Ada", 9999, 50, 2005);

        e1.printInfo();
        e2.printInfo();
    }
}
