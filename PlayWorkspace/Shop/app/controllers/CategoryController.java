package controllers;

import play.mvc.*;

import views.html.category.*;
import play.data.FromFactory.*;
import javax.inject.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's item page.
 */

public class CategoryController extends Controller {
    //@Inject FormFactory formFactory;
    public Result createForm(){
		return ok(create.render());
	}
    /**
     * Method: POST
     * URL: /saveItem
     * @return
     */
    public Result save() {
        //Category cat=formFactoy.from(Category.class).bindFromRequest().get();
        return ok(create.render());
    }
    /**
     * Method: POST
     * URL: /deleteItem/iid
     * @return
     */
    public Result delete(){
    	return ok(list.render());
    }
    /**
     *Method: POST
     *URL : /updateItem
     * @return
     */
    public Result update(){
    	return ok(list.render());
    }
    /**
     * Method :GET
     * URL : /listItem
     * @return
     */
    public Result list(){
    	return ok(list.render());
    }

}