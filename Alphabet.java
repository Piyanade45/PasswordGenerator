package passwordGenerator;

public class Alphabet {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS ="abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "1234567890";
    public static final String SYMBOLS="!@#$%^&*(),.\\/?-+=~_";
    
    final StringBuilder sb = new StringBuilder();
    
    public Alphabet(boolean uppercaseIncluded,boolean lowercaseIncluded,boolean numbersIncluded,boolean specialCharactersIncluded) {
    	
    	if (uppercaseIncluded) sb.append(UPPERCASE_LETTERS);
    	if (lowercaseIncluded) sb.append(LOWERCASE_LETTERS);
    	if (numbersIncluded) sb.append(NUMBERS);
    	if (specialCharactersIncluded) sb.append(SYMBOLS);	
    }
    
    public String getAlphabet() {
    	return sb.toString();
    }
	

}
