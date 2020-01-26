/*
* LC - 1281 : To identify product and sum of digits in an integer and then return the difference
*/
public class LC_1281_Subtract_ProdnSum {
	public static void main(String args[]){
		int product=1, sum=0, n=234;
        
        while (n > 0){
            product = product * (n%10);
            sum = sum + (n%10);
            n= n/10;
        }

        System.out.println(product - sum);
	}
}