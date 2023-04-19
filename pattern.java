
public class pattern {
    public static boolean validatePhoneNumber(String phoneNumber) {
        String pattern = "^[1][35789]\\d{9}";

        return phoneNumber.matches(pattern);
    }

    public static void main(String args) {

        boolean result = validatePhoneNumber("10086");
        System.out.println(result);

        String title = "<title>wtu</title>";

        String pattern = "<.*?>";

        title.replaceAll(pattern, "");
        System.out.println(title.replaceAll(pattern, ""));
    }
}
