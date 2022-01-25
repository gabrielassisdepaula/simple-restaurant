package com.simple.restaurant.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/product")
class ProductController {

    @GetMapping
    fun getProduct(
        @RequestHeader("X-RESTAURANT-ID") restaurantId: UUID,
        @RequestParam("productId") productId: UUID
    ) {

    }

    @PostMapping
    fun createProduct(
        @RequestBody productDTO: String //ProductDTO
    ) {

    }

    @PutMapping
    fun updateProduct(
        @RequestBody productDTO: String //ProductDTO
    ) {

    }

    @DeleteMapping
    fun deleteProduct(
        @RequestParam("productId") productId: UUID, //ProductDTO
    ) {
        // cascade deletes products associated with the product
    }
}