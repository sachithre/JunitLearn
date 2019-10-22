
public class StringHelper {
	
	//input AACD --> output CD
	//input ACD  --> output CD
	//input CDAF --> output CDAF
	//input CDAA --> output CDAA
	//input CDFG --> output CDFG
	public String truncateAInFirst2Positions(String str) {
		if(str.length()<=2)
			return str.replaceAll("A", "");
		
		String first2Chars = str.substring(0,2);
		String stringMinusFirst2Chars = str.substring(2);
		
		return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
	}

	public boolean areFirstAndLastTwoCharactersTheSame(String str) {
		if(str.length()<=1)
			return false;
		if(str.length()==2)
			return true;
		
		String first2Chars = str.substring(0,2);
		
		String last2Chars = str.substring(str.length()-2);
		
		return first2Chars.equals(last2Chars);
	}
	
}
