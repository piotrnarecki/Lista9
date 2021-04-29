class Rectangle(name: String) : Shape(name) {

    var side1: Double = 0.0
    var side2: Double = 0.0


    constructor(
        name: String,
        side1: Double,
        side2: Double,


        ) :
            this(name) {

        this.name = name
        this.side1 = side1
        this.side2 = side2


    }


    override fun getPerimeter(): Double {

        var perimeter = 2 * (side1 + side2)
        return perimeter

    }

    override fun getArea(
    ): Double {

        var area = side1 * side2
        return area
    }

    override fun details() {

        println(name)

        println("perimeter = ${getPerimeter()}")
        println("area = ${getArea()}")
    }

}