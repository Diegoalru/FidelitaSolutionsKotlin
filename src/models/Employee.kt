package models

import ExperienceEnum

open class Employee(
    private var name: String = "",
    private var identification: String = "",
    private var age: Int = 0,
    private var isMarried: Boolean = false,
    private var salary: Double = 0.0
) {
    init {
        validateAge(age)
    }

    fun setAge(age: Int) {
        validateAge(age)
        this.age = age
    }

    fun increaseSalary(percentage: Double) {
        require(percentage >= 0) { "El porcentaje no puede ser negativo" }
        salary += salary * (percentage / 100)
    }

    override fun toString(): String {
        return "\nNombre: $name" +
                "\nCedula: $identification" +
                "\nEdad: $age" +
                "\nCasado: ${if (isMarried) "Sí" else "No"}" +
                "\nSalario: $salary" +
                "\nClasificación: ${levelExperience().getDescription()}"
    }

    private fun validateAge(age: Int) {
        require(age in 18..45) { "La edad debe estar en el rango de 18 a 45 años" }
    }

    private fun levelExperience(): ExperienceEnum = when (age) {
        in 0..21 -> ExperienceEnum.BEGINNER
        in 22..35 -> ExperienceEnum.INTERMEDIATE
        else -> ExperienceEnum.ADVANCED
    }
}