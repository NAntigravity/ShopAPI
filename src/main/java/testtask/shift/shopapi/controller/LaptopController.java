package testtask.shift.shopapi.controller;

import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.*;
import testtask.shift.shopapi.model.Laptop;
import testtask.shift.shopapi.service.LaptopService;

@RestController
@RequestMapping("/api/laptops")
public class LaptopController {
    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping(value = {"", "/"}, produces = "application/json")
    public @NotNull
    Iterable<Laptop> getLaptops() {
        return laptopService.getAllLaptops();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Laptop getLaptop(@PathVariable long id) {
        return laptopService.getLaptop(id);
    }

    @PostMapping(value = "/add", produces = "application/json")
    public Laptop createNewHLaptop(@RequestBody Laptop newLaptop) {
        return laptopService.save(newLaptop);
    }

    @PutMapping(value = "/{id}", produces = "application/json")
    public Laptop editLaptop(@PathVariable long id,
                                   @RequestBody @org.jetbrains.annotations.NotNull Laptop newLaptop){
        laptopService.getLaptop(id);
        newLaptop.setId(id);
        return laptopService.save(newLaptop);
    }
}
