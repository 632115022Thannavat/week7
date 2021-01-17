//thanavat voloshin 632115022
public class Dog extends Pet{
public Dog(String Name,String Species,String Color,int Age){
    this.Name = Name;
    this.Species = Species;
    this.Color = Color;
    this.Age = Age;
}
public void Run(){
    System.out.println("My "+kind+" "+Name+" is run to the jungle");
}
public void Bark(){
    System.out.println(size+" bark Box Box!!!");
}
public void Hair(){
    if (hair == "short"){
        System.out.println("Short hair: true");
    }else{
        System.out.println("Long hair: true");
    }
}
}
    
    

