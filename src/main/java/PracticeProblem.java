import java.util.HashMap;

public class PracticeProblem {

public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {

	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
    for (int i = 0; i < names.length; i++) {
        map.put(names[i], ages[i]);
    }
    
    return map;
}

public static HashMap<String, Integer> increaseAge(HashMap<String, Integer> map, String name) {

    if (map.containsKey(name)) {
        map.put(name, map.get(name) + 1);
    }
    return map;
    }
public static HashMap<String, Integer> replaceName(HashMap<String, Integer> map, String name, String str) {
    if (map.containsKey(name)) {
        int age = map.get(name);
        map.remove(name);
        map.put(str, age);
    }
    return map;

}
}