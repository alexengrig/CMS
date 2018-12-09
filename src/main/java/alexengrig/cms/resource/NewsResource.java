package alexengrig.cms.resource;

import alexengrig.cms.model.News;
import alexengrig.cms.model.Review;
import alexengrig.cms.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsResource {

    @GetMapping("/{id}")
    public ResponseEntity<News> findOne(@PathVariable("id") News newsFromDb) {
        return ResponseEntity.ok(newsFromDb);
    }

    @GetMapping
    public ResponseEntity<List<News>> findAll() {
        return ResponseEntity.ok(Arrays.asList(new News(), new News()));
    }

    @PostMapping
    public ResponseEntity<News> newNews(@RequestBody News news) {
        return new ResponseEntity<>(news, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<News> updateNews(@PathVariable("id") News newsFromDb,
                                           @RequestBody News news) {
        return ResponseEntity.ok(news);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeNews(@PathVariable("id") News newsFromDb) {

    }

    @GetMapping("/{id}/review/{userId}")
    public ResponseEntity<Review> review(@PathVariable("id") News newsFromDb,
                                         @PathVariable("userId") User userFromDb) {
        return ResponseEntity.ok(new Review());
    }

    @GetMapping("/revised")
    public ResponseEntity<List<News>> revisedNews() {
        return ResponseEntity.ok(Arrays.asList(new News(), new News()));
    }

}
