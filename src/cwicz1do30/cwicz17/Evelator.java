package cwicz1do30.cwicz17;

public class Evelator {

    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    void add(Person person) {
        if (peopleNumber < 4) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else
            System.out.println("Winda jest pełna");

    }

    void start() {
        if (weightIsCorrect()) {
            System.out.println("Winda wystartowała");
        }
        else {
            int overWeight = getWeight() - maxWeight;
            System.out.println("Winda jest przeciążona o " + overWeight + "kg");
        }
    }

    private boolean weightIsCorrect() {
        return getWeight() <= maxWeight;
    }

    private int getWeight() {
        int sumPeopleWeight = 0;
        for(int i =0; i < people.length; i++){
            if(people[i]  != null){
                sumPeopleWeight += people[i].getWeight();
            }
        }
        return sumPeopleWeight;
    }

    void clear(){
        people = new Person[4];
        peopleNumber =0;
    }
}
