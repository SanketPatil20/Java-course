package hashset;
import java.util.*;

public class CreateHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <Integer> set = new HashSet <>();
		set.add(21);
		set.add(22);
		set.add(23);
		set.add(24);
		set.add(25);
		
		System.out.println("Inserting 21 again: " + set.add(21));
		
		System.out.println(set);
		
		System.out.println("Is 21 present in hashset? -> " + set.contains(21));

	}

}
