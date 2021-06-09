package chapterfour.products;

public class ManageStock {
    public static void main(String[] args) {
        Product soap = new Product("OMO", 1);
        Product cookies = new Product("Oreos", 2);
        Product oil = new Product("Sunflower", 3);
        Product crisps = new Product("pringles", 4);

        StockManager stockManager = new StockManager();
        stockManager.addProduct(soap);
        stockManager.addProduct(cookies);
        stockManager.addProduct(oil);
        stockManager.addProduct(crisps);

        stockManager.printProductDetails();

        System.out.println(stockManager.findProduct(1));
        System.out.println(stockManager.numberInStock(1));
        stockManager.delivery(1,15);
        System.out.println(stockManager.numberInStock(1));
        stockManager.findProductByName("OMO");
    }
}
