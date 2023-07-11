package day02.solved;

//Task: Using this keyword

public class Person2 {

    private String name;  // Private data member

    public String getName() {  // Public getter method
        return name;
    }

    public void setName(String name) {  // Public setter method
            // name = name; Wrong way to use refer the attribute of class
			this.name = name; // this Keyword used for referring current instance
    }
}
