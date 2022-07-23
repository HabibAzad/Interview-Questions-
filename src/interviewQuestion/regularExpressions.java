package interviewQuestion;

public class regularExpressions {

	public static void main(String[] args) {
		
		String text="Hello991231Worlds";
		
		String afterReplaced=text.replaceAll("[0-9]", "");
		System.out.println(afterReplaced);
		
		String text1="AllThisLetter";
		//Remove all uper cases letter
		
		text1.replaceAll("[A-Z]", "");
		String text1Replaced=text1.replaceAll("[A-Z]", "");
		System.out.println(text1Replaced);

		//keep the alphabet letter only
		
		String onlyAlphabet=text.replaceAll("[^a-zA-Z]", "");
		System.out.println(onlyAlphabet);
		
		
	        String text2 = "Hello991231Worlds";
	        // Replace numbers with only 1 single space.    
	        String replaced = text.replaceAll("[0-9]", " ").replaceAll("\\s+", " ");
	        System.out.println(replaced);
	    }
		
	}


