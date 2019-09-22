package pl.sda.javastart.aaJavaStart.aStatic.String;
// metoda append z klasy String , mozemy uzyc konkatenacji + , ale ze wzgledu na pamiec aplikacji lepsze sa metodty z klasy String
public class a {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
            builder.append(",");
        }
        String numbers = builder.toString();

        System.out.println(numbers);
    }
}
