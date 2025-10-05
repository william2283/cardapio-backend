package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/food")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @PostMapping
    public FoodResponseDTO saveFood(@RequestBody FoodRequestDTO data) {
        // Validação simples
        if (data.title() == null || data.title().isEmpty() ||
                data.image() == null || data.image().isEmpty() ||
                data.price() == null) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Todos os campos devem ser preenchidos"
            );
        }


        Food foodData = new Food(data);
        repository.save(foodData);


        return new FoodResponseDTO(foodData);
    }

    @GetMapping
    public List<FoodResponseDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(FoodResponseDTO::new)
                .toList();
    }
}

