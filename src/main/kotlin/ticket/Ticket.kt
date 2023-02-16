package ticket

import place.ParkingSpot
import vehicle.VehicleType
import java.text.SimpleDateFormat
import java.util.*

data class Ticket(private val id: Int, private val spot: ParkingSpot, val vehicleType: VehicleType, val entryTime: Date = Date()) {
    fun printTicket(): String {
        val simpleDateFormat = SimpleDateFormat("dd-MMM-yyyy HH:mm:ss")
        val formattedEntryTime = simpleDateFormat.format(entryTime)
        return """Parking Ticket:
            Ticket Number: $id
            Spot Number: ${spot.id}
            Entry Date-time: $formattedEntryTime
        """.trimMargin()
    }
}
