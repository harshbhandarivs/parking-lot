package fee_model

import vehicle.VehicleType
import vehicle.VehicleType.*
import java.util.*
import kotlin.math.ceil

class FlatFeeModel : FeeModel {

    private fun calculateNumberOfHours(entryTime: Date, exitTime: Date): Long {
        return ceil((exitTime.time - entryTime.time).toDouble() / 3_600_000).toLong()
    }

    override fun calculateFee(entryTime: Date, exitTime: Date, vehicleType: VehicleType): Long {
        val numberOfHours = calculateNumberOfHours(entryTime, exitTime)
        return when (vehicleType) {
            SCOOTER, MOTORCYCLE -> numberOfHours * 10
            CAR, BUS -> numberOfHours * 20
            TRUCK -> 0
        }
    }
}