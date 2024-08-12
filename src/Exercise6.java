public class Exercise6 {

    static String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void newPrintWeekDays() {
        for (String s : daysOfWeek) {
            switch (s) {
                case "Sunday" -> System.out.println("We eat pot roast on Sunday");
                case "Monday" -> System.out.println("We eat spaghetti on Monday");
                case "Tuesday" -> System.out.println("We eat tacos on Tuesday");
                case "Wednesday" -> System.out.println("We eat chicken on Wednesday");
                case "Thursday" -> System.out.println("We eat meatloaf on Thursday");
                case "Friday" -> System.out.println("We eat hamburgers on Friday");
                case "Saturday" -> System.out.println("We eat pizza on Saturday");
                default -> System.out.println("She said hola como estas");
            }
        }
    }

    public static void main(String[] args) {
        newPrintWeekDays();
    }
}
