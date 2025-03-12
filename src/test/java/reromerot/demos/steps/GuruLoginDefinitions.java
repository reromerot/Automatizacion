package reromerot.demos.steps;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.questions.Text;
import reromerot.demos.enums.Exceptions;
import reromerot.demos.exceptions.NotTextFound;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static reromerot.demos.userinterfaces.GuruHomePage.TITLE;

public class GuruLoginDefinitions {

    @Then("valida que se presenta el mensaje de éxito con texto {string}")
    public void validaQueSePresentaElMensajeDeExitoConTexto(String msg) {
        theActorInTheSpotlight().should(seeThat(Text.of(TITLE.of(msg)), equalTo(msg)).orComplainWith(NotTextFound.class,
                String.format(Exceptions.LOGIN_FAIL.getTextoExepcion(), msg, Text.of(TITLE.of(msg))
                        .answeredBy(theActorInTheSpotlight()))));
    }

}
