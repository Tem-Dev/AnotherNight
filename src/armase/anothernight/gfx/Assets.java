package armase.anothernight.gfx;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class Assets {
	// final sprite size for cropping
	private static final int width = 32, height = 32;

	// Placeholder
	public static BufferedImage placeholder;
	public static BufferedImage[] placeholders;
	
	// Backdrops
	// TODO : State-specific Backdrops
	// TODO : Animated Backdrops
	public static BufferedImage forestNight, black;

	// UI Elements	
	public static BufferedImage[] btn_start, btn_scoreboard, btn_quit, btn_ok, btn_tutorial;
	public static BufferedImage[] btn_attack, btn_battleCry, btn_shieldsUp;
	public static BufferedImage[] btn_secret;
	public static BufferedImage[] title, night_word, numbers;
	
	// Logo
	public static BufferedImage[] logo;
	
	// Creatures
	public static BufferedImage player;
	public static BufferedImage[] player_idle;
	public static BufferedImage[] player_attack;
	public static BufferedImage[] player_battleCry;
	public static BufferedImage[] player_shieldsUp;
	public static BufferedImage[] player_death;
	public static BufferedImage mushdrool;
	public static BufferedImage[] mushdrool_idle;
	public static BufferedImage[] mushdrool_attack;
	public static BufferedImage[] mushdrool_death;
	public static BufferedImage doggo;
	public static BufferedImage[] doggo_idle;
	public static BufferedImage[] doggo_attack;
	public static BufferedImage[] doggo_death;
	public static BufferedImage skeleton;
	public static BufferedImage[] skeleton_idle;
	public static BufferedImage[] skeleton_attack;
	public static BufferedImage[] skeleton_death;
	public static BufferedImage dummy;
	public static BufferedImage[] dummy_all;
	
	// Alphabet
	public static BufferedImage[] alphabetImages;
    public static Map<Character, BufferedImage> alphabetMap = new HashMap<>();

	public static void init() {

		// UI Sheets
		SpriteSheet logoSheet = new SpriteSheet(ImageLoader.loadImage("/textures/logo.png"));
		SpriteSheet titleSheet = new SpriteSheet(ImageLoader.loadImage("/textures/title.png"));
		SpriteSheet buttonSheet = new SpriteSheet(ImageLoader.loadImage("/textures/buttons.png"));
		SpriteSheet abilitySheet = new SpriteSheet(ImageLoader.loadImage("/textures/ability_buttons.png"));
		SpriteSheet nightWordSheet = new SpriteSheet(ImageLoader.loadImage("/textures/night_word.png"));
		SpriteSheet numbersSheet = new SpriteSheet(ImageLoader.loadImage("/textures/one_to_ten.png"));
		SpriteSheet alphabetSheet = new SpriteSheet(ImageLoader.loadImage("/textures/alphabet.png"));
		SpriteSheet secretSheet = new SpriteSheet(ImageLoader.loadImage("/textures/secretbutton.png"));
		
		// Anni Sheets
		SpriteSheet anniIdleSheet = new SpriteSheet(ImageLoader.loadImage("/textures/anni_idle.png"));
		SpriteSheet anniAttackSheet = new SpriteSheet(ImageLoader.loadImage("/textures/anni_attack.png"));
		SpriteSheet anniAtkBuffSheet = new SpriteSheet(ImageLoader.loadImage("/textures/anni_atkBuff.png"));
		SpriteSheet anniDefBuffSheet = new SpriteSheet(ImageLoader.loadImage("/textures/anni_defBuff.png"));
		SpriteSheet anniDeathSheet = new SpriteSheet(ImageLoader.loadImage("/textures/anni_death.png"));
		
		// Creature Sheets
		SpriteSheet mushdroolSheet = new SpriteSheet(ImageLoader.loadImage("/textures/mushdrool.png"));
		SpriteSheet doggoSheet = new SpriteSheet(ImageLoader.loadImage("/textures/borko.png"));
		SpriteSheet skeletonSheet = new SpriteSheet(ImageLoader.loadImage("/textures/skeleton.png"));
		SpriteSheet dummySheet = new SpriteSheet(ImageLoader.loadImage("/textures/dummy.png"));
		
		// Missing Sprite Sheet
		SpriteSheet missingSheet = new SpriteSheet(ImageLoader.loadImage("/textures/img_missing_16.png"));
		
		// Logo
		logo = new BufferedImage[8];
		for (int i = 0; i < logo.length; i++)
			logo[i] = logoSheet.crop(64 * i, 0, 64, 80);
		
		// Title
		title = new BufferedImage[4];
		for (int i = 0; i < title.length; i++)
			title[i] = titleSheet.crop(64 * i, 0, 64, 56);
		
		// Placeholders
		placeholder = ImageLoader.loadImage("/backdrops/placeholder.jpg");
		placeholders = new BufferedImage[2];
		placeholders[0] = missingSheet.crop(width * 0, 0, width, height);
		placeholders[1] = missingSheet.crop(width * 1, 0, width, height);
		
		// Backdrops
		forestNight = ImageLoader.loadImage("/backdrops/forest_night.png");
		black = ImageLoader.loadImage("/backdrops/black.png");
		
		// Button Sheet Crops
		btn_start = new BufferedImage[2];
		btn_scoreboard = new BufferedImage[2];
		btn_quit = new BufferedImage[2];
		btn_tutorial = new BufferedImage[2];
		btn_ok = new BufferedImage[2];
		btn_start[0] =		buttonSheet.crop(0, 0, width * 4, height * 2);
		btn_start[1] =		buttonSheet.crop(width * 4, 0, width * 4, height * 2);
		btn_scoreboard[0] =	buttonSheet.crop(0, height * 2, width * 4, height * 2);
		btn_scoreboard[1] =	buttonSheet.crop(width * 4, height * 2, width * 4, height * 2);
		btn_quit[0] =		buttonSheet.crop(0, height * 4, width * 4, height * 2);
		btn_quit[1] =		buttonSheet.crop(width * 4, height * 4, width * 4, height * 2);
		btn_ok[0] =			buttonSheet.crop(0, height * 6, width * 4, height * 2);
		btn_ok[1] =			buttonSheet.crop(width * 4, height * 6, width * 4, height * 2);
		btn_tutorial[0] =	buttonSheet.crop(0, height * 8, width * 4, height * 2);
		btn_tutorial[1] =	buttonSheet.crop(width * 4, height * 8, width * 4, height * 2);
		
		// Night Counter Crops
		night_word = new BufferedImage[4];
		numbers = new BufferedImage[10];
		for (int i = 0; i < night_word.length; i++)
			night_word[i] = nightWordSheet.crop(width * 4 * i, 0, width * 4, height * 2);
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = numbersSheet.crop(width * i, 0, width, height);
		
		// Ability Sheet Crops
		btn_attack = new BufferedImage[2];
		btn_battleCry = new BufferedImage[2];
		btn_shieldsUp = new BufferedImage[2];
		btn_attack[0] =		abilitySheet.crop(0, 0, width * 4, height * 2);
		btn_attack[1] =		abilitySheet.crop(width * 4, 0, width * 4, height * 2);
		btn_battleCry[0] =	abilitySheet.crop(0, height * 2, width * 4, height * 2);
		btn_battleCry[1] =	abilitySheet.crop(width * 4, height * 2, width * 4, height * 2);
		btn_shieldsUp[0] =	abilitySheet.crop(0, height * 4, width * 4, height * 2);
		btn_shieldsUp[1] =	abilitySheet.crop(width * 4, height * 4, width * 4, height * 2);
		
		// Secret Button Crops
		btn_secret = new BufferedImage[2];
		btn_secret[0] = secretSheet.crop(0, 0, width * 4, height * 2);
		btn_secret[1] = secretSheet.crop(width * 4, 0, width * 4, height * 2);
		
		// Player Crops
		player_idle = new BufferedImage[16];
		player_attack = new BufferedImage[16];
		player_battleCry = new BufferedImage[16];
		player_shieldsUp = new BufferedImage[16];
		player_death = new BufferedImage[16];
		for (int i = 0; i < player_idle.length; i++)
			player_idle[i] = anniIdleSheet.crop(width * i, 0, width, height);
		for (int i = 0; i < player_attack.length; i++)
			player_attack[i] = anniAttackSheet.crop(width * i, 0, width, height);
		for (int i = 0; i < player_battleCry.length; i++)
			player_battleCry[i] = anniAtkBuffSheet.crop(width * i, 0, width, height);
		for (int i = 0; i < player_shieldsUp.length; i++)
			player_shieldsUp[i] = anniDefBuffSheet.crop(width * i, 0, width, height);
		for (int i = 0; i < player_death.length; i++)
			player_death[i] = anniDeathSheet.crop(width * i, 0, width, height);
		player = anniIdleSheet.crop(0, 0, width, height);
		
		// Mushdrool Crops
		mushdrool_idle = new BufferedImage[4];
		mushdrool_attack = new BufferedImage[4];
		mushdrool_death = new BufferedImage[4];
		for (int i = 0; i < 4; i++)
			mushdrool_idle[i] = mushdroolSheet.crop(width * i, 0, width, height);
		for (int i = 0; i < 4; i++)
			mushdrool_attack[i] = mushdroolSheet.crop(width * i, height, width, height);
		for (int i = 0; i < 4; i++)
			mushdrool_death[i] = mushdroolSheet.crop(width * i, height * 2, width, height);
		mushdrool = mushdroolSheet.crop(0, 0, width, height);
		
		// Danger Doggo Crops
		doggo_idle = new BufferedImage[4];
		doggo_attack = new BufferedImage[4];
		doggo_death = new BufferedImage[4];
		for (int i = 0; i < 4; i++)
			doggo_idle[i] = doggoSheet.crop(width * i, 0, width, height);
		for (int i = 0; i < 4; i++)
			doggo_attack[i] = doggoSheet.crop(width * i, height, width, height);
		for (int i = 0; i < 4; i++)
			doggo_death[i] = doggoSheet.crop(width * i, height * 2, width, height);
		doggo = doggoSheet.crop(0, 0, width, height);
		
		// Sneaky Skeleton Crops
		skeleton_idle = new BufferedImage[4];
		skeleton_attack = new BufferedImage[4];
		skeleton_death = new BufferedImage[4];
		for (int i = 0; i < 4; i++)
			skeleton_idle[i] = skeletonSheet.crop(width * i, 0, width, height);
		for (int i = 0; i < 4; i++)
			skeleton_attack[i] = skeletonSheet.crop(width * i, height, width, height);
		for (int i = 0; i < 4; i++)
			skeleton_death[i] = skeletonSheet.crop(width * i, height * 2, width, height);
		skeleton = skeletonSheet.crop(0, 0, width, height);
		
		// Dummy Crops
		dummy_all = new BufferedImage[4];
		for (int i = 0; i < 4; i++)
			dummy_all[i] = dummySheet.crop(width * i, 0, width, height);
		dummy = dummySheet.crop(0, 0, width, height);
		
		// Alphabet
        alphabetImages = new BufferedImage[43];
		for (int i = 0; i < alphabetImages.length; i++)
			alphabetImages[i] = alphabetSheet.crop(16 * i, 0, 16, height);
		
        char[] alphabetArray = "abcdefghijklmnopqrstuvwxyz.,!?':-1234567890".toCharArray();
        for(int i = 0; i < alphabetArray.length; i++) {
            alphabetMap.put(alphabetArray[i], alphabetImages[i]);
        }
	}
}
