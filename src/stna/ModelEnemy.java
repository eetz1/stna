/*
 * eetz1s License such cool so wow
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stna;

/**
 *
 * @author eetz1
 */
public class ModelEnemy extends ModelBlock{
    private int x;
    private int y;
    private int damage;
    private String id;
    
    private int speed;
    
    public ModelEnemy(int x, int y, String id) {
        this.x=x;
        this.y=y;
        this.id=id;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getid() {
        return id;
    }
    
    public void setid(String id) {
        this.id = id;
    }
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
}

