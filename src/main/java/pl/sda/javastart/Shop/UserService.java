package pl.sda.javastart.Shop;

import java.util.ArrayList;
import java.util.List;

// robimy rejestracje
// zewnetrzny serwis , klasa kontener
public class UserService {
    private List<User> registeredUsers = new ArrayList<>();  // od razu w polu mozemy inicjaliszowac liste , dobra praktyka

    public boolean registration(String name, String password) { // sprawdzamy metoda , jesli jest juz takie konto o takich danych da nam false
        boolean notExist = registeredUsers.stream()     // sprawdzamy czy juz taki jest
                .map(User::getName)   // pobieramy name z usera
                .noneMatch(name::equals); //zwraca nam boolena , czy cos nie istnieje
        if (notExist) {
            User user = new User();   // tworzymy uzytkownika
            user.setName(name);   // nadajemy imie
            user.setPassword(password); // nadajemy haslo
            user.setId(getNextId());                // robimy id zeby nadawalo przy tworzeniu konta uzytkownika
            registeredUsers.add(user);  // wrzucamy naszego uzytkownika do kontenera
        }

        return notExist;
    }

    private Long getNextId() {   // piszemy metode na dawanie id dla kolejnych uzytkownikow , chcemy uzyskac ostatniego uzytkownika i dodac jeden
        Long id = registeredUsers.stream()
                .map(User::getId)
                .max(Long::compareTo)
                .orElse(0L);
        return ++id;  // zeby nam liczylo od 1
    }

    public boolean login(String name, String password) {   // piszemy metode na logowanie sie
        User user = registeredUsers.stream()
                .filter(u -> u.getName().equals(name) && u.getPassword().equals(password))
                .findAny()   // zwraca optionala
                .orElse(null);  // optional ma taka metode
        MainShop.user = user;
        return user != null;
    }
}
