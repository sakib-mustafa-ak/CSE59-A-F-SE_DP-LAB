
class Applet{
    void launch(){
        System.out.println("Applet launched");
    }
}

class GameApplet extends Applet{
    void play(){
        System.out.println("Playing game");
    }
}

public class main6 {
    public static void main(String[] args) {
        GameApplet g = new GameApplet();
        g.launch();
        g.play();
    }
}
