package task;

import com.microsoft.playwright.Page;
import pages.Agregar;
import pages.Ingresar;

public class AgregarProducto {

    public AgregarProducto(){
    }

    public void aSeleccionar(Page page) {
        Agregar agregar=new Agregar(page);
        agregar.producto();
    }

}
