package builder;

public class Runner {
    public static void main(String[]args){
        User kartik = new  User.UserBuilder("kartik","kumar").age(12).build();
//        System.out.println(kartik.toString());

        SmartPhone  OP = new SmartPhone.SmartPhoneBuilder("OpenPlus",8,128)
                .camera(48)
                .build();
        System.out.println(OP.toString());
    }
}
