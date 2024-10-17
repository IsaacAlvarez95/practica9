
import java.util.ArrayList;

public class Empresa{

    private String nombre;
    private String rfc;
    private String localizacion;
    private String correoElectronico;
    private String telefono;
    public Flota flota;

    public Empresa(String nombre, String rfc, String localizacion, String correoElectronico,
                    String telefono){
        this.nombre = nombre;
        this.rfc = rfc;
        this.localizacion = localizacion;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.flota = new Flota();
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getRFC(){
        return this.rfc;
    }

    public String getLocalizacion(){
        return this.localizacion;
    }

    public String getCorreo(){
        return this.correoElectronico;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void addTransporte(MedioDeTransporte medioDeTransporte){
        flota.addTransporte(medioDeTransporte);
    }

    public void addTransporte(ArrayList<MedioDeTransporte> mediosDeTransporte){
        for(MedioDeTransporte medioDeTransporte : mediosDeTransporte){
            flota.addTransporte(mediosDeTransporte);
        }
    }

    public void deleteTransporte(int index){
        flota.deleteTransporte(index);
    }

    @Override
    public String toString(){
        return "---Empresa---\n" +
               "-> Nombre : " + this.nombre + "\n" +
               "-> RFC : " + this.rfc + "\n" +
               "-> Localizacion : " + this.localizacion + "\n" +
               "-> Telefono : " + this.telefono + "\n" +
               flota + 
               "-------------\n";
    }
}