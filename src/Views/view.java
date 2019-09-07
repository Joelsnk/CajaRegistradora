
package Views;

import java.util.List;
import java.util.Scanner;
import team.ed.objects.Product;

/**
 *
 * @author Galford
 */
public class view {
    public static void ShowHeaderPrincipal(){
        System.out.println("\t\t*************************************");
        System.out.println("\t\t* BIENVENIDOS A LA CAJA REGISTRADORA *");
        System.out.println("\t\t*************************************");
    }
    
    public static void ShowMenuPrincipal(){
        System.out.println("\t\t\t 1. Comprar");
        System.out.println("\t\t\t 2. Vender");
        System.out.println("\t\t\t 3. Inventario");
        System.out.println("\t\t\t 4. Compras");
        System.out.println("\t\t\t 5. Ventas");
        System.out.println("\t\t\t 6. Salir");
    }
    
    public static void ShowGetOption(){
        System.out.print("\t\t Digite la opción: ");
        
    }
    
    public static void ShowGetAmount(){
        System.out.print("\t\t Digite la cantidad: ");
    }
    
    public static void ShowGetPrice(){
        System.out.print("\t\t Digite el precio: ");
    }
    
    public static int getOption(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    
    public static int getAmount(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    
    public static double getPrice(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }
    
    public static void ShowBuyHeader(){
        System.out.println("\t\t***********************************");
        System.out.println("\t\t*          MENÚ DE COMPRAS        *");
        System.out.println("\t\t***********************************");
        ShowItemsMenu();
    }
    
    public static void ShowSaleHeader(){
        System.out.println("\t\t***********************************");
        System.out.println("\t\t*          MENÚ DE VENTAS         *");
        System.out.println("\t\t***********************************");
        ShowItemsMenu();
    }
    
    public static void ShowStockHeader(){
        System.out.println("\t\t*****************************************************");
        System.out.println("\t\t*                I N V E N T A R I O                *");
        System.out.println("\t\t*****************************************************");
        ShowItemsHeader();
    }
    
    public static void ShowItemsHeader(){
        System.out.println("\t\t-----------------------------------------------------");
        System.out.println("\t\t*  PRODUCTO  | Cantidad  | Vr Unitario  | Vr Total  *");
        System.out.println("\t\t-----------------------------------------------------");
    }
    
    public static void ShowBuyListHeader(){
        System.out.println("\t\t*****************************************************");
        System.out.println("\t\t*                  C O M P R A S                    *");
        System.out.println("\t\t*****************************************************");
        ShowItemsHeader();
    }
    
    public static void ShowSaleListHeader(){
        System.out.println("\t\t*****************************************************");
        System.out.println("\t\t*                   V E N T A S                     *");
        System.out.println("\t\t*****************************************************");
        ShowItemsHeader();
    }
    
    public static void ShowItemsMenu(){
        System.out.println("\t\t 1. Papa ");
        System.out.println("\t\t 2. Arroz ");
        System.out.println("\t\t 3. Carne ");
        System.out.println("\t\t 4. Volver ");
    }
    
    public static void ShowThanks(){
        System.out.println("Gracias por utilizar la aplicación.");
    }
    
    public static void ShowInvalidOption(){
        System.out.println("Opción no válida");
    }
    
    public static void ShowGetBack(String name){
        System.out.println("\t\t Saliendo del módulo "+name);
    }
    
    public static void ShowItemsStock(Product[] products){
        for(Product v: products){
            System.out.println("\t\t*"+v.getName()+"\t| "+v.getAmount()+"\t\t| "+v.getPrice()+"\t\t\t| "+v.getAmount()*v.getPrice()+"\t\\t*");
            
            /*System.out.println("Nombre: "+v.getName());
            System.out.println("Cantidad: "+v.getAmount());
            System.out.println("Precio: "+v.getPrice());*/  
        }
    }
    
    public static void ShowAnyKey(){
        System.out.println("Digite cualquier número para continuar: ");
    }
    
    public static void ShowInvalidAmount(){
        System.out.println("La cantidad no es válida.");
    }
    
    public static void ShowPurchases(List<Product> listado){
        for(Product v: listado){
                        System.out.println("\t\t*"+v.getName()+"\t| "+v.getAmount()+"\t\t| "+v.getPrice()+"\t\t\t| "+v.getAmount()*v.getPrice()+"\t\\t*");
        }
    }
    
    public static void ShowSales(List<Product> listado){
        for(Product v: listado){
                        System.out.println("\t\t*"+v.getName()+"\t| "+v.getAmount()+"\t\t| "+v.getPrice()+"\t\t\t| "+v.getAmount()*v.getPrice()*1.25+"\t\\t*");
        }
    }
    
}
