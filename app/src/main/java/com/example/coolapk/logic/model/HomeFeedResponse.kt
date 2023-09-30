package com.example.coolapk.logic.model

import com.google.gson.annotations.SerializedName

data class HomeFeedResponse(val data: List<Data>) {

    data class Data(
        val entityType: String,
        val entities: List<Entities>,
        val id: String,
        val uid: String,
        val username: String,
        val tpic: String,
        val message: String,
        val pic: String,
        val tags: String,
        val likenum: Int,
        val commentnum: Int,
        val replynum: Int,
        val forwardnum: Int,
        val favnum: Int,
        @SerializedName("create_time") val createTime: String,
        @SerializedName("device_title") val deviceTitle: String,
        @SerializedName("device_name") val deviceName: String,
        @SerializedName("recent_reply_ids") val recentReplyIds: String,
        @SerializedName("recent_like_list") val recentLikeList: String,
        val entityId: String,
        val userAvatar: String,
        val infoHtml: String,
        val title: String,
        val picArr: List<String>,
        val replyRows: List<ReplyRows>
    )

    data class ReplyRows(
        val id: String, val uid: String, val username: String,
        val message: String, val likenum: String
    )

    data class Entities(
        val pic: String,
        val title: String,
    )

}
