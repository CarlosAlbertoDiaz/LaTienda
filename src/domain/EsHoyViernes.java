package domain;

public class EsHoyViernes {
    //defino un metodo, mi accion, estatica para que no tenga que instanciarla
    public static String esHoyViernes(String dia) {
        return "Viernes".equals(dia) ? "Si" : "No";
    }
}
