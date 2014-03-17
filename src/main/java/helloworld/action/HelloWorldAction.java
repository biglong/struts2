package helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import helloworld.model.MessageStore;

/**
 * <p>Description:  </p>
 *
 * @author: huangshaolong
 * Date: 3/13/14
 * Time: 4:41 PM
 * CopyRight com.tom.ule
 */
public class HelloWorldAction extends ActionSupport {

    private static final long serialVersionUID = -287799425459201600L;
    private MessageStore messageStore= new MessageStore();
    private String userName;

    @Override
    public String execute() throws Exception {
        messageStore = new MessageStore();
        helloCount++;
        if(userName != null){
            messageStore.setMessage(messageStore.getMessage()+" "+userName);
        }
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private static int helloCount = 0;

    public int getHelloCount() {
        return helloCount;
    }

    public void setHelloCount(int helloCount) {
        HelloWorldAction.helloCount = helloCount;
    }

}
