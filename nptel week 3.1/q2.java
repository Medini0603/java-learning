class person{
    String name;
    int dob;
    int mobileno;
    person(String n, int d, int m){
        name=n;
        dob = d;
        mobileno = m;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("date : "+dob);
        System.out.println("Mobile number : "+mobileno);
    }
}

class student extends person{
    int rollno;
    String institution;
     int[] marks = new int[6];
    int[] qualif = new int[2];

    student(String n, int d, int m, int r, String i, int mark[], int q[]){
        //student(String n, int d, int m, int r, String i){
        super(n,  d, m);
        rollno=r;
        institution=i;
          marks=mark;
         qualif=q;
    }

    void print2(){
        super.display();
        System.out.println("rollno : "+ rollno);
        System.out.println("Institution : "+institution);

        for(int i=0;i<6;i++){
            System.out.println("Marks "+ (i+1) + "= "+marks[i]);
        }

        for(int i=0;i<2;i++){
            System.out.println("qualif "+ (i+1) + "= "+qualif[i]);
        }
    }
}

class q2{
    public static void main(String args[]) {
       // student s = new student("Medini",2002,121,31,"sjce");
       int n[]={100,100,99,98,97,96};
       int m[]={1,2};
        student s = new student("Medini",2002,121,31,"sjce",n,m);

        s.print2();
    }
}