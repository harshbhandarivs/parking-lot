package fee_model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import vehicle.VehicleType
import vehicle.VehicleType.*
import java.time.Instant
import java.util.*

class FlatFeeModelTest {
    @Test
    fun `Should calculate fees for Scooter`() {
        val flatFeeModel = FlatFeeModel()

        val calculateFee = flatFeeModel.calculateFee(
            Date.from(Instant.parse("2007-12-03T10:15:30.00Z")),
            Date.from(Instant.parse("2007-12-03T15:15:31.00Z")),
            SCOOTER
        )

        assertEquals(60, calculateFee)
    }

    @Test
    fun `Should calculate fees for car`() {
        val flatFeeModel = FlatFeeModel()

        val calculateFee = flatFeeModel.calculateFee(
            Date.from(Instant.parse("2007-12-03T10:15:30.00Z")),
            Date.from(Instant.parse("2007-12-03T15:15:31.00Z")),
            CAR
        )

        assertEquals(120, calculateFee)
    }

    @Test
    fun `Should calculate fees for Truck`() {
        val flatFeeModel = FlatFeeModel()

        println(Date())
        val calculateFee = flatFeeModel.calculateFee(
            Date.from(Instant.parse("2007-12-03T10:15:30.00Z")),
            Date.from(Instant.parse("2007-12-03T15:15:31.00Z")),
            TRUCK
        )

        assertEquals(0, calculateFee)
    }
}
