package Other;

public class CommandLine {

	public CommandLine() {

	}

	public static void main(String[] args) {
		System.out.println("String :"+args[0]);
		System.out.println("Length :"+args[0].length());
		System.out.print("Reverse :");
		for(int i =args[0].length()-1 ; i >= 0; i--)
		{
			
			System.out.print(args[0].charAt(i));
		}
		System.out.print("\nUpper case :");
		for(int i =args[0].length()-1 ; i >= 0; i--)
		{
			System.out.print(Character.toUpperCase(args[0].charAt(i)));	
		}
		int digcount=0,numcount=0,whscount=0;
		for(int i =args[0].length()-1 ; i >= 0; i--)
		{
			if(Character.isDigit(args[0].charAt(i)))
				digcount++;
			if(Character.isLetter(args[0].charAt(i)))
				numcount++;
			if(Character.isWhitespace(args[0].charAt(i)))
				whscount++;
		}
		System.out.println("\nTotal Digits :" +digcount);
		System.out.println("Total Letters :" +numcount);
		System.out.println("Total WhiteSpace :" +whscount);
		
		
		
	
	}
	
}
