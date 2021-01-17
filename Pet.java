//thanavat voloshin 632115022
public class Pet{
    String kind,Name,Species,Color,size,hair,water,swim,Country,fly;
    int Age;
public Pet(){

}
public Pet(String Name,String Species,String Color,int Age){
    this.Name = Name;
    this.Species = Species;
    this.Color = Color;
    this.Age = Age;
}
public void Kind(){
    System.out.println("Kind "+kind);
    System.out.println("Name: "+Name+" Species: "+Species+" Color: "+Color+" Age: "+Age);
}
}
