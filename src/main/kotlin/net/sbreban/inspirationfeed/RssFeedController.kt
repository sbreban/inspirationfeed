package net.sbreban.inspirationfeed

import net.sbreban.inspirationfeed.dao.FeedItemDAO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.View

@RestController
class RssFeedController(private val feedItemDAO: FeedItemDAO) {

    @GetMapping("/feed")
    fun getFeed(): View? {
        val feedItems = feedItemDAO.findAll()
        return RssFeedView(feedItems)
    }
}