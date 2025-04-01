class Plata:Operator(), Vivodnterface{
    override fun Print1() {
        println("${name} является выгодным предожением!приобретайте по ${price} за минуту гласило обьявление")
    }
     var P=true
    override fun Q():Double
    {
       var Q=0.00
        if (P==true)
        {
             Q=0.70*100.00*Scoverage/price

        }
        if (P==false)
        {
              Q=1.50*100.00*Scoverage/price

        }
        return Q
    }
    //ввод информации
    open fun Vvod()
    {
        println("введите название оператора ")
        name= readLine()!!
        println("введите цену за минуту у оператора ")
        price= readLine()!!.toDouble()
        println("введите площадь покрытия ")
        Scoverage= readLine()!!.toDouble()
        println("введите наличие платы за каждое соединение false true")
        P= readLine()!!.toBoolean()


    }
    //вывод информации
   override fun Print()
    {
        println("имя оператора= ${name} " +
                "цена за минуту= ${price} " +
                "площадь покрытия= ${Scoverage} " +
                "наличие платы за каждое соединение= ${P} " +
                "качество= ${Q()} ")
    }
}
