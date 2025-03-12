package reromerot.demos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.List;

public class GuruLoginPage {

    private List<Target> fields;
    public static final Target USER_NAME = Target.the("Campo nombre de usuario").locatedBy("name:uid");
    public static final Target PASSWORD = Target.the("Campo password").locatedBy("name:password");
    public static final Target BTN_LOGIN = Target.the("Boton Login").locatedBy("//*[@value='LOGIN']");

    public GuruLoginPage() {
        fields = new ArrayList<>();
        fields.add(USER_NAME);
        fields.add(PASSWORD);
        fields.add(BTN_LOGIN);
    }

    public List<Target> getFields() {
        return fields;
    }

}
