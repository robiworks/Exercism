public class PigLatinTranslator {
    String translate(String input) {
        input = input.toLowerCase();
        String output = "";
        String[] vowels = new String[] {"a", "e", "i", "o", "u", "xr", "yt"};
        String[] consonants = new String[] {"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        // Check if word begins with vowel prefix first
        for (String vowelPrefix : vowels) {
            if (input.startsWith(vowelPrefix)) {
                output = input + "ay";
                return output;
            }
        }
        // Check if word begins with consonant prefix
        for (String consonantPrefix : consonants) {
            if (input.startsWith(consonantPrefix)) {

            }
        }
        return output;
    }
}