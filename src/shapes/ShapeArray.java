package shapes;

public class ShapeArray {

	public static void main(String[] args) {
		 Shape[] shapeArray = new Shape[3];
	        
	        Sphere sphere = new Sphere(5.0);
	        Cylinder cylinder = new Cylinder(3.0, 7.0);
	        Cone cone = new Cone(4.0, 6.0);

	        shapeArray[0] = sphere;
	        shapeArray[1] = cylinder;
	        shapeArray[2] = cone;

	        for (Shape shape : shapeArray) {
	            System.out.println(shape.toString());
	        }

	}

}
