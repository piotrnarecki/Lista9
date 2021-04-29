class CircleIF(var radius:Double) : ShapeIF {

    override val name: String = "circle"

     init {
         this.radius=radius



     }




    override fun getPerimeter(): Double {
        var perimeter = 2 * radius * Math.PI
        return perimeter
    }

    override fun getArea(): Double {

        var area = Math.PI * Math.pow(radius, 2.0)
        return area

    }

    override fun details() {

        println(name)

        println("perimeter = ${getPerimeter()}")
        println("area = ${getArea()}")


    }



}