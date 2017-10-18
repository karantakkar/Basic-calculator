import java.util.Scanner;
class calculater{
    public static void main(String args[]){
        int ch,a,b;
        System.out.println("this is calculator");
        System.out.println("what do u want to calculate");
        System.out.println("Press 1 for ADDITION");
        System.out.println("Press 2 for SUBTRACTION");
        System.out.println("Press 3 for DIVISION");
        System.out.println("Press 4 for MULTIPLICATION");
        System.out.println("give the values of a n b respectively");
        Scanner no=new Scanner(System.in);
        a=no.nextInt();
        b=no.nextInt();
        System.out.println("now what do u want to calculate");
        Scanner variable = new Scanner(System.in);
        ch = variable.nextInt();
        switch (ch) {
            case 1:float sum;
                   sum=a+b;
                   System.out.println("the sum of a and b = "+ sum);
                   break;
            case 2:float sub;
                   sub =a-b;
                   System.out.println("subtraction of a and b = "+ sub);
                   break;
            case 3:float div;
                   div=a/b;
                   System.out.println("division of a/b ="+ div);
                   break;                                   
            case 4:float multi;
                   multi=a*b;
                   System.out.println("multiplication of a and b = "+ multi);
                   break; 
            default:System.out.println("you did somthing worng sorry try again");
                    break;
        }
    }
}