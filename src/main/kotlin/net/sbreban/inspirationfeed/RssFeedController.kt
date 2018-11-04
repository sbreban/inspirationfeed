package net.sbreban.inspirationfeed

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.View

@RestController
class RssFeedController {

    @Autowired
    private val view: RssFeedView? = null

    val feed: View?
        @GetMapping("/feed")
        get() = view
}