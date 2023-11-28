import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal;
        System.out.println("What animal you Want");
        System.out.println("1.Dog \n 2.Cat");
        int choice = sc.nextInt();
        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal = new Cat();
            animal.speak();
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}