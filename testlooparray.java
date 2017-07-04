import java.util.Scanner;
public class testlooparray()
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int no_of_elements = Integer.parseInt(scan.nextLine());
    
    //Create array to store elements
    String myintarray[] = new String[no_of_elements];
    for (int i=0; i<no_of_elements; i++)
    {
      System.out.println("Enter no of elements: " + (i+1) + ":");
      myintarray[i] = scan.nextLine();
    }
    
    //Display the elements in array
    for (int i=0; i<myintarray.length; i++)
    {
      System.out.println("Element " + (i+1) + ":");
      System.out.println(myintarray[i] + "\n");
    }
   }
  }
