package pl.sda.javastart.aaJavaStart.aStatic.Interface;
//W Javie istnieje także pojęcie interfejsów. Można o nich powiedzieć, że są klasami w pełni abstrakcyjnymi - mogą posiadać
// jedynie publiczne metody abstrakcyjne oraz stałe.

//ZADANIE- program potrafiący wyliczyć pole i obwód figur geometrycznych. Stworzymy interfejs Shape zawierający dwie metody
// calculatePerimeter() (oblicz obwód) oraz calculateArea() (oblicz pole). Dla wygody dodajmy często używaną wartość
// PI - korzysta z niej kilka kształtów.
interface Shape {
    public static final double PI = 3.14;

    // metody są domyślnie publiczne i abstrakcyjne , mozna zapisac luz ominac public w double
    double calculateArea();

    public double calculatePerimeter();
}

//Interfejsy traktuj jako definiowanie kontraktów. W naszym przypadku kontrakt brzmi "każdy kształt musi mieć możliwość obliczenia
// pola i obwodu". Jeśli tworzysz klasę, która implementuje interfejs Shape, to klasa taka musi spełniać ten kontrakt poprzez
// implementowanie wszystkich metod abstrakcyjnych interfejsu. Interfejsy są użyteczne jeżeli korzystamy z polimorfizmu, same w
// sobie nie niosą większej wartośc