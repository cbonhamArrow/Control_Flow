import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise9 {

    static String addressList = """
            12345 First Street, First City, AA 90210
            22222 Second Street, Second City, BB 22222
            33333 Third Street, Third City, CC 33333
            44444 Fourth Street, Fourth City, DD 44444
            55555 Fifth Street, Fifth City, EE 55555
            66666 Sixth Street, Sixth City, FF 66666
            77777 Seventh Street, Seventh City, GG 77777
            88888 Eighth Street, Eighth City, HH 88888
            99999 Ninth Street, Ninth City, II 99999
            00000 Tenth Street, Tenth City, JJ 00000""";

    static String regex = "(?<buildingNumber>\\d{5})\\s(?<streetName>\\w+\\s\\w+),\\s(?<city>\\w+\\s\\w+),\\s(?<state>\\w{2})\\s(?<postalCode>\\d{5})";

    static Pattern pattern = Pattern.compile(regex);
    static Matcher matcher = pattern.matcher(addressList);

    public static void parseAddress() {
        for (int i = 0; i < 10; i++) {
            matcher.find();
            System.out.println(matcher.group("buildingNumber"));
            System.out.println(matcher.group("streetName"));
            System.out.println(matcher.group("city"));
            System.out.println(matcher.group("state"));
            System.out.println(matcher.group("postalCode"));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        parseAddress();
    }
}
