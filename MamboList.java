package Jimmy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MamboList {
	  public static List<String> seaCreature = new ArrayList<>();
	  
	  public static void main(String[] args){
		  seaCreature.add("Whale");
		  seaCreature.add("Otter");
		  seaCreature.add("Salmon");
		  seaCreature.add("Walrus");
		  seaCreature.add("Trout");
		  
		  System.out.println(seaCreature);
		  System.out.println(seaCreature.get(2));
		  System.out.println(" ");
		  
		  seaCreature.set(2, "Mambo");
		  System.out.println(seaCreature.get(2));
		  System.out.println(" ");
		  
		  seaCreature.remove(2);
		  System.out.println(seaCreature.size());
		  System.out.println(" ");
		  
		  for (int i = 0; i < seaCreature.size(); i++) {
			    System.out.println(seaCreature.get(i));
			}
		  System.out.println(" ");
		  
		  Collections.sort(seaCreature);
		  for (String i : seaCreature){
			    System.out.println(i);
			}
		  System.out.println(" ");
		  
		  Collections.reverse(seaCreature);
		  System.out.println(seaCreature);
		  System.out.println(" ");
		  
		  Collections.swap(seaCreature,2,3);
		  System.out.println(seaCreature);
	    }
}
