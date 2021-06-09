package chapterfour.products;

/**
 * Model some details of a product sold by a company.
 *
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */

public class Product {

    private String productName;
    private int productQuantity;
    private int productID;


    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param productID The product's identifying number.
     * @param productName The product's name.
     */

    public Product(String productName, int productID){
        this.productName = productName;
        this.productID = productID;
        this.productQuantity = 0;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public int getProductID() {
        return productID;
    }

    /**
     * @return The id, name and quantity in stock.
     */

    public String getProductDetails(){
        return "ID: " + getProductID() +
                " Name: " + getProductName() +
                " Stock Quantity: " + getProductQuantity();
    }

    public void increaseStockQuantity(int quantity){
        if(quantity > 0){
            productQuantity += quantity;
        }
        else {
            System.out.println("Attempt to restock " +
                    productName + " with a positive amount");
        }
    }

    /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     */
    public void sellOneProduct(){
        if(productQuantity > 0){
            productQuantity--;
        }
        else {
            System.out.println("The item: " + productName + " is out of stock.");
        }
    }
}
