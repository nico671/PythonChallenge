// class for finding unique characters within a string
// author: Nico Carbone
// date: 9/6/22

import java.util.HashMap;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;


public class FindUniqueCharacters {
  
    // counts each time a character appears in the string

    HashMap<Character, Integer> countRecurringCharacters(String input) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < input.length(); i ++) {
            if (map.containsKey(input.charAt(i))) {
                map.computeIfPresent(input.charAt(i), (k, v) -> v + 1);
            }
            else {
                map.put(input.charAt(i), 1);
            }
        }

        return map;
    }
    
    // gets all keys with a corresponding value, essentially a helper function to present our individual characters nicely
    public List<Object> getKeysFromValue(Map<?, ?> hm, Object value){

        List <Object>list = new ArrayList<Object>();
        
        for(Object o:hm.keySet()){
            if(hm.get(o).equals(value)) {
                list.add(o);
            }
        }
        return list;
      }

}