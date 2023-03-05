package com.example.ameni.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.ameni.Entities.Skieur;
import com.example.ameni.Services.IskieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurController {
    private IskieurService iskieurService;

    @PostMapping("/add")
    public Skieur addSkieur(@RequestBody Skieur s) {
        return iskieurService.addSkieur(s);
    }

    @PutMapping("/update")
    public Skieur updateSkieur(@RequestBody Skieur skieur) {
        return iskieurService.updateSkieur(skieur);
    }

    @GetMapping("/get/{id}")
    public Skieur getSkieur(@PathVariable("id") Long numSkieur) {
        return iskieurService.retrieveSkieur(numSkieur);
    }

    @GetMapping("/getAll")
    public List<Skieur> getAllSkieurs() {
        return iskieurService.retrieveAllSkieurs();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iskieurService.removeSkieur(id);
    }
    public Skieur assignSkieurToPiste( Long numSkieur, Long numPiste){
        return iskieurService.assignSkieurToPiste(numSkieur,numPiste);
    }
}