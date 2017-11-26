/**Author: Matt Busch
 * Date: 11/26/2017
 * Purpose: To create a Person object to call upon in the PersonDriver class
 */
public class Person {
    private String name;
    private int age;

    /**Purpose: to construct the variables using default values without parameters
     *
     */
    public Person () {
        name = "John";
        age = 0;
    }

    /** Purpose: To construct the variables using parameters
     *
     * @param name
     * @param age
     */
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**Purpose: To get the name of the Person
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**Purpose: to set the name of the Person
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**Purpose: to get the age of the Person
     *
     * @return
     */
    public int getAge() {
        return this.age;
    }

    /**Purpose: to set the age of the Person
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**Purpose: to return the variables as strings
     *
     * @return
     */
    public String toString () {
        return "Person name is " + this.name + "\n Person age is " + this.age;
    }
}
