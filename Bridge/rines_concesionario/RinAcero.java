package rines_concesionario;

public class RinAcero implements IElegir {

    @Override
    public void elegirRin(int radio, int x, int y, int tamaño) {

        System.out.printf("Eligiendo un Rin de Acero [ tamaño: "+ tamaño + ", radio: "+ radio +", x: " + x + ", y: "+ y  + "] ");

    }
}
