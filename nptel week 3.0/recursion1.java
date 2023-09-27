class fact{
    int n;

    int factorial(int n){

        //termination statement
        if(n==0)return (1);

        //recursion statement
        else return (n*(factorial(n-1)));
    }
}

class recursion1{
    public static void main(String args[]) {
        fact x = new fact();
        x.n = Integer.parseInt(args[0]);
        System.out.println("The factorial of "+ x.n + " is "+ x.factorial(x.n));
    }
}