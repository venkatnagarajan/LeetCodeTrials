/*
* LC771 - Given 2 strings (Jewels and Stones) identify how many chars of S are available in J
*/

public class LC_771_JewelsAndStones {
	public static void main (String args[]){
        String J = "aA";
		String S = "aaAAAbbBBB";
		int counter=0;
        // for each char in String S. i.e. for each stone check if they are present in String J
        for (char c: S.toCharArray()){
            if(J.contains(String.valueOf(c))) counter++;
        }
        System.out.println(counter);
	}
}