/*
 * eetz1s License such cool so wow
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stna;

import java.util.*;

/**
 *
 * @author eetz1
 */
public class TowerEngineController {

    private ModelEnemy enemy;
    private ModelTower tower;
    private Arena arena;
    private List enemies;
//    private List towers = arena.getTowers();
    private int direction;
    public final int up = 0, down = 1, right = 2, left = 3;
    
    public TowerEngineController(Arena a){
        this.arena =a;
    }

    public void shoot(List enemies, List towers) {
        enemies = arena.getEnemies();
        for (int i = 0; i < towers.size(); i++) {
            tower = (ModelTower) towers.get(i);
            for (int j = 0; j < enemies.size(); j++) {

                enemy = (ModelEnemy) enemies.get(j);
                int range = (int) (Math.PI * Math.pow(tower.getRange(), 2));
                if (enemy.getX() < tower.getX() + range && enemy.getY() < tower.getY() + range) {
                    enemy.setHealt(tower.getDamage());
                    System.out.print("PEWPEW");
                }
            }
        }

    }

    public void isDead() {
                enemies = arena.getEnemies();

        for (int j = 0; j < enemies.size(); j++) {
            enemy = (ModelEnemy) enemies.get(j);
            if (!enemy.isAlive()) {
                //delete from screen
                //add moneys
            }
        }

    }

    public void movable() {
        //enemies = arena.getEnemies();
        //arena = new Arena();
        
        ModelBlock[][] grid = arena.getArena();
        //for (ModelEnemy enemy : arena.getEnemies()) {
            for(ModelEnemy enemy2 : arena.getEnemies()){
            //enemy = (ModelEnemy) enemie;
            
            int xcoord = enemy2.getX();
            int ycoord = enemy2.getY();
            try {
                
                if ("road".equals(grid[ycoord + 1][xcoord].getid())) {
                    direction = down;
                    System.out.print("alas");
                } else if ("road".equals(grid[ycoord - 1][xcoord].getid())) {
                    direction = up;
                    System.out.print("ylös");
                } else if ("road".equals(grid[ycoord][xcoord + 1].getid())) {
                    direction = right;
                    System.out.print("oikeel");
                } else if ("road".equals(grid[ycoord][xcoord - 1].getid())) {
                    direction = left;
                    System.out.print("vasen");
                }
            } catch (Exception e) {
                System.out.print(e);
            }
            if (direction == up) {
                ycoord--;
                enemy2.setY(ycoord);
            } else if (direction == down) {
                ycoord++;
                enemy2.setY(ycoord);
            } else if (direction == right) {
                xcoord++;
                enemy2.setX(xcoord);
                System.out.print("oikeel");
            } else if (direction == left) {
                xcoord--;
                enemy2.setX(xcoord);
            }
        }
    }

}
