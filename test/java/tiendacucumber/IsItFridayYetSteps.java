package tiendacucumber;

import domain.EsHoyViernes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

//para el when creo una clase y defino un metodo

public class IsItFridayYetSteps {
    //las pongo a nivel de clases
    String hoy;
    String respuesta;

    @Given("hoy es {string}")
    public void hoy_es(String dia) {
        hoy = dia;
    }

    //@Given("hoy es Domingo")
    //public void hoy_es_Domingo() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //1° asigno un valor a una variable
    //    hoy = "Domingo";
    //}

    //@Given("hoy es Viernes")
    //public void hoy_es_Viernes() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    //    hoy = "Viernes";
    //}

    @When("pregunto si es Viernes")
    public void pregunto_si_es_Viernes() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        // va a buscar que se ejecute ese metodo
        // ejecuta un metodo
        respuesta = EsHoyViernes.esHoyViernes(hoy);

    }

    @Then("debo responder que {string}")
    public void debo_responder_que(String respuestaEsperada) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        //determinar si la prueba pasa o no pasa
        //Esos metodos o clases que tienen esas clases se denomina assert "ayudan a comparar valores"
        //comparar lo que la prueba espera con lo que el sistema esta generando
        //si coinciden la prueba fue superada
        Assert.assertEquals(respuestaEsperada, respuesta);


    }
}
