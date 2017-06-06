/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

/**
 *
 * @author RLH
 */
class GameCharacter {
    
    // imagereader
    private final Image characterImg = new ImageReader().getImage("character.png");
    private Tile currentTile;
    
    //staat op een tile/positie
    public GameCharacter(Tile startTile){
        currentTile = startTile;
    }
        
    public void setTile(Tile nextTile){
        currentTile = nextTile;
    }
    public Tile getCurrentTile(){
        return currentTile;
    }
    
    public void paint(Graphics g){
        
    }
}
