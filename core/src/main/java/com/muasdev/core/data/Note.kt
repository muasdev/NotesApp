package com.muasdev.core.data

/**
 * Created by Muhammad Mu'adz on 10/01/2020.
 * muassdev@gmail.com
 */
data class Note (
    var title: String,
    var content: String,
    var creationTime: Long,
    var updateTime: Long,
    var id: Long = 0
)