class q0{
    public static void main(String args[]) {

        //program 1
        int x;
        x=100;

        if(x==100){
            int y=20;
            System.out.println("x = "+x+" y = "+y);
            x=y*2;
        }
        //y=100;//throws error

        System.out.println("x = "+x);


        //program 2
        {
            int m=10;
            System.out.println(m);
        }
      //  System.out.println(m);  ----> throws error


      //program 3

      for(int a=0;a<4;a++)
      {
        System.out.println(a);
      }
     // System.out.println(a);  ------>throws error



     //program 5
     int a;
     for( a=0;a<4;a++)
     {
       System.out.println(a);
     }
     System.out.println(a);  //------ not throw error

    }
}