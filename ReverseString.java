package jun11;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello world from Java";
        
        
        String[] words = input.split(" ");
        
        
        String reversedString = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i];
            if (i != 0) {
                reversedString += " ";
            }
        }
        
        System.out.println("Original string: " + input);
        System.out.println("Reversed words string: " + reversedString);
    }
}
