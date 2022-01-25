package com.simple.restaurant.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/restaurant")
class RestaurantController {

    @GetMapping
    fun getRestaurant(
        @RequestParam("restaurantId") restaurantId: UUID
    ) {

    }

    @PostMapping
    fun createRestaurant(
        @RequestBody restaurantDTO: String //RestaurantDTO
    ) {

    }

    @PutMapping
    fun updateRestaurant(
        @RequestBody restaurantDTO: String //RestaurantDTO
    ) {

    }

    @DeleteMapping
    fun deleteRestaurant(
        @RequestParam("restaurantId") restaurantId: UUID, //RestaurantDTO
        @RequestParam("cascade", required = false) cascade: Boolean = true
    ) {
        // cascade deletes products associated with the restaurant
    }

}