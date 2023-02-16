package place

data class ParkingSpot(val id: Int, var available: Boolean = true) {
    fun occupy() {
        available = false
    }
    fun unOccupy() {
        available = true
    }
}
