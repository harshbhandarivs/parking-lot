package place

import fee_model.FlatFeeModel
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import ticket.Ticket
import vehicle.VehicleType
import vehicle.VehicleType.CAR
import vehicle.VehicleType.TRUCK
import java.time.Instant
import java.util.*

class AirportTest {
    private lateinit var airport: Airport
    @BeforeEach
    fun `Create airport with flat fee model with just cars and two-wheelers allowed`() {
        airport = Airport(mapOf( CAR to ParkingSpace(Array(5) { ParkingSpot(it + 1)})), FlatFeeModel())
    }

    @Test
    fun `Should park car and generate ticket`() {
        val entryTime = Date()
        val expectedTicket = Ticket(1, ParkingSpot(1, false), CAR, entryTime)

        val ticket = airport.park(CAR)

        assertEquals(
            expectedTicket,
            ticket
        )
    }
}
