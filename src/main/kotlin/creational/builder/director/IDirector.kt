package creational.builder.director

import creational.builder.model.Sky

interface IDirector {
    fun make(): Sky
}