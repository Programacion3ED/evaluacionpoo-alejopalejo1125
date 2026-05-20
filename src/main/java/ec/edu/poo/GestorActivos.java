package ec.edu.poo;

public class GestorActivos {
    private ActivoDigital[] activos;
    private int contador;

    // Constructor
    public GestorActivos() {
        this.activos = new ActivoDigital[10];
        this.contador = 0;
    }

    public boolean registrarActivo(ActivoDigital activo) {
        // Validación de nulidad y capacidad máxima
        if (activo == null || contador >= 10) {
            return false;
        }

        // Validación de código duplicado
        if (buscarPorCodigo(activo.getCodigo()) != null) {
            return false;
        }

        activos[contador] = activo;
        contador++;
        return true;
    }

    public ActivoDigital buscarPorCodigo(String codigo) {
        if (codigo == null) {
            return null;
        }
        for (int i = 0; i < contador; i++) {
            if (activos[i].getCodigo().equals(codigo)) {
                return activos[i];
            }
        }
        return null;
    }

    public int contarActivosCriticos() {
        int criticos = 0;
        for (int i = 0; i < contador; i++) {
            if (activos[i].getNivelRiesgo() >= 8) {
                criticos++;
            }
        }
        return criticos;
    }

    public double calcularPromedioRiesgo() {
        if (contador == 0) {
            return 0.0;
        }
        double suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += activos[i].getNivelRiesgo();
        }
        return suma / contador;
    }

    public boolean aplicarParcheActivo(String codigo) {
        ActivoDigital activo = buscarPorCodigo(codigo);
        if (activo != null) {
            activo.setParcheAplicado(true);
            return true;
        }
        return false;
    }

    public int obtenerCantidadActivos() {
        return contador;
    }

    public ActivoDigital[] obtenerActivos() {
        return activos;
    }

    public void reiniciar() {
        this.activos = new ActivoDigital[10];
        this.contador = 0;
    }
}