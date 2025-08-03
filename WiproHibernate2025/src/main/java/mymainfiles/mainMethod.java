package mymainfiles;



import java.util.List;
import java.util.Scanner;
import mypojofiles.Item;
import mydaofiles.ItemDAO;

public class mainMethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemDAO dao = new ItemDAO();
        int choice;

        do {
            System.out.println("\nHibernate Item CRUD");
            System.out.println("-------------------------------");
            System.out.println("1. Add");
            System.out.println("2. View All");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Get by ID");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    dao.addItem(new Item(name, price));
                    break;

                case 2:
                    List<Item> items = dao.getAllItems();
                    for (Item i : items) {
                        System.out.println(i.getId() + " - " + i.getName() + " - " + i.getPrice());
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    Item updateItem = dao.getItemById(updateId);
                    if (updateItem != null) {
                        System.out.print("Enter new name: ");
                        updateItem.setName(sc.next());
                        System.out.print("Enter new price: ");
                        updateItem.setPrice(sc.nextDouble());
                        dao.updateItem(updateItem);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    dao.deleteItem(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter ID to fetch: ");
                    int getId = sc.nextInt();
                    Item item = dao.getItemById(getId);
                    if (item != null) {
                        System.out.println("ID: " + item.getId());
                        System.out.println("Name: " + item.getName());
                        System.out.println("Price: " + item.getPrice());
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
        sc.close();
    }
}

