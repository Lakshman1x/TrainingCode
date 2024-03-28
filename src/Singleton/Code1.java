package Singleton;

public class Code1 {
    // Singleton, lazy, thread-safe(double check lock)
    private Code1(){}// private constructor, to prevent from creating new instance of object outside the class
    private  static  Code1 obj;// Instance of Singleton class


    // public and static method to get instance
    public static Code1 getInstance(){
        // lazy initialisation, thread safe using double check lock
        if(obj==null)
        {
        synchronized(Code1.class){
            if(obj==null){obj= new Code1();}
            }
        }
        return  obj;
    }

    public  void check(){System.out.println("Called from Code 1 ");}

}
