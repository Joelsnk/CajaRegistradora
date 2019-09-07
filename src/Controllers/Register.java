
package Controllers;

import Storage.Database;
import Views.view;
import java.util.List;
import team.ed.objects.Meat;
import team.ed.objects.Potato;
import team.ed.objects.Product;
import team.ed.objects.Rice;

/**
 *
 * @author Galford
 */
public class Register {
    private Database database;
    
    public Register(){
        database = new Database();
    }

    // Inicia el proceso de la registradora
    public void register(){
        
        int option;
        do{
            view.ShowHeaderPrincipal();
            view.ShowMenuPrincipal();
            view.ShowGetOption();
            option = view.getOption();
            switch(option){
                case 1:
                    Buy();
                    break;
                case 2:
                    Sale();
                    //view.ShowSaleHeader();
                    break;
                case 3:
                    //view.ShowStockHeader();
                    ShowStock();
                    break;
                case 4:
                    ShowPurchases();
                    //view.ShowBuyListHeader();
                    break;
                case 5:
                    ShowSales();
                    //view.ShowSaleListHeader();
                    break;
                case 6:
                    view.ShowThanks();
                    //System.exit(0);
                    break;
                default:
                    view.ShowInvalidOption();
            }
        }while(option >= 1 && option < 6);
    }
    
    // Buy se encargará de mostrar el menú de compras
    //y obtener la opción deseada por el usuario
    private void Buy(){
        view.ShowBuyHeader();
        int option;
        do{
            view.ShowGetOption();
            option = view.getOption();            
            if(option >= 1 && option <=3){
                BuyProduct(option);
            } else if(option ==4){
                view.ShowGetBack("Compras");
                return;
            } else {
                view.ShowInvalidOption();
            }           
        }while(option < 1 || option > 4);
    }
    
    // Registra en la base de datos el producto comprado
    private void BuyProduct(int option){
        Product product = null;
        switch(option){
            case 1:
                product = new Potato("Amarilla");
                break;
            case 2:
                product = new Rice("Tucapel");
                break;
            case 3:
                product = new Meat("Lomo");
                break;
            default:
                view.ShowInvalidOption();
        }
        view.ShowGetAmount();
        int amount = view.getAmount();
        view.ShowGetPrice();
        double price = view.getPrice();
        product.setAmount(amount);
        product.setPrice(price);
        database.Buy(product);
    }
    
    private void ShowStock(){
        view.ShowStockHeader();
        view.ShowItemsStock(database.getAll());
        view.ShowAnyKey();
        view.getOption();
    }
    
    // Sale se encargará de mostrar el menú de ventas
    //y obtener la opción deseada por el usuario
    private void Sale(){
        view.ShowSaleHeader();
        int option;
        do{
            view.ShowGetOption();
            option = view.getOption();            
            if(option >= 1 && option <=3){
                SaleProduct(option);
            } else if(option ==4){
                view.ShowGetBack("Ventas");
                return;
            } else {
                view.ShowInvalidOption();
            }           
        }while(option < 1 || option > 4);
    }
    
    // Registra en la base de datos el producto vendido
    private void SaleProduct(int option){
        Product product = null;
        if(option < 1 || option > 3){
            view.ShowInvalidOption();
            return;
        }
        product = database.getByIndex(option - 1);        
        view.ShowGetAmount();
        int amount = view.getAmount();
        
        if(product.getAmount() < amount){
            view.ShowInvalidAmount();
            return;
        }
        
        product.setAmount(amount);
        database.Sale(product);
    }
    
    private void ShowPurchases(){
        List<Product> listado = database.getPurchases();
        view.ShowBuyListHeader();
        view.ShowPurchases(listado);
    }
    
     private void ShowSales(){
        List<Product> listado = database.getSales();
        view.ShowSaleListHeader();
        view.ShowSales(listado);
    }
}
