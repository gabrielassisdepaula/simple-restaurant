package com.simple.restaurant.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/order")
class OrderController {

    @GetMapping
    fun getOrder(
        @RequestHeader("X-RESTAURANT-ID") restaurantId: UUID,
        @RequestParam("orderId") orderId: UUID
    ) {

    }

    @PostMapping
    fun createOrder(
        @RequestHeader("X-RESTAURANT-ID") restaurantId: UUID,
        @RequestBody orderDTO: String //OrderDTO
    ) {

    }

    @DeleteMapping
    fun deleteOrder(
        @RequestHeader("X-RESTAURANT-ID") restaurantId: UUID,
        @RequestParam("orderId") orderId: UUID,
    ) {

    }
}