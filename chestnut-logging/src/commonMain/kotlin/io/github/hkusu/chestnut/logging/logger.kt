package io.github.hkusu.chestnut.logging

interface Logger {
    fun log(
        level: Level = Level.Debug,
        tag: String = "Chestnut",
        message: () -> String,
    )

    enum class Level {
        Verbose,
        Debug,
        Info,
        Warn,
        Error,
        Assert
    }
}