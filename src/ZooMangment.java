import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class ZooMangment {
    public static void main(String[] args) {

        Animal lion = new Animal("family", "simba", 3, true);
//        lion.name = "Simba";
//        lion.age = 3;
//        lion.isMammal = true;
//        lion.family = "family";
        Zoo myZoo = new Zoo("belvidaire", "tunis", 25);
//        myZoo.city = "tunis";
//        myZoo.nbrCages = 25;
//        myZoo.name = "belvidaire";
        Animal tiger = new Animal("family", "bagira", 4, true);
        Animal lion2 = new Animal("family", "simba", 3, true);

        myZoo.addAimall(lion);
        myZoo.addAimall(tiger);
        myZoo.addAimall(lion2);

        System.out.println(myZoo);
        myZoo.showAnimals();
        System.out.println(myZoo.searchAnimal(lion2));


    }


}