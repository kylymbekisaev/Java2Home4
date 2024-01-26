package com.example.java2home4.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.java2home4.data.NotesModel
import com.example.java2home4.databinding.NotItemBinding

class NoteAdapter: RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    private var nateList = mutableListOf<NotesModel>()

    fun setNoteList(noteList: MutableList<NotesModel>){
        this.nateList = noteList
    }

    class NoteViewHolder(private val binding: NotItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun onBind(notesModel: NotesModel) {
            binding.tvNot.text = notesModel.note
            binding.tvTitle.text = notesModel.title
            binding.tvData.text = notesModel.data
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(
            NotItemBinding.inflate(LayoutInflater.from(parent.context))
        )
    }

    override fun getItemCount(): Int {
        return nateList.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.onBind(nateList[position])
    }

}