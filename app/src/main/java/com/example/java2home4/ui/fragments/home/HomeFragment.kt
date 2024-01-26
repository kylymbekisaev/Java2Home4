package com.example.java2home4.ui.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.java2home4.data.NotesModel
import com.example.java2home4.databinding.FragmentHomeBinding
import com.example.java2home4.ui.adapters.NoteAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = _binding!!
    private val noteAdapter = NoteAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializ()
    }

    private fun initializ() {
        noteAdapter.setNoteList(
            mutableListOf(
                NotesModel("Title", "Note", "Data \n time"),
                NotesModel("Title", "Note", "Data \n time"),
                NotesModel("Title", "Note", "Data \n time")
            )
        )
        binding.rvNotes.adapter = noteAdapter
    }


}