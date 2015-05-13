package tdddojo;

/**
 * Created by wbzhao on 15/5/13.
 */
public class Mommy {

    private static String VOWEL_REGEX = "[aeiouAEIOU]";

    public static String mommify(String input) {
        if (vowelPercentageMoreThan30Percent(input))
            return input.replaceAll(VOWEL_REGEX, "mommy");
        return input;
    }

    private static boolean vowelPercentageMoreThan30Percent(String input) {
        if (vowelPercentageOf(input) > 0.3)
            return true;
        return false;
    }

    private static double vowelPercentageOf(String input) {
        return (double)vowelCount(input) / input.length();
    }

    private static int vowelCount(String input) {
        String[] vowelSplit = input.split(VOWEL_REGEX, -1);
        return vowelSplit.length - 1;
    }
}
