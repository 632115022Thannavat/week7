package bike;
import java.util.Scanner;
public class Bike extends Info{
    public Bike(int num,int num2){
        this.num = num;
        this.num2 = num2;
    }
    public void speed(){
        Scanner in = new Scanner(System.in);
        String word = ""; //getting from user
        do{
            word = in.next();
            if(Up(word)){
                num = num +5;
                System.out.println("The current speed is "+num+"km/h");
            }if(Down(word)){
                num = num -5;
                System.out.println("The current speed is "+num+"km/h");
             }
        }while(!word.equals("quit")&&num<100&&num!=0);
        System.out.println("The bicycle stop");
        }
        public static boolean Up(String word){
                if(!word.equals("up")){
                    return false;
                }
                return true;
            }
        public static boolean Down(String word){ 
            if(!word.equals("down")){
                return false;
            }
            return true;
        }
    }         
    
    

