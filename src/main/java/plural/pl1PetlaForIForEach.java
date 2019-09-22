package plural;

public class pl1PetlaForIForEach {
    public static void main(String[] args) {

        float sum = 0.0f;
        float sum1 = 0.0f;

        // petla for
        float[] theVals = {10.0f, 20.0f, 30.0f};
        for (int i = 0; i < theVals.length; i++) {
            sum = sum + theVals[i];
        }
        System.out.println(sum);


        //petla for each
        float[] theVals1 = {10.0f, 20.0f, 30.0f};
        for (float v : theVals1) {
            sum1 = sum1 + v;
        }
        System.out.println(sum1);
    }
}
