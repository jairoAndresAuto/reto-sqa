package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Ingresar {

    public Page pagina;
    public Locator cumpleaniosBtn;

    public Ingresar(Page page) {
        pagina = page;
        cumpleaniosBtn = page.locator("#primary-menu li a[href='https://www.floristeriamundoflor.com/product-category/cumpleanos/']");
    }

    public void categoria() {
        cumpleaniosBtn.click();
    }
}
