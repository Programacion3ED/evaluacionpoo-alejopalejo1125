package ec.edu.poo;

public class Servidor extends ActivoDigital {
    private String sistemaOperativo;

    // Constructor
    public Servidor(String codigo, String nombre, int nivelRiesgo, boolean parcheAplicado, String sistemaOperativo) {
        super(codigo, nombre, nivelRiesgo, parcheAplicado);
        this.sistemaOperativo = sistemaOperativo;
    }

    // Getter y setter de sistemaOperativo
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}