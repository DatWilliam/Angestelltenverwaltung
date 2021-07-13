/**
 * create a new management member
 * management divides in ProjectManager and CEO
 * @author Liam Wipperfuerth
 * @version 15.05.2021
 */
public class Management extends Employee {

    private int finishedProjects;

    public Management(String surname, String name, Position position, int finishedProjects) {
        super(surname, name);
        this.vacationQuota = 20;
        this.position = position;
        this.finishedProjects = finishedProjects;
        calculateSalary();
        calculateVacationQuota();

    }

    /**
     * returns the employees parameters
     */
    @Override
    public String toString(){
        return name + ", " + surname + " (" + position + "):  Finished projects = " + finishedProjects + "; Monthly salary = " + salary + " EUR; " + getVacationQuota() + " offdays.";
    }

    /**
     * cals the salary
     * Project Managers: 8k per month
     * CEO: 10k per month + 10% per finished project
     */
    @Override
    public void calculateSalary(){

        if (position == Position.ProjectManager) {
            this.salary = 8000;
        } else {
            this.salary = 10000;
        }

        this.salary = (int) (this.salary * (1 + (finishedProjects * 0.1)));

    }

    /**
     * calcs days off
     * 20 + finished projects*2
     */
    @Override
    public void calculateVacationQuota(){
        this.vacationQuota = (20 + (finishedProjects *2));
    }

}