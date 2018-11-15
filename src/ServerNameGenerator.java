import java.lang.reflect.Method;

public class ServerNameGenerator {
    public static void main(String[] arg) {
        String randomHyphenated = randomElement(adjectives).toUpperCase() + "-" + randomElement(nouns).toUpperCase();
        System.out.println("Here is your server name: ");
        System.out.println(randomHyphenated);
    }

    static String[] adjectives = {"helpful", "guarded", "screeching", "odd", "straight", "sparkling", "lyrical", "material", "nappy", "unusual"};
    static String[] nouns = {"robin", "discovery", "song", "shoes", "property", "dust", "eggnog", "milk", "truck", "increase"};

    public static String randomElement(String[] arrayOfStrings) {
       return arrayOfStrings[MethodsExercises.randomWithRange(0,9)];
    }
}
