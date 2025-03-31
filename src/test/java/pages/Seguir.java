package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Seguir {

    public Page pagina;
    public Locator seguirBtn;


    public Seguir(Page page) {
        pagina=page;
        seguirBtn = page.locator("text=Seguir comprando");
    }

    public void comprando() {
        seguirBtn.click();
    }
}
