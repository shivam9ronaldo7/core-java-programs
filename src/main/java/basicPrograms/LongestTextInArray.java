package basicPrograms;

public class LongestTextInArray {

    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "JavaScript", "C++", "Ruby"};
        String longestText = "";
        for (String text : arr) {
            if (text.length() > longestText.length()) {
                longestText = text;
            }
        }
        System.out.println("Longest text in array is: " + longestText);
    }

}
