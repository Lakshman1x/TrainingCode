package builder;
public class SmartPhone {
    public final String brand; // required
    public final int ram; // required
    public final int storage; // required

    public double processingSpeed; // optional parameter
    public double size; // optional parameter
    public double camera; //  optional parameter


    SmartPhone(SmartPhoneBuilder obj){
        this.brand= obj.brand;
        this.ram=obj.ram;
        this.storage=obj.storage;
        this.processingSpeed=obj.processingSpeed;
        this.size=obj.size;
        this.camera=obj.camera;
    }

    @Override
    public String toString(){
        return "Brand : "+this.brand+"\nRam : "+this.ram+" GB\nStorage : "+this.storage+
                " GB\nProcessing speed : "+this.processingSpeed+"Ghz\nSize : "+this.size+" Inch\nCamera : "+this.camera+" MP";
    }

    public static  class SmartPhoneBuilder{
        private final String brand; // required
        private final int ram; // required
        private final int storage; // required

        private double processingSpeed; // optional parameter
        private double size; // optional parameter
        private double camera; //  optional parameter

        public  SmartPhoneBuilder(String brand, int ram, int storage ){
            this.brand=brand;
            this.ram=ram;
            this.storage=storage;
        }

        public  SmartPhoneBuilder processingSpeed(double processingSpeed){
            this.processingSpeed=processingSpeed;
            return  this;
        }

        public SmartPhoneBuilder size(double size){
            this.size=size;
            return  this;
        }

        public SmartPhoneBuilder camera(double camera){
            this.camera=camera;
            return this;
        }

        public SmartPhone build(){
            return  new SmartPhone(this);
        }

    }



}
