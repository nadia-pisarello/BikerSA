public abstract class Producto
{
    private String id;
    private double precio;
    private double costo;
  
    public Producto(){}
    public Producto(String id, double precio, double costo){
        this.id = id;
        this.precio = precio;
        this.costo = costo;
    }
    
    
}
