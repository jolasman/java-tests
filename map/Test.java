package map;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public Test(){
		
	}
	
	public void test_map(){
		
		String initial_string = "ola eu tenho coisas e eu tenho cenas e coisas .";
		String[] words = initial_string.split("\\s+");
		int counter;
		Map<String, Integer> map = new HashMap<>();
		
		for(String word_in : words){
			
			if(map.containsKey(word_in)){
				counter = map.get(word_in);
				map.put(word_in, counter + 1);
			}
			else{
				map.put(word_in, 1);
			}
		}	
		
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());  	
		}
		
		
		
	}

}
