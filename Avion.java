public class Avion extends MedioDeTransporteMecánico  {
    
    public Avion(String nombre, String identificador, int añoDeCreacion){
        super(nombre, identificador, añoDeCreacion);
    }

    @Override
    public String virar(){
        boolean encendido = super.isItEncendido();
        if(encendido = true){
            return "---> " + super.getNombre() + " ha cambiado de direccion. \n";
        }else{
            return "---> " + super.getNombre() + " esta apagado. \n";
        }
    }

    
}
