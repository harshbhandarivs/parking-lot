package place

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SpaceTest {
    private lateinit var space: ParkingSpace

    @BeforeEach
    fun setUp() {
        space = ParkingSpace(Array(1) { ParkingSpot(it + 1) })
    }

    @Test
    fun `Should get free spot in parking space`() {
        val spot = space.getParkingSpot()

        assertEquals(1, spot.id)
        assertEquals(false, spot.available)
    }

    @Test
    fun `Should free up spot in parking space`() {
        val spot = space.getParkingSpot()

        space.freeUpSpace(spot)

        assertEquals(1, spot.id)
        assertEquals(true, spot.available)
    }
}