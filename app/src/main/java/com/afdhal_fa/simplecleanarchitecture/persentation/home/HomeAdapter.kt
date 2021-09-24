package com.afdhal_fa.simplecleanarchitecture.persentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.afdhal_fa.simplecleanarchitecture.databinding.ListItemNowPlayingBinding
import com.afdhal_fa.simplecleanarchitecture.domain.entity.TvOnTheAir

/**
 * Created by Muh Fuad Afdhal on 9/24/2021
 * Email: fuad.afdal.fa@gmail.com
 */

class HomeAdapter(private var nowPlaying: List<TvOnTheAir>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListItemNowPlayingBinding.inflate(layoutInflater, parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(nowPlaying[position])
    }

    class HomeViewHolder(private val binding: ListItemNowPlayingBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(nowPlaying: TvOnTheAir) {
            binding.nowPlaying = nowPlaying
        }
    }

    override fun getItemCount(): Int = nowPlaying.size

    fun refreshNowPlaying(nowPlaying: List<TvOnTheAir>) {
        this.nowPlaying = nowPlaying
        notifyDataSetChanged()
    }

}
