public class Mantenimiento {
    
    private String tipo;
    private String fecha;
    private float costo;

    public Mantenimiento(String tipo, String fecha, float costo){
        this.tipo = tipo;
        this.fecha = fecha;
        this.costo = costo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getFecha(){
        return this.fecha;
    }

    public float getCosto(){
        return this.costo;
    }

    @Override
    public String toString(){
        return "( Tipo : " + tipo + ", Fecha : " + fecha + ", Costo : " + costo +" )\n";
    }
}
