class baseclass{
    public int x=12;
    private int y=14;
    protected int z=33;
    int a;

    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
    }

    private int gety(){
        return y;
    }
    private void sety(int y){
        this.y=y;
    }

    protected int getz(){
        return z;
    }
    protected void setz(int z){
        this.z=z;
    }

     int geta(){
        return a;
    }
     void seta(int a){
        this.a=a;
    }
}

class q15 extends baseclass{
    public static void main(String args[]) {
        baseclass obj = new baseclass();
        q15 subobj = new q15();

        //public
        System.out.println("The initial value of x in subobj is "+subobj.getx());
        subobj.setx(20);
        System.out.println("The updated value of x in subobj is "+subobj.getx());

        //private --->gives error
        // System.out.println("The initial value of y in subobj is "+subobj.gety());
        // subobj.sety(20);
        // System.out.println("The updated value of y in subobj is "+subobj.gety());

        //protected
        System.out.println("The initial value of z in subobj is "+subobj.getz());
        subobj.setz(34);
        System.out.println("The updated value of z in subobj is "+subobj.getz());

        //default
        System.out.println("The initial value of a in subobj is "+subobj.geta());
        subobj.seta(90);
        System.out.println("The updated value of a in subobj is "+subobj.geta());
    }
}