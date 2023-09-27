class cat{
    void voice(){
        System.out.println("Meow.......");
    }
}

class petcat extends cat{
    void voice(){
        System.out.println("Meow Meow.......im pet");
    }
}

class wildcat extends cat{
    static boolean flag;
    void voice(){
        if(flag){
            super.voice();//refers to voice of cat
        }

        else{
            System.out.println("Its a wild cat....I cant talk:-(");
        }
    }
}

class q5{
    public static void main(String args[]) {
        petcat c1 = new petcat();
        c1.voice();
        System.out.println();

        wildcat c2 = new wildcat();
        c2.flag = true;
        c2.voice();


        c2.flag = false;
        c2.voice();
    }
}