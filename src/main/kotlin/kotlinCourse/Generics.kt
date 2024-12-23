package kotlinCourse

fun main() {
    val intList: List<Int> = emptyList()
    val stringList: List<String> = listOf()

    val workersList = listOf(
        Worker(1, "John", FactoryWorker()),
        Worker("one", 1, OfficeWorker()),
        Worker(2, "Jack", ManagerWorker())
    )
    for (i in workersList) {
        println(i.id)
        println(i.name)
        println(i.type.toString())
    }

    /**
    val worker1: Worker<Int> = Worker(1, 2)  // если стоит параметр, то все значения должны быть этого типа
    val worker2: Worker<String> = Worker("1", "2") */

    val worker3 = Worker(1, "Donald", OfficeWorker())

    /** val worker4 = Worker(2, "Joe", MedicalWorker())  Здесь ошибка из-за того, что edicalWorker()
     * не использует интерфейс Job, class Worker<T, Type: Job> это ограничение не дает это использовать*/

    // Объекты создались т.к классы имеют интерфейс Job, MasterDegree, и создаются от класса (38 строка)
    val masterWorker1 = MasterWorker(1, "Joe", ManagerWorker())
    val masterWorker2 = MasterWorker(2, "Donald", OfficeWorker())

    // Тут будет ошибка т.к FactoryWorker() не имеет Job, MasterDegree интерфейсов
    //val masterWorker3 = MasterWorker(3, "John", FactoryWorker())


}

// Можно ограничивать через интерфейсы, классы используемые в дженерике.
// В данном примере можно будет добавлять Type только который использует интерфейс Job
class Worker<T, Type>(val id: T, val name: T, val type: Type) {}

// Создание нескольких ограничений для создание объекта класса
class MasterWorker<T, JobType>(val id: T, val name: T, val type: JobType) where JobType : Job, JobType : MasterDegree

interface Job
interface MasterDegree
class OfficeWorker() : Job, MasterDegree

class FactoryWorker() : Job

class ManagerWorker() : Job, MasterDegree

class MedicalWorker()

class Homeless() : Job