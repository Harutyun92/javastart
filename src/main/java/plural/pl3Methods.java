package plural;

public class pl3Methods {
    public static void main(String[] args) {

        pl3Methods m = new pl3Methods();
        m.showSum(5, 2, 4);
        System.out.println("Im back");
    }

    void showSum(int x, int y, int count) {

        if (count < 1)
            return;

        int sum = x + y;
        for (int i = 0; i < count; i++) {
            System.out.println(sum);
            return;
        }
    }
}
