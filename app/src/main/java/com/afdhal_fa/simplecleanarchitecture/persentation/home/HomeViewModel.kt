package com.afdhal_fa.simplecleanarchitecture.persentation.home

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.afdhal_fa.simplecleanarchitecture.abstraction.UseCase
import com.afdhal_fa.simplecleanarchitecture.data.vo.Result
import com.afdhal_fa.simplecleanarchitecture.domain.entity.NowPlaying
import com.afdhal_fa.simplecleanarchitecture.domain.entity.TvOnTheAir
import com.afdhal_fa.simplecleanarchitecture.domain.usecase.GetMovieNowPlayingUseCase
import com.afdhal_fa.simplecleanarchitecture.domain.usecase.GetTvOnTheAirUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

class HomeViewModel @Inject constructor(
    private val getMovieNowPlayingUseCase: GetMovieNowPlayingUseCase,
    private val getTvOnTheAirUseCase: GetTvOnTheAirUseCase
) : ViewModel() {

    private val _nowPlaying = MutableLiveData<Result<List<NowPlaying>>>()
    val nowPlaying: LiveData<Result<List<NowPlaying>>>
        get() = _nowPlaying

    private val _tvOnTheAir = MutableLiveData<Result<List<TvOnTheAir>>>()
    val tvOnTheAir: LiveData<Result<List<TvOnTheAir>>>
        get() = _tvOnTheAir

    fun getNowPlaying() {
        _nowPlaying.value = Result.Loading
        viewModelScope.launch {
            _nowPlaying.value = getMovieNowPlayingUseCase(UseCase.None)
        }
    }

    fun getTvOnTheAir() {
        _tvOnTheAir.value = Result.Loading
        viewModelScope.launch {
            _tvOnTheAir.value = getTvOnTheAirUseCase(UseCase.None)
        }
    }
}