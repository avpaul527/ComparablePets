package pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, how many pets do you have?");
        int petsNum = scanner.nextInt();
        scanner.nextLine();


        //ArrayList<Pet> pets = new ArrayList<>();
        Pet[] pets = new Pet[petsNum];


        for (int i = 0; i < petsNum; i++) {
            System.out.println("What kind of pet is pet " + (i + 1) + "?");
            String kindOfPet = scanner.nextLine();
            System.out.println("What is this pet's name?");
            String petName = scanner.nextLine();
            System.out.println("Pet " + (i + 1) + " is a " + kindOfPet + " named " + petName);
            //pets.add("Pet " + i + " is a " + kindOfPet + " named " + petName);

            Pet pet = null;
            switch (kindOfPet) {
                case "Dog":
                    pet = new Dog(petName);
                    //pets.add(pet);
                    break;
                case "Cat":
                    pet = new Cat(petName);
                    //pets.add(pet);
                    break;
                case "Fish":
                    pet = new Fish(petName);
                    //pets.add(pet);
                    break;
                default:
                    System.out.println("Pet Unknown");
                    i--;
                    continue;

            }
            pets[i] = pet;
        }


//        for(Pet pet : pets) {
//            if (pet != null) {
//                System.out.println(pet.getName() + " makes the sound " + pet.speak());
//            }
//        }

        System.out.println(" ");
        Arrays.sort(pets);
        System.out.println("Pets sorted by name: ");
        for(Pet pet : pets) {
            if (pet != null) {
                System.out.println(pet.getName() + " makes the sound " + pet.speak() + " (Name: " + pet.getName() + ")");
            }
        }

        System.out.println(" ");
        Arrays.sort(pets, new TypeComparator());
        System.out.println("Pets sorted by type: ");
        for(Pet pet : pets) {
            if (pet != null) {
                System.out.println(pet.getName() + " makes the sound " + pet.speak() + "(" + pet.getClass().getSimpleName() +")");
            }
        }


        scanner.close();
    }
}
