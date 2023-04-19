import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {
        String line = "This order was replaced for QT3000!OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value" + m.group(0));
            System.out.println("Found value" + m.group(1));
            System.out.println("Found value" + m.group(2));
            System.out.println("Found value" + m.group(3));
        } else {
            System.out.println("No match");
        }


        String content = "<html><head<title>wtu</title></head>";
        List<String> srcList = new ArrayList<String>();
        Pattern p = Pattern.compile("<(img)(.*?)(>|></img>|/", Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(content);
        boolean hasPic = matcher.find();
        if (hasPic == true) {
            while (hasPic) {
                String group = matcher.group(2);
                System.out.println(group);
            }
        }
    }
}
