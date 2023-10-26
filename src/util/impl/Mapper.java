package util.impl;

import java.time.LocalDate;

import model.Note;
import util.Mappable;

public class Mapper implements Mappable<String, Note> {
    @Override
    public String input(Note note) {
        return String.format("%s" + ", " + "%s" + ", " + "%s"
                , note.getId(), note.getNote(), note.getLocalDate());
    }

    @Override
    public Note output(String s) {
        String[] notes = s.split(",");
        long id;
        if (isDigit(notes[0])) {
            id = Long.parseLong(notes[0]);
            return new Note(id, notes[1], LocalDate.now());
        }
        throw new NumberFormatException();
    }

    public boolean isDigit(String idNumber) {
        try {
            Long.parseLong(idNumber);
            return true;
        } catch (Exception e) {
            System.err.println("Program will finish incorrect.");
            return false;
        }
    }
}
   

