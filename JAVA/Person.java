public class Person {

    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = (age < 0 ||age > 100)? 0: age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        String fullName = "";
        if (!this.firstName.equals("") && !this.lastName.equals("")) {
            fullName = " ";
        }
        return this.firstName + fullName + this.lastName;
    }
    public static void main(String[] args) {
        Person person = new Person();
	    person.setFirstName("");
	    person.setLastName("");
	    person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());
    }
}
