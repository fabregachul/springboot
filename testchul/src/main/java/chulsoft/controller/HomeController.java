package chulsoft.controller;

import chulsoft.domain.posts.PostsRepository;
import chulsoft.dto.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class HomeController {

    private PostsRepository postsRepository;

    @RequestMapping("/qkrduscnf")
    public String index(){
        return "확인!";
    }

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld!!!";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
}
