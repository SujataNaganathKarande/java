package Assighmentno3;
import java.util.*;

public class colorlistdemo {
	
	public class ColorListDemo {
	    public static void main(String[] args) {
	        // Step 1: Create initial LinkedList
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("red");
	        colors.add("blue");
	        colors.add("yellow");
	        colors.add("orange");

	        // Step 2: Display using Iterator
	        System.out.println("Colors using Iterator:");
	        Iterator<String> itr = colors.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	        // Step 3: Display in reverse using ListIterator
	        System.out.println("\nColors in reverse using ListIterator:");
	        ListIterator<String> listItr = colors.listIterator(colors.size());
	        while (listItr.hasPrevious()) {
	            System.out.println(listItr.previous());
	        }

	        // Step 4: Insert pink and green between blue and yellow
	        List<String> newColors = Arrays.asList("pink", "green");
	        int insertIndex = colors.indexOf("yellow"); // insert before yellow
	        colors.addAll(insertIndex, newColors);

	        System.out.println("\nUpdated Colors List:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	    }
	}

}
