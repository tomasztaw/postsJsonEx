/**
 * Created by tomasz_taw
 * Date: 10.11.2023
 * Time: 21:38
 * Project Name: postsJsonEx
 * Description:
 */
package pl.taw.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping
    List<Post> findAll() {
        return postRepository.findAll();
    }


}
