package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Eliminar {

    public Page pagina;
    public Locator eliminarBtn;

    public Eliminar(Page page) {
        pagina = page;
        eliminarBtn = page.locator("i[class='fa fa-trash-o']");
    }

    public void productoCarrito() {
        eliminarBtn.click();
    }

}
