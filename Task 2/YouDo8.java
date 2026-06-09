

class Item{
    String name;
    double price;

    Item (String name, double price){
        this.name = name;
        this.price = price;
    }
}

class Order{
    Item item1;
    Item item2;

    Order(Item item1, Item item2){
        this.item1 = item1;
        this.item2 = item2;
    }

    void printBill(){
        double total = item1.price + item2.price;
        System.out.println("--- Order List ---");
        System.out.println(item1.name + ": $" + item1.price);
        System.out.println(item2.name + ": $" + item2.price);
        System.out.println("Total cost: $" + total);
    }
}

public class main8 {
    public static void main(String[] args) {
        Item mouse = new Item("Mouse", 20.0);
        Item keyboard = new Item("Keyboard", 45.0);

        Order myOrder = new Order(mouse,keyboard);
        myOrder.printBill();
    }
    
}
