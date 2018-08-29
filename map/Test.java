package map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public Test(){

	}


	public void countWords(){

		System.out.println("Please insert the sentence to analyse. The output will show the number of times each word appears in the sentence.");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		String[] words_array = sentence.split("\\s+");

		int counter;
		Map<String, Integer> map = new HashMap<>();

		for(String word_in : words_array){
			
			if(map.containsKey(word_in)){
				counter = map.get(word_in);
				map.put(word_in, counter + 1);
			}
			else {
				map.put(word_in, 1);
			}

		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
		
		scan.close();


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
