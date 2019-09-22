package pl.sda.javastart.aaJavaStart.aStatic.String;

// wbudowane metody w klasie String
public class StringsMethods {
    public static void main(String[] args) {
        String words = "  Jeden dwa trzy cztery pięć sześć siedem ";
        String sub1 = words.substring(2, 7);
        String sub2 = words.replaceAll("dwa", "hehe");
        String sub3 = words.trim();
        char charat = words.charAt(2);

        System.out.println(words);
        System.out.println("words.substring(2, 7)");
        System.out.println(sub1);
        System.out.println("words.replaceAll(\"dwa\", \"hehe\")");
        System.out.println(sub2);
        System.out.println("words.trim()");
        System.out.println(sub3);
        System.out.println("words.charAt(2)");  // zwraca char z podanego indeksu 2 zaczynami liczyc od 0
        System.out.println(charat);

        String original = "Ala ma kota";
        original.replaceAll("Ala", "Kasia");  // nie zmieni napisu Ala na Kasia bo musimy przypisca do nowej referencji lub tej ktora chcemy nadpisac
        System.out.println(original);

        String originall = "Ala ma kota";
        originall = originall.replaceAll("Ala", "Kasia");
        System.out.println(originall);
    }
}