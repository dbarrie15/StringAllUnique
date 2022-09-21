package home.com;
public class StringAllUniqueCharMain
{
	public static void main(String[] args)
 {
	   System.out.println("Moose has all unique chars : " + hasAllUniquechars("Moose"));
 }
	
public static boolean hasAllUniquechars (String word) {
	
	
	 for(int index=0;index < word.length(); index ++)  {
		 
		 char c =word.charAt(index);
		 if(word.indexOf(c)!=word.lastIndexOf(c))
			 return false;
	 }
	
     return true;
}
}