package reromerot.demos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.List;

public class SauceLoginPage {

    public List<Target> targets;
    public static final Target INPUT_USERL = Target.the("campo nombre de usuario").locatedBy("id:user-name");
    public static final Target INPUT_PASSWORD = Target.the("campo password").locatedBy("name:password");
    public static final Target BTN_SIGN_IN = Target.the("botón de iniciar sesión").locatedBy("id:login-button");

    public SauceLoginPage() {
        super();
    }

    public List<Target> getTargets() {
        targets = new ArrayList<>();
        targets.add(INPUT_USERL);
        targets.add(INPUT_PASSWORD);
        targets.add(BTN_SIGN_IN);
        return targets;
    }

}
