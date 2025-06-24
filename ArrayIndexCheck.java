import java.util.Scanner;

public class ArrayIndexCheck 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];

    
        System.out.println("Enter 3 integer values:");
        for (int i = 0; i < 3; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        
        System.out.print("Enter an index to access (0 to 2): ");
        int index = scanner.nextInt();

        try 
        {
            
            if (index < 0 || index >= arr.length) 
            {
                throw new ArrayIndexOutOfBoundsException("Invalid index! Please enter between 0 and 2.");
            }
            System.out.println("Value at index " + index + " is: " + arr[index]);
} 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }

        scanner.close();
}
} 
