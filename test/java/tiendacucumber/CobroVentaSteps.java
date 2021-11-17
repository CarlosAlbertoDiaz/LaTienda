package tiendacucumber;

import domain.PagoEsEfectivo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CobroVentaSteps {

    String pago;
    String respuesta;

    //Given es algo que tenemos, sabemos o que ocurrio
    //@Given("pago es con tarjeta")
    //public void pago_es_con_tarjeta() {
        //1° defino una variable, pongo al sistema en un estado conocido
        //pago = "tarjeta";
    //}

    //7° paso
    //@Given("pago es con efectivo")
    //public void pago_es_con_efectivo() {
        //pago = "efectivo";

    //}

    //8° paso
    @Given("pago es con {string}")
    public void pago_es_con(String forma) {
        pago = forma;
    }

    //When evento o la accion
    @When("pregunto si es con efectivo")
    public void pregunto_si_es_con_efectivo() {
        //2° paso crea una clase publica y hago que ese ejecute ese metodo
        //3° pongo la variable pago a nivel de clases
        respuesta = PagoEsEfectivo.pagoEsEfectivo(pago);
    }

    //Then es el resultado
    //Realizo una comparacion
    @Then("debo contestar que {string}")
    public void debo_contestar_que(String respuestaEsperada) {
        //4°
        //compara los valores y si no coinciden generan una exepcion
        //los valores tienen que ser iguales para que la prueba pase
        //5° pongo la variable respuesta a nivel de clases arriba del given
        ////lo que la prueba espera, con lo que el sistema esta generando
        Assert.assertEquals(respuestaEsperada, respuesta);
    }

        //6° ejecuto la prueba, cambio el null por un "No"

}
