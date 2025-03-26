open class Operator:Abstract (){
    override var name=" "
    override var price=0.00
    override var Scoverage=0.00


   open fun Q():Double
    {
       var Q=100*Scoverage/price
        return Q
    }
    //вывод информации
    open fun Print()
    {
        println("имя оператора= ${name} " +
                "цена за минуту=${price} " +
                "пощадь покрытия=${Scoverage}" +
                "качество=${Q()}")
    }
}