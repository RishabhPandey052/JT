package programs;
import java.util.Scanner;
public class SearchInArray
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    
	    int arr[] = new int[size];
	    
	    for(int i =0 ;i<size;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    int key = sc.nextInt();
	    int position = -1;
	    
	    for(int i = 0 ;i<size;i++){
	        if(arr[i] == key){
	            position = i;
	            break;
	        }
	   }
	   
	   if(position == -1){
	       System.out.println(key + " is not present in array ");
	   } else {
	       System.out.println("position of "+ key + " is " + (position+1));
	   }
	   
	   sc.close();
	}
}