public class Bicicleta extends MedioDeTransporteMecánico  {
    
    public Bicicleta(String nombre, String identificador, int añoDeCreacion){
        super(nombre, identificador, añoDeCreacion);
    }

    @Override
    public String avanzar(){
        return "---> " + super.getNombre() + " ha avanzado. \n";
    }

    @Override
    public String retroceder(){
        return "---> " + super.getNombre() + " ha retrocedido. \n";
    }

    @Override
    public String virar(){
        return "---> " + super.getNombre() + " ha virado. \n";
    }
    
}
