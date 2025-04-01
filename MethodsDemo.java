
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = getData();
		System.out.println(name);
		
		
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		
		getData2();
		
		
		}
	
	
	
	public static String getData()
	{
		System.out.println("Hello from getData");
		return "Omar Cavazos";
	}

	public static String getData2()
	{
		System.out.println("Hello from getData2");
		return "Omar Cavazos";
	}


}
