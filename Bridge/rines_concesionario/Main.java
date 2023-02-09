package rines_concesionario;

public class Main {

    public static void main(String[] args) {

        Forma rinAcero = new Rin(100, 100, 10, 17, new RinAcero());
        Forma rinALuminio = new Rin(100, 100, 10, 18, new RinAluminio());
        Forma rinAleacion = new Rin(100, 100, 10, 19, new RinAcero());

        rinAcero.elegir();
        rinALuminio.elegir();
        rinAleacion.elegir();


    }
}