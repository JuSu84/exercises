package cwiczenia31do60.cwicz33;

public class DataStore {

    private static final int MAX_COMPUTERS = 100;
    private int computerNumber = 0;


    private Computer[] computers = new Computer[MAX_COMPUTERS];

    public void addToArray(Computer computer) {
        if (computerNumber <MAX_COMPUTERS && computer != null) {
            computers[computerNumber] = computer;
            computerNumber++;
        }else {
            System.out.println("Maksymalna liczba komputerw osiągnięta");
        }
    }

    public void printListOfComputers(){
        for (int i = 0; i < computerNumber; i++) {
            System.out.println(computers[i]);
        }
    }

    public int checkAvailability(Computer computer){
        if (computer == null)
            return 0;

        int result =0;
        for (int i = 0; i < computerNumber; i++) {
            if(computer.equals(computers[i]))
                result++;
        }
        return result;
    }
}
