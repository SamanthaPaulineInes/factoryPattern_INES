package LabHw4_INES_3BSCS1_FactoryPattern;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Clinic
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner clnc = new Scanner(System.in);

        System.out.print("\nWELCOME TO PET RECORD");
        System.out.print("\nINES, SAMANTHA PAULINE | 3 BSCS 1 | LAB 4: FACTORY PATTERN");

        boolean a = true;

        while (a)
        {
            System.out.print("\n==========================================================");
            System.out.print("\n\n         Pet Record");
            System.out.print("\n-------------------------------");
            System.out.print("\n|[1]Dog  |  [2]Cat  |  [3]Exit|");
            System.out.print("\n-------------------------------");
            System.out.print("\nChoose your pet number: ");
            Integer choice = clnc.nextInt();

            System.out.print("\n=====");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(" Loading");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(" =====");
            TimeUnit.SECONDS.sleep(1);

            PetRecord petFile = new PetRecord();
            Pet pet = null;

            switch (choice)
            {
                case 1:
                    pet = new Dog();
                    petFile.setPetID("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepherd");
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetID("C01");
                    petFile.setPetName("Muming");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                case 3:
                    System.out.print("\n\nTHANK YOU!\n");
                    break;
                default:
                    System.out.print("Invalid number. Please try again.");
                    break;
            }
            System.out.println("\n\nPet id is " + petFile.getPetID());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
            if(choice.equals(1))
            {
                System.out.print("Pet breed is " + ((Dog)pet).getBreed() + "\n");
            }
            else
            {
                System.out.println("Number of lives is " + ((Cat)pet).getNoOfLives());
            }
            System.out.println("Communication sound: " + petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play());
        }
    }
}
