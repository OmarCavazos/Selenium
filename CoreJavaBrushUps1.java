import java.util.Arrays;

public class CoreJavaBrushUps1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int myNum = 5;
        String website = "https://rahulshettyacademy.com/";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;
        
        System.out.println(myNum + " is the value stored in myNum variable");
        System.out.println(website);

        // Arrays
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 12;
        
        int[] arr2 = {1, 2, 4, 5, 6,10,45,68,123,45678};

        
        // Print the arrays using Arrays.toString()
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("arr2: " + Arrays.toString(arr2));
        
        for(int i= 0; i < arr2.length; i++) {
        	System.out.println(arr2[i]);
        }
        
        
        String[] name = {"jose", "omar", "cavazos", "avilez"};
        
        /*
        for(int i= 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        */
      
        for(String s:name) {
            System.out.println(s);
        }
             
        
    }
}

