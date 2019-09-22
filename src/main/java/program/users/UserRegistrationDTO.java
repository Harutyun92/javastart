package program.users;

import lombok.Data;

@Data   // mozna zamiast get i set, kostruktor itp
public class UserRegistrationDTO { //DATA TRANSFER OBJECT - słuzy do przesylania danych
    private String firstName;
    private String lastName;
    private String eMail;
    private String birthDate; //TODO LocalDate zamiast Stringa
    private String pesel;
    private String phone;
    private String password;
    private String city;
    private String country;
    private String street;
    private String zipCode;
    private boolean preferEmails;
}
