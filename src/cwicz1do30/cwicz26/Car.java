package cwicz1do30.cwicz26;

public class Car {


    private static int START_ENGINE = 100;
    private static int ERROR_CHECK_ENGINE = 200;
    private static int ERROR_NO_FUEL = 300;
    private static int WARNING_FUEL_FLAP_OPEN = 400;
    private static int WARNING_DOORS_OPEN = 500;

    private int fuel;
    private boolean engineOk;
    private boolean engineOn;
    private boolean fuelFlapOpen;
    private boolean doorsOpen;

    public Car(int fuel, boolean engineOk, boolean engineOn, boolean fuelFlapOpen, boolean doorsOpen) {
        this.fuel = fuel;
        this.engineOk = engineOk;
        this.engineOn = engineOn;
        this.fuelFlapOpen = fuelFlapOpen;
        this.doorsOpen = doorsOpen;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        if (fuel <= 0) engineOk = false;
        this.fuel = fuel;
    }

    public boolean isEngineOk() {
        return engineOk;
    }

    public void setEngineOk(boolean engineOk) {
        if (!engineOk) engineOk = false;
        this.engineOk = engineOk;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        int systemCheck = systemCheck();
        if (systemCheck == ERROR_CHECK_ENGINE || systemCheck == ERROR_NO_FUEL)
            this.engineOn = false;
        else
            this.engineOn = engineOn;
    }

    private int systemCheck() {
        if (!engineOk) return ERROR_CHECK_ENGINE;
        if (fuel == 0) return ERROR_NO_FUEL;
        if (!fuelFlapOpen) return WARNING_FUEL_FLAP_OPEN;
        if (!doorsOpen) return WARNING_DOORS_OPEN;
        return START_ENGINE;
    }

    public boolean isFuelFlapOpen() {
        return fuelFlapOpen;
    }

    public void setFuelFlapOpen(boolean fuelFlapOpen) {
//        if(!fuelFlapOpen)  fuelFlapOpen = false;
        this.fuelFlapOpen = fuelFlapOpen;
    }

    public boolean isDoorsOpen() {
        return doorsOpen;
    }

    public void setDoorsOpen(boolean doorsOpen) {
//        if(!doorsOpen) doorsOpen = false;
        this.doorsOpen = doorsOpen;
    }

    int start(){
        int systemCheck = systemCheck();
        setEngineOn(true);
        return systemCheck;
    }

     String status() {
        if (systemCheck() == START_ENGINE)
            return "Wszystko sprawne ruszaj w drogę";
        String status = "Status samochodu : \n";
        if (!engineOk)
            status += "> silnik uszkodzony\n";
        if (fuel == 0)
            status += ">Brak paliwa\n";
        if (!fuelFlapOpen)
            status += ">otwarty wlew paliwa\n";
        if (!doorsOpen)
            status += ">drzwi lub bagażnik są otwarte\n";
        if (engineOn)
            status += ">silnik włączony\n";
        else
            status += ">silnik wyłączony";
        return status;

     }
}
