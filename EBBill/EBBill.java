import java.io.*;
import java.util.Scanner;

class EBBill implements Serializable {
    int houseNumber; // Default access modifier (package-private)
    String tenantName; // Default access modifier (package-private)
    double startEnergyMeterReading; // Default access modifier (package-private)
    double endEnergyMeterReading; // Default access modifier (package-private)
    double billAmount; // Default access modifier (package-private)

    EBBill(int houseNumber, String tenantName, double startEnergyMeterReading, double endEnergyMeterReading){
        this.houseNumber=houseNumber;
        this.tenantName=tenantName;
        this.startEnergyMeterReading=startEnergyMeterReading;
        this.endEnergyMeterReading=endEnergyMeterReading;
    }

    public void calculateBill() {
        billAmount = (endEnergyMeterReading - startEnergyMeterReading) * 10;
    }

    public String toString(){
        return "House Number :" + houseNumber+"\nTenant Name :" + tenantName+"\nStart Energy Meter Reading :" + startEnergyMeterReading+"\nEnd Energy Meter Reading :"+endEnergyMeterReading+"\nBill Amount :" + billAmount;
    }
}

class Demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EBBill[] bills = new EBBill[4];

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enter Bill Details");
            System.out.println("2. Save Data");
            System.out.println("3. Display Details");
            System.out.println("4. Calculate Bill Amount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    enterBillDetails(bills, scanner);
                    break;
                case 2:
                    saveData(bills);
                    break;
                case 3:
                    displayDetails(loadData(), scanner);
                    break;
                case 4:
                    calculateBillAmount(bills, scanner);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    public static void enterBillDetails(EBBill[] bills, Scanner scanner) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for House " + (i + 1));
            System.out.print("House Number: ");
            int houseNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Tenant Name: ");
            String tenantName = scanner.nextLine();
            System.out.print("Start Energy Meter Reading: ");
            double startReading = scanner.nextDouble();
            System.out.print("End Energy Meter Reading: ");
            double endReading = scanner.nextDouble();
            EBBill bill = new EBBill(houseNumber,tenantName,startReading,endReading);
            bill.calculateBill();
            bills[i] = bill;
        }
    }

    public static void saveData(EBBill[] bills) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("bills.dat");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(bills);
            System.out.println("Data saved to 'bills.dat' file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static EBBill[] loadData() {
        try (FileInputStream fileInputStream = new FileInputStream("bills.dat");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (EBBill[]) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new EBBill[4];
    }

    public static void displayDetails(EBBill[] bills, Scanner scanner) {
        System.out.print("Enter the house number to display details: ");
        int selectedHouse = scanner.nextInt();
        for (EBBill bill : bills) {
            if (bill != null && bill.houseNumber== selectedHouse) {
                System.out.println("Details\n"+bill);
                break;
            }
        }
    }

    public static void calculateBillAmount(EBBill[] bills, Scanner scanner) {
        System.out.print("Enter the house number for which you want to calculate the bill: ");
        int selectedHouse = scanner.nextInt();
        for (EBBill bill : bills) {
            if (bill != null && bill.houseNumber == selectedHouse) {
                System.out.println("Details\n"+bill);
                break;
            }
        }
    }
}
