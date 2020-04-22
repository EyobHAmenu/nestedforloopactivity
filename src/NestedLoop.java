import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        /*
            Declare and initialize integer variable count equal to 1.
            prompt user to enter a height for the triangle
            using for loop go from 1 to the height entered
            use nested loop and go from 1 to the outer loops height
            then print count
            increment count every time it go to the outer for loop

         */
        int height;
        int count = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a height of for a triangle. : ");
        height = sc.nextInt();
        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(count + " ");
            }
            System.out.println();
            count++;
        }

    }
}
