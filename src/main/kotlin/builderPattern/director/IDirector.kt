package builderPattern.director

import builderPattern.model.Sky

interface IDirector {
    fun make(): Sky
}