package clase;

public class Alumno {
    private String nombre;
    private String apellido1;

    private String apellido2;

    private int carnet;
    private String telefono;

    public Alumno(String nombre, String apellido1, String apellido2, int carnet, String telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.carnet = carnet;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "**Alumno:** " + nombre + "\n"
                + "**apellido paterno:** " + apellido1 + "\n"
                + "**apellido materno:** " + apellido2 + "\n"
                + "**Carnet:** " + carnet + "\n"
                + "**telefono:** " + telefono + "\n";
    }
}
