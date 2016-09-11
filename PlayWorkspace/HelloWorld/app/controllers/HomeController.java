package controllers;

import play.mvc.*;
import views.html.*;
import play.data.*;
import models.*;
import javax.inject.*;
import java.util.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    @Inject FormFactory formFactory;
    private static List<Register> all=new ArrayList<>();

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public Result index() {
        return ok(index.render("hello world from ...."));
    }
    public Result register(){
        return ok(register.render("Regstration home page"));
    }
    public Result saveRegistration(){
        Register reg=formFactory.form(Register.class).bindFromRequest().get();
        all.add(reg);
        return ok(register.render("Regstration home page"));
    }
    public Result list(){
          return ok(list.render("Registered Users",all));
    }

}
