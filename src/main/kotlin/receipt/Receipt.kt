package receipt

import java.text.SimpleDateFormat
import java.util.*

data class Receipt(
    private val id: Int,
    private val entryTime: Date = Date(),
    private val exitTime: Date = Date(),
    private val fee: Long
) {

    fun printReceipt(): String {
        val simpleDateFormat = SimpleDateFormat("dd-MMM-yyyy HH:mm:ss")
        val formattedEntryTime = simpleDateFormat.format(entryTime)
        val formattedExitTime = simpleDateFormat.format(exitTime)
        return """Parking Receipt:
            Receipt Number: R-$id
            Entry Date-time: $formattedEntryTime
            Exit Date-time: $formattedExitTime
            Fees: $fee
        """.trimMargin()
    }

}
