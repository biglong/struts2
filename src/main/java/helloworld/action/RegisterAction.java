package helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import helloworld.model.Person;

/**
 * <p>Description:  </p>
 *
 * @author: huangshaolong
 * Date: 3/14/14
 * Time: 2:48 PM
 * CopyRight com.tom.ule
 */
public class RegisterAction extends ActionSupport {

    private static final Logger LOG = LoggerFactory.getLogger(RegisterAction.class);
    private static final long serialVersionUID = -586215908805682523L;
    private Person personBean = new Person();

    @Override
    public String execute() throws Exception {
    LOG.info("RegisterAction executed ...");
        return SUCCESS;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }

    @Override
    public void validate() {

        if(personBean.getFirstName() ==null || personBean.getFirstName().length() == 0 ){
            addFieldError("personBean.firstName","First name is required");
        }
        if(personBean.getEmail() == null|| personBean.getEmail().length() == 0){
            addFieldError("personBean.email","Email is required");
        }
        if(personBean.getAge() == null ||personBean.getAge() <18){
            addFieldError("personBean.age","You must be older than 18");
        }
    }


    public String throwException() throws Exception {
        try {
            throw new Exception();
        }catch (Exception e){
            throw new Exception(e.getCause());
        }
    }



}
