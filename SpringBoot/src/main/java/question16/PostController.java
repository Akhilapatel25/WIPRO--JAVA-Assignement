package question16;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import question16.Post;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final Map<Integer, Post> postStore = new HashMap<>();
    private int currentId = 1;

    @GetMapping
    public List<Post> getAllPosts() {
        return new ArrayList<>(postStore.values());
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable int id) {
        return postStore.get(id);
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        post.setId(currentId++);
        postStore.put(post.getId(), post);
        return post;
    }

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable int id, @RequestBody Post updatedPost) {
        updatedPost.setId(id);
        postStore.put(id, updatedPost);
        return updatedPost;
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable int id) {
        postStore.remove(id);
    }
}
