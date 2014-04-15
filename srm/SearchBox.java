// Qn: http://community.topcoder.com/stat?c=problem_statement&pm=8019&rd=10773
// Ans: http://community.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm361

public class SearchBox{
	public static void main(String args[]){
		System.out.println("Search box ..");

		String text = "We dont need no education";
		String search = "ed";
		String wholeWord = "N";
		int start = 13;

		//String text = "All in all youre just another brick in the wall";
		//String search = "just";
		//String wholeWord = "Y";
		//int start = 17;

		System.out.println("Solution : " + find(text, search, wholeWord, start));
	}

	public static int find(String text, String search, String wholeWord, int start){

		if(start >= text.length()-search.length()){
			return -1;
		}
		int i;
		int j;

		outer:
		for(i=start; i<(text.length()-search.length()); i++){
			int k =i;
			for(j=0;j<search.length(); j++){				
				if(text.charAt(k) != search.charAt(j)){
					continue outer;					
				}
				k++;
			}
			if(wholeWord.equals("Y")){	
				if(i+search.length()<text.length()){
					if(text.charAt(i+search.length())!= ' ')
						return -1;
				}
				if(i != 0){
					if(text.charAt(i-1) != ' ')
						return -1;
				}
			}
			return i;
		}
		return -1;
	}
}