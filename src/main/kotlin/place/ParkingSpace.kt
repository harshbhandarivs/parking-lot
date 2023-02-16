package place

import exception.InsufficientParkingSpaceException

data class ParkingSpace(private val parkingSpots: Array<ParkingSpot>) {
    fun getParkingSpot(): ParkingSpot {
        for (spot in parkingSpots) {
            if (spot.available) {
                spot.occupy()
                return spot
            }
        }
        throw InsufficientParkingSpaceException("Parking space not available")
    }

    fun freeUpSpace(parkingSpot: ParkingSpot) {
        parkingSpot.unOccupy()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ParkingSpace

        if (!parkingSpots.contentEquals(other.parkingSpots)) return false

        return true
    }

    override fun hashCode(): Int {
        return parkingSpots.contentHashCode()
    }

}
