package codingWars.LaczenieTablic;

public class LiczenieSamoglosek {
    public static void main(String[] args) {
        System.out.println(getCount("aleJaja"));
        System.out.println(getCount1("fawfeffaaeee"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }


    public static int getCount1(String str) {
        return (int) str.chars()
                .mapToObj(i -> (char) i)
                .filter(i -> "aeiou"
                        .contains(String.valueOf(i)))
                .count();
    }
}