public class Main {
    public static void main(String[] args) {
        Aerolinea aerolinea = new Aerolinea(100);

        Aviones aviones1 = new Aviones(1,"Boeing","787-9",290);

        Aviones aviones2 = new Aviones(2,"AirBus","A320",150);

        System.out.println(aerolinea.findAvion(1));

        System.out.println(aerolinea.addAviones(aviones1));
        System.out.println(aerolinea.addAviones(aviones2));

        System.out.println(aerolinea.obtianCatalogo());
    }
}