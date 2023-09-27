class primetest{
    public static void main(String args[]) {
        boolean isprime = true;
        int n = Integer.parseInt(args[0]);
        if(n<=0){System.out.println("enter a valid number");}
        else if(n==1){System.out.printf("%d is neither a prime number nor a composite number\n",n);}
        else{for(int i=2;i<(n/2);i++){
            if(n%i==0){
                isprime = false;
                break;
        }
    }
        if(isprime){
            System.out.printf("%d is a prime number\n",n);
        }
        else{ System.out.printf("%d is not a prime number\n",n);}
    }
}
}