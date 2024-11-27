package kotlinCourse.oop.abstraction

interface Actions {
    //В интерфейсе есть возможность объявить методы без реализации – что-то вроде шаблонов
    // или объявить какую-либо реализацию по умолчанию. Для этого просто нужно написать метод с телом.
    fun startWorking(name: String) {
        println("$name ${this::class.simpleName} starts working")
    }

    fun prepareForBreak()
    fun prepareForLunch()
}