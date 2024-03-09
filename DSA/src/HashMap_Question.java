import java.util.HashMap;
import java.util.Map;

public class HashMap_Question {
  private static String fun(String str, Map<String, Object> map ){
    while("java.util.HashMap" == map.get(str).getClass().getName()){
      map = (HashMap)map.get(str);
    }
    int i=2;
    System.out.println(i);
    System.out.println(map.get(str).getClass().getName());
    return (String)map.get(str);
  }

  public static void main(String[] args) {
    Map<String, Object> map1 = new HashMap<>();
    Map<String, Object> map2 = new HashMap<>();
    Map<String, Object> map3 = new HashMap<>();
    map1.put("A","a");
    map1.put("B", map2);
    map1.put("C", "1");

    map2.put("A","a");
    map2.put("B", "b");


    System.out.println(fun("C", map1));
  }
}