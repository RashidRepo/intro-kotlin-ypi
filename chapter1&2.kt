/Created by Rashid 18/05/24/
//main function
fun main() {
    println("Hello, Android ATC!!!")
    
    val x = 1 // here x=1, I did not  declare the data type of x
    val y = 3
    val z = x+y
    
    println(z)
    
    //Implicit declaration, Explicit declaration
    // Tidak perlu specify data type (imply-mengagak data type)
    // Explicit - Kita specify data type dia
    
    //Constant vs Variable
    //Pemalar boleh ubah
    // Constant (val) -> Once I declare it, It cannot be change
    // A constant use less  memory because it is fixed
    //name = "Rashid"
    val name  = "Rashid"
//     name = "Syed"
    println(name)
    
    // Variable (var) => Once declared as var, it can change
    //Dynamic memory allocation
    var fullname = "Rashid Basharudin"
    println(fullname)
    
    // Data type
    //String -> ""
    //Char -> ''
    //:String || :Char -> (of type)
    val address:String = "Meru,Klang"
    println(address)
    
    var jantina:Char = 'L'
    println(jantina)
    
    //Operasi
    // +
    val message = "My name is "+fullname+" and i live in "+address
    println(message)
    
    //String interpolation
    val anotherMessage = "My name is $fullname and my address is $address"
    println(anotherMessage)
    
    //Number
    var num1:Int = 3
    var num2:Int = 23
    
    var sum:Int = 1+2
    println("Total sum is $sum")
    
    //Operasi +, -, * ,/ , %
    
    var minus = num2 - num1
    println(minus)
    
    var product = num2 * num1
    println(product)
    
    var division = num2 / num1
    println(division)
    
    var modulo = num2 % num1
    println(modulo)
    
    /////////Boolean
    var isValidate = true
    var isComplete:Boolean = false
    
    println(isValidate && isComplete)
    println(isValidate || isComplete)
    println(!isValidate)
    
    
    //Nullable?
    var pro = null
    var pros:String? = null
    println(pro)
    println(pros)
    pros = "Good"
    println(pros)
    
    
    var tinggi = 170.0
    var berat = 70
    var bmi = berat/((tinggi / 100) * (tinggi/100))
    println("bmi : $bmi")
    
    
    ////Array
    var scores = arrayOf(70,90,100,80,85,60)
    println(scores[0])
    println(scores[1])
    println(scores.size)
    
    ////////////////////////////////////////////////////////////////
    ///Conrtrol flow
    var myAge = 27
   //var myAge = 16
   //var myAge = 12

    if(myAge < 18){
        println("You are underage")
    }
    println("The End")
    
    
    if(myAge < 18){
        println("You are underage")
    }
    else{
        println("You can watch movie")
    }
    
    //////////////////////////////////////////////////////////////
    if(myAge < 13){
        println("You cannot watch movie")
    }
    else if (myAge < 18){
        println("You can watch with parent (PG)")
    }
    else{
        println("You can watch movie")
    }
    
    ////////////////////////////////////////////////////////
    var childAge = 17
    var parent = true
    
    if(childAge < 13){
        println("You cannot watch movie")
    }
    else if (childAge < 18  && parent == false){
        println("You cannot watch movie")
    }
    else if (childAge < 18  && parent == true){
        println("You can watch with parent (PG)")
    }
    else{
        println("You can watch movie")
    }
    /////////////////////////////////////////////////////////////
    
    if(childAge < 13 || childAge < 18  && parent == false){
        println("You cannot watch movie")
    }
    else{
        println("You can watch movie")
    }
    
    
    var size = 1
    var price = 0
    var test:Boolean? = null
    
    when (size){
        1-> price = 5
        2-> price = 7
        3-> price = 10
        else-> println("We dont support other size")
    }
    println(price)
    
    when {
        childAge < 13 -> println("You cannot watch movie")
        childAge < 18  && parent == false -> println("You cannot watch movie")
        childAge < 18  && parent == true -> println("You can watch with parent (PG)")
        else -> println("You can watch movie")
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////
    //// For loop
    
    //0 hingga 5
    for (i in 0..5){
        println("up i=$i") //dari 0 naik hingga 5
    }
    
    //5 hingga 0
    for (i in 5 downTo 0){
        println("down i=$i") //dari 5 turun hingga 0
    }
    
    for (i in 1..5 step 2){
        println("up by 2 i=$i") //dari 1 naik hingga 5, setiap kali naik 2
    }
    
    for (i in 5 downTo 1 step 2){
        println("down by 2 i=$i") //dari 5 turun hingga 1, setiap kali turun 2
    }
    
    
    
    
    var lang = arrayOf("Ruby","Kotlin","Python","Java")
    for (item in lang){
        println(item)
    }
    
    for(i in 0..lang.size - 1){
        println("item at index $i is ${lang[i]}")
    }
    
    
    // While
    var x1 = 1
    while (x1 <= 5){
        println("x1 = $x1")
        x1++
    }
    
    // Do While
    var x2 = 30
    do{
        println("x2 = $x2")
        x2++
    }
    while(x2 <= 5)
    
    
    var x3 = 1
    do{
        println("x3=$x3")
        x3++
        if(x3 == 3) break
    }
    while (x<=5)
    
    
    var x4 = 0
    do{
        x4++
        if(x4==3){
            continue
        }
        println("x4 = $x4")
    }
    while (x4<=5)
    
    sayHello()
    sayGoodbye("Shid")
    println(sum(3,4))
    println(calculateBMI(178.0,60.0))
    
       
}

fun sayHello(){
    println("Hello Rashid")
}

fun sayGoodbye(name:String){
    println("Goodbye $name")
}

fun sum(a:Int, b:Int): Int{
    return a+b
}

fun calculateBMI(height:Double, weight:Double): Double{
    return weight/((height/100) * (weight/100))
}
