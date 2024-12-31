package com.ifisher.Controllers;


import com.ifisher.DTOs.MarkResponseDTO;
import com.ifisher.Models.Mark;
import com.ifisher.Repositories.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marks")
public class MarkController {

    @GetMapping
    public ResponseEntity<String> getMarks(){
        return ResponseEntity.ok("success");
    }

    @Autowired
    private MarkRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/especie/{id}")
    public ResponseEntity<MarkResponseDTO> getMark(@PathVariable Long id){
        Optional <Mark> mark = repository.findById(id);
        if (mark.isPresent()){
            MarkResponseDTO markDTO = new MarkResponseDTO(mark.get());
            return ResponseEntity.ok(markDTO);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
