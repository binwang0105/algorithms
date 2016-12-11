import java.util.HashMap;

public class test {

	public static void main(String[] args){
		String str1 = "GaEkForGeek";
		String str2 = "ABBCCCDDDDF";
		String str3 = "";
		String res = compressString(str3);
		System.out.println(res);
	}
	
	public static String compressString(String str){
		if(str == null || str.length() == 0)
			return str;
		
		if(str.length() == 1)
			return str+"1";
		
		StringBuilder stb = new StringBuilder(); //1
		char prev = str.charAt(0); //2
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			if(prev == str.charAt(i)){
				count++;
			} else {
				stb.append(prev);
				stb.append(count);
				count = 1;
			}
			prev = str.charAt(i);
			//if cur is the end  3
			if(i == str.length()-1){
				stb.append(prev);
				stb.append(count);
			}
		}
		return stb.toString();
	}
}