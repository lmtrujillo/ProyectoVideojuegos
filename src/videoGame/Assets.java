package videoGame;

import java.awt.image.BufferedImage;
/**
 * encapsulates the game assets and provides the means to statically access them.
 * Also loads the assets.
 * 
 * @author
 * @date 28/01/2019
 * @version 1.0
 */
public class Assets {
    public static BufferedImage background; // to store background image

    // Stores each sprite
    public static BufferedImage alien;
    public static BufferedImage shot;
    public static BufferedImage bomb;
    public static BufferedImage player;
    public static BufferedImage explosion;
    public static BufferedImage level1;
    public static BufferedImage level2;
    public static BufferedImage level3;
    public static BufferedImage wall;
    
    public static BufferedImage heartFull;
    public static BufferedImage heartHalf;
    public static BufferedImage heartEmpty;
    public static BufferedImage sand;
    public static BufferedImage wheel;
    public static BufferedImage can;
    public static BufferedImage wheels[];
    public static BufferedImage wheelSheet;
    public static BufferedImage bubble;
    public static BufferedImage pirate;
    public static BufferedImage seabackground;
    public static BufferedImage swimtoleft[];
    public static BufferedImage swimtoleftsheet;
    public static BufferedImage swimtoright[];
    public static BufferedImage swimtorightsheet;
    public static BufferedImage swimup[];
    public static BufferedImage swimupsheet;
    public static BufferedImage swimdown[];
    public static BufferedImage swimdownsheet;
    public static BufferedImage explosions[];
    public static BufferedImage explosionsprite;
    
    //Text
    public static BufferedImage movement;
    public static BufferedImage shooting;
    public static BufferedImage hud;
    public static BufferedImage hud2;
    public static BufferedImage title;
    public static BufferedImage prologue;
    public static BufferedImage objetivo;
    public static BufferedImage gameover;
    public static BufferedImage space;
    
    //Sound
    public static SoundClip music1;    // Stores looping music
    public static SoundClip music2;    // Stores looping music
    public static SoundClip drop;
    
    /**
     * loads all of the game assets as images
     */
    public static void init(){
        background = ImageLoader.loadImage("/images/background.png"); 

        level1 = ImageLoader.loadImage("/images/Level1.png");
        level2 = ImageLoader.loadImage("/images/Level2.png");
        level3 = ImageLoader.loadImage("/images/Level3.png");

        
        wall = ImageLoader.loadImage("/images/Wall.png");
        alien = ImageLoader.loadImage("/images/alien.png"); 
        shot = ImageLoader.loadImage("/images/shot.png"); 
        bomb = ImageLoader.loadImage("/images/bomb.png"); 
        player = ImageLoader.loadImage("/images/turtle.png");
        explosion = ImageLoader.loadImage("/images/explosion.png");
        
        heartFull = ImageLoader.loadImage("/images/heartFull.png");
        heartHalf = ImageLoader.loadImage("/images/HeartHalf.png");
        heartEmpty = ImageLoader.loadImage("/images/HeartEmpty.png");
        sand = ImageLoader.loadImage("/images/Sand.png");
        can = ImageLoader.loadImage("/images/can.png");
        pirate = ImageLoader.loadImage("/images/Pirate.png");
        wheel = ImageLoader.loadImage("/images/wheel.png");
        bubble = ImageLoader.loadImage("/images/bubble.png");
        wheelSheet = ImageLoader.loadImage("/images/wheelSheet.png");
        movement = ImageLoader.loadImage("/images/TutorialMovement.png");
        shooting = ImageLoader.loadImage("/images/TutorialShooting.png");
        hud = ImageLoader.loadImage("/images/hud.png");
        hud2 = ImageLoader.loadImage("/images/hud2.png");        
        title = ImageLoader.loadImage("/images/StartMenu.png");      
        prologue = ImageLoader.loadImage("/images/introscreen.png");   
        objetivo = ImageLoader.loadImage("/images/Objective.png"); 

        gameover = ImageLoader.loadImage("/images/gameover.png"); 
        space = ImageLoader.loadImage("/images/space.png"); 

        gameover = ImageLoader.loadImage("/images/gameover.png");
        seabackground = ImageLoader.loadImage("/images/sea-background.png");
        swimtoleftsheet = ImageLoader.loadImage("/images/swim_to_left_sheet.png");
        swimtorightsheet = ImageLoader.loadImage("/images/swim_to_right_sheet.png");
        swimupsheet = ImageLoader.loadImage("/images/swim_up_sheet.png");
        swimdownsheet = ImageLoader.loadImage("/images/swim_down_sheet.png");
        explosionsprite = ImageLoader.loadImage("/images/explosion-sprite.png");

        
        wheels = new BufferedImage[4];
        SpriteSheet spritesheet = new SpriteSheet(wheelSheet);
        for(int i = 0; i < 4; i++){
            wheels[i] = spritesheet.crop(i * 200, 0, 200, 200);
        }

        
        music1 = new SoundClip("/sound/aquatic.wav");
        music2 = new SoundClip("/sound/cave.wav");
        drop = new SoundClip("/sound/drop.wav");

        swimtoleft = new BufferedImage[6];
        SpriteSheet spritesheetleft = new SpriteSheet(swimtoleftsheet);
        for(int i = 0; i < 6; i++){
            swimtoleft[i] = spritesheetleft.crop(i * 256, 0, 256, 256);
        }
        swimtoright = new BufferedImage[6];
        SpriteSheet spritesheetright = new SpriteSheet(swimtorightsheet);
        for(int i = 0; i < 6; i++){
            swimtoright[i] = spritesheetright.crop(i * 256, 0, 256, 256);
        }
        swimup = new BufferedImage[6];
        SpriteSheet spritesheetup = new SpriteSheet(swimupsheet);
        for(int i = 0; i < 6; i++){
            swimup[i] = spritesheetup.crop(0,i * 256, 256, 256);
        }
        swimdown = new BufferedImage[6];
        SpriteSheet spritesheetdown = new SpriteSheet(swimdownsheet);
        for(int i = 0; i < 6; i++){
            swimdown[i] = spritesheetdown.crop(0,i * 256, 256, 256);
        }
        explosions = new BufferedImage[6];
        SpriteSheet spritesheetexplotions = new SpriteSheet(swimdownsheet);
        for(int i = 0; i < 3; i++){
            explosions[i] = spritesheetexplotions.crop(0,i * 256, 256, 256);
        }
    }    
}
