//thanavat voloshin 632115022
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Lucky","Poodle","brown",2);
        dog.kind = "dog";
        dog.Kind();
        dog.Run();
        dog.size = "small";
        dog.hair = "short";
        dog.Bark();
        dog.Hair();

        Fish fish = new Fish("Nimo","Clown fish","Orange",1);
        fish.kind = "fish";
        fish.Kind();
        fish.size = "small";
        fish.water = "salt";
        fish.swim = "speed";
        fish.Sea();
        fish.Swim();

        Bird bird = new Bird("Kiki","Parrot","Green",1);
        bird.kind = "Bird";
        bird.Kind();
        bird.Country = "maxico";
        bird.fly = "fly";
        bird.Speak();
        bird.Country();
        bird.Fly();
     
    }
    
}
