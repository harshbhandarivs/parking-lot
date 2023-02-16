package ticket

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import place.ParkingSpot
import vehicle.VehicleType.CAR
import java.time.Instant
import java.util.*

class TicketTest {
    @Test
    fun `Should print ticket in right format`() {
        val entryTime = Date.from(Instant.parse("2007-12-03T10:15:30.00Z"))
        val ticket = Ticket(1, ParkingSpot(1, false), CAR, entryTime)

        val printTicket = ticket.printTicket()

        assertEquals(
            printTicket,
            """Parking Ticket:
            Ticket Number: 1
            Spot Number: 1
            Entry Date-time: 03-Dec-2007 15:45:30
        """.trimMargin()
        )
    }
}