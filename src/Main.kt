import models.Analyst
import models.Employee
import javax.swing.JOptionPane

fun main() {
    try {
        // Crear un arreglo de empleados
        val empleados = arrayOf(
            Employee("Jean Ramos", "123456789", 20, true, 2500.0),
            Analyst("Carla Mendez", "852369741", 35, true, 4000.0, "Finanzas", arrayOf("CFA", "CPA")),
            Employee("Maria Lopez", "321654987", 17, false, 3000.0)
        )

        // Aumentar salario en un 10% para todos los empleados
        empleados.forEach { it.increaseSalary(10.0) }

        // Mostrar información de los empleados
        empleados.forEach { empleado ->
            JOptionPane.showMessageDialog(
                null,
                empleado.toString(),
                "Información del empleado",
                JOptionPane.INFORMATION_MESSAGE
            )
        }
    } catch (e: Exception) {
        JOptionPane.showMessageDialog(null, "Error inesperado: ${e.message}", "Error", JOptionPane.ERROR_MESSAGE)
    }
}