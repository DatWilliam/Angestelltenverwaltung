/**
 * create a new guard
 * @author Liam Wipperfuerth
 * @version 15.05.2021
 */
public class Guard extends Employee {

    private int nightShifts;
    private int earlyShifts;
    private int lateShifts;

    public Guard(String surname, String name, int nightShifts, int earlyShifts, int lateShifts) {
        super(surname, name);
        this.position = Position.Guard;
        this.vacationQuota = 20;
        this.nightShifts = nightShifts;
        this.earlyShifts = earlyShifts;
        this.lateShifts = lateShifts;
        calculateSalary();
        calculateVacationQuota();
    }

    /**
     * returns the employees parameters
     */
    @Override
    public String toString(){
        return name + ", " + surname + " (" + position + "): Shifts " + earlyShifts + "/"
                + lateShifts + "/" + nightShifts + "; Monthly salary = " + salary + " EUR; " + getVacationQuota() + " offdays.";
    }

    /**
     * cals the salary
     * 100 per early/late shift & 160 per nightshift
     */
    @Override
    public void calculateSalary(){
        this.salary = (this.earlyShifts*100 + this.nightShifts*160 + this.lateShifts*100);
    }

    /**
     * calcs days off
     * 20 + amout of shifts per month / 4
     */
    @Override
    public void calculateVacationQuota(){
        vacationQuota = 20 + ((float) (this.earlyShifts + this.nightShifts + this.lateShifts) / 4);
    }
}
