package builder;

public class User {
    private final String firstName;
    private final String lastName;
    private int age;
    private String address;

    User(UserBuilder obj){
        this.firstName=obj.firstName;
        this.lastName=obj.lastName;
        this.age=obj.age;
        this.address= obj.address;
    }

    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.address;
    }

    public static  class UserBuilder{
        private final String firstName;
        private final String lastName;
        private int age;
        private String address;

        public UserBuilder(String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }
        public UserBuilder age(int age){
            this.age=age;
            return  this;
        }
        public UserBuilder address(String address){
            this.address=address;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}
