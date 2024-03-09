
import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

  public static void main(String[] args) {
    String string = "abccd";
    System.out.println(mostFrequentCharacter(string));
  }

  public static char mostFrequentCharacter(String string) {
    // Create a hash table to store the frequency of each character in the string.
    Map<Character, Integer> frequency = new HashMap<>();
    for (char ch : string.toCharArray()) {
      if (!frequency.containsKey(ch)) {
        frequency.put(ch, 0);
      }
      frequency.put(ch, frequency.get(ch) + 1);
    }

    // Find the character with the highest frequency.
    int maxFrequency = 0;
    char maxFrequencyChar = 0;
    for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
      if (entry.getValue() > maxFrequency) {
        maxFrequency = entry.getValue();
        maxFrequencyChar = entry.getKey();
      }
    }
    frequency.forEach((k,v)->System.out.println(k+":"+v));

    // If there are several characters with the same highest frequency, return the one that is smallest in lexicographical order.
    return maxFrequencyChar;
  }
}
