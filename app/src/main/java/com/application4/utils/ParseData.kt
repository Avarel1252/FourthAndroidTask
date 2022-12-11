package com.application4.utils

class ParseData {
    fun parseUserName(extra: String?): Pair<String, String> {
        if (extra.isNullOrEmpty()) return Pair("Name", "Surname")
        val name = extra.substringBefore(".")
        val surname = extra.substringAfter(".").substringBefore("@")
        return Pair(name, surname)
    }
}