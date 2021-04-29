fun main() {






    var circle1 = Circle("Andrzej", 5.0)

    circle1.details()


    var circle2 = Circle("Barbara", 7.0)

    circle2.details()




//
//
//
//
//    var square1 = Square("rectangle", 3.0)
//
//    square1.details()
//
//
//    var rectangle1 = Rectangle("rectangle", 4.0, 6.0)
//
//    rectangle1.details()
//
//
//    var triangle1 = Triangle("triangle", 3.0, 4.0, 5.0)
//    triangle1.details()




    ///////


    var circleIf1 = CircleIF( 3.0)

    circleIf1.details()

    var circleIf2 = CircleIF( 5.0)

    circleIf2.details()





///////

    var day1 = Week.MONDAY

    println(day1)


    day1.checkIfIsWeekened()

    day1.checkIfIsWorkday()


    var sos1=Sos.mieszany

    println(sos1)

    println(sos1.price)

    println(sos1.containsMilk)


    sos1.checkAllergens()







}