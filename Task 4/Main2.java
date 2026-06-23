class Employee {
    protected String name;
    
    public Employee(String name) { this.name = name; }
    
    public String getName(){
        return name;
    }

    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus...");
    }
}

interface BonusEligible {
    void calculateBonus();
}

class PermanentEmployee extends Employee implements BonusEligible{
    public PermanentEmployee(String name){
        super(name);
    }

    @Override
    public void calculateBonus(){
        System.out.println("Calculating standard employee bonus......");
    }
}

class Contractor extends Employee{
    public Contractor(String name){
        super(name);
    }
}


public class Main2 {
    public static void main(String[] args) {
        PermanentEmployee alice = new PermanentEmployee("Alice");

        Contractor bob = new Contractor("Bob");

        System.out.println("---- Staff List ----");
        System.out.println("Employee: " + alice.getName());
        System.out.println("Employee: " + bob.getName());
        System.out.println();

        System.out.println("---- Processing Bonuses ----");

        alice.calculateBonus();

        System.out.println(bob.getName() + " is a contractor and is not eligible for a bonus. (Safe behavior)");
    }
}
