package Assighmentno3;
import java.io.*;

public class File {
	
	
	    public static void main(String[] args) {
	        int charCount = 0, wordCount = 0, lineCount = 0;

	        try {
	            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
	            String line;

	            while ((line = reader.readLine()) != null) {
	                lineCount++;
	                charCount += line.length();
	                String[] words = line.trim().split("\\s+");
	                wordCount += words.length;
	            }

	            reader.close();

	            System.out.println("Lines: " + lineCount);
	            System.out.println("Words: " + wordCount);
	            System.out.println("Characters: " + charCount);

	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }
	}


