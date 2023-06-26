package Assignment1;

public class Problem1 {
    public static void main(String[] args) {
        // Problem 1
        String name = "Hi\uD83D\uDC4B, my name is \"\u121a\u12aa\u12a4\u1208\".";
        System.out.println(name);

        //Problem 2
        System.out.println(name.length());// the length is 24 because the emoji has 2 unicodes and my name also have 4 unicodes, each character in my name have 1 unicode. The rest is spaces, alphabets, and simi colon
    }

}