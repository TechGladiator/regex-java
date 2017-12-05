import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Reggie {
  public static void main(String[] args) {
    Console console = System.console();
    // Your amazing code below
    String zipCode = "90210";
    if (zipCode.matches("^\\d{5}(-\\d{4})?$")) {
      System.out.printf("%s is a valid zip code%n", zipCode);
    } else {
      System.out.printf("%s is NOT a valid zip code%n", zipCode);
    }
    String skills = "JavaScript, HTML, CSS, and Java";
    for (String skill : skills.split("\\W+(and\\W+)?")) {
      System.out.printf("Skill:  %s %n",
                        skill);
    }
  }
}