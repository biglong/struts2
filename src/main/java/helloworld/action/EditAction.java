package helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import helloworld.model.State;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>Description:  </p>
 *
 * @author: huangshaolong
 * Date: 3/17/14
 * Time: 5:09 PM
 * CopyRight com.tom.ule
 */
public class EditAction extends ActionSupport {
    private String[] sports = new String[]{"basketball","football","tennis"};
    private String[] genders = new String[]{"male","female","not sure"};
    private List<State> states;
    private String[] allCarModels = new String[]{"Buick","Nissan","Ford","Toyota"};
    public String save() throws Exception{

        return SUCCESS;
    }

    public String edit() throws Exception {

        return SUCCESS;
    }

    public List<String> getAllCarModels() {
        return Arrays.asList(allCarModels);
    }

    public List<String> getGenders() {
        return Arrays.asList(genders);
    }

    public List<String> getSports() {
        return Arrays.asList(sports);
    }

    public List<State> getStates() {
        states = new ArrayList<State>();
        states.add(new State("NY","New York"));
        states.add( new State("AZ", "Arizona") );
        states.add( new State("CA", "California") );
        states.add( new State("FL", "Florida") );
        states.add( new State("KS", "Kansas") );
        return states;
    }


}
