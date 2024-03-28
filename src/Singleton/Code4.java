package Singleton;

public class Code4 {
    // singleton, lazy initialization, thread-safe(no double check lock)
    private Code4(){} // private constructor

    private  static  Code4 obj; // Instance of Singleton class

    public static synchronized  Code4 getInstance(){
        // overhead due to synchronized keyword
        if(obj==null){
            obj=new Code4();

        }        return obj;
    }

    public  void check(){System.out.println("Called from Code 4 ");}

}
