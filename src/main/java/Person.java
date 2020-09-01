//Class Person – Will be used to handle objects that will contain the fields that you will
//fill in in the form. You can define which attributes to use.


// förnamn
// efternamn
// mail


public class Person {

    private String fullName;
    private String nationality;
    private int age;

    public Person(String fullName, String nationality, int age) {
        this.fullName = fullName;
        this.nationality = nationality;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                '}';
    }
}
