//thanavat voloshin 632115022
public class Bird extends Pet{
    public Bird(String Name,String Species,String Color,int Age){
        this.Name = Name;
        this.Species = Species;
        this.Color = Color;
        this.Age = Age;
    } 
    public void Speak(){
        System.out.println("Speak-professor ball so handsom");
    }
    public void Country(){
       System.out.println("Live in "+Country);
       if(Country == "maxico"){
           System.out.println("Check country -maxico: true");
       }else{
           System.out.println("Check country -maxico: false");
       }
    }
    public void Fly(){
       if(fly == "fly"){
           System.out.println("Is can fly: true");
       }else{
           System.out.println("Is can fly: false");
       }   
    }
}
