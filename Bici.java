public class Bici extends Producto implements java.io.Serializable, Gestionable 
{
    private TipoBici tipo;
    private Rodado rodado;
    private String marca;
    private Cuadro cuadro;
    private int cambio;

    /* Constructor for objects of class Bici */
    public Bici(){}
    public Bici(TipoBici tipo, Rodado rodado, String marca, Cuadro cuadro, int cambio){
        this.tipo = tipo;
        this.rodado = rodado; 
        this.marca = marca;
        this.cuadro= cuadro;
        this.cambio = cambio;
        
    }
    //getters & setters    
    public TipoBici getTipo(){
        return tipo;
    }
    public Rodado getRodado(){
        return rodado;
    }
    public String getMarca(){
        return marca;
    }
    public Cuadro getCuadro(){
        return cuadro;
    }
    public int getCambio(){
        return cambio;
    }
    public void setTipo(TipoBici tipo){
        this.tipo = tipo;
    }
    public void getRodado(Rodado rodado){
        this. rodado = rodado;
    }
    public void getMarca(String marca){
        this.marca = marca;
    }
    public void getCuadro(Cuadro cuadro){
        this.cuadro = cuadro;
    }
    public void getCambio(int cambio){
        this.cambio = cambio;
    }
    
    public String toString(){
        return String.format("Tipo: %s.\nRodado: %s\".\nMarca: %s.\nCuadro: %s.\nCantidad de cambios: %s.", getTipo(),getRodado().getRodado(),
        getMarca(),getCuadro(), getCambio());
    }
    public void usar(){};
    public void lavar(){};
    public void darMantenimiento(){};
}
