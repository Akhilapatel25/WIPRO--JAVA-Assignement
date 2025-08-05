
package question16;


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Component
public class PostClient {

    private final String BASE_URL = "http://localhost:8080/api/posts";
    private final RestTemplate restTemplate = new RestTemplate();

    public void getAllPosts() {
        List<Post> posts = Arrays.asList(restTemplate.getForObject(BASE_URL, Post[].class));
        if (posts.isEmpty()) {
            System.out.println("No posts found.");
        } else {
            for (Post post : posts) {
                System.out.println(post);
            }
        }
    }

    public void getPostById(int id) {
        try {
            Post post = restTemplate.getForObject(BASE_URL + "/" + id, Post.class);
            System.out.println(post);
        } catch (Exception e) {
            System.out.println("Post not found with ID: " + id);
        }
    }

    public void createPost(Post post) {
        Post created = restTemplate.postForObject(BASE_URL, post, Post.class);
        System.out.println("Created: " + created);
    }

    public void updatePost(int id, Post post) {
        restTemplate.put(BASE_URL + "/" + id, post);
        System.out.println("Updated post with ID: " + id);
    }

    public void deletePost(int id) {
        restTemplate.delete(BASE_URL + "/" + id);
        System.out.println("Deleted post with ID: " + id);
    }
}
