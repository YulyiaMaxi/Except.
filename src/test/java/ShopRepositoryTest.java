import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    @Test

    public void shouldRemoveIdExist() {//открываем метод фиг.скобкой и в него все кладем
        ShopRepository repo = new ShopRepository(); //после объявления переменной фиг.скобка не стоит!

        Product product1 = new Product(32, "хлеб", 180);// кладем наши продукты
        Product product2 = new Product(22, "рис", 220);
        Product product3 = new Product(42, "гречка", 100);

        repo.add(product1);//кладем наши методы из репо
        repo.add(product2);
        repo.add(product3);
        repo.removeById(22);

        Product[] actual = repo.findAll(); //ищем среди всех и складываем в массив
        Product[] expected = {product1, product3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldRemoveIdNotExist() {//открываем метод фиг.скобкой и в него все кладем
        ShopRepository repo = new ShopRepository(); //после объявления переменной фиг.скобка не стоит!

        Product product1 = new Product(32, "хлеб", 180);// кладем наши продукты
        Product product2 = new Product(22, "рис", 220);
        Product product3 = new Product(42, "гречка", 100);

        repo.add(product1);//кладем наши методы из репо
        repo.add(product2);
        repo.add(product3);
        repo.findAll();

        Assertions.assertThrows(NotFoundException.class, () -> repo.removeById(14)
        );
    }
}





