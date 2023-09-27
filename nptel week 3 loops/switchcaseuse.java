import java.util.*;
class switchcaseuse{
    public static void main(String args[]) {
        //menu design using do while
        Scanner s = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Help on");
            System.out.println("Press 1 for if");
            System.out.println("Press 2 for switch");
            System.out.println("Press 3 for while");
            System.out.println("Press 4 for do-while");
            System.out.println("Press 5 for for");
            System.out.println("Choose any one of these numbers");

            choice = s.nextInt();

        }
        while((choice <1)||(choice>5));

        switch(choice)
        {
            case 1:
            {System.out.println("if(condition)");
            System.out.println("else");
            break;}

            case 2:
            {System.out.println("swith(expression)");
            System.out.println("break");
            break;}

            case 3:
            {System.out.println("while(condition)");
            System.out.println("ststement");
            break;}

            case 4:
            {System.out.println("do(ststement)");
            System.out.println("while(condition)");
            break;}

            case 5:
            {System.out.println("for(iteration,condition,increment/decrement)");
            System.out.println("statements");
            break;}
        }
    }
}