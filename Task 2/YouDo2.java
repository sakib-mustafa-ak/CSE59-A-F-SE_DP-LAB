
class NumberChecker{
    void check (int num){
        boolean isEvenAndGreaterThanTen = (num %2==0) &&(num>10);
        System.out.println(isEvenAndGreaterThanTen);
    }
}

public class main2 {
    public static void main(String[] args) {
        NumberChecker checker = new NumberChecker();
        checker.check(14);
    }
}
