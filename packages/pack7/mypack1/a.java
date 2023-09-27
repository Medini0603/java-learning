package mypack1;
//import mypack1.x;
public class a {
    public a(){
        protection obj=new protection();
        System.out.println("Constuctor of class a: nonsubclass of  x under same package");

        System.out.println("default : "+obj.n);
        System.out.println("public : "+obj.npub);;
        System.out.println("protected : "+obj.npro);
       // System.out.println("private : "+npri);

    }
}
