/**Author: Matt Busch
 * Date: 11/26/2017
 * Purpose: To make a person using the Person class
 */
public class PersonDriver {
    /**Purpose: to set up a Person class and compare it to another Person class
     *
     * @param args
     */
    public static void main(String [] args) {
        Person talha = new Person();
        talha.setName("Talha");
        talha.setAge(19);
        System.out.println(talha.getName());
        System.out.println(talha.getAge());
        Person matt = new Person("Matt", 21);
        if(talha.getName().equals(matt.getName())) {
            System.out.println("The two people have the same name");
        } else {
            System.out.println("The two people do not have the same name");
        }
        if (talha.getAge() > matt.getAge()) {
            System.out.println("Talha is older than Matt");
        } else if (talha.getAge() == matt.getAge()) {
            System.out.println("Talha and Matt are the same age");
        } else {
            System.out.println("Matt is older than Talha");
        }

    }
}
