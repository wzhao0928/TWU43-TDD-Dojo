package tdddojo;

/**
 * Created by wbzhao on 15/5/13.
 */
public class Mommy {
    public static String mommify(String input) {
        String vowelRegex = "[aeiouAEIOU]";
        if (vowelPercentageMoreThan30Percent(input))
            return input.replaceAll(vowelRegex, "mommy");
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
        String vowelRegex = "[aeiouAEIOU]";
        String[] vowelSplit = input.split(vowelRegex);
        return vowelSplit.length - 1;
    }
}
