package com.muasdev.core.repository

import com.muasdev.core.data.Note

/**
 * Created by Muhammad Mu'adz on 10/01/2020.
 * muassdev@gmail.com
 */
class NoteRepository(private val dataSource: NoteDataSource) {

    suspend fun addNote(note: Note) = dataSource.add(note)

    suspend fun getNote(id: Long) = dataSource.get(id)

    suspend fun getAllNote() = dataSource.getAll()

    suspend fun removeNote(note: Note) = dataSource.remove(note)
}