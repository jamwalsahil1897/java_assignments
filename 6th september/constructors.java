package work;

 

public class constructors {
    
	constructors() {                     //zero argument
		
		System.out.println("Perimeter of different shape's:");
        
        int length=6;
        int breadth=50;
        
        int perimeterofrectangle = (length + breadth)*2;
        
        System.out.println("Perimeter of rectangle =  " +perimeterofrectangle);
    }
    
    
	constructors(int side) {                   //parameterized
        
        int perimeterofsquare= 4*side;
        
        System.out.println("Perimeter of square =  " +perimeterofsquare);
    }

 

    
	constructors(int base, int side1, int side2) {                     // overloading
        
        int perimeteroftriangle= base+side1+side2;
        
        System.out.println("Perimeter of Triangle =  " +perimeteroftriangle);
    }
    
    
    public static void main(String args[]) {
        
    	constructors perimeterofrectangle= new constructors();
    	constructors perimeterofsquare= new constructors(4);
    	constructors perimeteroftriangle= new constructors(4,5,6);
    }
}