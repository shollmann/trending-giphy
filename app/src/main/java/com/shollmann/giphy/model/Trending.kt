package com.shollmann.giphy.model

data class Trending(val data: List<Gif>)

data class Gif(val title: String, val contentUrl: String)
