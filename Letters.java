import java.util.Scanner;
import java.util.TreeMap;

public class Letters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		sc.close();
		
		char[] array = line.toCharArray();
		char[] array2 = new char[array.length];
		int i = 0;
		TreeMap<Character, Integer> map = new TreeMap<>();
		
		for(char c : array) {
			int ascii = (int) c;
			if(ascii >= 65 && ascii <= 90)
				ascii += 32;
			char d = (char) ascii;
			array2[i] = d;
			i++;
		}
		
		for(char d : array2) {
			int ascii = (int) d;
			if(ascii >= 97 && ascii <= 122) {
				char c = (char) ascii;
				if(map.containsKey(c)) {
					int key = map.get(c);
					key++;
					map.put(c, key);
				}else {
					map.put(c, 1);
				}
			}
		}
		
		System.out.println("Counted letters:");
		for(char el : map.keySet()) {
			System.out.println(el+"="+map.get(el));
		}
		
	}
	
}
