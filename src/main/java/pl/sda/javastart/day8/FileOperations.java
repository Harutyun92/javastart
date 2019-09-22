package pl.sda.javastart.day8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
    private static final String PATH_TO_FILE = "C:\\zadanie\\wiersz.txt";

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(PATH_TO_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);  //piszemy prawa strone i zaznaczamy ctrl alt v i pojawi sie lewa strona

            String line;
            List<String> lines = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);   // przez ta petle linijka po linijce odczytujemy plik az nie dojdziemy do ostatniej linijki , null po to jest
            }

            printCapitalized(lines);
        } catch (IOException e) {                  // piszemy exception ktory nam wyskoczyl jako blad w catch
            System.out.println(e.getMessage());         // napisze nam message ktory jest w programie zapisany automatycznie
            //ABSOLUTNIE NIGDY NIE ZOSTAWIAJCIE PUSTEGO CATCH!!!
        }
    }

    private static void printCapitalized(List<String> lines) {
        for (String s : lines) {      // dajemy petle for each i chcemy zeby kazda linijka zaczynala sie z duzej litery
            String c = String.valueOf(s.charAt(0));  //chcemy dostac pierwsza literke
            String upperCased=c.toUpperCase();   // pierwsza litere zamienia nam na duza
            String restOfLine= s.substring(1);  // reszte dodaje to pierwszej litery , czyli np bocian , b->B i ocian dodaje do B
            System.out.println(upperCased+restOfLine);

        }
    }

}