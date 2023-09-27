class q8{
    public static void main(String args[]) {
        if(args.length<=0)
        {
            System.out.println("The command line input is not found");
        }
        // else{
        //     System.out.println("the command line arguments are ");
        //     for(int i=0; i<args.length ; i++)
        //     {
        //         System.out.print(args[i] + " ");
        //     }
        //     System.out.println();
        // }

        // OR

        else{
            System.out.println("the command line arguments are ");
            for(String val : args){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}