/*
Class Customer
@author Trevor Price
date: 3/4/2020
@param
customerName: The name of the customer
customerPhone: The phone number of the customer
customerAddress: The address of the customer
squareFootage: The square footage of the home

mods
THP 3/4/2020 - Everything


 */

//The main class here is customer, and accepts the name, phone, address and square footage from main


open class Customer(customerName: String, customerPhone: String,
                    customerAddress: String,squareFootage: Double) {
    var customerName = ""
    var customerPhone = ""
    var customerAddress = ""
    var squareFootage = 0.0
    //The init belows sets the value for these things based on the inputs from main.
    init{
        println("Creating a customer")
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
    }

    //The showCustomer() function prints the name, address, phone, and square footage neatly
    fun showCustomer(){
        println("Name: " + customerName + "\nPhone: " + customerPhone +
                "\nAddress: " + customerAddress + "\nSquare Footage: " + squareFootage)
    }
}

//The commercial class inherits the name, phone, address, and square footage from the customer class.
//The commercial class also has the propertyName and multiproperty value which is unique to it.

class Commercial(customerName: String,customerPhone: String,
                 customerAddress: String,squareFootage: Double,
                 propertyName: String, multiProperty: Boolean):
    Customer(customerName,customerPhone,
        customerAddress,squareFootage)
{

    var propertyName = ""
    var rate = 0.0
    var multiProperty = false

    //The init below sets all of the variables
    init{
        println("Make a commercial customer")
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
        this.propertyName = propertyName
        this.multiProperty = multiProperty
    }

    //The weeklyCharge() function calculates the rate variable based on the assigned formula.
    fun weeklyCharge(){
        rate = 5 * squareFootage/1000

        //If the multiProperty boolean is true, give the rate a 10% discount
        if(multiProperty == true)
        {
            rate = rate*.9
        }

        //This prints all of the variables unique to the commercial class neatly
        println("Multi-property: " + multiProperty +"\nWeekly charge: $" + rate +
                "\nProperty Name: " + propertyName)
    }
}

//The residential class inherits the name, address, phone, and square footage from the customer class
//The residential class also adds the senior class which is unique to it.
class Residential(customerName: String,customerPhone: String,
                  customerAddress: String,squareFootage: Double,
                  Senior: Boolean):
    Customer(customerName,customerPhone,
        customerAddress,squareFootage)
{
    var rate = 0.0
    var Senior = false

    //The init below sets all of the variables accordingly
    init{
        println("Make a commercial customer")
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
        this.Senior = Senior
    }

    //The weeklyCharge function caclulates and prints the rate given the forumla.
    fun weeklyCharge(){
        rate = 6 * squareFootage/1000

        //If the senior boolean is true, discount the rate by 15%
        if(Senior == true)
        {
            rate = rate*.85
        }

        //Print the fields unique to the residential class along with the rate.
        println("Senior discount: " + Senior +"\nWeekly charge: $" + rate)
    }
}
