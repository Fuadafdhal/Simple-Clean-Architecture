package com.afdhal_fa.simplecleanarchitecture.persentation.home

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.afdhal_fa.simplecleanarchitecture.R
import com.afdhal_fa.simplecleanarchitecture.abstraction.BaseActivity
import com.afdhal_fa.simplecleanarchitecture.data.vo.Result
import com.afdhal_fa.simplecleanarchitecture.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>() {
    override fun getLayoutResourceId(): Int = R.layout.activity_home
    override fun getViewModelClass(): Class<HomeViewModel> = HomeViewModel::class.java

    private val adapter by lazy { HomeAdapter(emptyList()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* observeMovieNowPlayingResult()
         vm.getNowPlaying()*/
        observeTvOnTheAirResult()
        vm.getTvOnTheAir()
        initRecycleView()
    }

    private fun observeTvOnTheAirResult() {
        vm.tvOnTheAir.observe(this, Observer {
            when (it) {
                is Result.Loading -> {

                }
                is Result.Success -> {
                    adapter.refreshNowPlaying(it.data)
                }
                is Result.Empty -> {

                }
                is Result.Error -> {

                }
            }
        })
    }

    private fun observeMovieNowPlayingResult() {
        vm.nowPlaying.observe(this, Observer {
            when (it) {
                is Result.Loading -> {

                }
                is Result.Success -> {
//                    adapter.refreshNowPlaying(it.data)
                }
                is Result.Empty -> {

                }
                is Result.Error -> {

                }
            }
        })
    }

    private fun initRecycleView() {
        val layoutManager = LinearLayoutManager(this)
        binding.rvMovieNowPlaying.layoutManager = layoutManager
        binding.rvMovieNowPlaying.adapter = adapter
    }
}
