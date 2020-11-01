/* this program encrypts capital letters, small letters, digits using caesar cipher
 String message is the message to be encrypted and key is the shift of cipher.
*/
public class caesarCipher
{
public static String encryptMessage(String message, int key)
	{ 
		int charVal , result =0;
		char[] resultArray = new char[message.length()];
		for(int i=0;i< message.length();i++)
		{
			charVal = (int) message.charAt(i);
			// Capital letters start at 65 in ascii code
			if(charVal >= 65 & charVal <= 91)
				{ result = ((charVal + key - 65)% 26) + 65 ; }
			// Small letters start at 97 in ascii code
			else if(charVal >= 97 & charVal <= 123)
				{ result = ((charVal + key - 97)% 26) + 97 ; }
			// Digits start at 48 in ascii code
			else if(charVal >= 48 & charVal <= 57)
				{ result = ((charVal + key - 48)% 10) + 48 ; }
			// Else special character will remain as it is
			else
				{ result = charVal ; }
			resultArray[i] = (char) result;
		}
	return (String.valueOf(resultArray));	

	}

public static void main(String args[])
	{
		caesarCipher caesarObject = new caesarCipher();
		// Though here I am giving hard-coded values to demonstrate boundary conditions.
		// Custom user input can be taken as well
		String message = "All 1 the Zombies 98  program? !=*";
		int key = 3;
		String encryptedessage = caesarObject.encryptMessage(message,key);
		System.out.println(encryptedessage);
		
	}
}
