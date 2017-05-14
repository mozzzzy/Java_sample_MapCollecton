import java.util.*;

public class MapCollectionTest{
  public static void main(String[] args){
    System.out.println("Map Collection Test program.");

    //create HashMap
    Map<String,String> hm1 = new HashMap<String, String>();

    //put value
    hm1.put("key1","value1");
    hm1.put("key3","value3");
    hm1.put("key4","value4");
    hm1.put("key2","value2"); //not Last node (Hash Map <-> TreeMap)

    //get value
    String value = hm1.get("key1");
    System.out.println("value of key1 is "+value);

    //get all value
    Set<String> keys = hm1.keySet();
    for(String eachKey: keys){
      System.out.println(eachKey+" : "+hm1.get(eachKey));
    }


  }
}
