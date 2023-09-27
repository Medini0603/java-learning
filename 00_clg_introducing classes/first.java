class first{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }

    void sum(int a,int b,int c)
    {
        System.out.println(c+a+b);
    }

  
            public static void main(String args[]){
                first obj=new first();
                obj.sum(1,2,3);
                obj.sum(4,5);
            }
        
}

// class first{
//     public static void main(String args[]){
//         $1mainclasseg obj=new $1mainclasseg();
//         obj.sum(1,2,3);
//         obj.sum(4,5);
//     }
// }