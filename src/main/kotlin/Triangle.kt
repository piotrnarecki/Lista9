class Triangle(name: String) : Shape(name) {

    var side1: Double = 0.0
    var side2: Double = 0.0
    var side3: Double = 0.0

// trzeba bedzie sprawdzic czy da sie utworzyć taki trojkat
    constructor(
        name: String,
        side1: Double,
        side2: Double,
        side3: Double,


        ) :
            this(name) {

        this.name = name
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3


    }


    override fun getPerimeter(): Double {

        var perimeter = side1 + side2 + side3
        return perimeter

    }

    override fun getArea(
    ): Double {
        //wzor Herona
        var p = getPerimeter() / 2
        var area = Math.pow((p * (p - side1) * (p - side2) * (p - side3)), 0.5)
        return area
    }

    override fun details() {

        println(name)

        println("perimeter = ${getPerimeter()}")
        println("area = ${getArea()}")
    }

}