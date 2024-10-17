import java.util.ArrayList;

public class FlotaMain{

    public static void main(String[] args){
        Empresa empresa = new Empresa(
            "Turismo", 
            "999-8596", 
            "Ensenada", 
            "example@example.com", 
            "555-5698");
        Autobus autobus = new Autobus(
            "Atusa",
            "AD874", 2012);
        Avion avion = new Avion(
            "AeroMex", 
            "DG734", 
            2008);
        Bicicleta bicicleta = new Bicicleta(
            "Bicicleta",
            "UN345", 
            2009);
        Caballo caballo = new Caballo(
            "Caballo",
            "Jorge",
            2015);
        TodoTerreno todoterreno = new TodoTerreno(
            "Jeep", 
            "78HGF", 
            2021);

        ArrayList<MedioDeTransporte> mediosDeTransporte = new ArrayList<>();
        mediosDeTransporte.add(avion);
        mediosDeTransporte.add(autobus);

        empresa.addTransporte(todoterreno);
        empresa.addTransporte(caballo);
        empresa.addTransporte(bicicleta);
        empresa.addTransporte(mediosDeTransporte);

        Mantenimiento mantenimiento1 = new Mantenimiento("Cambio de aceite", "Agosto 2024",  800);
        Mantenimiento mantenimiento2 = new Mantenimiento("Cambio de herraduras", "Enero 2021", 1200);
        Mantenimiento mantenimiento3 = new Mantenimiento("Aceitado de cadenas", "Febrero 2023", 500);
        Mantenimiento mantenimiento4 = new Mantenimiento("Llenado de combustible", "Octubre 2024", 1000);
        Mantenimiento mantenimiento5 = new Mantenimiento("Cambio de llantas", "Marzo 2024", 2000);

        empresa.flota.mediosDeTransporte.get(0).addMantenimiento(mantenimiento1);
        empresa.flota.mediosDeTransporte.get(1).addMantenimiento(mantenimiento2);
        empresa.flota.mediosDeTransporte.get(2).addMantenimiento(mantenimiento3);
        empresa.flota.mediosDeTransporte.get(3).addMantenimiento(mantenimiento4);
        empresa.flota.mediosDeTransporte.get(4).addMantenimiento(mantenimiento5);

        ArrayList<Mantenimiento> mantenimientos1 = new ArrayList<>();
        mantenimientos1.add(mantenimiento5);
        mantenimientos1.add(mantenimiento5);

        ArrayList<Mantenimiento> mantenimientos2 = new ArrayList<>();
        mantenimientos2.add(mantenimiento2);
        mantenimientos2.add(mantenimiento2);

        empresa.flota.mediosDeTransporte.get(0).addMantenimiento(mantenimientos1);
        empresa.flota.mediosDeTransporte.get(1).addMantenimiento(mantenimientos2);
        empresa.flota.mediosDeTransporte.get(2).addMantenimiento(mantenimientos1);
        empresa.flota.mediosDeTransporte.get(3).addMantenimiento(mantenimientos1);
        empresa.flota.mediosDeTransporte.get(4).addMantenimiento(mantenimientos1);

        System.out.println(empresa);
    }

}