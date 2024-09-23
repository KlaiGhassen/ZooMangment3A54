public class Zoo {
    Animal[] animals;
    String name, city;
    int nbrCages;
    int nbrAnimals = 0;

    Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    boolean addAimall(Animal animal) {
        if (searchAnimal(animal) == -1 && nbrAnimals < nbrCages) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    boolean removeAnimal(Animal animal) {
        int deletedIndex = searchAnimal(animal);
        animals[deletedIndex] = null;
        return true;

    }

    void dispayZoo() {
        System.out.println("name : " + name + " city : " + city + "nbrCages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "name : " + name + " city : " + city + "nbrCages : " + nbrCages + "animals numbers  : " + nbrAnimals;

    }

    void showAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);


        }
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }


}
