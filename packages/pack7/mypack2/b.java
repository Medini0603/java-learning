
package mypack2;
//import mypack1.*;

class b {

    b() {
        mypack1.protection obj=mypack1.protection();
        System.out.println("Constuctor of class y:subclass of  x under same package");

        System.out.println("default : " + obj.n);
        System.out.println("public : " + obj.npub);
        ;
        System.out.println("protected : " + obj.npro);
        // System.out.println("private : "+npri);

    }

}
