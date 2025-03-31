package task;

import com.microsoft.playwright.Page;
import pages.Ingresar;

public class IngresarCategoria {

    public IngresarCategoria(){
    }

    public void cumpleanios(Page page) {
        Ingresar ingresar=new Ingresar(page);
        ingresar.categoriaCumpleaños();
    }

    public void amor(Page page) {
        Ingresar ingresar=new Ingresar(page);
        ingresar.categoriaAmor();
    }
}
