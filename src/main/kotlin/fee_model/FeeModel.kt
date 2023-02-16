package fee_model

import vehicle.VehicleType
import java.util.*

interface FeeModel {
    fun calculateFee(entryTime: Date, exitTime: Date, vehicleType: VehicleType): Long
}
