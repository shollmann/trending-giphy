package com.shollmann.giphy.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shollmann.giphy.model.Gif
import com.shollmann.giphy.model.Trending
import com.shollmann.giphy.repository.GiphyRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

internal class TrendingViewModel : ViewModel() {
    val trending = MutableLiveData<List<Gif>>()

    fun loadTrending() = GlobalScope.launch(Dispatchers.Main) {
        val serviceResponse = GiphyRepository.getTrending()

        launch(Dispatchers.Main) {
            trending.value = (serviceResponse.response as Trending).data
        }
    }
}
