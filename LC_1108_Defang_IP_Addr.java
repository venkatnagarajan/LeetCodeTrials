public class LC_1108_Defang_IP_Addr{
	public static void main(String args[]){
		String inputAddress = "1.2.3.4";
		String address = inputAddress;
		//if(address == "") return null;
        
		
		// Option#1 - by checking the index of . and replacing with [.] using StringBuffer
		int index=0,iter=0;
        // A string buffer to hold the final string
		StringBuffer str=new StringBuffer();
        
        while(address.indexOf(".") > 0 ){
            // identify the index of '.'
			index = address.indexOf(".");
            // don't prefix [.] for first iteration
			if (iter !=0) {
                str = str.append("[.]");
            }
            str = str.append(address.substring(0, index));
            
            address = address.substring(index+1);
            //System.out.println (address);
            iter++;
        }
        str.append("[.]").append(address);
        System.out.println(str.toString());
		
		
		// Option#2 - by using String.replaceAll (regex, inputStr)
		String address2 = inputAddress;
		System.out.println(address2.replaceAll("[.]","[.]"));
		
		// Option#3 - search char wise and append [.] instead of . while putting into new string
		String address3 = inputAddress;
		StringBuffer sbr = new StringBuffer();
		for(char c : address3.toCharArray()){
			if(c=='.') sbr = sbr.append("[.]");
			else sbr = sbr.append(c);
		}
		System.out.println(sbr.toString());
	}
}
