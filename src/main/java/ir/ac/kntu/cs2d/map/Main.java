package ir.ac.kntu.cs2d.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
    private TileMap loadMap(String filename) throws IOException {
        ArrayList lines = new ArrayList();
        int width = 0;
        int height = 0;
// read every line in the text file into the list
        BufferedReader reader = new BufferedReader(
                new FileReader(filename));
        while (true) {
            String line = reader.readLine();
// no more lines to read
            if (line == null) {
                reader.close();
                break;
            }
// add every line except for comments
            if (!line.startsWith("#")) {
                lines.add(line);
                width = Math.max(width, line.length());
            }
        }
// parse the lines to create a TileEngine
        height = lines.size();
        TileMap newMap = new TileMap(width, height);
        for (int y=0; y<height; y++) {
            String line = (String)lines.get(y);
            for (int x=0; x<line.length(); x++) {
                char ch = line.charAt(x);
// check if the char represents tile A, B,C, etc.
                int tile = ch - 'A';
                if (tile >= 0 && tile < tiles.size()) {
                    newMap.setTile(x, y, (Image)tiles.get(tile));
                }
// check if the char represents a sprite
                else if (ch == 'o') {
                    addSprite(newMap, coinSprite, x, y);
                }
                else if (ch == '!') {
                    addSprite(newMap, musicSprite, x, y);
                }
}
            else if (ch == '*') {
                addSprite(newMap, goalSprite, x, y);
            }
            else if (ch == '1') {
                addSprite(newMap, grubSprite, x, y);
            }
            else if (ch == '2') {
                addSprite(newMap, flySprite, x, y);
            }
        }
    }
    // add the player to the map
    Sprite player = (Sprite)playerSprite.clone();
player.setX(TileMapRenderer.tilesToPixels(3));
player.setY(0);
newMap.setPlayer(player);
return newMap;
}
