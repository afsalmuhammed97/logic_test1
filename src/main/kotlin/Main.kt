fun main(args: Array<String>) {


    for (i in 1..250) {
       var result= checkSevenOrNot(i)

        if (result==7) println(7) else println(i)

    }


}



 fun checkSevenOrNot(number: Int):Int{

            var result=getSumOfDigits(number)
     if (result >9)  result=getSumOfDigits(result)

     return result
 }


fun getSumOfDigits(number1: Int):Int{
    var number=number1

    var sum=0
    while (number >0){
        val reminder=number%10
         sum +=reminder
        number/=10
    }

    return sum
}














