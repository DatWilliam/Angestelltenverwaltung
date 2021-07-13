import java.util.Scanner;

/**
 * Main class to run the Code and create an array of employees
 * @author Liam Wipperfuerth
 * @version 15.05.2021
 */

public class Application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Employee[] employees = new Employee[15];

        loop(scan, employees);
    }

    /**
     * process of adding new employees to an array
     * @param scan the scanner
     * @param employees the array of employees
     */
    public static void loop(Scanner scan, Employee[] employees){
        String input;
        String surname;
        String name;
        int index = 0;
        boolean exit = false;

        for(int i = 0; !exit && i < 15; i++) {
            System.out.println("Commands: [new_guard],[new_it],[new_manager],[show_employees],[exit]");
            input = scan.nextLine();

            switch (input) {
                case "new_guard":
                    int a, b, c;

                    System.out.println("Adding new guard");
                    System.out.println("Surname:");
                    surname = scan.nextLine();

                    System.out.println("Name:");
                    name = scan.nextLine();

                    System.out.println("Night shifts (per month) :");
                    a = Integer.parseInt(scan.nextLine());

                    System.out.println("Early shifts (per month) :");
                    b = Integer.parseInt(scan.nextLine());

                    System.out.println("Late shifts (per month) :");
                    c = Integer.parseInt(scan.nextLine());

                    System.out.println("Added " + name + ", " + surname + " to company.");

                    employees[i] = new Guard(surname, name, a, b, c);
                    index++;
                    break;
                case "new_it":
                    int y;
                    int x;
                    Employee.Position rank;

                    System.out.println("Adding new IT-personel:");
                    System.out.println("Surname:");
                    surname = scan.nextLine();

                    System.out.println("Name:");
                    name = scan.nextLine();

                    System.out.println("Rank (JuniorDeveloper or SeniorDeveloper):");
                    rank = Employee.Position.valueOf(scan.nextLine());

                    System.out.println("Year joined:");
                    y = Integer.parseInt(scan.nextLine());

                    System.out.println("Weekhours:");
                    x = Integer.parseInt(scan.nextLine());

                    System.out.println("Added " + name + ", " + surname + " to company.");

                    employees[i] = new Developer(surname, name, rank, x, y);
                    index++;
                    break;
                case "new_manager":
                    int z;
                    Employee.Position position;

                    System.out.println("Adding new Management:");
                    System.out.println("Surname:");
                    surname = scan.nextLine();

                    System.out.println("Name:");
                    name = scan.nextLine();

                    System.out.println("Rank (CEO or ProjectManager):");
                    position = Employee.Position.valueOf(scan.nextLine());

                    System.out.println("Finished Projects:");
                    z = Integer.parseInt(scan.nextLine());

                    System.out.println("Added " + name + ", " + surname + " to company.");

                    employees[i] = new Management(surname, name, position, z);
                    index++;
                    break;
                case "show_employees":
                    for (int j = 0; j < index; j++) {
                        System.out.println(employees[j].toString());
                    }
                    break;
                default:
                    exit = true;
                    break;
            }
        }
    }
}
