 class Circle(name: String) : Shape(name) {

     var radius: Double = 0.0


     constructor(
        name: String,
        radius: Double,

        ) :
            this(name) {

        this.name = name
        this.radius = radius


    }


    override fun getPerimeter(): Double {

        var perimeter = 2 * radius * Math.PI
        return perimeter

    }

    override fun getArea(
    ): Double {

        var area = Math.PI * Math.pow(radius, 2.0)
        return area
    }

    override fun details() {

        println(name)

        println("perimeter = ${getPerimeter()}")
        println("area = ${getArea()}")
    }

}