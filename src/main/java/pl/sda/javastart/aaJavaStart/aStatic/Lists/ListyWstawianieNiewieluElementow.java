package pl.sda.javastart.aaJavaStart.aStatic.Lists;

import java.util.List;
//Java 9 wprowadza tzw. collections factory methods, czyli specjalne metody, przeznaczone przede wszystkim do tworzenia niewielkich list,
// gdy znamy elementy, które mają się w niej znaleźć. Od teraz w celu utworzenia listy można zapisać:

public class ListyWstawianieNiewieluElementow {
//   public static void main(String[] args) {
//       List<Integer> numbers = List.of(5, 10, 15);
//       for (Integer num : numbers) {
//           System.out.println(num);
//       }
//   }
}
 //Bardzo ważną kwestią przy tworzeniu list z użyciem powyższej metody jest to, że lista taka jest niemodyfikowalna, czyli nie możemy
// do niej ani dodawać, ani usuwać z niej elementów. Jeśli spróbujemy to zrobić to otrzymamy wyjątek UnsupportedOperationException.