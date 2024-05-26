// Clase principal
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("¡Hola, mundo!");

        // Crear instancias de cada tipo de vehículo
        VehiculoPasajeros auto = new VehiculoPasajeros("Toyota", "Corolla", 2020, 15000, 5);
        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        // Mostrar la información de cada vehículo
        System.out.println("Información del Auto:");
        auto.mostrarInfo();
        auto.realizarMantenimiento();
        
        System.out.println("\nInformación del Camion:");
        camion.mostrarInfo();
        camion.realizarMantenimiento();
        
        // Calcular y mostrar el costo de mantenimiento del auto
        double costoPorKm = 0.5;
        int kilometrosRecorridos = 10000;
        double costoTotal = auto.calcularCostoMantenimiento(costoPorKm, kilometrosRecorridos);
        System.out.println("\nCosto de mantenimiento del Auto: " + costoTotal);
    }
}