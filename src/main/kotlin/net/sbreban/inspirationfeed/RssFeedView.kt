package net.sbreban.inspirationfeed

import com.rometools.rome.feed.rss.Channel
import com.rometools.rome.feed.rss.Description
import com.rometools.rome.feed.rss.Item
import org.springframework.stereotype.Component
import org.springframework.web.servlet.view.feed.AbstractRssFeedView
import java.sql.Date
import java.util.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class RssFeedView : AbstractRssFeedView() {

    override fun buildFeedMetadata(model: Map<String, Any>, feed: Channel, request: HttpServletRequest) {
        feed.title = "Inspiration Feed"
        feed.description = "Get Inspired"
        feed.link = "http://www.sbreban.ddns.net"
    }

    override fun buildFeedItems(
        model: Map<String, Any>, request: HttpServletRequest,
        response: HttpServletResponse
    ): List<Item> {

        val book = Item()
        book.title = "The Strange Death of Europe: Immigration, Identity, Islam "
        book.description = Description()
        book.description.value = "Not wrong, a little controversial. Favourite book of Viktor Orban."
        book.author = "Douglas Murray"
        book.link = "https://www.goodreads.com/book/show/33584231-the-strange-death-of-europe"
        book.pubDate = Date(System.currentTimeMillis())

        val podcast = Item()
        podcast.title = "Elon Musk on Tesla’s crazy year, dying on Mars and taking Saudi money "
        podcast.description = Description()
        podcast.description.value = "Interesting interview about how Tesla is getting the electric vehicle innovations to move faster."
        podcast.author = "Recode Decode, hosted by Kara Swisher"
        podcast.link = "https://art19.com/shows/recode-decode/episodes/1261f8ff-95ea-43b1-a039-3de04be40060"
        podcast.pubDate = Date(System.currentTimeMillis())

        return Arrays.asList<Item>(book, podcast)
    }

}