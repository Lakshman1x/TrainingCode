package Singleton;

public class Code3 {
    // Singleton, eager initialization, thread-safe(bcz its eager init)
    private Code3(){} // private constructor

    private  static  Code3 obj =new Code3(); // Instance of Singleton class eager initialisation

    public static Code3 getInstance(){
        return obj;
    }

    public  void check(){System.out.println("Called from Code 3 ");}

}
