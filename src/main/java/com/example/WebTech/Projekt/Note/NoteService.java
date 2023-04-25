package com.example.WebTech.Projekt.Note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {

        @Autowired
        NoteRepository repo;

        public Note save(Note note) {
            return repo.save(note);
        }

        public Note get(Long id) {
            return repo.findById(id).orElseThrow(() -> new RuntimeException());
        }

        public List<Note> getAll() {
            Iterable<Note> iterator = repo.findAll();
            List<Note> notes = new ArrayList<Note>();
            for (Note note : iterator)  notes.add(note);
            return notes;
        }
}