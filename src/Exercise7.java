public class Exercise7 {

    static String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


    public static void newPrintWeekDays() {
        for (String s : daysOfWeek) {
            String meal = switch (s) {
                case "Sunday" -> "pot roast";
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                case "Saturday" -> "pizza";
                default -> "nothing";
            };
            System.out.printf("We eat %s on %s%n", capitalize(meal), s);
        }
    }

    private static String capitalize(String input) {
        if (input.contains(" ")) {
            String firstChar1 = input.substring(0,1).toUpperCase();
            String firstChar2 = input.substring(input.indexOf(" ") +1 , input.indexOf(" ") + 2).toUpperCase();
            String restOfWord1 = input.substring(1, input.indexOf(" "));
            String restOfWord2 = input.substring(input.indexOf(" ") + 2);
            return firstChar1 + restOfWord1 + " " + firstChar2 + restOfWord2;
        } else {
            String firstChar1 = input.substring(0,1).toUpperCase();
            String restOfWord1 = input.substring(1);
            return firstChar1 + restOfWord1;
        }
    }

    public static void main(String[] args) {
        newPrintWeekDays();
    }
}


