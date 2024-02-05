package PrommingStArCl;
public class RotateString {
    public static void main(String[] args) {
        String input = "hello"; //elloh
        char[] charArray = input.toCharArray();
        char firstChar = charArray[0];
        for (int i = 1; i < charArray.length; i++) {
            charArray[i - 1] = charArray[i];
        }
        charArray[charArray.length - 1] = firstChar;
        String output = new String(charArray);
        System.out.println(output);

        
        }
    }
