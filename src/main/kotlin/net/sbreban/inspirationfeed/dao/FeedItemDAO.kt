package net.sbreban.inspirationfeed.dao

import net.sbreban.inspirationfeed.model.FeedItem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FeedItemDAO : JpaRepository<FeedItem, Int>