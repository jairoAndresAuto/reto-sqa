package task;

import com.microsoft.playwright.Page;
import pages.Agregar;
import pages.Eliminar;

public class EliminarArticulo {

    public EliminarArticulo(){
    }

    public void delCarrito(Page page) {
        Eliminar eliminar=new Eliminar(page);
        eliminar.productoCarrito();
    }

}
