package Assement4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class App {
    public static void printAllPrintableObjects(IPrint[] prints) {
        for (int i = 0; i < prints.length; i++) {
            System.out.println(prints[i]);
        }
    }

    public static void consumeComsumables(Consumable[] consumables) {
        for (int i = 0; i < consumables.length; i++) {
            System.out.println("You can Consume " + consumables[i]);

        }
    }

    public static void getTotalPriceOfCustomerProducts(Consumable[] consumables) {
        double total = 0;
        for(int i = 0; i < consumables.length; i++){
            consumables[i].consume();
        }

    }

    public static String getSecondaryAddressOfCustomer(Customer customer){
        String seconAddress = "";
        for(int i = 0; i < customer.toString().length(); i++){
           seconAddress = customer.getAddresses().get(1);
       }
       return seconAddress;
    }


    public static void reverseSortAndPrintAllProductsByPrice(ArrayList<Product> products){
        Collections.sort(products,new sortingList());
        for(Product product:products){
            System.out.println(product.getPrice());
        }
    }

   public static ArrayList<Double> getListOfProductPricesGreaterThanThePriceOfProductGiven(ArrayList<Product> products, Product product){

    };

    public static void addASingleProductToDirectoryTiedToCoustomerByNameThenPrint(Map<String,Product> productMap,Customer customer,Product product ){
        for (String i: productMap.keySet()) {
            System.out.println(customer + ":" + product.getName());
        }
       // System.out.println(productMap.get() +":");
    }


}