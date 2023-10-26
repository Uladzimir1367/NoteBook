package controller;

import java.util.List;

import model.Note;

import model.repository.impl.NoteRepository;
public class Controller {
private NoteRepository noteRepository;

    public Controller(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public void create(Note note) {
        noteRepository.create(note);
    }

    public Note read(long id) {
        return noteRepository.read(id);
    }
    public List<Note> readAll() {
        return noteRepository.readAll();
    }


    public void update(long id, Note noteForUpdate) {
        noteRepository.update(id, noteForUpdate);
    }

    public boolean delete(long id) {
        return noteRepository.delete(id);
    }
}
