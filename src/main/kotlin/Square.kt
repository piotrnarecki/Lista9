class Square(name: String) : Shape(name) {

    var side: Double = 0.0


    constructor(
        name: String,
        side: Double,

        ) :
            this(name) {

        this.name = name
        this.side = side


    }


    override fun getPerimeter(): Double {

        var perimeter = 4 * side
        return perimeter

    }

    override fun getArea(
    ): Double {

        var area =  side*side
        return area
    }

    override fun details() {

        println(name)

        println("perimeter = ${getPerimeter()}")
        println("area = ${getArea()}")
    }

}