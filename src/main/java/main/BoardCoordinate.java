/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static main.Game.*;

/**
 *
 * @author RLH
 */
public class BoardCoordinate {
    private final int x;
    private final int y;
     
    public BoardCoordinate(int x, int y) {
        //check coordinates within bounds
        if(x < 0) { 
            this.x = 0;
        } else if(x >= COLS) { 
            this.x = COLS-1;
        } else {
            this.x = x;
        }
        
        if(y < 0) { 
            this.y = 0;
        } else if(y >= ROWS) { 
            this.y = ROWS-1;
        } else {
            this.y = y;
        }
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    // Make new Boardcoordinate with new values.
    public BoardCoordinate getLeft() {
        return new BoardCoordinate(x-1, y);
    }
    public BoardCoordinate getRight(){
        return new BoardCoordinate(x+1, y);    
    }
    public BoardCoordinate getUp(){
        return new BoardCoordinate(x, y-1);
    }
    public BoardCoordinate getDown(){
        return new BoardCoordinate(x,y+1);
    }
    
}
