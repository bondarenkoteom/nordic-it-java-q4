package com.homework1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homework1.parking.Place;

@RestController
public class ParkController {

    @GetMapping("/free")
    private String free(Model model) {
        List<Place> places = new ArrayList<>();
        Place place1 = new Place(1, false);
        Place place2 = new Place(2, false);
        Place place3 = new Place(3, false);
        Place place4 = new Place(4, false);
        Place place5 = new Place(5, false);
        Place place6 = new Place(6, false);
        Place place7 = new Place(7, false);
        Place place8 = new Place(8, false);
        Place place9 = new Place(9, false);
        Place place10 = new Place(10, false);
        Place place11 = new Place(11, false);
        Place place12 = new Place(12, false);
        Place place13 = new Place(13, false);
        Place place14 = new Place(14, false);
        Place place15 = new Place(15, false);
        Place place16 = new Place(16, false);
        Place place17 = new Place(17, false);
        Place place18 = new Place(18, false);
        Place place19 = new Place(19, false);
        Place place20 = new Place(20, false);
        return "Места" + " " + place1 + " " + place2;

    }

    @PostMapping("park")
    private String park() {

        return null;

    }
}
