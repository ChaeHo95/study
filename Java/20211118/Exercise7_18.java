class Robot{}
class DanceRobot extends Robot{
    void dance(){
        System.out.println("dancing");
    }
}
class SingRobot extends Robot{
    void sing(){
        System.out.println("sing");
    }
} 
class DrawRobot extends Robot{
    void draw(){
        System.out.println("draw a picture");
    }
}
 class Exercise7_18 {
    static void action(Robot r){
        if(r instanceof DanceRobot){
            DanceRobot d = new DanceRobot();
            d.dance();
        }
        if(r instanceof SingRobot){
            SingRobot s = new SingRobot();
            s.sing();
        }
        if(r instanceof DrawRobot){
            DrawRobot dr = new DrawRobot();
            dr.draw();
        }
    }
    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for(int i=0; i<arr.length; i++){
            action(arr[i]);
        }
    }
}
