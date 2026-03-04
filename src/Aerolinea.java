

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

    private int buscarPrimerHuecoLibre(){
        int posicionAviones = -1;
        boolean seguirBuscar = true;

        for(int i = 0; i < CANT_MAX_AVIONES && seguirBuscar; i++){
            if (catalogo[i] == null) {
                posicionAviones = i;
                seguirBuscar = false;
            }
        }

        return posicionAviones;
    }

    public boolean addAviones(Aviones aviones){
        boolean avionAnadido = false;
        int posicion;

        if (findAvion(aviones.getId()) == null ) {
            posicion = buscarPrimerHuecoLibre();
            if(posicion >= 0){
                catalogo[posicion] = aviones;
                avionAnadido = true;
            }
        }

        return avionAnadido;
    }

    public Aviones deleteAviones(int id){
        Aviones avionEncontrado = null;
        boolean seguirBuscar = true;

        for(int i = 0; i < CANT_MAX_AVIONES && seguirBuscar; i++){
            if(catalogo[i] != null && catalogo[i].getId() == id){
                avionEncontrado = catalogo[i];
                catalogo[i] = null;
                seguirBuscar = false;
            }
        }

        return avionEncontrado;
    }

    public boolean updateNumAviones(int idAvion, int numAviones){
        boolean numAvionesActualizado = false;
        Aviones aviones;

        aviones = findAvion(idAvion);

        if(aviones != null){
            numAvionesActualizado = aviones.updateNumPasajeros(numAviones);
        }
        return numAvionesActualizado;
    }

    public String obtianCatalogo(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < CANT_MAX_AVIONES; i++){
            if(catalogo[i] != null){
                sb.append(catalogo[i].toString());
            }
        }
        sb.append("\n");

        return sb.toString();
    }


}