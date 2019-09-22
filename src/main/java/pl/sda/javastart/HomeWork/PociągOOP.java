package pl.sda.javastart.HomeWork;

public class PociągOOP {
    public static void main(String[] args) {
        Wagon wagon=new Wagon(100,1,20,true);
        Pociąg pociag= new Pociąg(200,"PKP",30,2);
        System.out.println(pociag.toString());
    }
}
