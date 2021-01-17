public class Fish extends Pet{
    public Fish(String Name,String Species,String Color,int Age){
        this.Name = Name;
        this.Species = Species;
        this.Color = Color;
        this.Age = Age;
    } 
    public void Sea(){
        System.out.println(size);
        if (water == "salt"){
            System.out.println("Is swim to the sea: true");
        }else{
            System.out.println("Is swim to the sea: false");
        }
    }
    public void Swim(){
    System.out.println("Swim "+swim);
       if(swim == "speed"){
           System.out.println("Swim fast: true");
       }else{
           System.out.println("Swim fast: false");
       }
    }
}
