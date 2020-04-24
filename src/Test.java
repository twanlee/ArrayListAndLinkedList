import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Product p1 = new Product(1,"A1",1);
        Product p2 = new Product(2,"A2",2);
        Product p3 = new Product(3,"A3",5);
        Product p4 = new Product(4,"A4",3);
        Product p5 = new Product(5,"A5",4);

        List<Product> myProducts = new ArrayList<Product>();
        myProducts.add(p1);
        myProducts.add(p2);
        myProducts.add(p3);
        myProducts.add(p4);
        myProducts.add(p5);
        Scanner sc = new Scanner(System.in);
//        int id = sc.nextInt();
//        System.out.println(myProducts.toString());
//        editProduct(myProducts, sc, id);
//        System.out.println(myProducts.toString());
//        removeProduct(myProducts, sc, id);
//        System.out.println(myProducts.toString());
//        String name = sc.next();
//        displayName(myProducts, sc, name);
        priceComparator x = new priceComparator();
        Collections.sort(myProducts,x);
        System.out.println(myProducts.toString());

    }

    public static void editProduct(List<Product> myProducts, Scanner sc, int id) {
        for(Product x : myProducts){
            if(x.getId()==id){
                String name = sc.next();
                x.setName(name);
                int price = sc.nextInt();
                x.setPrice(price);
                break;
            }
        }
    }
    public static void removeProduct(List<Product> myProducts, Scanner sc, int id) {
        for(Product x : myProducts){
            if(x.getId()==id){
               myProducts.remove(x);
                break;
            }
        }
    }
    public static void displayName(List<Product> myProducts, Scanner sc, String name) {
        for(Product x : myProducts){
            if(x.getName().equals(name)){
                System.out.println(x.toString());
                break;
            }
        }
    }
}
