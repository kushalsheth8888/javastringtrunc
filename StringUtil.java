
public class StringUtil {
	private static final String truncateValue = " ... (truncated) ... ";
	public static void main(String[] args) {
		System.out.println(truncate("123456789012345678901234567890",25));
		System.out.println(truncate("1234567890",5));
		System.out.println(truncate("123456789012345678901234567890",31));		
	}
	
	public static String truncate(String str,int maxLength){
		if(str.length() > maxLength && maxLength > 0 && str.length() > truncateValue.length() ){
			int strLength = maxLength - truncateValue.length();
			String startingStr = str.substring(0, (strLength/2)+(strLength%2));
			String endingStr = str.substring((str.length()-(strLength/2)), str.length());
			return startingStr+truncateValue+endingStr;
		}else 			
			return str;
		
	}
}
