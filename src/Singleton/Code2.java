package Singleton;

public class Code2 {
    // Singleton, lazy, not thread-safe
    private Code2(){} // private constructor, to prevent from creating new instance of object outside the class

    private static Code2 obj; // Instance of Singleton class

    // public and static method to get instance
    public static Code2 getInstance(){
        // lazy initialization (not thread safe)
        if(obj==null){
            obj= new Code2();
        }
        return  obj;
    }
    public  void check(){System.out.println("Called from Code 2 ");}
}
