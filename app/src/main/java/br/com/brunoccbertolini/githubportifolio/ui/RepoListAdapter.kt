package br.com.brunoccbertolini.githubportifolio.ui

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView


import br.com.brunoccbertolini.githubportifolio.data.model.Repo
import br.com.brunoccbertolini.githubportifolio.databinding.ItemRepoBinding
import com.bumptech.glide.Glide

class RepoListAdapter: ListAdapter<Repo ,RepoListAdapter.RepolistViewHolder>(DiffCallback()) {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepolistViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemRepoBinding.inflate(inflater, parent, false)
        return RepolistViewHolder(binding)
    }


    override fun onBindViewHolder(holder: RepolistViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class RepolistViewHolder(private val viewBinding: ItemRepoBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(item: Repo) {
            viewBinding.tvName.text = item.name
            viewBinding.tvDescription.text = item.description
            viewBinding.tvLanguage.text = item.language
            viewBinding.chipStars.text = item.stargazersCount.toString()

            Glide.with(viewBinding.root.context)
                .load(item.owner.avatar_url).into(viewBinding.ivUser)

        }

    }

}

class DiffCallback: DiffUtil.ItemCallback<Repo>(){
    override fun areItemsTheSame(oldItem: Repo, newItem: Repo): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Repo, newItem: Repo): Boolean {
        return oldItem.id == newItem.id
    }

}