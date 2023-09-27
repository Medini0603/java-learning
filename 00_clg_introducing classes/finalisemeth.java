class finalisemeth{

    public static void main(String[] args) 
    {
        finalisemeth obj = new finalisemeth();
        obj = null;
        System.gc();
        System.out.println("Done");
        
    }
    
  @Override
    protected void finalize()
    {
        System.out.println("Before Destory the Object perform some activity");
        // System.out.println("Release connection");
        // System.out.println("Close network connection");
    }
}