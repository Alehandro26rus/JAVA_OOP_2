import Domain.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Product item_1 = new Product(100, 1, "Lays", 1);
        Product item_2 = new Product(120, 2, "Nuts", 2);
        Product item_3 = new Product(90, 3, "Chips", 3);
        Product item_4 = new Product(30, 4, "Bread", 4);
        Product item_5 = new Product(60, 5, "Coffee", 5);
        Product item_6 = new Product(150, 6, "Breakers", 6);

        Holder hold = new Holder();
        CoinDispenser coin = new CoinDispenser();
        Display display = new Display();
        List<Product> productList = new ArrayList<>();

        productList.add(item_1);
        productList.add(item_2);
        productList.add(item_3);
        productList.add(item_4);
        productList.add(item_5);
        productList.add(item_6);

        VendingMachine vm = new VendingMachine(hold, coin, display, productList);

        for (Product p : vm.getAssort()){
            System.out.println(p);
        }

    }
}
