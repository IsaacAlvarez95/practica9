import java.util.*;

public abstract class MedioDeTransporte {
    private String nombre;
    private String identificador;
    private int añoDeCreacion;
    private ArrayList<Mantenimiento> mantenimientos;

    public MedioDeTransporte(String nombre, String identificador, int añoDeCreacion){
        this.nombre = nombre;
        this.identificador = identificador;
        this.añoDeCreacion = añoDeCreacion;

        mantenimientos = new ArrayList<>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getIdentificador(){
        return this.identificador;
    }

    public int getAñoDeCreacion(){
        return this.añoDeCreacion;
    }

    public String avanzar(){
        return "---> " + nombre + " ha avanzado. \n";
    }

    public String retroceder(){
        return "---> " + nombre + " ha retrocedido. \n";
    }

    public String virar(){
        return "---> " + nombre + " ha virado. \n";
    }

    public void addMantenimiento(Mantenimiento mantenimiento){
        mantenimientos.add(mantenimiento);
    }

    public void addMantenimiento(ArrayList<Mantenimiento> mantenimientos){
        for(Mantenimiento mantenimiento : mantenimientos){
            this.mantenimientos.add(mantenimiento);
        }
    }

    public String showMantenimientos(){
        String lista = "-> Mantenimientos : \n";
        for(Mantenimiento mantenimiento : mantenimientos){
            lista = lista + mantenimiento;
        }
        return lista;
    }

    @Override
    public String toString(){
        return "[------------\n" +
               "-> Nombre : " + nombre + "\n" +
               "-> Identificador : " + identificador + "\n" +
               "-> Año de Creacion : " + añoDeCreacion + "\n" +
               showMantenimientos() + 
               "[------------";
    }
}
