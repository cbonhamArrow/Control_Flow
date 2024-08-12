public class Exercise3 {

    public static void outputDaysOfWeek() {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int s = 0; s < daysOfWeek.length; s++) {
            if ((s % 2) == 1) {
                System.out.println(daysOfWeek[s].toUpperCase());
            } else {
                System.out.println(daysOfWeek[s]);
            }
        }
    }

    public static void main(String[] args) {
        outputDaysOfWeek();
    }
}
