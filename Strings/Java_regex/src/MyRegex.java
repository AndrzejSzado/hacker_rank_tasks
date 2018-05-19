import java.util.Scanner;

public class MyRegex {
    private String digital = "(([0-1]?\\d{1,2})|([2]{1}[0-4]{1}[0-9]{1})|([2]{1}[5]{1}[0-5]{1}))";
    private String dot = "([.])";
    private String pattern = getDigital()+getDot()+getDigital()+getDot()+getDigital()+getDot()+getDigital();

    public String getDigital() {
        return digital;
    }

    public String getDot() {
        return dot;
    }

    public String getPattern() {
        return pattern;
    }
}
