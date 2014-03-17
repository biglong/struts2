package helloworld.model;

/**
 * <p>Description:  </p>
 *
 * @author: huangshaolong
 * Date: 3/13/14
 * Time: 4:35 PM
 * CopyRight com.tom.ule
 */
public class MessageStore {
    private String message;

    public MessageStore(String message) {
        this.message = message;
    }

    public MessageStore() {
       setMessage("Hello struts User");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "message:"+message;
    }
}
