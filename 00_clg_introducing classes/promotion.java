// public class promotion {
//     void disp(int a,long b){
//         System.out.println(a+b);
//     }
//     void disp(long a,int b){
//         System.out.println(a+b);
//     }

//     public static void main(String args[])
//     {
//         promotion obj=new promotion();
//         obj.disp(10,10);----------------->ERROR BECAUSE AMBIGUITY BETWEEN WHICH METHODS SUITS AFTER PROMOTION
//     }
// }
public class promotion {
        void disp(int a,int b){
            System.out.println(a+" "+b);
        }
        void disp(long a,long b){
            System.out.println(a+" "+b);
        }
        void sum(int a,long b){
            System.out.println(a+b);
        }
        void sum(long a,long b,int c){
            System.out.println(a+b+c);
        }
        public static void main(String args[])
        {
            promotion obj=new promotion();
            obj.disp(10,10);
            obj.sum(10, 10);//first param is promoted to long
            obj.sum(10, 10,10);//last param is promoted to long
        }
    }
    