import java.lang.NumberFormatException

/*
Pseudocode:
Variables: name, number, address, square footage, senior, multi-property, selection, etc.
Process:
While the user hasn't entered 3, continue to loop through the main menu.
If the user selects 1, this is residential, so ask the user for the customer info plus whether they're a senior.
Send this information to the residential class, and calculate the associated rate.
Finally, print the residential customer information.
If the user selects 2, this is commercial, so ask the customer info plus whether they have multiple properties and the property name.
Send this information to the commercial class, and calculate the associated rate.
Finally, print the commercial customer information.
 */


//This is the main function

fun main() {
    //This try function catches the error if the user enters a string when a number is required.
    try {

        //This do function continues to loop until the user selects 3 as an option
        do {

            println("Please enter the type of customer you are:")
            println("1. Residential")
            println("2. Commercial")
            println("3. Exit")

            val selection = readLine()!!.toInt()

            //If the user selects 1, the variables for the residential class are entered.
            //This class is then called, and the rate is returned as a print statement.
            if (selection == 1) {
                try {
                    println("Residential")
                    println("Please enter your name: ")
                    val residentialName = readLine()!!.toString()
                    println("Please enter your phone number: ")
                    val residentialPhone = readLine()!!.toString()
                    println("Please enter your address: ")
                    val residentialAddress = readLine()!!.toString()
                    println("Please enter your square footage: ")
                    val residentialSquare = readLine()!!.toDouble()
                    println(
                        "Are you a senior citizen?:\n" +
                                "(Enter 1 for yes, and 0 for no)"
                    )
                    val residentialSeniorAnswer = readLine()!!.toInt()
                    var residentialSenior = false

                    //If the user enters 1, then the senior boolean should be true
                    if (residentialSeniorAnswer == 1) {
                        residentialSenior = true
                    }

                    val customer1 = Residential(
                        residentialName, residentialPhone,
                        residentialAddress, residentialSquare, residentialSenior
                    )

                    customer1.showCustomer()
                    customer1.weeklyCharge()
                } catch (e: NumberFormatException) {
                    println("${e.message} is not a number")
                }
            }
            //If the user enters 2, the commercial class is called.
            //The user enters the data consitent with this class, and the charge is returned.
            else if (selection == 2) {
                try {
                    println("Commercial")
                    println("Please enter your name: ")
                    val commercialName = readLine()!!.toString()
                    println("Please enter your phone number: ")
                    val commercialPhone = readLine()!!.toString()
                    println("Please enter your address: ")
                    val commercialAddress = readLine()!!.toString()
                    println("Please enter your square footage: ")
                    val commercialSquare = readLine()!!.toDouble()
                    println("Please enter your property name: ")
                    val commercialPropertyName = readLine()!!.toString()
                    println(
                        "Do you have multiple properties?:\n" +
                                "(Enter 1 for yes, and 0 for no)"
                    )
                    val commercialMultiAnswer = readLine()!!.toInt()
                    var commercialMultiProperty = false

                    //If the user enters 1 above, the multiProperty boolean is true.
                    if (commercialMultiAnswer == 1) {
                        commercialMultiProperty = true
                    }

                    val customer1 = Commercial(
                        commercialName, commercialPhone,
                        commercialAddress, commercialSquare,
                        commercialPropertyName, commercialMultiProperty
                    )

                    customer1.showCustomer()
                    customer1.weeklyCharge()
                } catch (e: NumberFormatException) {
                    println("${e.message} is not a number")
                }
            } else if (selection == 3)
                println("Thank you!")
            //If the user enters 3, the do loop is exited and the program ends.
            else
                println("That option does not exist.")
        } while (selection != 3)
    }
    catch(e:NumberFormatException)
    {
        println("${e.message} is not a number. Selection must be a number.")
    }
}