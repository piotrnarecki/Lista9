enum class Sos(val price: Int, val containsMilk: Boolean, val containsNuts: Boolean) {
    łagodny(2, true, false),
    mieszany(3, true, true),
    ostry(4, false, true);

    fun checkAllergens() {

        if (containsMilk) {
            println("Sos zawiera mleko")
        }
        if (containsNuts) {
            println("Sos zawiera orzechy")
        }
    }


}