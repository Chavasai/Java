class StringEscapeSequenceCheck 
{
    	public static void main(String[] args) 
	{
        	// Example 1: Newline (\n)
        	String str1 = "Hello,\nWorld!";
        	System.out.println(str1);

        	// Example 2: Tab (\t)
        	String str2 = "Java\tProgramming";
        	System.out.println(str2);

        	// Example 3: Double Quotes (\")
        	String str3 = "He said, \"Java is amazing!\"";
        	System.out.println(str3);

        	// Example 4: Single Quote (\')
        	String str4 = "It\'s a sunny day.";
               	System.out.println(str4);

        	// Example 5: Backslash (\\)
        	String str5 = "The file path is C:\\Users\\Documents\\File.txt";
        	System.out.println(str5);

        	// Example 6: Unicode Character (\u)
        	String str6 = "This is a smiley: \u263A";
        	System.out.println(str6);

        	// Example 7: Carriage Return (\r)
       		String str7 = "Hello, World!\rJava";
        	System.out.println(str7); // "Java" overwrites part of "Hello, World!"
    }
}
