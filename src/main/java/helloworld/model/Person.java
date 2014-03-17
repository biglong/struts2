package helloworld.model;

/**
 * <p>Description:  </p>
 *
 * @author: huangshaolong
 * Date: 3/14/14
 * Time: 2:40 PM
 * CopyRight com.tom.ule
 */
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private Integer phoneNumber;
    private String sport;
    private String residency;
    private boolean over21;
    private String [] carModels;

    public String[] getCarModels() {
        return carModels;
    }

    public void setCarModels(String[] carModels) {
        this.carModels = carModels;
    }

    public boolean isOver21() {
        return over21;
    }

    public void setOver21(boolean over21) {
        this.over21 = over21;
    }

    public String getResidency() {
        return residency;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
