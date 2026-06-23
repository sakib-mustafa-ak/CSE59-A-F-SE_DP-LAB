
public class Employee {
    protected String name;
    
    public Employee(String name) { this.name = name; }
    
    public String getName(){
        return name;
    }

    public void calculateBonus() {
        System.out.println("Calculating standard employee bonus...");
    }
}

public interface BonusEligible {
    void calculateBonus();
}

public class PermanentEmployee extends Employee implements BonusEligible{
    public PermanentEmployee(String name){
        super(name);
    }

    @Override
    public void calculateBonus(){
        System.out.println("Calculating standard employee bonus......");
    }
}

public class Contractor extends Employee{
    public Contractor(String name){
        super(name);
    }
}


public class Main2 {
    
}
