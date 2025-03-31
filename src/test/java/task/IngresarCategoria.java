package task;

import com.microsoft.playwright.Page;
import pages.Ingresar;

public class IngresarCategoria {

    public IngresarCategoria(){
    }

    public void cumpleanios(Page page) {
        Ingresar ingresar=new Ingresar(page);
        ingresar.categoria();
    }
}
