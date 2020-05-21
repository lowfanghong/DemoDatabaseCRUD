package com.myapplicationdev.android.demodatabasecrud;

import java.io.Serializable;

public class Note implements Serializable {

 private int id;
 private String NoteContent;

    public Note(int id, String noteContent) {
        this.id = id;
        NoteContent = noteContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoteContent() {
        return NoteContent;
    }

    public void setNoteContent(String noteContent) {
        NoteContent = noteContent;
    }
    @Override
    public String toString() { return "ID:" + id + ", " + NoteContent;  }

}


