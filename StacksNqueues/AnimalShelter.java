
public class AnimalShelter{
    public static void main(String[] args) {
        AnimalQueue animals = new AnimalQueue();
        animals.enQueue(new Cat("Callie"));
        animals.enQueue(new Cat("Kiki"));
        animals.enQueue(new Dog("Fido"));
        animals.enQueue(new Dog("Dora"));
        animals.enQueue(new Cat("Kari"));
        animals.enQueue(new Dog("Dexter"));
        animals.enQueue(new Dog("Dobo"));
        animals.enQueue(new Cat("Copa"));
        
        System.out.println(animals.deQueueAny().name());
        System.out.println(animals.deQueueAny().name());
        System.out.println(animals.deQueueAny().name());

        animals.enQueue(new Dog("Dapa"));
        animals.enQueue(new Cat("Kilo"));

        

    }
}