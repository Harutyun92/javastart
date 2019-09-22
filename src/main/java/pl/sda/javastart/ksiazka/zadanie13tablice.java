package pl.sda.javastart.ksiazka;

public class zadanie13tablice {
    public static void main(String[] args) {
        System.out.println("program ktory w 10 elementowej tablicy o nazwie dane umieszcza liczby od 0-9");
        int n=10;
        int[]dane=new int[n];
        for (int i = 0; i <dane.length ; i++) {
            dane[i]=i;
            System.out.println("dane["+i+"]= "+i);

        }
        System.out.println("program ktory w 10 elementowej tablicy o nazwie dane umieszcza libczy od 9-0");
        int m=10;
        int[]dane1=new int[m];
        for (int i = 0; i <dane.length ; i++) {
            dane1[i]=m-1-i;
            System.out.println("dane["+i+"]= "+dane1[i]);

        }
    }
}
