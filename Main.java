
public class Main {

    public static void main(String[] args) {
         
        User firstUser = new User("Вася","123123");
        User secondUser = new User("Петя","321321");
        User thirdUser = new User("Света","456123");
       
        Category noFood = new Category("Всякое");
        Product phone = new Product("Телефон", 100,5.0);
        Product glass = new Product("Стекло",50,4.0);
        Product toys = new Product("Игрушка",250000,5.0);
        Product pistol = new Product("Пистолет",15,3.0);
        Product cigars = new Product("Сигары",80,4.0);
        noFood.addNewProduct(phone);
        noFood.addNewProduct(glass);
        noFood.addNewProduct(toys);
        noFood.addNewProduct(pistol);
        noFood.addNewProduct(cigars);
        
        Category food = new Category("Еда");
        Product meat = new Product("Мясо",100,5.0);
        Product milk = new Product("Молоко",50,4.0);
        Product eggs = new Product("Яйца",250000,5.0);
        Product water = new Product("Вода",15,3.0);
        Product apple = new Product("Яблоки",80,4.0);
        food.addNewProduct(meat);
        food.addNewProduct(milk);
        food.addNewProduct(eggs);
        food.addNewProduct(water);
        food.addNewProduct(apple);
        
        System.out.println(food);
        System.out.println(" ");
        System.out.println(noFood);

      
        firstUser.getBasket().addProduct(food.getProducts().get(1));
        secondUser.getBasket().addProduct(noFood.getProducts().get(3));
        thirdUser.getBasket().addProduct(food.getProducts().get(4));


        food.getProducts().remove(0);
        noFood.getProducts().remove(3);

        System.out.println(food);
        System.out.println(noFood);
                
    }

      
}


    

