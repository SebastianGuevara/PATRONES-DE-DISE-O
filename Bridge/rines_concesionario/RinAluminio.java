package rines_concesionario;

public class RinAluminio implements IElegir {

    @Override
    public void elegirRin(int radio, int x, int y, int tamaño) {

        System.out.printf("Eligiendo un Rin de Aluminio[ tamaño: "+ tamaño + ", radio: "+ radio +", x: " + x + ", y: "+ y  + "]");

    }
}
