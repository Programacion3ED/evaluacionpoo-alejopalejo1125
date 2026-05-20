package ec.edu.poo;

public class Firewall extends ActivoDigital {
    private int reglasActivas;

    // Constructor
    public Firewall(String codigo, String nombre, int nivelRiesgo, boolean parcheAplicado, int reglasActivas) {
        super(codigo, nombre, nivelRiesgo, parcheAplicado);
        this.reglasActivas = reglasActivas;
    }

    // Getter y setter de reglasActivas
    public int getReglasActivas() {
        return reglasActivas;
    }

    public void setReglasActivas(int reglasActivas) {
        this.reglasActivas = reglasActivas;
    }
}