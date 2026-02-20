abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void work();

    void showName() {
        System.out.println("Employee: " + name);
    }
}

class Developer extends Employee {
    Developer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(" " + name + " is writing Java code.");
    }
}

final class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(" " + name + " is managing the team sprint.");
    }
}

public class CompanySystem {
    public static void main(String[] args) {

        Developer dev = new Developer("AK");
        Manager mgr = new Manager("AB");

        dev.showName();
        dev.work();

        mgr.showName();
        mgr.work();
    }
}