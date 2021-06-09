package chapterfour.products;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Manage stock of a business
 * The stock is managed 0 or more products
 * @author: Bongani Maphiri
 * @version 1.0
 */
public class StockManager {

    private ArrayList<Product> stock;


    public StockManager(){
        stock = new ArrayList<>();
    }

    /**
     * add a product to the list
     * @param item the product to be added
     */
    public void addProduct(Product item){
        stock.add(item);
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param productID The ID of the product.
     * @param quantity The amount to increase the quantity by.
     */
    public void delivery(int productID, int quantity){
        Product product = findProduct(productID);
        product.increaseStockQuantity(quantity);
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int productID){
        Iterator<Product> it = stock.iterator();
        while (it.hasNext()){
         Product product  = it.next();
           if(product.getProductID() == productID){
              return product;
           }
        }
        return null;
    }

    /**
     * Try to find a product in the stock with the given name.
     * @param name the name of the product to find
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProductByName(String name){
        Iterator<Product> it = stock.iterator();
        while (it.hasNext()){
            Product product  = it.next();
            if(product.getProductName() == name){
                return product;
            }
        }
        return null;
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param productID The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID){
       return findProduct(productID).getProductQuantity();
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails(){
        for (Product product: stock) {
            System.out.println(product.getProductDetails());
        }

    }

    /**
     * Print details of all producrs with stock levels
     * below a given value
     * @param value value of stocks to be returned
     */

    public void printStocksBelow(int value){
        for (Product product:stock) {
            if(product.getProductQuantity() < value){
                System.out.println(product.getProductDetails());
            }
        }
    }
}
