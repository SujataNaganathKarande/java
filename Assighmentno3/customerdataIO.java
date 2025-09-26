package Assighmentno3;
import java.io.*;
import java.util.*;
public class customerdataIO {
public class CustomerDataIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "customers.dat";

        try {
            // Writing customer data to file
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));

            System.out.print("Enter number of customers: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // consume newline

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for Customer " + (i + 1));
                System.out.print("Customer ID: ");
                int c_id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Customer Name: ");
                String cname = scanner.nextLine();

                System.out.print("Address: ");
                String address = scanner.nextLine();

                System.out.print("Mobile No: ");
                String mobile_no = scanner.nextLine();

                // Write data
                dos.writeInt(c_id);
                dos.writeUTF(cname);
                dos.writeUTF(address);
                dos.writeUTF(mobile_no);
            }
            dos.close();

            // Reading customer data from file
            DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
            System.out.println("\nCustomer Details from File:");
            for (int i = 0; i < n; i++) {
                int c_id = dis.readInt();
                String cname = dis.readUTF();
                String address = dis.readUTF();
                String mobile_no = dis.readUTF();

                System.out.println("\nCustomer " + (i + 1));
                System.out.println("ID: " + c_id);
                System.out.println("Name: " + cname);
                System.out.println("Address: " + address);
                System.out.println("Mobile No: " + mobile_no);
            }
            dis.close();

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}}




