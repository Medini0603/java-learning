class student{
    String name,branch;
    float fees;
    int rollno;


    student(int rollno,String name,String branch){
        this.rollno=rollno;
        this.name=name;
        this.branch=branch;
    }
    //constructor inside constructor-----> an example
    
    student(int rollno,String name,String branch,float fees){
        this(rollno, name, branch);
        this.fees=fees;
    }

    //method to display the details of students..
    void display(){
        System.out.println(rollno + "   " + name + "   " + branch + "   " + fees + "   ");
    }
    
}
class q10{
     public static void main(String args[]) {
    

        //student s1=new student(1,Medini,Cs,40555); ---->it shows error
        //because    STRINGS ARE NOT ENCLOSED IN ""   note this
    student s1=new student(1,"Medini","Cs",40555);
    student s2=new student(2,"Sannidhi","Cs",40555);
    student s3=new student(3,"Radhika","Cs",40555);

    s1.display();
    s2.display();
    s3.display();
}
}