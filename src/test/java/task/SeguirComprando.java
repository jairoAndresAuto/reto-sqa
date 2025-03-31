package task;

import com.microsoft.playwright.Page;
import pages.Ingresar;
import pages.Seguir;

public class SeguirComprando {


    public SeguirComprando(){
    }

    public void productos(Page page) {
        Seguir seguir=new Seguir(page);
        seguir.comprando();
    }

}
