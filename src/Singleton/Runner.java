package Singleton;

public class Runner {
    static <E> boolean areObjEqual( E obj1 , E obj2){
        /*
        * This method checks if the address of 2 objects are same
        * in case of singleton objects it should be same
        * */

        return  obj1==obj2;
    }
    public static void main(String[] args) {
        /*
        * This class contains the driver code for trying out  singleton classes
        * */

        Code1 obj1= Code1.getInstance();
        Code1 obj2= Code1.getInstance();

        Code2 obj3= Code2.getInstance();
        Code2 obj4= Code2.getInstance();

        Code3 obj5= Code3.getInstance();
        Code3 obj6= Code3.getInstance();

        Code4 obj7= Code4.getInstance();
        Code4 obj8= Code4.getInstance();


        System.out.println(areObjEqual(obj1,obj2));
        System.out.println(areObjEqual(obj3,obj4));
        System.out.println(areObjEqual(obj5,obj6));
        System.out.println(areObjEqual(obj7,obj8));


    }
}