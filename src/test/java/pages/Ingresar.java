package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Ingresar {

    public Page pagina;
    public Locator cumpleaniosBtn;
    public Locator amorBtn;

    public Ingresar(Page page) {
        cumpleaniosBtn = page.locator("#primary-menu li a[href='https://www.floristeriamundoflor.com/product-category/cumpleanos/']");
        amorBtn = page.locator("#primary-menu li a[href='https://www.floristeriamundoflor.com/product-category/amor/']");
    }

    public void categoriaCumpleaños() {
        cumpleaniosBtn.click();
    }

    public void categoriaAmor() {
        amorBtn.click();
    }
}
