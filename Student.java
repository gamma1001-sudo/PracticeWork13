public class Student {

    int idNumber;

    String name;

    public Student(int idNumber, String name) {

        this.idNumber = idNumber;

        this.name = name;
    }

    @Override
    public String toString() {

        return idNumber + " - " + name;
    }
}