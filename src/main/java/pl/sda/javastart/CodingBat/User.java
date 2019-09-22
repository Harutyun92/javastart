package pl.sda.javastart.CodingBat;


    class UserMenager {
        public static void main(String[] args) {
            User user = new User("Jan","Kowalski");
            System.out.println("Wybierz opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - wyświetl informację o użytkowniku");
            System.out.println("2 - modyfikuje dane użytkownika");

            int option = 2;
            if (option==0){
                System.out.println("BYE BYE");
            }else if (option==1){
                System.out.println("Użytkownik " + user.getFirstname() + user.getLastName());
            }else if (option==2){
               user.setFirstname("Marian ");
                user.setLastName("Nowak");
                System.out.println("Zmieniono dane użytkownika " + user.getFirstname() + user.getLastName());
            }
        }
    }

