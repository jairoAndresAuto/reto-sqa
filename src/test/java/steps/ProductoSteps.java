package steps;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import task.AgregarProducto;
import task.EliminarArticulo;
import task.IngresarCategoria;
import task.SeguirComprando;

import static org.junit.Assert.assertEquals;

public class ProductoSteps {

    private Page page;
    private IngresarCategoria ingresarCategoria=new IngresarCategoria();
    private AgregarProducto agregarProducto=new AgregarProducto();
    private SeguirComprando seguirComprando=new SeguirComprando();
    private EliminarArticulo eliminarArticulo=new EliminarArticulo();

    @Dado("que navego a la página {string}")
    public void que_navego_a_la_página(String url) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));  // Lanzar el navegador en modo visible
        page = browser.newPage();
        page.navigate(url);
        page.viewportSize();
    }

    @Cuando("selecciono la categoria cumpleaños")
    public void seleccionoLaCategoriaCumpleaños() {
        ingresarCategoria.cumpleanios(page);
    }

    @Y("lo agrego al carrito dos productos")
    public void lo_agrego_al_carrito_dos_productos() {
        agregarProducto.aSeleccionar(page);
    }

    @Y("elimino el producto del carrito")
    public void elimino_el_producto_del_carrito() {
        eliminarArticulo.delCarrito(page);
    }

    @Entonces("debería ver el mensaje {string}")
    public void debería_ver_el_mensaje(String mensaje) {
        assertEquals(mensaje,
                page.textContent("div[class='cart-empty woocommerce-info']").trim());
    }

    //-----------------------------------------

    @Cuando("selecciono la categoria amor")
    public void seleccionoLaCategoriaAmor() {
        ingresarCategoria.amor(page);
    }

    @Cuando("lo agrego los productos")
    public void lo_agrego_los_productos() throws InterruptedException {
        agregarProducto.aSeleccionar(page);
        seguirComprando.productos(page);
        agregarProducto.aSeleccionar(page);
    }

    @Entonces("deberia ver los productos en el carrito")
    public void deberia_ver_los_productos_en_el_carrito() {

    }


}
