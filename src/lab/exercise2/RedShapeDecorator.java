/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise2;

/**
 *
 * @author jordanrehbein
 */
public class RedShapeDecorator extends ShapeDecorator{
    
    public RedShapeDecorator(Shape shapeToBeDecorated) {
        super(shapeToBeDecorated);
    }
    
    private void addRedBorder(){
        System.out.println("The border is Red");
    }
    
    @Override
    public void draw(){
        super.draw();
        addRedBorder();
    }
}
