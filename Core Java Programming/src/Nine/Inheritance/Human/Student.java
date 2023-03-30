package Nine.Inheritance.Human;


import Nine.Inheritance.Animal.Cat;

public class Student extends Person{
    private String indexNumber;
    private Cat cat;

    public Student() {
        super();
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}
