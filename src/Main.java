import java.util.*;



public class Main {
    public static void main(String[] args) {

        System.out.println("abccba is " + checkForPalindrome("abccba"));
        System.out.println("Was it a car or a cat I saw ? is " + checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(" is " + checkForPalindrome("I did, did I?"));
        System.out.println("Racecar  is " + checkForPalindrome("Racecar"));
        System.out.println("Don't node is " + checkForPalindrome("Don't node"));
        System.out.println("hello  is " + checkForPalindrome("hello "));

        System.out.println("abccba is " + checkForPalindrome2("abccba"));
        System.out.println("Was it a car or a cat I saw ? is " + checkForPalindrome2("Was it a car or a cat I saw ?"));
        System.out.println("I did, did I? is " + checkForPalindrome2("I did, did I?"));
        System.out.println("Racecar  is " + checkForPalindrome2("Racecar"));
        System.out.println("Don't node is " + checkForPalindrome2("Don't node"));
        System.out.println("hello  is " + checkForPalindrome2("hello "));
        toBinary(5);
        toBinary(25);
        toBinary(553);
    }

    public static boolean checkForPalindrome(String text) {
        text = text.toLowerCase(Locale.ROOT).replaceAll("[.,?'!_ -]", "");
        String[] letters = text.split("");
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        Stack<String> stack3 = new Stack<>();

        for (String letter : letters) {

            stack1.push(letter);
            stack3.push(letter);
        }
        for (String letter : letters) {

            stack2.push(stack1.pop());
        }
        return stack2.equals(stack3);
    }

    public static boolean checkForPalindrome2(String text) {
        text = text.toLowerCase(Locale.ROOT).replaceAll("[.,?'!_ -]", "");
        String[] letters = text.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (String letter : letters) {
            queue.offer(letter);
            stack.push(letter);

        }
        while (!queue.isEmpty()) {

            if (!queue.poll().equals(stack.pop())) {
                return false;
            }

        }

        return true;
    }
    public static void toBinary (int number){
        LinkedList <Integer>binary = new LinkedList<> ();
        while (number>0){

            binary.addFirst( number%2);
            number = ((int)Math.floor(number/2));

        }
        String result = "";
        for(int binar :binary){
            result+=  String.valueOf(binar);

        }
        System.out.println("Binary number is : "+result);

    }
}