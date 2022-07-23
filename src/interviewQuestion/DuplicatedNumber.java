package interviewQuestion;

import java.util.HashSet;

public class DuplicatedNumber {
	
	public static void main(String[] args) {
        String text = "dadralrlk";
        char[] arrChar = text.toCharArray();
        HashSet<Character> duplicatedList = new HashSet<>();
        for (int i = 0; i < arrChar.length; i++) {
            boolean isDuplicate = true;
            char toSearch = arrChar[i];
            if (duplicatedList.contains(toSearch)) {
                isDuplicate = false;
            } else {
                for (int j = i + 1; j < arrChar.length; j++) {
                    char toCheckWith = arrChar[j];
                    if (toSearch == toCheckWith) {
                        duplicatedList.add(toSearch);
                        isDuplicate = true;
                    }
                }
            }
            if (!isDuplicate) {
                System.out.println("Found is :) " + toSearch);
                break;
            }
        }
    }

}


	

