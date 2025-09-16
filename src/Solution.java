//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 /*import java.util.*;

class Solution {
  public static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{3, 9, 1, 4, 7}));
    }
} */

/*import java.util.*;

class Solution {
  public static Map<String,Integer> wordCount(String text) {
        Map<String,Integer> map = new HashMap<>();
        for (String word : text.toLowerCase().split("\\W+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("Hello hello world"));
    }
} */

/*import java.util.*;

class Solution {
  public static boolean isPalindrome(String s) {
       s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
       return s.equals(new StringBuilder(s).reverse().toString());
   }

   public static void main(String[] args) {
       System.out.println(isPalindrome("RaceCar"));
   }
} */

/* import java.util.*;

class Solution {
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("karat"));
    }
} */

/* class Solution {
 public static void main(String[] args) {

   for (int i = 0; i < 10; i++) {

            switch (i){
              case 0: System.out.println("Bliss"); break;
              case 3: System.out.println("Fizz"); break;
              case 5: System.out.println("Buzz"); break;
              case 6: System.out.println("Fizz"); break;
              case 9: System.out.println("Bump"); break;
              default: System.out.println(i); break;

            }

    }
  }
}  */

/* import java.util.*;
class Solution {
    public static Map<String, Integer> countWords(String text) {
        text = text.toLowerCase();
        String[] words = text.split("\\s+");
        Map<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue;
            int numberOfCharacters = word.length();
            counts.put(word, counts.getOrDefault(word, 0) + 1);
            System.out.println(word + " Number of chars: "+numberOfCharacters);

        }

        return counts;
    }
    public static void main(String[] args) {
        String input = "Dog cat dog DOG bird cat";
        System.out.println(countWords(input));
    }
} */

/* import java.util.*;
class Solution {

  public static void main(String[] args) {
    String word = "Today is a great day";
    String upperCase = word.toUpperCase();
    String lowerCase =  word.toLowerCase();
    System.out.println("original word: " + word);
    System.out.println("Upper Case word: "+ upperCase);
    System.out.println("Lower Case word: "+ lowerCase);
  }

} */

//import java.util.*;
//class Solution{
//  static void fibonacci(int n) {
//    int a=0, b=1;
//    for (int i=0; i<n; i++){
//      System.out.println(a + " ");
//      int temp = a+b;
//      a=b; b=temp;
//    }
//  }
//
//  public static void main(String[] args) {
//        fibonacci(7);
//    }
//}

//import java.util.*;
//
//class Solution {
//    // Helper: check if search is subsequence of name
//    public static boolean isSubsequence(String name, String search) {
//        int i = 0, j = 0;
//        while (i < name.length() && j < search.length()) {
//            if (name.charAt(i) == search.charAt(j)) {
//                j++; // move in search
//            }
//            i++; // always move in name
//        }
//        return j == search.length(); // all search chars found in order
//    }
//
//    // Main autocomplete method
//    public static int autocomplete(List<String> names, String search) {
//        int count = 0;
//        for (String name : names) {
//            if (isSubsequence(name.toLowerCase(), search.toLowerCase())) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Alice", "Alicia", "Bob", "Charlie", "Alfred");
//        String search = "al";
//
//        System.out.println("Matches: " + autocomplete(names, search));
//    }
//}

class Solution {
        //upperCase and lowerCase
        public static void main(String[] args) {
            String words = "Today is a great day";
            String upperCase = words.toUpperCase();
            String lowerCase =  words.toLowerCase();
            System.out.println("original word: " + words);
            System.out.println("Upper Case word: "+ upperCase);
            System.out.println("Lower Case word: "+ lowerCase);
            // split String into Array
            String[] wordsArray = words.split("\\s+");
            System.out.println("Split strings into Array ");
            System.out.println("The words are: ");
            for (String word: wordsArray){
                System.out.println(word + "");
            }
            //Concatenate strings
            String part1 = "Hello";
            String part2 = "World";
            String concat = part1.concat(part2);
            System.out.println("Concatenating strings ");
            System.out.println(concat);

            //Replace string
            String original = "I love programming in Python";
            String replacedString = original.replace("Python","Java");
            System.out.println("Replacing strings ");
            System.out.println("Original String: " + original);
            System.out.println("Replaced string: " + replacedString);

            //Reverse string
            String orig = ("Hello");
            StringBuilder sb = new StringBuilder(orig);
            String reversed = sb.reverse().toString();
            System.out.println("Reversing a string: ");
            System.out.println("Original string: " + orig);
            System.out.println("Reversed string: " + reversed);

        }

    }