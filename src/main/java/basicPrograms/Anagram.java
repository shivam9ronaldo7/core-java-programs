package basicPrograms;

public class Anagram {

    public static void main(String[] args) {

        String givenString = "aba";
        StringBuilder anagram = new StringBuilder();
        for (int i = givenString.length() - 1; i >= 0; --i) {
            anagram.append(givenString.charAt(i));
        }
        if (givenString.contentEquals(anagram)) {
            System.out.println(givenString + " is anagram");
        } else {
            System.out.println(givenString + " is not anagram");
        }
    }

}