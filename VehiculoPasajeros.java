// Clase VehiculoPasajeros
public class VehiculoPasajeros extends Vehiculo {
    private int numPasajeros;

    // Constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;
    }

    // Getter y Setter para numPasajeros
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    // Sobrescribir el método mostrarInfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Pasajeros: " + numPasajeros);
    }

    // Sobrescribir el método realizarMantenimiento
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento específico del auto.");
        System.out.println("Chequeando aceite, filtros y neumáticos.");
    }

    // Método para calcular el costo de mantenimiento
    public double calcularCostoMantenimiento(double costoPorKm, int kilometrosRecorridos) {
        return costoPorKm * kilometrosRecorridos;
    }
}