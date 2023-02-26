package com.example.ameni.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.ameni.Entities.Piste;
import com.example.ameni.Entities.Skieur;
import com.example.ameni.Services.IPisteService;
import com.example.ameni.Services.IskieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/piste")
public class PisteController {
    private IPisteService iPisteService;

    @PostMapping("/add")
    public Piste add(@RequestBody Piste p) {
        return iPisteService.addPiste(p);
    }

    @PutMapping("/update")
    public Piste update(@RequestBody Piste p) {
        return iPisteService.updatePiste(p);
    }

    @GetMapping("/get/{id}")
    public Piste get(@PathVariable("id") Long id) {
        return iPisteService.retrievePiste(id);
    }

    @GetMapping("/getAll")
    public List<Piste> getAll() {
        return iPisteService.retrieveAllPistes();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iPisteService.remove(id);
    }
}