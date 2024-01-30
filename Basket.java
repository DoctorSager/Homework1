import java.util.ArrayList;

public class Basket  {

    private ArrayList<Product> products;

  
    public Basket() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts(){
        return products;
    }
    /**
     * @apiNote Метод добавляющий товар в корзину
     * @param product
     */
    public void addProduct(Product product){
        products.add(product);
    }

    /**
     * @apiNote Метод удаляющий товар из корзины
     * @param product
     */
    public void removeProduct(Product product){
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Basket [products=" + products + "]";
    }


    
}