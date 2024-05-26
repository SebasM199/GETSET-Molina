// Clase Vehiculo
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    // Constructor
    public Vehiculo(String marca, String modelo, int año, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    // Método para mostrar la información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Kilometraje: " + kilometraje);
    }

    // Método para realizar el mantenimiento básico del vehículo
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento básico del vehículo.");
    }
}