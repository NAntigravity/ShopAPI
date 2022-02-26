package testtask.shift.shopapi.controller;

import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.*;
import testtask.shift.shopapi.model.HardDrive;
import testtask.shift.shopapi.service.HardDriveService;

@RestController
@RequestMapping("/api/hdds")
public class HardDriveController {
    private final HardDriveService hardDriveService;

    public HardDriveController(HardDriveService hardDriveService) {
        this.hardDriveService = hardDriveService;
    }

    @GetMapping(value = {"", "/"}, produces = "application/json")
    public @NotNull
    Iterable<HardDrive> getHardDrives() {
        return hardDriveService.getAllHardDrives();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public HardDrive getHardDrive(@PathVariable long id) {
        return hardDriveService.getHardDrive(id);
    }

    @PostMapping(value = "/add", produces = "application/json")
    public HardDrive createNewHardDrive(@RequestBody HardDrive newHardDrive) {
        return hardDriveService.save(newHardDrive);
    }

    @PutMapping(value = "/{id}", produces = "application/json")
    public HardDrive editHardDrive(@PathVariable long id,
                               @RequestBody @org.jetbrains.annotations.NotNull HardDrive newHardDrive){
        hardDriveService.getHardDrive(id);
        newHardDrive.setId(id);
        return hardDriveService.save(newHardDrive);
    }
}
