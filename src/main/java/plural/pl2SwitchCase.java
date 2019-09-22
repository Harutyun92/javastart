package plural;

public class pl2SwitchCase {
    public static void main(String[] args) {

        int iVal = 10;

        switch (iVal % 2) {

            case 0:
                System.out.print(iVal + " is even");
                //       System.out.println(" is even");
                break;   // jak nie wstawimy break to sie nie zatrzyma jak cos bedzie prawda i poleci dalej i wyswietli wszystko

            case 1:
                System.out.print(iVal);
                System.out.println(" is odd");
                break;

            default:
                System.out.println("oops it broke");
                break;
        }

    }
}
