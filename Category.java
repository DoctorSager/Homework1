import java.util.ArrayList;

public class Category{

    private String name;
    private ArrayList<Product> products;

    
    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    
    /**
     * @apiNote метод добавляющий продукт в категорию
     * @param product
     */
    public void addNewProduct(Product product){
        products.add(product);
    }

    @Override
    public String toString() {
        return name + "=" + products;
    }
   
}