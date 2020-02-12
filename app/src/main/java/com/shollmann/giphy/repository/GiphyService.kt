package com.shollmann.giphy.repository

import com.shollmann.giphy.model.Trending
import retrofit2.Call
import retrofit2.http.GET

interface GiphyService {
    @GET("stickers/trending")
    fun getTrending(): Call<Trending>
}
