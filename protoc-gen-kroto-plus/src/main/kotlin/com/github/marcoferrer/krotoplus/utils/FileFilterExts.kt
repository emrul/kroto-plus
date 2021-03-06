package com.github.marcoferrer.krotoplus.utils

import com.github.marcoferrer.krotoplus.config.FileFilter

data class RegexFilter(val include: List<Regex>, val exclude: List<Regex>) {

    fun isEmpty() = include.isEmpty() && exclude.isEmpty()

    fun matches(value: String) = when{
        include.isNotEmpty() -> include.any { it.matches(value) } && exclude.none { it.matches(value) }
        exclude.isNotEmpty() -> exclude.none { it.matches(value) }
        else -> true
    }
}

fun globPatternToRegexString(globPattern: String): String = globPattern
    .replace(".", "\\.")
    .replace("?", ".")
    .replace("*", ".*")

private val filterRegexListCache = mutableMapOf<FileFilter, RegexFilter>()

fun FileFilter.getRegexFilter(): RegexFilter =
    filterRegexListCache.getOrPut(this) {
        RegexFilter(
            include = includePathList.map { Regex("^(${globPatternToRegexString(it)})$") },
            exclude = excludePathList.map { Regex("^(${globPatternToRegexString(it)})$") }
        )
    }

fun FileFilter.matches(path: String): Boolean = getRegexFilter().matches(path)
