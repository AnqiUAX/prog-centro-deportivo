

public class Aviones {

    // atributos de la clase
    private int id;
    private String fabricante;
    private String modelo;
    private int numPasajeros;

    public Aviones(int id, String fabricante, String modelo, int numPasajeros) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numPasajeros = numPasajeros;

    }

    public int getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Aviones{");

        sb.append(String.format("\n id: %d", id));
        sb.append(String.format(" fabricante: %s", fabricante));
        sb.append(String.format(" modelo: %s", modelo));
        sb.append(String.format(" numero.Pasajeros: %d", numPasajeros));
        sb.append("}");

        return sb.toString();

    }

    public boolean updateNumPasajeros(int numPasajeros) {
        boolean resultado;

        if (numPasajeros <= 0) {
            resultado = false;
        }
        else {
            this.numPasajeros = numPasajeros;
            resultado = true;
        }
        return resultado;
    }

}