public class MedioDeTransporteMecánico extends MedioDeTransporte {
    
    private boolean isEncendido;

    public MedioDeTransporteMecánico(String nombre, String identificador, int añoDeCreacion){
        super(nombre, identificador, añoDeCreacion);
        apagar();
    }

    public void encender(){
        this.isEncendido = true;
    }

    public void apagar(){
        this.isEncendido = false;
    }

    public boolean isItEncendido(){
        return isEncendido;
    }

    @Override
    public String avanzar(){
        if(isEncendido = true){
            return "---> " + super.getNombre() + " ha avanzado. \n";
        }else{
            return "---> " + super.getNombre() + " esta apagado. \n";
        }
    }

    @Override
    public String retroceder(){
        if(isEncendido = true){
            return "---> " + super.getNombre() + " ha retrocedido. \n";
        }else{
            return "---> " + super.getNombre() + " esta apagado. \n";
        }
    }

    @Override
    public String virar(){
        if(isEncendido = true){
            return "---> " + super.getNombre() + " ha virado. \n";
        }else{
            return "---> " + super.getNombre() + " esta apagado. \n";
        }
    }

}
