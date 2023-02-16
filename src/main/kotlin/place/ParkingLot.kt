package place

import fee_model.FeeModel
import receipt.Receipt
import ticket.Ticket
import vehicle.VehicleType

interface ParkingLot {
    val parkingSpace: Map<VehicleType, ParkingSpace>
    val feeModel: FeeModel
    fun park(vehicle: VehicleType): Ticket
    fun unPark(ticket: Ticket): Receipt
}
