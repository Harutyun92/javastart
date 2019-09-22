package program.users;

public class UserContextHolder { //info o zalogowanym
    private static String email;

    public static void logUserIn(UserLoginDTO dto){
        email = dto.getEmail();
    }
}
