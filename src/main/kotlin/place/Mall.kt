package place

import fee_model.FeeModel
import receipt.Receipt
import ticket.Ticket
import vehicle.VehicleType

class Mall(override val parkingSpace: Map<VehicleType, ParkingSpace>, override val feeModel: FeeModel) : ParkingLot {
    override fun park(vehicle: VehicleType): Ticket {
        TODO("Not yet implemented")
    }

    override fun unPark(ticket: Ticket): Receipt {
        TODO("Not yet implemented")
    }
}