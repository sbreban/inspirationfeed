package net.sbreban.inspirationfeed

import com.rometools.rome.feed.rss.Channel
import com.rometools.rome.feed.rss.Description
import com.rometools.rome.feed.rss.Item
import net.sbreban.inspirationfeed.model.FeedItem
import org.springframework.web.servlet.view.feed.AbstractRssFeedView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class RssFeedView(private val feedItems: MutableList<FeedItem>) : AbstractRssFeedView() {

    override fun buildFeedMetadata(model: Map<String, Any>, feed: Channel, request: HttpServletRequest) {
        feed.title = "Inspiration Feed"
        feed.description = "Get Inspired"
        feed.link = "http://www.sbreban.ddns.net"
    }

    override fun buildFeedItems(
        model: Map<String, Any>, request: HttpServletRequest,
        response: HttpServletResponse
    ): List<Item> {

        val items: MutableList<Item> = mutableListOf()
        feedItems.forEach {
            val item = Item()
            item.title = it.title
            item.author = it.author
            item.description = Description()
            item.description.value = it.description
            item.link = it.link
            item.pubDate = it.pubDate

            items.add(item)
        }

        return items
    }

}