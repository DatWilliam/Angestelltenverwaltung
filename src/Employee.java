/**
 * create different employees
 * this class is abstract
 * @author Liam Wipperfuerth
 * @version 15.05.2021
 */
public abstract class Employee {
    protected String surname;
    protected String name;
    protected Position position;
    protected int salary;
    protected float vacationQuota;

    /**
     * different positions within the employees
     */
    public enum Position{
        Guard, SeniorDeveloper, JuniorDeveloper, ProjectManager, CEO;
    }

    //constructor
    public Employee(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    /**
     * @return this surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * sets new surname
     * @param surname the new surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return this name
     */
    public String getName() {
        return name;
    }

    /**
     * sets new name
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return this position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * sets new position
     * @param position the new position
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * @return this salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * calcs the salary
     * calc is different for different positions
     */
    public abstract void calculateSalary();

    /**
     * rounds the days off and returns them
     * @return the days off
     */
    public int getVacationQuota() {
        return (int) vacationQuota;
    }

    /**
     * calcs the days off
     * calc is different for different positions
     */
    public abstract void calculateVacationQuota();
}
