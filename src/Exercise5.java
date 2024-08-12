public class Exercise5 {

    static String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    static String[] foodForDays = {"rot roast", "spaghetti", "tacos", "chicken", "meatloaf", "hamburgers", "pizza"};

    public static void printDaStuff() {
        for (int i = 0; i < 7; i++) {
            System.out.printf("We eat %s on %s%n", foodForDays[i], daysOfWeek[i]);
        }
    }

    public static void main(String[] args) {
        printDaStuff();
    }

}
