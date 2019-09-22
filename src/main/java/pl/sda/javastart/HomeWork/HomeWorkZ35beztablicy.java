package pl.sda.javastart.HomeWork;

public class HomeWorkZ35beztablicy {
    public static void main(String[] args) {
        tabliczka(6,8);
    }
    public static void tabliczka(int szerokosc,int wysokosc){
        for (int i = 1; i <= szerokosc; i++) {
            for (int j = 1; j <=wysokosc ; j++)
                System.out.print( i * j+"\t");

            System.out.println();
        }
    }
}
