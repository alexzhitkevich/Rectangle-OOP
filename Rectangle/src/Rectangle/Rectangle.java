/**
 ** Alexandra Zhitkevich 
 * Date: December 1st, 2019
 * Zhitkevich_Alexandra_Rectangle 
 * Rectangle class: Creating and defining a
 * Rectangle class. This class has the following methods 
 * 1. constructor method that has four parameters representing the four fields 
 * of the class. 
 * 2.'toString' method that prints out the (x,y) coordinate of the lower left
 * corner of the rectangle & height and width 
 * 3. instance method 'area' that returns the area of the rectangle 
 * 4. instance method 'perimeter' that returns the perimeter of a rectangle 
 * 5. class method 'intersection' that has two Rectangle parameters. The method 
 * should return the rectangle formed by the area common to the two rectangles. 
 * 6. class method 'totalPerimeter' that has two Rectangle parameters. The 
 * method should return the total perimeter of the figure formed by the two 
 * rectangles. 
 * 7. instance method 'contains' that has one parameter of type Rectangle. The 
 * method should return true if every point of the specified rectangle is on or
 * within the implicit parameter. It should return false otherwise.
 */
package Zhitkevich_Alexandra_Rectangle;

/**
 *
 * @author Alexnik
 */
public class Rectangle {

    private int left;
    private int bottom;
    private int width;
    private int height;

    /**
     * Description: Instance method 'Rectangle' declares and initializes the
     * parameters of the rectangle when the Rectangle object is only created and
     * declared but not initialized.
     *
     * Precondition: For the method to run, a Rectangle object must declared but
     * does not need to have parameters set.
     *
     * Post condition: When the method is complete, the parameters of the
     * Rectangle object created will be set to zero.
     *
     */
    public Rectangle() {
        int x = 0;
        int y = 0;
        int l = 0;
        int w = 0;
    }

    /**
     * Description: Instance method 'Rectangle' declares and initializes the
     * parameters of the rectangle when the Rectangle object is both declared
     * and initialized. If the height is less than zero, the height will be set
     * to zero. If the width is less than zero, the width will be set to zero.
     *
     * Precondition: For the method to run, a Rectangle object must be declared
     * and initialized. The parameters x, y, l, w must be declared and
     * initialized.
     *
     * Post condition: When the method is complete, the parameters of the
     * Rectangle object will be set to the values given by integer values x, y,
     * l , and w
     *
     * @param x - This parameter is the x coordinate of the specified rectangle
     * @param y - This parameter is the y coordinate of the specified rectangle
     * @param l - This parameter is the height of the specified rectangle
     * @param w - This parameter is the width of the specified rectangle
     *
     */
    public Rectangle(int x, int y, int l, int w) {
        left = x;
        bottom = y;
        //length cannot be a negative number
        if (l < 0) {
            height = 0;
        } else {
            height = l;
        }
        //width cannot be a negative number.
        if (w < 0) {
            width = 0;
        } else {
            width = w;
        }
    }

    /**
     * Description: Instance method 'setLeft' sets the bottom left corner's x
     * coordinate of the rectangle to the value specified.
     *
     * Precondition: For the method to run, the parameter must be an integer.
     * The method has to be invoked by a rectangle object.
     *
     * Post condition: When the method is complete, the x coordinate of the
     * bottom left corner of the rectangle will be set to the value given
     * through the parameter that is passed through.
     *
     * @param newLeft - This parameter is the new x coordinate of the specified
     * rectangle
     *
     */
    public void setLeft(int newLeft) {
        left = newLeft;
    }

    /**
     * Description: Instance method 'setBottom' sets the bottom left corner's y
     * coordinate of the rectangle to the value specified.
     *
     * Precondition: For the method to run, the parameter must be an integer.
     * The method has to be invoked by a rectangle object.
     *
     * Post condition: When the method is complete, the y coordinate of the
     * bottom left corner of the rectangle will be set to the value given
     * through the parameter that is passed through.
     *
     * @param newBottom - This parameter is the new y coordinate of the
     * specified rectangle
     *
     */
    public void setBottom(int newBottom) {
        bottom = newBottom;
    }

    /**
     * Description: Instance method 'setHeight' sets the height of the rectangle
     * to the value specified.
     *
     * Precondition: For the method to run, the parameter must be an integer and
     * greater than zero. The method has to be invoked by a rectangle object.
     *
     * Post condition: When the method is complete, the height of the rectangle
     * will be set to the value given through the parameter that is passed
     * through.
     *
     * @param newHeight - This parameter is the height of the specified
     * rectangle
     *
     */
    public void setHeight(int newHeight) {
        height = newHeight;
    }

    /**
     * Description: Instance method 'setWidth' sets the width of the rectangle
     * to the value specified.
     *
     * Precondition: For the method to run, the parameter must be an integer and
     * greater than zero. The method has to be invoked by a rectangle object.
     *
     * Post condition: When the method is complete, the width of the rectangle
     * will be set to the value given through the parameter that is passed
     * through.
     *
     * @param newWidth - This parameter is the width of the specified rectangle
     *
     */
    public void setWidth(int newWidth) {
        width = newWidth;
    }

    /**
     * Description: Instance method 'toString' returns the dimensions of the
     * rectangle object created (including bottom left corner x and y
     * coordinates, width & height) as a String
     *
     * Precondition: For the method to run, both Rectangle constructor methods
     * must be created in order to make sure that each parameter of the
     * Rectangle object has been declared and initialized. The length and the
     * width values of the rectangle must be greater than zero.
     *
     * Post condition: When the method is complete, the dimensions of the
     * Rectangle object will be displayed to the user when the method is called.
     *
     * @return String value is returned.
     */
    public String toString() {
        return ("Base: (" + left + ", " + bottom + ")" + " w: " + width + "h: " + height);
    }

    /**
     * Description: Instance method 'area' returns the area of the rectangle
     * object created.
     *
     * Precondition: For the method to run, both Rectangle constructor methods
     * must be created in order to make sure that the width and height of the
     * Rectangle object have been declared and initialized. The length and the
     * width values of the rectangle must be greater than zero.
     *
     * Post condition: When the method is complete, the area of the Rectangle
     * object will be displayed to the user when the method is called.
     *
     * @return integer value is returned.
     */
    public int area() {
        return (width * height);
    }

    /**
     * Description: Instance method 'perimeter' returns the perimeter of the
     * rectangle object created.
     *
     * Precondition: For the method to run, both Rectangle constructor methods
     * must be created in order to make sure that the width and height of the
     * Rectangle object have been declared and initialized. The length and the
     * width values of the rectangle must be greater than zero.
     *
     * Post condition: When the method is complete, the perimeter of the
     * Rectangle object will be displayed to the user when the method is called.
     *
     * @return integer value is returned.
     */
    public int perimeter() {
        return (width * 2 + height * 2);
    }

    /**
     * Description: Static method 'intersection' returns the new rectangle
     * created by the intersection of two existing Rectangle objects that have
     * been created.
     *
     * Precondition: For the method to run, both Rectangle constructor methods
     * must be created in order to make sure that the width and height of the
     * Rectangle object have been declared and initialized. Two rectangle
     * objects must be created and their dimensions (left, bottom, height,
     * width) should be set. The length and the width values of the rectangles
     * must be greater than zero.
     *
     * Post condition: When the method is complete, the rectangle formed by the
     * intersection of the Rectangle objects will be displayed to the user when
     * the method is called.
     *
     * @param r1 - This parameter is the first rectangle object
     * @param r2 - This parameter is the second rectangle object
     *
     * @return Rectangle is returned.
     */
    public static Rectangle intersection(Rectangle r1, Rectangle r2) {
        int intersectLeft = 0;
        int intersectBottom = 0;
        int intersectWidth = 0;
        int intersectHeight = 0;
        boolean isTrue = false;
        //checks which rectangle's bottom left x coordinate is further left
        for (int i = r1.left; i <= r1.left + r1.width; i++) {
            if (i >= r2.left && i <= r2.left + r2.width) {
                if (!isTrue) {
                    intersectLeft = i;
                    isTrue = true;
                }
                if (i < r1.left + r1.width && i < r2.left + r2.width) {
                    intersectWidth++;
                }
            }
        }
        isTrue = false;
        //checks which rectangle's bottom left y coordinate is lower
        for (int i = r1.bottom; i <= r1.bottom + r1.height; i++) {
            if (i >= r2.bottom && i <= r2.bottom + r2.height) {
                if (!isTrue) {
                    intersectBottom = i;
                    isTrue = true;
                }
                if (i < r1.bottom + r1.height && i < r2.bottom + r2.height) {
                    intersectHeight++;
                }
            }
        }

        //creates the new rectangle formed by the intersetion of the two 
        Rectangle intersect = new Rectangle(intersectLeft, intersectBottom, intersectHeight, intersectWidth);
        return (intersect);

    }

    /**
     * Description: Static method 'totalPerimeter' returns the perimeter of the
     * two rectangle objects when they intersect. If one rectangle is completely
     * contained by the other, the method will return the perimeter of the outer
     * rectangle. If the rectangles do not intersect, the method should return
     * the sum of the individual perimeter
     *
     * Precondition: For the method to run, both Rectangle constructor methods
     * must be created in order to make sure that the width and height of the
     * Rectangle object have been declared and initialized. Two rectangle
     * objects must be created and their dimensions (left, bottom, height,
     * width) should be set. The length and the width values of the rectangles
     * must be greater than zero.
     *
     * Post condition: When the method is complete, it will return the value of
     * the total perimeter of the two Rectangle objects when intersected.
     *
     * @param r1 - This parameter is the first rectangle object
     * @param r2 - This parameter is the second rectangle object
     *
     * @return Integer is returned.
     */
    public static int totalPerimeter(Rectangle r1, Rectangle r2) {
        return (r1.perimeter() + r2.perimeter() - intersection(r1, r2).perimeter());

    }

    /**
     * Description: Instance method 'contains' will return true if every point
     * of the specified rectangle passed by the explicit parameter is on or
     * within the implicit parameter. It will return false otherwise.
     *
     * Precondition: For the method to run, both Rectangle constructor methods
     * must be created in order to make sure that the width and height of the
     * Rectangle object have been declared and initialized. One rectangle object
     * must be created and their dimensions (left, bottom, height, width) should
     * be set. The length and the width values of the rectangle must be greater
     * than zero.
     *
     * Post condition: When the method is complete, it will return a boolean
     * based on whether the specified rectangle is contained by the implicit
     * parameter.
     *
     * @param r1 - This parameter is a rectangle object
     *
     * @return Boolean is returned.
     */
    public boolean contains(Rectangle r1) {
        if (r1.left <= left && r1.bottom <= bottom) {
            if (r1.left + r1.width >= left + width && r1.bottom + r1.height >= bottom + height) {
                return true;
            }
        }
        return false;

    }

}
