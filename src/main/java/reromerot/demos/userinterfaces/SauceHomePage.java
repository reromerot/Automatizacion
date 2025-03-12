package reromerot.demos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SauceHomePage {

    public static final Target TITTLE = Target.the("Título de la página").locatedBy("(//*[text()='Products'])[1]");

    public SauceHomePage() {
        super();
    }

}
