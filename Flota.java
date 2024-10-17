import java.util.*;

public class Flota {
    
    public ArrayList<MedioDeTransporte> mediosDeTransporte;

    public Flota(){
        mediosDeTransporte = new ArrayList<>();
    }

    public void addTransporte(MedioDeTransporte medioDeTransporte){
        mediosDeTransporte.add(medioDeTransporte);
    }

    public void addTransporte(ArrayList<MedioDeTransporte> mediosDeTransporte){
        for(MedioDeTransporte medioDeTransporte : mediosDeTransporte){
            this.mediosDeTransporte.add(medioDeTransporte);
        }
    }

    public void deleteTransporte(int index){
        mediosDeTransporte.remove(index);
    }

    public String showTransportes(){
        String lista = "";
        for(MedioDeTransporte medioDeTransporte: mediosDeTransporte){
            lista = lista + medioDeTransporte + "\n";
        }
        return lista;
    }

    public int showSize(){
        return mediosDeTransporte.size();
    }

    @Override
    public String toString(){
        return "{---Medios de transporte : " + showSize() + "---\n" +
               showTransportes() +
               "{------------\n";
    }
}
