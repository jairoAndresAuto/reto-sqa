package pages;

import com.github.javafaker.Faker;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Agregar {

    public Page pagina;
    public Locator productosBtn;
    public Locator agregarCarritoBtn;

    public Agregar(Page page) {
        pagina = page;
        productosBtn = page.locator("div[class='product-block grid'] > div > figure > a");
        agregarCarritoBtn = page.locator("span[class='title-cart']");
    }

    public void producto() {
        Faker faker = new Faker();
        int posicion = faker.random().nextInt(0, productosBtn.all().size() - 1);
        productosBtn.all().get(posicion).hover();
        agregarCarritoBtn.all().get(posicion).click();
    }


}
