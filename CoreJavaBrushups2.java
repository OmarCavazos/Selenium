import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushups2 {

	public static void main(String[] args) {

//        int[] arr2 = {1, 2, 4, 5, 6,10,45,68,123,45678};
//
//        for(int i=0; i<arr2.length; i++) {
//        	if(arr2[i] % 2 == 0) {
//        		System.out.println(arr2[i] );
//        	}
//        	else {
//        		System.out.println(arr2[i] + " is NOT a multiple of 2");
//        	}
//        }
        
        //create object of the class
        ArrayList <String> a = new ArrayList <String> ();
        a.add("Jose");
        a.add("Omar");
        a.add("Cavazos");
        a.add("Avilez");
        //a.get(3);
        if (a.size() > 3) {
            System.out.println(a.get(3));
        }

        
        for(int i=0; i < a.size(); i++) {
        	System.out.println(a.get(i));
        }
        
        System.out.println("**********");
        for(String val :a) {
        	System.out.println(val);
        }
        
        
        
        String[] name = {"Jose", "Omar", "Cavazos", "Avilez"};
        List <String> nameArrayList = Arrays.asList(name);
        if(nameArrayList.contains("Cavazos")) {
        	System.out.println("It contains it");
    	}
    	else {
    		System.out.println(" it does not");
    	}
        
        
	
	}


}
