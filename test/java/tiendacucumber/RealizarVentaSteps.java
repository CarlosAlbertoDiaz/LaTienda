package tiendacucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RealizarVentaSteps {
    String id;
    @Given("id no corresponde a un cliente")
    public void id_no_corresponde_a_un_cliente() {
        id = "cliente";

    }

    @When("pregunto si es cliente")
    public void pregunto_si_es_cliente() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("realiza la venta {string}")
    public void realiza_la_venta(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
