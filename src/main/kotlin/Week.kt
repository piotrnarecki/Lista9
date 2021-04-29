enum class Week(val isWeekend: Boolean, ) {

    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);


    fun checkIfIsWeekened(
    ) {
        if(isWeekend == true){
            println("Is weekend !")}else{
                println("I hate mondays !")
        }
    }

    fun checkIfIsWorkday(
    ) {
        if(isWeekend == false){
            println("Is workday !")}else{
            println("I need weekend !")
        }
    }



}