package dao_20220214_02;

import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> listOfProducts = new ArrayList();
    private static ProductRepository instance = new ProductRepository();

    public static  ProductRepository getInstance(){
        return instance;
    }
    public ProductRepository() {
        Product phone = new Product("P1234", "iPhone 6s", 800000);
        phone.setDescription("4.7-inch, 1334X750 Renina HD display, 8-megapixel iSight Camera");
        phone.setCategory("Smart Phone");
        phone.setManufacturer("Apple");
        phone.setUnitsInStock(1000L);
        phone.setCondition("New");
        Product notebook = new Product("P1235", "LG PC 그램", 1500000);
        notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
        notebook.setCategory("Notebook");
        notebook.setManufacturer("LG");
        notebook.setUnitsInStock(1000L);
        notebook.setCondition("Refurbished");
        Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
        tablet.setDescription("212.8*125.6*6.6mm, Super AMOLED dispaly, Octa-Core processor");
        tablet.setCategory("Tablet");
        tablet.setManufacturer("Samsung");
        tablet.setUnitsInStock(1000L);
        tablet.setCondition("Old");
        this.listOfProducts.add(phone);
        this.listOfProducts.add(notebook);
        this.listOfProducts.add(tablet);
    }

    public void addProduct(Product product){
        listOfProducts.add(product);
    }

    public ArrayList<Product> getAllProducts() {
        return this.listOfProducts;
    }

    public Product getProductById(String productid){
        Product productById = null;

        for(int i = 0; i < listOfProducts.size(); i++){
            Product product = listOfProducts.get(i);
            if(product != null && product.getProductId() != null &&
            product.getProductId().equals(productid)){
                productById = product;
                break;
            }
        }
        return  productById;
    }
}