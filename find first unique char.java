import java.util.HashMap;

public class test {

	public static void main(String[] args){
		String str = "GaEkForGeek";
		char c = findFirstChar(str);
		System.out.println(c);
	}
	
	public static char findFirstChar(String str){
		char res = str.charAt(0);
		HashMap<Character, Integer> countArray = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(countArray.containsKey(c)){
				countArray.put(c, countArray.get(c)+1);
			} else {
				countArray.put(c, 1);
			}
		}
		for(int i = 0; i < str.length(); i++){
			char temp = str.charAt(i);
			if(countArray.get(temp)==1){
				res = temp;
				break;
			}
		}
		return res;
	}
}