package com.ureca.weakness

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("/api/v1/send")
class SenderController {

    @GetMapping("/get/{domain}")
    fun getHealth(@PathVariable domain: String) {
        RestTemplate().getForEntity(
            "https://$domain",
            String.Companion::class.java).body
    }
}