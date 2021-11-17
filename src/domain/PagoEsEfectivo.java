package domain;

//9° paso refactorizar
//10° definir la clase como publica
public class PagoEsEfectivo {
    //metodo dentro de una clase
    public static String pagoEsEfectivo(String pago) {
        return "efectivo".equals(pago) ? "Si" : "No";
    }
}
