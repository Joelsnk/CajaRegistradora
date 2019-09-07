
package team.ed.objects;

/**
 *
 * @author Galford
 */
public abstract class Product implements Cloneable{

    private String name;
    private int amount;
    private double price;

    public Product() {
    }

    public Product(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            System.out.println("No puede asignar una cantidad negativa.");
            return;
        }
        this.amount = amount;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("No se puede colocar un precio negativo.");
            return;
        }
        this.price = price;
    }
    
    @Override
    public String toString(){
        return this.name+" - "+this.amount+" - "+this.price;
    }

    /*public String MostrarObjeto(){
        return this.name+" - "+this.amount+" - "+this.price;
    }*/
    
    public Product Clone()throws CloneNotSupportedException{
        return (Product) super.clone();
    }
}
