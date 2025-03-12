package reromerot.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import reromerot.demos.models.User;
import reromerot.demos.utils.Logger;

import java.util.List;


public class Login implements Task {

    private User user;
    private Target fieldUserName;
    private Target fieldPassword;
    private Target btnSignIn;

    public Login(User user, List<Target> targets) {
        this.user = user;
        fieldUserName = targets.get(0);
        fieldPassword = targets.get(1);
        btnSignIn = targets.get(2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getName()).into(fieldUserName),
                Enter.theValue(user.getPassword()).into(fieldPassword),
                Click.on(btnSignIn)
        );
        Logger.info(Login.class, "Ejecutando: ************** Login ****************");
    }

    public static Login into(User user, List<Target> targets) {
        return Tasks.instrumented(Login.class, user, targets);
    }

}