//Question: http://community.topcoder.com/stat?c=problem_statement&pm=13094&rd=15849
//Answer: http://apps.topcoder.com/wiki/display/tc/SRM+616
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Arrays;
import java.lang.Integer;

public class ColorfulCoinsEasy{
    public static void main(String args[]){
    	int[] ip = {1, 5, 15, 90};
    	System.out.println("Checking for input " + Arrays.toString(ip));
    	System.out.println("Is possible " + isPossible(ip));
    }

    public static String isPossible(int[] input){
    	//Go through each value from max to twice max
    	int min= input[input.length-1];
    	int max = min *2;
    	min = min +1;    	
    	for(int j = min;j<max;j++){
    		Map<Integer, Integer> map = getMapInput(input);
    		int value = j;
    		for(int i=input.length-1; i>=0;i--){
    			int div = value / input[i];
    			map.put(input[i], div);
    			value = value % input[i];
    		}
    		if (checkSetHashNonZeroAndUnique(map.values()) == true){
    			return "isPossible";
    		}
    	}
    	return "notPissible";
    }

    public static Map<Integer, Integer> getMapInput(int input[]){
    	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    	for(int i=0;i<input.length;i++){
    		map.put(input[i],0);
    	}
    	return map;
    }

    public static boolean checkSetHashNonZeroAndUnique(Collection<Integer> set){
    	Integer[] ipArray = set.toArray(new Integer[0]);
    	Arrays.sort(ipArray);    
    	for(int j=0;j<ipArray.length-1;j++){
    		if(ipArray[j]==0){
    			return false;
    		}
    		if(ipArray[j]==ipArray[j+1]){
    			return false;
    		}
    	}
    	return true;
    }
}