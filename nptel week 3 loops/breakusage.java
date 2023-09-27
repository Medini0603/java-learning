class breakusage{
    public static void main(String args[]) {
        for(int i=0; ;i++){
            System.out.println("Hello " + i);
            if(i>=10)break;
        }
    }
}