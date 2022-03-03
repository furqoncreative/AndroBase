package com.furqoncreative.androbase.ui.home.ui.dashboard

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.furqoncreative.androbase.data.Affirmation
import com.furqoncreative.androbase.databinding.ListItemBinding

class DashboardAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
    ) : RecyclerView.Adapter<DashboardAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.binding.itemTitle.text = context.resources.getString(item.stringResource)
    }

    override fun getItemCount() = dataset.size


    class ItemViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root) {

    }
}