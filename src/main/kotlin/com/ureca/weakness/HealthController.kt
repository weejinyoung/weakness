package com.ureca.weakness

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/health")
class HealthController {

    @GetMapping("/call-get")
    fun getHealth() = "Get Health!"

    @PostMapping("/call-post")
    fun postHealth() = "Post Health!"
}