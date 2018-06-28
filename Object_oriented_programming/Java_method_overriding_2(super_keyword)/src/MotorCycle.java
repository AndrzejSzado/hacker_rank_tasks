public class MotorCycle extends BigCycle {
    public String define_me(){
        return "a cycle with a engine";
    }
    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());
        String temp = super.define_me();
        System.out.println("My ancestor is a cycle who is "+temp);
    }
}
