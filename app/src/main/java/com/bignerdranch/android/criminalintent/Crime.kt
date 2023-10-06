package com.bignerdranch.android.criminalintent

import java.util.Date
import java.util.UUID

data class Crime(
    val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Crime

        if (id != other.id) return false
        if (title != other.title) return false
        if (date != other.date) return false
        if (isSolved != other.isSolved) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + date.hashCode()
        result = 31 * result + isSolved.hashCode()
        return result
    }
}
