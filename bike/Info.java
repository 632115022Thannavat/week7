package bike;

public class Info {
    int num,num2;
    public Info(){

    }
    public Info(int num,int num2){
        this.num = num;
        this.num2 = num2;
    }
    public void How(){
        System.out.println("The current speed is "+num+"km/h");
    }
    public void mbike(){
        System.out.println("------MountainBike------");
        System.out.println("The current gear is 2 /apllied gear to increase speed");
    }
    public void nbike(){
        System.out.println("------NormalBike------");
        System.out.println("Please enter 'up' for increase speed/'down' for break speed/'quit' for stop bicycle");
    }
}

    
    
    
    




    

