/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * a method to find the common substring.
 */
public class ReclamationProject {
        /**
         *
         * @param a a given string
         * @param b a given string
         * @return The substring which both strings have in common
         */
    static String doit(final String a, final String b) {
        String s1 = a;
        String s2 = b;
        if (s1.length() > s2.length()) {
            String c = s1;
            s1 = s2;
            s2 = c;
        }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < s1.length(); i++) {
            for (int j = s1.length() - i; j > 0; j--) {
                for (int k = 0; k < s2.length() - j; k++) {
                    if (s1.regionMatches(i, s2, k, j) && j > r.length()) {
                        r = s1.substring(i, i + j);
                    }
                }
            }
        }
        return r;
    }
}
