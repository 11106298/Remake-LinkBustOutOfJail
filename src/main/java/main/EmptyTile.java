/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Graphics;

/**
 *
 * @author RLH
 */
public class EmptyTile extends Tile{

    public EmptyTile(BoardCoordinate pos) {
        super(pos);
    }

    @Override
    public void paint(Graphics g) {
        
    }
    
}
