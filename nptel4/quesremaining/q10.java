class P{
    protected int rollno = 555;
    protected void msg() {
        System.out.println("Class P : Hello java "+ rollno);
    }
}

class q10{
    public static void main(String args[]) {
        P obj = new P();
        obj.msg();
        System.out.println(obj.rollno);
    }
}