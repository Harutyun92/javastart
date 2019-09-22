package pl.sda.javastart.aaJavaStart.aStatic.Static;

public class zadanie {
    private static int studentNumber=0;
    private String firstName;
    private String lastName;
    private int index;

    public zadanie(String firstName, String lastName, int index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
        studentNumber++; // przy kazdym wywolaniu konstruktora liczba studentow zwiekszy sie o 1 czyli jak tworzyym nowy obiekt
    }

    public static int getStudentNumber() {
        return studentNumber;
    }

    public static void setStudentNumber(int studentNumber) {
        zadanie.studentNumber = studentNumber;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
