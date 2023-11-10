/**
 * Created by tomasz_taw
 * Date: 10.11.2023
 * Time: 21:41
 * Project Name: postsJsonEx
 * Description:
 */
package pl.taw;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import pl.taw.post.PostRepository;

public class DataLoader implements CommandLineRunner {

    private final PostRepository postRepository;
    private final ObjectMapper objectMapper;

    public DataLoader(PostRepository postRepository, ObjectMapper objectMapper) {
        this.postRepository = postRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
