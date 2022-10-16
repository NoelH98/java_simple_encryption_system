package main;
import java.util.regex.PatternSyntaxException;

public class EncryptionMethods {
	
	//Simple class handling cryptography.
	//implemented are simpleAlphaNumeric , morseCode ,vigenereCipher;
	
	public static String input;
	public static String output;
	
	
	
	public EncryptionMethods() {
		
	}
	
	public static void simpleKeyEncryption(String data, int key) {
		
		System.out.println(data);
		
		for(char c: chars){
			c += key
		 System.out.print(c);
		}
	}
	
	
	public static void simpleAlphaNumericEncryption(String data) {
		String str = data.toUpperCase();
		String output1 = str.replace('A','1');
		String output2 = output1.replace('B','2');
		String output3 = output2.replace('C','3');
		String output4 = output3.replace('D','4');
		String output5 = output4.replace('E','5');
		String output6 = output5.replace('F','6');
		String output7 = output6.replace('G','7');
		String output8 = output7.replace('H','8');
		String output9 = output8.replace('I','9');
		String output10 = output9.replace('J','@');
		String output11 = output10.replace('K','$');
		String output12 = output11.replace('L','%');
		String output13 = output12.replace('M','*');
		String output14 = output13.replace('O','?');
		String output15 = output14.replace('P','!');
		String output16 = output15.replace('R','#');
		String output = output16;

		System.out.println(output);
	}
	
	public static void simpleAlphaNumericDecryption(String data) {
		String str = data.toUpperCase();
		String output1 = str.replace('1','A');
		String output2 = output1.replace('2','B');
		String output3 = output2.replace('3','C');
		String output4 = output3.replace('4','D');
		String output5 = output4.replace('5','E');
		String output6 = output5.replace('6','F');
		String output7 = output6.replace('7','G');
		String output8 = output7.replace('8','H');
		String output9 = output8.replace('9','I');
		String output10 = output9.replace('@','J');
		String output11 = output10.replace('$','K');
		String output12 = output11.replace('%','L');
		String output13 = output12.replace('*','M');
		String output14 = output13.replace('?','O');
		String output15 = output14.replace('!','P');
		String output16 = output15.replace('#','R');
		String output = output16;
		
		System.out.println(output);
	}
	
    public static String vigenereCipherEncryption(String text,final String keyword) {
    	String res = "";
        text = text.toUpperCase();
    	
    	for(int i = 0,j = 0;i < text.length();i++) {
    		char c = text.charAt(i);
    		if(c < 'A'|| c > 'Z')continue;
    		res +=(char)((c + keyword.charAt(j)-2 * 'A') % 26+'A');
    		j = ++j % keyword.length();
    		System.out.print(res);
    	}
    	return res;
    	
    }
    
    public static String vigenereCipherDecryption(String text,final String key) {
    	String res ="";
    	text = text.toUpperCase();
    	for(int i = 0,j = 0;i < text.length();i++) {
    		char c = text.charAt(i);
    		if(c < 'A'||c > 'Z')continue;
    		res += (char)((c - key.charAt(j) + 26) % 26 + 'A');
    		j = ++j % key.length();
    		System.out.print(res);      
    	}
    	return res;
    }
    
    public static void morseCodeEncryption(String data) {
     //   String str = data.toUpperCase();
        char[] english = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
        		          'S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
        		          "--","-.","---",".---.","--.-",".-.","...","-","..-","...-",".--","-..-",
        		          "-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..",
        		          "----.","-----","--..--",".-.-.-","..--.."};
        
        System.out.println("This is an English to Morse Code Translator:");
        System.out.println("Please enter what you would like tranlate");
        System.out.println("      into Morse Code.");
        System.out.println("==============================================");
        
        String userInput = "NOEL";
        char[] chars = userInput.toCharArray();
        
        String str = "";
        for(int i=0; i<chars.length;i++) {
        	for(int j=0;j<english.length;j++) {
        		if(english[j]==chars[i]) {
        			str = str + morse[j] + "";
        		}
        	}
        }
        
        System.out.print(str);
        
    }
    
    public static void morseCodeDecryption(String data) {
    	//String str = data.toUpperCase();
        char[] english = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
        		          'S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
        		          "--","-.","---",".---.","--.-",".-.","...","-","..-","...-",".--","-..-",
        		          "-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..",
        		          "----.","-----"};
        
        System.out.println("This is a Morse code to English Translator:");
        System.out.println("Please enter what you would like tranlate.Separate each letter/digit with"
        		           + "a single space anddelimit multiple words with a | ");
        System.out.println("      into Morse Code.");
        System.out.println("==============================================");
        
        try {
         String userInput = "--.. -----";
         String[] words = null;
         if(userInput.contains("|")) {
        	words = userInput.split("[|]");
         }else {
        	words = new String[1];
        	words[0] = userInput;
         }
         for(String word:words) {
              String[] characters = word.split(" ");
              for(int h =0;h<characters.length;h++) {
              for(int i =0;i<morse.length;i++) {
            	 if(characters[h].equals(morse[i])) {
            		System.out.print(english[i]);
            	 }
              }
              }
         System.out.print("");
         }
         
        }catch(PatternSyntaxException ex) {}
    }
    
    public static void main(String[]args) {
    	
    	// Call appropriate function.
    	
     	//simpleAlphaNumericEncryption("Hello world,welcome to agents this is verrrry");
    	//simpleAlphaNumericDecryption("85%%? W?#%4,W5%3?*5 T? 175NTS T89S 9S V5####Y");
    	//morseCodeDecryption("str");
    	
    	
     //   vigenereCipherEncryption(key,text);
    
    //  	vigenereCipherDecryption(key,"OOFOFOOFOS");
    	 
    }
    
}
