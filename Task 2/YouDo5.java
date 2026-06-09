


class printer{
    void printData(String text){
        System.out.println("Printing string: " + text);
    }

    void printData(int number){
     System.out.println("Printing number: " +number);   
    }
}

public class main5 {
    public static void main(String[] args) {
        printer p = new printer();
        p.printData("Hello");
        p.printData(1);
    }
}
