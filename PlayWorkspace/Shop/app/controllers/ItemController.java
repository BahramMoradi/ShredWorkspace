package controllers;

import play.mvc.*;

import views.html.item.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's item page.
 */
public class ItemController extends Controller {
    public Result createForm(){
		return ok(createItem.render());
	}
    /**
     * Method: POST
     * URL: /saveItem
     * @return
     */
    public Result save() {
        return ok(listItem.render());
    }
    /**
     * Method: POST
     * URL: /deleteItem/iid
     * @return
     */
    public Result delete(){
    	return ok(listItem.render());
    }
    /**
     *Method: POST
     *URL : /updateItem
     * @return
     */
    public Result update(){
    	return ok(listItem.render());
    }
    /**
     * Method :GET
     * URL : /listItem
     * @return
     */
    public Result list(){
    	return 	ok(listItem.render());
    }

}
