package com.example.newfeatures;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("presidents")
public class PresidentController {

    List<President> presidents = new ArrayList<>();

    @PostMapping
    public President addPresident(@RequestBody President president) {
        presidents.add(president);
        return president;
    }
}
