package models

class Analyst (
    name: String = "",
    id: String = "",
    age: Int = 0,
    isMarried: Boolean = false,
    salary: Double = 0.0,
    private var area: String = "",
    private var certifications: Array<String> = arrayOf()
) : Employee(name, id, age, isMarried, salary) {

    override fun toString(): String {
        return super.toString() +
                "\nÁrea: $area" +
                "\nCertificaciones: ${certifications.joinToString(", ")}"
    }
}