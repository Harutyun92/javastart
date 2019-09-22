package pl.sda.javastart.aaJavaStart.aStatic.Tablice;

public class Comapny {
    public static void main(String[] args) {
        Employe[] employe=new Employe[10];
        employe[0]=new Employe("Jan","kowalski",222);
        employe[1]=new Employe("Adam","Nowak",333);
        employe[2]=new Employe("Damian","stoch",444);
        employe[0].setFirstName("Kuba");  // zmienilismy imie na Kuba
        System.out.println(employe[0].getFirstName()+employe[0].getLastName()+employe[2].getSalary());
        System.out.println("Wielkosc tablicy ");
        int employeSize=employe.length;
        System.out.println(employeSize);
    }
}
