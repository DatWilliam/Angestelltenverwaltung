/**
 * create a new developer
 * management divides in Junior/Senior Developer
 * @author Liam Wipperfuerth
 * @version 15.05.2021
 */
public class Developer extends Employee {
    private int hiringYear;
    private int weeklyHours;

    public Developer(String surname, String name, Position position, int weeklyHours, int hiringYear) {
        super(surname, name);
        this.position = position;
        this.weeklyHours = weeklyHours;
        this.vacationQuota = 22;
        this.hiringYear = hiringYear;
        calculateSalary();
        calculateVacationQuota();

    }

    /**
     * returns the employees parameters
     */
    @Override
    public String toString(){
        return name + ", " + surname + " (" + position + "):  Weekhours = " + weeklyHours + "; Monthly salary = " + salary + " EUR; " + getVacationQuota() + " offdays.";
    }

    /**
     * cals the salary
     * JuniorDeveloper: 25*4*weekly horus
     * SeniorDeveloper: 32+years working * 4 * weeklyhours
     */
    @Override
    public void calculateSalary(){
        if(position == Position.JuniorDeveloper){
            this.salary = (this.weeklyHours * 25 * 4);
        } else {
            this.salary = (this.weeklyHours * (32 + getYearsWorking(2021)) * 4);
        }
    }

    /**
     * calcs days off
     * 20 + years working/3
     * max bonus days = 5
     */
    @Override
    public void calculateVacationQuota(){
        if(position == Position.SeniorDeveloper){
            int temp = (getYearsWorking(2021) / 3);
            if(temp > 5){ vacationQuota = 22 + 5; } else vacationQuota = 22 + temp;
        } else { vacationQuota = 22; }
    }

    /**
     * calcs years working
     * @return the years
     */
    public int getYearsWorking(int year){
        return year - this.hiringYear;
    }
}