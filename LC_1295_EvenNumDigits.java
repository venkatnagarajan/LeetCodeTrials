/*
* LC 1295 : Identify the numbers from an array that have even number of digits
*/

public class LC_1295_EvenNumDigits {
	public static void main (String args[]){
        int[] nums = {123, 3456, 12, 33345, 56};
		// var to hold the count of numbers that have even number of digits 
        int counter=0;
        for (int i : nums){
            if(hasEvenNumDigits(i)) counter++;
        }
        System.out.println(counter);

	}
	
    // method to identify if a number has even number of digits
    private static boolean hasEvenNumDigits(int n){
        // var to hold the number of digits
        int iter=0;
        while(n>0){
            n = n/10;
            iter++;
        }
        // to identify if number of digits are even
        if (iter%2 ==0) return true;
        return false;
    }	
}

