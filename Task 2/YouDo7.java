
interface Clickable {

    void onClick();
}

class Button implements Clickable{
    @Override
    public void onClick(){
        System.out.println("Button was clicked!");
    }
}

public class main7 {
    public static void main(String[] args) {
        Button a = new Button();
        a.onClick();
    }
    
}
