package question16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class RestTemplateApplication implements CommandLineRunner {

    @Autowired
    private PostClient client;

    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nChoose an operation (GETALL, GET, POST, PUT, DELETE, EXIT): ");
            choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "GETALL":
                    client.getAllPosts();
                    break;
                case "GET":
                    System.out.print("Enter Post ID: ");
                    int getId = scanner.nextInt();
                    scanner.nextLine();
                    client.getPostById(getId);
                    break;
                case "POST":
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Body: ");
                    String body = scanner.nextLine();
                    Post newPost = new Post(userId, 0, title, body);
                    client.createPost(newPost);
                    break;
                case "PUT":
                    System.out.print("Enter Post ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Body: ");
                    String newBody = scanner.nextLine();
                    Post updatedPost = new Post(1, updateId, newTitle, newBody);
                    client.updatePost(updateId, updatedPost);
                    break;
                case "DELETE":
                    System.out.print("Enter Post ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    client.deletePost(deleteId);
                    break;
                case "EXIT":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (!choice.equals("EXIT"));

        scanner.close();
    }
}
