package course;

public class Stringtest {

	public static void main(String[] args) {
		
		// This class is for string functions
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(vect[1]);	
		
		System.out.println("Lowercase" + s01);
	}

}
