enum class ExperienceEnum(private val description: String) {
    BEGINNER("Beginner Level"),
    INTERMEDIATE("Intermediate Level"),
    ADVANCED("Advanced Level");

    fun getDescription(): String = description
}