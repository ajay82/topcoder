// Qn: http://community.topcoder.com/stat?c=problem_statement&pm=13041&rd=15845
// An: http://apps.topcoder.com/wiki/display/tc/SRM+612

public class EmoticonsDiv2{
	public static void main(String args[]){
		System.out.println("EmoticonsDiv2..");
		int[] ipArray = {2,6,11,16,1000};
		for(int i=0;i<ipArray.length;i++){
			System.out.println("");
			System.out.println("Expected smiley count: " + ipArray[i]);
			System.out.println("Copy paste count: " + printSmiles(ipArray[i]));
		}
	}
	public static int printSmiles(int smiles){
		int counter=0;
		int res = smiles;
		outer:
		while(res>1){
			for(int i=2;i<=res;i++){
				if( (res%i)==0 && (res/i)%2 == 0){
					counter = counter + i;
					res = res/i;
					continue outer;
				}
			}
			counter = counter + res;
			res = res/res;
		}

		return counter;
	}
}