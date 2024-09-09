/* James Tierney
    09/09/24

*/
import java.util.*;
public class Sumofcubes{
    public static void main (String[] args){
        int num;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();

    while (num > 0) {
        int digit = num % 10;
        sum += digit * digit * digit;
        num /= 10;
        }
    System.out.println(sum);
    }
}