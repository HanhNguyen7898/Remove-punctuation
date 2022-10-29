import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter your sentence: "); 
		String sentence = scanner.nextLine();
		System.out.println(removePunctuation(sentence).toString());
	}

	
	public static StringBuilder removePunctuation(String sentence) {
		StringBuilder sb = new StringBuilder(); 
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) != '!' && sentence.charAt(i) != '"' && sentence.charAt(i) != '#' 
			&& sentence.charAt(i) != '$' && sentence.charAt(i) != '%' && sentence.charAt(i) != '&'
			&& sentence.charAt(i) != '\'' && sentence.charAt(i) != '('&& sentence.charAt(i) != ')' 
			&& sentence.charAt(i) != '*' && sentence.charAt(i) != '+' && sentence.charAt(i) != ','
			&& sentence.charAt(i) != '-' && sentence.charAt(i) != '.' && sentence.charAt(i) != '/') {
				sb.append(sentence.charAt(i));
			}
		}
		return sb;  
	}
}
