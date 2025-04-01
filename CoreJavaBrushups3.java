
public class CoreJavaBrushups3 {

	public static void main(String[] args ){
		
		
		String s = "Jose Omar Cavazos";
		System.out.println(s);
		//Remove "Omar" [1] from string
		String[] splittedString = s.split("Omar");
		
		System.out.println(splittedString);
		
		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		
		System.out.println(splittedString[1].trim());
		
		for(int i= s.length()-1; i >= 0; i--) {
			
			System.out.println(s.charAt(i));
			
		}

		
		
		
		//System.out.println(s+ s1 + s2);
		//String s2 = " Test";
		
//		String s1 = new String(" Welcome");
		
				
		//System.out.println(s+ s1 + s2);
	}
}
