
package Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import team.ed.objects.Meat;
import team.ed.objects.Potato;
import team.ed.objects.Product;
import team.ed.objects.Rice;

/**
 *
 * @author Galford
 */
public class Database {
    private Product[] products;
    
    private List<Product> purchases;
    private List<Product> sales;
    
    public Database(){
        products=new Product[3];
        
        Product potato=new Potato("Amarilla");
        Product rice=new Rice("Tucapel");
        Product meat=new Meat("Lomo");
        
        products[0]=potato;
        products[1]=rice;
        products[2]=meat;
        
        purchases = new ArrayList<>();
        sales = new ArrayList<>();
    }
    
    public Product getByIndex(int i){
        if(i<0||i>2){
            System.out.println("Índice no válido.");
            return null;
        }
        
        Product result=null;
        try {
            //return products[i];
            result = products[i].Clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public Product[] getAll(){
        Product[] result = new Product[3];
        try{
            result[0]=products[0].Clone();
            result[1]=products[1].Clone();
            result[2]=products[2].Clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(ex);
        }
        return result;
    }
    
    public void Buy(Product product){
        Product temp;
        switch(product.getClass().getSimpleName()){
            case "Potato":
                temp = products[0];
                break;
            case "Rice":
                temp = products[1];
                break;
            case "Meat":
                temp = products[2];
                break;
            default:
                System.out.println("No válido.");
                return;
        }
        temp.setAmount(product.getAmount() + temp.getAmount());
        temp.setPrice(product.getPrice());
        purchases.add(product);
    }
    
    public void Sale(Product product){
        Product temp;
        switch(product.getClass().getSimpleName()){
            case "Potato":
                temp = products[0];
                break;
            case "Rice":
                temp = products[1];
                break;
            case "Meat":
                temp = products[2];
                break;
            default:
                System.out.println("No válido.");
                return;
        }
        temp.setAmount(temp.getAmount() - product.getAmount());
        temp.setPrice(product.getPrice()*1.25);
        sales.add(product);
    }
    
    public List<Product> getPurchases(){
        return purchases;
    }
    
    public List<Product> getSales(){
        return sales;
    }
}
