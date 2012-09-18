
package palindrome;


public class PalindromeCaseDep extends Palindrome 
{
    @Override
    public boolean isPalindrome(String str) 
    {
        int leng;
	int fromBeg;
	int fromEnd;
	boolean result;
	
	fromEnd = str.length() - 1;
	fromBeg = 0;
	result = true;
	
	while(fromEnd > fromBeg && result == true)
	{
		if(Character.isLetter(str.charAt(fromEnd)) == false)
		{
			fromEnd = fromEnd - 1;
		}
	
		if(Character.isLetter(str.charAt(fromBeg)) == false)
		{
			fromBeg = fromBeg + 1;
		}
		
		if(Character.isLetter(str.charAt(fromEnd)) != false && Character.isLetter(str.charAt(fromBeg)) != false)
		{
			if(str.charAt(fromEnd) != str.charAt(fromBeg))
			{
				result = false;
			}
			
			else
			{
				fromEnd = fromEnd-1;
				fromBeg = fromBeg+1;
			}
		}
	}
	
	return result;
    }
}
