

public class Aerolinea {

    private Aviones [] catalogo;
    private final int CANT_MAX_AVIONES;

    public Aerolinea(int cantidad_maxima_aviones) {
        CANT_MAX_AVIONES = cantidad_maxima_aviones;
        catalogo = new Aviones[CANT_MAX_AVIONES];
    }

    public Aviones findAvion(int idAvion){
        boolean seguirBuscar = true;
        Aviones avionEncontrado = null;

        for(int i = 0; i < CANT_MAX_AVIONES && seguirBuscar; i++){
            if(catalogo[i] != null && catalogo[i].getId() == idAvion){
                avionEncontrado = catalogo[i];
                seguirBuscar = false;
                avionEncontrado = catalogo[i];
            }
        }
        return avionEncontrado;
    }


}