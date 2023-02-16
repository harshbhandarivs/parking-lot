package place

import exception.VehicleNotPermittedException
import fee_model.FeeModel
import receipt.Receipt
import ticket.Ticket
import vehicle.VehicleType
import java.util.*

data class Airport(override val parkingSpace: Map<VehicleType, ParkingSpace>, override val feeModel: FeeModel) : ParkingLot {
    private var ticketID = 1
    private var receiptID = 1
    override fun park(vehicle: VehicleType): Ticket {
        return if (parkingSpace.containsKey(vehicle)) Ticket(
            ticketID++,
            parkingSpace[vehicle]!!.getParkingSpot(),
            vehicle,
            Date()
        ) else throw VehicleNotPermittedException("This parking lot does not have space for $vehicle")
    }

    override fun unPark(ticket: Ticket): Receipt {
        val currentDateTime = Date()
        return Receipt(
            receiptID++,
            ticket.entryTime,
            currentDateTime,
            feeModel.calculateFee(ticket.entryTime, currentDateTime, ticket.vehicleType)
        )
    }
}