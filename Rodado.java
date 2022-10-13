
public enum Rodado
{
    TWENTY_SIX(26.0), TWENTY_SEVEN(27.5), TWENTY_NINE(29.0);
    private final double rodado;
    private Rodado(Double rodado){
        this.rodado = rodado;
    }
    public Double getRodado(){
        return rodado;
    }
    
    
}
