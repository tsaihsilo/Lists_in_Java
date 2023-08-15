import java.util.Scanner;
import java.util.InputMismatchException;

class MainProgram{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String selection;

        Persons ps1 = new Persons();

        do {
            System.out.println("Enter option from list below: ");
            System.out.println("   1) Display complete directory");
            System.out.println("   2) Enter new person");
            System.out.println("   3) Search for person");
            System.out.println("   4) Modify person information");
            System.out.println("   5) Delete a record");
            System.out.println("   Q) Quit");
            System.out.print("Enter your option: ");

            selection = scan.next();

            switch (selection){
                case "1":
                    for (int i = 0; i < ps1.getSize(); i += 1) { 
                        System.out.println(ps1.getInternalList().get(i).toString());		
                    }
                    break;
                case "2":
                    enterNewPerson(ps1, scan);
                    break;
                case "3":
                    
                    System.out.println("Enter name to search: ");
                    scan.nextLine();
                    String searchName = scan.nextLine();
                    for (int i = 0; i < ps1.search(searchName).getSize(); i += 1) { 
                        System.out.println(ps1.search(searchName).getInternalList().get(i).toString());	
                        } 
                    break;
                case "4":
                    modify(ps1, scan);
                    break;
                case "5":
                    delete(ps1, scan);
                    break;
                case "Q":
                    break;
                }
            
            System.out.print("\n");

        } while (!"Q".equalsIgnoreCase(selection));

        scan.close();
    }

    public static void enterNewPerson(Persons P, Scanner k) {
        k.nextLine();
        System.out.println("Enter name: ");
        String name = k.nextLine();
        System.out.println("Enter address: ");
        String address = k.nextLine();
        System.out.println("Enter phone: ");
        String phone = k.nextLine();
        System.out.println("Is the person a student? (y/n)");
        String answer = k.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            System.out.println("Enter graduation year: ");
            int year = k.nextInt();
            k.nextLine(); 
            Student personCreated = new Student(name, address, phone, year);
            P.add(personCreated);
        }
        else {
            System.out.println("Is the person an employee? (y/n)");
            String isEmployee = k.nextLine();
            if (isEmployee.equalsIgnoreCase("y")) {
                System.out.println("Enter department: ");
                String department = k.nextLine();
                Employee personCreated = new Employee(name, address, phone, department);
                P.add(personCreated);
            }
            else{
                Person personCreated = new Person(name, address, phone);
                P.add(personCreated);
                System.out.println("Person " + name + " " + address + " " + phone + " " + " is added");
            }
        }
    }

    public static void modify(Persons P2, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the name of the person that you want to modify: ");
        String searchName = scanner.nextLine();
        for (int i = 0; i < P2.getSize(); i += 1) { 
            Persons match_arry = P2.search(searchName);
            System.out.println(match_arry.getInternalList().get(i).toString());
            System.out.println("Do you want to modify this record? (y/n)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.print("Enter name: ");
                String changeName = scanner.nextLine();
                match_arry.getInternalList().get(i).setName(changeName);
                System.out.print("Enter address: ");
                String changeAddress = scanner.nextLine();
                match_arry.getInternalList().get(i).setAddress(changeAddress);
                System.out.print("Enter phone: ");
                String changePhone = scanner.nextLine();
                match_arry.getInternalList().get(i).setPhone(changePhone);
                break;
            }
        } 
    }

    public static void delete(Persons P3, Scanner scanner) {
        System.out.println("Enter the index of the record that you want to delete: ");
        try{
            int index = scanner.nextInt();
            if (index < 0 || index >= P3.getSize()) {
                System.out.println("Error: invalid index.");
            }
            else{
                System.out.println("Record to delete: " + P3.getInternalList().get(index).toString());
                System.out.println("Do you want to delete this record? (y/n)");
                scanner.nextLine();
                String answerDelete = scanner.nextLine();
                if (answerDelete.equalsIgnoreCase("y")) {
                    P3.delete(index);
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Error: Invalid input. Please enter an integer.");
        }
    }
}