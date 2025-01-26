import java.util.Scanner;
public class swichh {
    public static void main(String[]args){

        System.out.println("Enter 1, For Addition");
        System.out.println("Enter 2, For Subtraction");
        System.out.println("Enter 3, For Multiplicaation");
        System.out.println("Enter 4, For Division");

        System.out.println("Enter your choice");
Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();

switch(choice){

    case 1:{
    System.out.println("Enter two numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x+y;
    System.out.println("Addition is :"+z);
        break;

    }
    case 2:{
    System.out.println("Enter two numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x-y;
    System.out.println("Subtraction is :"+z);
        break;
    }
    case 3:{
    System.out.println("Enter two numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x*y;
    System.out.println("Multiplication is :"+z);
        break;
    }
    case 4:{
    System.out.println("Enter two numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x/y;
    System.out.println("Division is :"+z);
        break;
    }
    default:{

System.out.println("Your choice is invalid,please enter vaid choice...!");

    }

}

    }
    
}
