
package team.ed.test;

import Controllers.Register;
import Storage.Database;
import Views.view;
import team.ed.objects.Product;

/**
 *
 * @author Galford
 */
public class Main {
    public static void main(String[] args) {
        /*Jabon j=new Jabon("Una marca buena");
        //System.out.println(j.getName());
        //System.out.println("Mostrar objeto: "+j.MostrarObjeto());
        System.out.println(j);*/
        
        /*Database database=new Database();
        Product product=database.getByIndex(0);
        System.out.println(product);
        
        product.setAmount(10);
        product.setPrice(1000);
        product.setName("Canchan");
        
        Product[] products=database.getAll();
        
        for(Product v:products){
            System.out.println(v);
        }*/
        
        /*view.ShowHeaderPrincipal();
        view.ShowMenuPrincipal();
        view.ShowGetOption();
        int option=view.getOption();
        System.out.println("La opción es: "+option);*/
        
        Register register = new Register();
        register.register();
    }
    
}
