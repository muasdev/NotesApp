package com.muasdev.core.repository

import com.muasdev.core.data.Note

/**
 * Created by Muhammad Mu'adz on 10/01/2020.
 * muassdev@gmail.com
 */
interface NoteDataSource {

    suspend fun add(note: Note)

    suspend fun get(id: Long): Note?

    suspend fun getAll(): List<Note>

    suspend fun remove(note: Note)
}