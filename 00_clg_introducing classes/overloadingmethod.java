 class disp {
    void printarray(int a[]){
        for(int x:a)
            System.out.print(x+" ");
            System.out.println();
    }

    void printarray(double a[]){
        for(double x:a)
            System.out.print(x+" ");
            System.out.println();
    }

    void printarray(char a[]){
        for(char x:a)
            System.out.print(x+" ");
            System.out.println();
    }
}

class overloadingmethod{
    public static void main(String args[]) {
        disp obj=new disp();
        int[] intarr={1,2,3,4,5};
        double[] doublearr={1.1,2.2,3.3};
        char[] chararr={'m','e','d','i','n','i'};
        obj.printarray(intarr);
        obj.printarray(doublearr);
        obj.printarray(chararr);
    }
}