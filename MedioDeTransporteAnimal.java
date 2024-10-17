
public class MedioDeTransporteAnimal extends MedioDeTransporte{

    private boolean isPreparado;

    public MedioDeTransporteAnimal(String nombre, String identificador, int añoDeCreacion){
        super(nombre, identificador, añoDeCreacion);
        descansar();
    }

    public void preparar(){
        this.isPreparado = true;
    }

    public void descansar(){
        this.isPreparado = false;
    }

    @Override
    public String avanzar(){
        if(isPreparado = true){
            return "---> " + super.getNombre() + " ha avanzado. \n";
        }else{
            return "---> " + super.getNombre() + " no esta preparado. \n";
        }
    }

    @Override
    public String retroceder(){
        if(isPreparado = true){
            return "---> " + super.getNombre() + " ha retrocedido. \n";
        }else{
            return "---> " + super.getNombre() + " no esta preparado. \n";
        }
    }

    @Override
    public String virar(){
        if(isPreparado = true){
            return "---> " + super.getNombre() + " ha virado. \n";
        }else{
            return "---> " + super.getNombre() + " no esta preparado. \n";
        }
    }
}
