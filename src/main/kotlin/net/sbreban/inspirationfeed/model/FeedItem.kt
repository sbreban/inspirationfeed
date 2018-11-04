package net.sbreban.inspirationfeed.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "feed_items")
data class FeedItem(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = 0,

    val title: String = "",

    val description: String = "",

    val author: String = "",

    val link: String = "",

    val pubDate: Date = Date()
)