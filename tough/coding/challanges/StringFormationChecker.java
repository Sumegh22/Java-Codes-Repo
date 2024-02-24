public class StringFormationChecker {
    public static void main(String[] args) {
        String s1 = "christopher williams";
        String s2 = "wrist";

        boolean canFormString = canFormString(s1, s2);

        if (canFormString) {
            System.out.println("String s2 can be formed using characters from String s1");
        } else {
            System.out.println("String s2 cannot be formed using characters from String s1");
        }
    }

    private static boolean canFormString(String s1, String s2) {
        // Create character frequency arrays for both strings
        int[] freqS1 = new int[256];
        int[] freqS2 = new int[256];

        // Populate frequency array for String s1
        for (char ch : s1.toCharArray()) {
            freqS1[ch]++;
        }

        // Populate frequency array for String s2
        for (char ch : s2.toCharArray()) {
            freqS2[ch]++;
        }

        // Check if each character in s2 is present in s1 with sufficient frequency
        for (char ch : s2.toCharArray()) {
            if (freqS1[ch] < freqS2[ch]) {
                return false;
            }
        }

        return true;
    }
}

