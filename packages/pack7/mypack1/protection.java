package mypack1;
public class protection{
    int n=1;
    public int npub=2;
    protected int npro=3;
    private int npri=4;

    public protection(){
        System.out.println("Constuctor of class x");

        System.out.println("default : "+n);
        System.out.println("public : "+npub);;
        System.out.println("protected : "+npro);
        System.out.println("private : "+npri);

    }

}