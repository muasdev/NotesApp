package com.muasdev.core.usecase

import com.muasdev.core.data.Note
import com.muasdev.core.repository.NoteRepository

/**
 * Created by Muhammad Mu'adz on 10/01/2020.
 * muassdev@gmail.com
 */
class AddNote(private val noteRepository: NoteRepository) {

    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}