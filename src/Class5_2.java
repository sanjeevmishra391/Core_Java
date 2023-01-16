// class (intro)

// class is a template or a blueprint using with we create objects

// object(instance) : state(property) and behaviour

// car object:
// state(property, attributes) : model, color, seating_capacity, mileage, ... 
// behaviour(methods, functions) : brake(), change_gear(), ...

// washing machine object:
// state(property) : model, color, capacity, fan_speed, ...
// behaviour : start(), stop(), water_intake(), ...

// dog object : 
// state : name, breed, color, ...
// behaviour : bark(), breath(), sniff(), walk(), run()

// class is a user defined data type
/*
* can contain attributes(instance variables, to store the data) and
* methods(that operates on instance variables and performs some action and may
* given some output)
*/

class Box {
    // instance variable(attributes)
    int length, width, height;

    // method
    // return_type function_name(inputs) { perform something; return output }
    // y = f(x)
    // sin(30) = 1/2
    int getVolume() {
        int volume = length * width * height;
        return volume; // used to return some data as output from the function
    }

    int getArea() {
        int area = 2 * (length * width + width * height + length * height);
        return area;
    }
}

// name
class Class5_2 {
    public static void main(String[] args) {
        // how to create object
        // ClassName object_name = new ClassName();
        // new keyword helps to allocate memory dynamically(during runtime)
        Box myObj = new Box(); // object
        myObj.length = 5;
        myObj.width = 10;
        myObj.height = 20;

        int vol = myObj.getVolume();

        // System.out.println(myObj.length + " " + myObj.width + " " + myObj.height);
        System.out.println("Volume of box = " + vol);
        System.out.println("Area of the box = " + myObj.getArea());
    }
}
