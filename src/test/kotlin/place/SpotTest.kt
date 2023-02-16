package place

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SpotTest {

    @Test
    fun `Should create new spot which are available`() {
        val spot = ParkingSpot(2)

        assertEquals(true, spot.available)
    }

    @Test
    fun `Should occupy a spot`() {
        val spot = ParkingSpot(1)

        spot.occupy()

        assertEquals(false, spot.available)
    }

    @Test
    fun `Should unOccupy a spot`() {
        val spot = ParkingSpot(1, true)
        spot.occupy()

        spot.unOccupy()

        assertEquals(true, spot.available)
    }
}