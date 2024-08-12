public class Exercise8 {

    static String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static int sumOfLetters(String[] input) {
        int sum = 0;
        for (String s : input) {
            sum += s.length();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfLetters(daysOfWeek));
    }


}
