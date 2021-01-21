package bike;
import java.util.Scanner;
public class MountainBike extends Info{
    public MountainBike(int num,int num2){
        this.num = num;
        this.num2 = num2;
    }
    public void speed1(){
        Scanner in = new Scanner(System.in);
        for(int i = num2;i<=99;i++){
        int gear = in.nextInt();
        i = i+(2*gear);
        if(i <=99){
        System.out.println("The current speed is "+i+" km/h");
        }else{
        System.out.println("bicycle cannot exceed");
        in.close();
        }
        }
    }
}