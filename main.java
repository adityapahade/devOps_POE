import java.util.*;
public class Main {
   public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);  
    int s=0;
	int n =100;
	System.out.print("Odd Numbers from "+s+"to "+n+" are: ");
	for (int i = s; i <= n; i++) {
	   if (i % 2 != 0) {
		System.out.print(i + " ");
	   }
	}
   }
}
