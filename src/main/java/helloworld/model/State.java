package helloworld.model;

/**
 * <p>Description:  </p>
 *
 * @author: huangshaolong
 * Date: 3/17/14
 * Time: 5:26 PM
 * CopyRight com.tom.ule
 */
public class State {
    private String stateAbbr;
    private String stateName;

    public State(String stateAbbr, String stateName) {
        this.stateAbbr = stateAbbr;
        this.stateName = stateName;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
     return this.stateName;
    }
}
