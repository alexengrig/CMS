package alexengrig.cms.resource;

import alexengrig.cms.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryResource {

    @GetMapping("/{id}")
    public ResponseEntity<Category> findOne(@PathVariable("id") Category categoryFromDb) {
        return ResponseEntity.ok(categoryFromDb);
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok(Arrays.asList(new Category(), new Category()));
    }

    @PostMapping
    public ResponseEntity<Category> newCategory(@RequestBody Category category) {
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("id") Category categoryFromDb,
                                                   @RequestBody Category category) {
        return ResponseEntity.ok(category);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeCategory(@PathVariable("id") Category categoryFromDb) {

    }

}
