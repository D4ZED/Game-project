import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class YourAdventure extends JComponent implements MouseListener {

	public static String nameOfApp = "Wizard adventure!";

	int eeCounter1;
	int state;
	String race = "";
	String magic = "";

	public YourAdventure() {
		addMouseListener(this);
	}

	public void paint(Graphics g) {

		Font font = new Font("Comic Sans MS", Font.BOLD, 20);
		g.setFont(font);
		int x = 5;
		int yi = 25;
		int y = 55;
		int y2 = y + 25;
		int y3 = y2 + 25;
		int y4 = y3 + 25;
		int yy = 0;

		if (state == 0) {
			g.setColor(Color.BLACK);
			g.drawString("Welcome, apprentice wizard. Would you like to become a real wizard?", x, yi);
			g.setColor(Color.GREEN);
			g.drawString("Yea!", x, y);
			g.setColor(Color.RED);
			g.drawString("No, not really...", x, y2);
		} else if (state == 1) {
			g.setColor(Color.BLACK);
			g.drawString("Great, then lets get started!", x, yi);
			g.setColor(Color.GREEN);
			g.drawString("Start!", x, y);
		} else if (state == 2) {
			g.setColor(Color.RED);
			g.drawString("WELL THEN WHY ARE YOU PLAYING THIS GAME!?!?!", x, yi); // ENDING
																					// 1
		} else if (state == 3) {
			if (eeCounter1 < 3) {
				g.setColor(Color.BLACK);
				g.drawString("Remind me, what race are you?", x, yi);
			} else if (eeCounter1 < 5) {
				g.setColor(Color.RED);
				g.drawString("HOW MANY TIMES ARE YOU GOING TO MAKE ME SAY THIS!?! 'Remind me, what race are you?'", x,
						yi);
			} else {
				g.setColor(Color.RED);
				g.drawString("OKAY THATS IT, YOU HAVE ONE MORE CHANCE TO CONFIRM YOUR RACE OR I QUIT!", x, yi);
			}
			g.setColor(Color.ORANGE);
			g.drawString("Human", x, y);
			g.setColor(Color.GREEN);
			g.drawString("Elf", x, y2);
			g.setColor(Color.RED);
			g.drawString("orc", x, y3);
		} else if (state == 99) {
			g.setColor(Color.RED);
			for (int i = 0; i < 42; i++) {
				yy = yy + 25;
				g.drawString(
						"GET OUT OF MY SIGHT YOU INSOLENT CHILD, YOU ARE NOT FIT TO LEARN FROM THE LIKES OF ME! DON'T EVER TRY TO TALK TO ME AGAIN OR ELSE I WILL END YOU!",
						x, yy); // ENDING 2
			}
		} else if (state == 4) {
			g.setColor(Color.BLACK);
			g.drawString("You are a " + race + ", correct? Great, let's get right down to business.", x, yi);
			g.setColor(Color.GREEN);
			g.drawString("Okay", x, y);
			g.setColor(Color.RED);
			g.drawString("Actually, this is not my race", x, y2);
		} else if (state == 5) {
			g.setColor(Color.BLACK);
			g.drawString("What type of magic do you specialize in?", x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.RED);
				g.drawString("Fire", x, y);
				g.setColor(Color.CYAN);
				g.drawString("Ice", x, y2);
				g.setColor(Color.ORANGE);
				g.drawString("Lightning", x, y3);
			} else if (race.equals("ELF")) {
				g.setColor(Color.decode("#800080"));
				g.drawString("Stealth", x, y);
				g.setColor(Color.GREEN);
				g.drawString("Life", x, y2);
				g.setColor(Color.MAGENTA);
				g.drawString("Support", x, y3);
			} else if (race.equals("orc")) {
				g.setColor(Color.GRAY);
				g.drawString("Resistance", x, y);
				g.setColor(Color.MAGENTA);
				g.drawString("Enhancement", x, y2);
				g.setColor(Color.RED);
				g.drawString("Rage", x, y3);
			}
		} else if (state == 6) {
			g.setColor(Color.BLACK);
			g.drawString("Ah, so you are a " + magic + " wizard? Interesting.", x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
			} else if (race.equals("orc")) {
				g.setColor(Color.RED);
			}
			g.drawString("What can i do with my magic?", x, y);
		} else if (state == 7) {
			if (magic.equals("FIRE")) {
				g.setColor(Color.BLACK);
				g.drawString(
						"As a FIRE wizard, you are able to manipulate the power of flames to incinerate your enemies.",
						x, yi);
				g.drawString(
						"It is a basic magic that is only effectice against humanoid cretures, so dragons and the like are completely immune.",
						x, y);
			} else if (magic.equals("ICE")) {
				g.setColor(Color.BLACK);
				g.drawString(
						"As an ICE wizard, you are able to harness the power of frost to stop your enimies in their tracks.",
						x, yi);
				g.drawString(
						"This is a simple, yet very powerful magic. It is perfect for an apprentice wizard like yourself!",
						x, y);
			} else if (magic.equals("LIGHTNING")) {
				g.setColor(Color.BLACK);
				g.drawString(
						"As a LIGHTNING wizard, you are able to harness the uncontrollable power of electricity to zap your enemies.",
						x, yi);
				g.drawString(
						"Be careful though, because if you are not skilled enough to control it, someone may get hurt!",
						x, y);
			} else if (magic.equals("STEALTH")) {
				g.setColor(Color.BLACK);
				g.drawString(
						"As a STEALTH wizard, you are able to make yourself invisible and muffle your footsteps to sneak by someone unseen.",
						x, yi);
				g.drawString("This kind of magic is commonly used by theives and other types of criminals.", x, y);
			} else if (magic.equals("LIFE")) {
				g.setColor(Color.BLACK);
				g.drawString(
						"As a LIFE wizard, you are able to reinvigorate something or someone that has recently died.",
						x, yi);
				g.drawString("You can also use this magic to cure someone of any sickness or disease.", x, y);
			} else if (magic.equals("SUPPORT")) {
				g.setColor(Color.BLACK);
				g.drawString(
						"As a SUPPORT wizard, you are able to empower someone else, giving them increased power and resilliance.",
						x, yi);
				g.drawString(
						"This magic is nearly useless on its own, but is very powerful if you are around other people.",
						x, y);
			} else if (magic.equals("RESISTANCE")) {
				g.setColor(Color.BLACK);
				g.drawString(
						"As a RESISTANCE wizard, you are able to raise your own defense and become immoveable. Essentially you can become a brick wall.",
						x, yi);
				g.drawString(
						"This magic is very good for fighting as well as taking hits. Keep in mind that you can still move on your own, but nothing else can move you.",
						x, y);
			} else if (magic.equals("ENHANCEMENT")) {
				g.setColor(Color.BLACK);
				g.drawString(
						"As an ENHANCEMENT wizard, you are able to temporarily reinforce any weapon you are holding, or armor you are wearing. Enhancing your weapon will allow it to deal more physical damage.",
						x, yi);
				g.drawString(
						"Enhancing your armor will allow it to absorb more physical damage, but keep in mind that this does not apply to elemental damage.",
						x, y);
			} else if (magic.equals("RAGE")) {
				g.setColor(Color.BLACK);
				g.drawString(
						"As a RAGE wizard, you are abl to cast a spell on yourself to allow you continue fighting for an extended amount of time without becoming tired.",
						x, yi);
				g.drawString(
						"This type of magic is commonly learned by warriors. If you have fighting skill, then this is the magic for you!",
						x, y);
			}
			g.setColor(Color.GREEN);
			g.drawString("Awesome! Can I start my adventure now?", x, y2);
			g.setColor(Color.RED);
			g.drawString("I don't think this is the magic for me...", x, y3);
		} else if (state == 8) {
			g.setColor(Color.BLACK);
			g.drawString(
					"Your are about to begin your adventure as a " + race + ", " + magic + " wizard! Are you ready?", x,
					yi);
			g.setColor(Color.GREEN);
			g.drawString("I thought you would never ask!", x, y);
			g.setColor(Color.RED);
			g.drawString("Actually no, I am not satisfied with that.", x, y2);
		} else if (state == 9) {
			g.setColor(Color.BLACK);
			g.drawString(
					"Great, your grand adventure will now begin. Meet me in my tower so I can tell you what you must do.",
					x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString("*Go straight to the tower like a good student*", x, y);
			g.drawString("*Drop by the tavern first for a few drinks*", x, y2);
		} else if (state == 10) {
			if (magic.equals("RESISTANCE")) {
				g.setColor(Color.BLACK);
				g.drawString(
						"*A brawl broke out in the tavern and you were stabbed with a broken bottle. You cast a resistance spell before going in, so it doesn't hurt you.*",
						x, yi);
				g.setColor(Color.RED);
				g.drawString("*Leave the tavern*", x, y);
				g.drawString("*Contnue to fight*", x, y2);
			} else {
				g.setColor(Color.RED);
				g.drawString("*A brawl broke out in the tavern and you were stabbed with a broken bottle. YOU DIED*", x,
						yi); // ENDING 3
			}
		} else if (state == 12) {
			g.setColor(Color.RED);
			g.drawString(
					"*You got a little bit carried away and killed the bartender. Soon the guard was there and sentenced you to be executed.*",
					x, yi); // ENDING 4
		} else if (state == 11) {
			g.setColor(Color.BLACK);
			g.drawString(
					"Welcome to my tower! This is where I will be teaching you how to use your magic as well as telling you where to go.",
					x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
				if (magic.equals("FIRE")) {
					g.setColor(Color.ORANGE);
					g.drawString("Would be a shame if someone burned it down.", x, y2);
				}
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString("It is a very nice tower.", x, y);
		} else if (state == 13) {
			g.setColor(Color.BLACK);
			g.drawString("Don't...", x, yi);
			g.setColor(Color.GREEN);
			g.drawString("T'was but a joke", x, y);
			g.setColor(Color.RED);
			g.drawString("*Burn down tower*", x, y2);
		} else if (state == 14) {
			g.setColor(Color.RED);
			g.drawString("*You burned down the tower and died in a blaze of glory!*", x, yi); // ENDING
																								// 5
		} else if (state == 15) {
			g.setColor(Color.BLACK);
			g.drawString("Thank you, it is a very nice tower indeed.", x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString("So what is my quest?", x, y);
		} else if (state == 16) {
			g.setColor(Color.BLACK);
			g.drawString("I need you to show me what you know about the magic that you use.", x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString("Okay, I can do that", x, y);
		} else if (state == 17) {
			g.setColor(Color.RED);
			g.drawString("You were unable to control your magic and ended up killing yourself.", x, yi); // ENDING
																											// 6
		} else if (state == 18) {
			g.setColor(Color.BLACK);
			g.drawString("Wow, I am impressed at how much you know already!", x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString("Thank you, so am I a real wizard yet?", x, y);
		} else if (state == 19) {
			g.setColor(Color.BLACK);
			g.drawString("Not yet, you still must complete a quest for me.", x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString("Ok well just tell me what the quest is already so I can do it!", x, y);
		} else if (state == 20) {
			g.setColor(Color.BLACK);
			g.drawString("Patiance is a virtue. Anyway, I need you to slay a dragon for me and bring back a scale.", x,
					yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString("Just a dragon? That is child's play for a prodigy likle myself!", x, y);
		} else if (state == 21) {
			g.setColor(Color.BLACK);
			g.drawString(
					"Don't get too ahead of yourself, I'm not bailing you out of any situations you get yourself into.",
					x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString("Okay okay I got it. Bye.", x, y);
		} else if (state == 22) {
			g.setColor(Color.BLACK);
			g.drawString("*And so you set off on your adventure to slay a dragon!*", x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString("Cool.", x, y);
		} else if (state == 23) {
			g.setColor(Color.BLACK);
			g.drawString(
					"*As you left the tower you saw a villager lying on the ground with a knife through his chest*", x,
					yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
				if (magic == "LIFE") {
					g.setColor(Color.GREEN);
					g.drawString("LIVE INSECT!", x, y2);
				}
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString("(-.-) that looks painful...", x, y);
		} else if (state == 24) {
			g.setColor(Color.RED);
			g.drawString(
					"*You revived the man, but he truned out to be a criminal and murders you with the very knife that you saved him from.*",
					x, yi); // Ending 7
		} else if (state == 25) {
			g.setColor(Color.RED);
			g.drawString("*You slowly back away feeling like a horribe person*", x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				g.setColor(Color.GREEN);
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString("I'll get over it.", x, y);
		} else if (state == 26) {
			g.setColor(Color.BLACK);
			g.drawString("*You hear a scream in the distance*", x, yi);
			if (race.equals("HUMAN")) {
				g.setColor(Color.ORANGE);
			} else if (race.equals("ELF")) {
				if (magic.equals("STEALTH")) {
					g.setColor(Color.decode("#800080"));
					g.drawString("*Go to sneak around and investigate*", x, y2);
				}
				g.setColor(Color.GREEN);
			} else if (race.equals("ORC")) {
				g.setColor(Color.RED);
			}
			g.drawString(
					"This day just keeps getting worse and worse, I'm not in the mood to bother with that right now.",
					x, y);
		} else if (state == 27) {
			g.setColor(Color.RED);
			g.drawString(
					"*You casn an invisibility spell and went to investigate, but once you got near the scene your spell wore off and you were spotted and killed.*",
					x, yi);
		} else if (state == 28) {
			g.setColor(Color.BLACK);
			g.drawString("*You moved on with your day*", x, yi);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("X:" + e.getX() + ", Y:" + e.getY());

		if (state == 0 && e.getX() >= 0 && e.getX() <= 45 && e.getY() >= 40 && e.getY() <= 60) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 0 && e.getX() >= 5 && e.getX() <= 170 && e.getY() >= 65 && e.getY() <= 80) {
			state = 2;
			System.out.println("State: " + state);
		} else if (state == 1 && e.getX() >= 0 && e.getX() <= 70 && e.getY() >= 40 && e.getY() <= 55) {
			state = 3;
			System.out.println("State: " + state);
		} else if (state == 3 && e.getX() >= 5 && e.getX() <= 70 && e.getY() >= 40 && e.getY() <= 55) {
			state++;
			race = "HUMAN";
			System.out.println("State: " + state);
			System.out.println("Race: " + race);
		} else if (state == 4 && e.getX() >= 0 && e.getX() <= 60 && e.getY() >= 40 && e.getY() <= 55) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 3 && e.getX() >= 5 && e.getX() <= 30 && e.getY() >= 40 && e.getY() <= 85) {
			state++;
			race = "ELF";
			System.out.println("State: " + state);
			System.out.println("Race: " + race);
		} else if (state == 3 && e.getX() >= 5 && e.getX() <= 40 && e.getY() >= 90 && e.getY() <= 105) {
			state++;
			race = "orc";
			System.out.println("State: " + state);
			System.out.println("Race: " + race);
		} else if (state == 4 && eeCounter1 == 5 && e.getX() >= 5 && e.getX() <= 290 && e.getY() >= 65
				&& e.getY() <= 80) {
			state = 99;
			System.out.println("State: " + state);
		} else if (state == 4 && e.getX() >= 5 && e.getX() <= 290 && e.getY() >= 65 && e.getY() <= 80) {
			state--;
			eeCounter1++;
			System.out.println("State: " + state);
			System.out.println("eeCounter: " + eeCounter1);
		} else if (state == 5 && race.equals("HUMAN") && e.getX() >= 5 && e.getX() <= 40 && e.getY() >= 40
				&& e.getY() <= 55) {
			state++;
			magic = "FIRE";
			System.out.println("State: " + state);
			System.out.println("Magic: " + magic);
		} else if (state == 5 && race.equals("HUMAN") && e.getX() >= 5 && e.getX() <= 40 && e.getY() >= 65
				&& e.getY() <= 80) {
			state++;
			magic = "ICE";
			System.out.println("State: " + state);
			System.out.println("Magic: " + magic);
		} else if (state == 5 && race.equals("HUMAN") && e.getX() >= 5 && e.getX() <= 90 && e.getY() >= 90
				&& e.getY() <= 110) {
			state++;
			magic = "LIGHTNING";
			System.out.println("State: " + state);
			System.out.println("Magic: " + magic);
		} else if (state == 5 && race.equals("ELF") && e.getX() >= 5 && e.getX() <= 75 && e.getY() >= 40
				&& e.getY() <= 50) {
			state++;
			magic = "STEALTH";
			System.out.println("State: " + state);
			System.out.println("Magic: " + magic);
		} else if (state == 5 && race.equals("ELF") && e.getX() >= 5 && e.getX() <= 40 && e.getY() >= 65
				&& e.getY() <= 80) {
			state++;
			magic = "LIFE";
			System.out.println("State: " + state);
			System.out.println("Magic: " + magic);
		} else if (state == 5 && race.equals("ELF") && e.getX() >= 5 && e.getX() <= 85 && e.getY() >= 90
				&& e.getY() <= 105) {
			state++;
			magic = "SUPPORT";
			System.out.println("State: " + state);
			System.out.println("Magic: " + magic);
		} else if (state == 5 && race.equals("orc") && e.getX() >= 5 && e.getX() <= 105 && e.getY() >= 40
				&& e.getY() <= 50) {
			state++;
			magic = "RESISTANCE";
			System.out.println("State: " + state);
			System.out.println("Magic: " + magic);
		} else if (state == 5 && race.equals("orc") && e.getX() >= 5 && e.getX() <= 125 && e.getY() >= 65
				&& e.getY() <= 80) {
			state++;
			magic = "ENHANCEMENT";
			System.out.println("State: " + state);
			System.out.println("Magic: " + magic);
		} else if (state == 5 && race.equals("orc") && e.getX() >= 5 && e.getX() <= 50 && e.getY() >= 90
				&& e.getY() <= 110) {
			state++;
			magic = "RAGE";
			System.out.println("State: " + state);
			System.out.println("Magic: " + magic);
		} else if (state == 6 && e.getX() >= 5 && e.getX() <= 305 && e.getY() >= 40 && e.getY() <= 60) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 7 && e.getX() >= 5 && e.getX() <= 415 && e.getY() >= 90 && e.getY() <= 110) {
			state = 5;
			System.out.println("State: " + state);
		} else if (state == 7 && e.getX() >= 5 && e.getX() <= 410 && e.getY() >= 65 && e.getY() <= 80) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 8 && e.getX() >= 5 && e.getX() <= 415 && e.getY() >= 65 && e.getY() <= 80) {
			state = 3;
			System.out.println("State: " + state);
		} else if (state == 8 && e.getX() >= 5 && e.getX() <= 310 && e.getY() >= 40 && e.getY() <= 55) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 9 && e.getX() >= 5 && e.getX() <= 440 && e.getY() >= 60 && e.getY() <= 80) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 9 && e.getX() >= 5 && e.getX() <= 470 && e.getY() >= 40 && e.getY() <= 60) {
			state = 11;
			System.out.println("State: " + state);
		} else if (state == 10 && magic.equals("RESISTANCE") && e.getX() >= 5 && e.getX() <= 165 && e.getY() >= 65
				&& e.getY() <= 80) {
			state = 12;
			System.out.println("State: " + state);
		} else if (state == 10 && magic.equals("RESISTANCE") && e.getX() >= 5 && e.getX() <= 170 && e.getY() >= 40
				&& e.getY() <= 55) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 11 && e.getX() >= 5 && e.getX() <= 170 && e.getY() >= 40 && e.getY() <= 55) {
			state = 15;
			System.out.println("State: " + state);
		} else if (state == 11 && magic.equals("FIRE") && e.getX() >= 5 && e.getX() <= 460 && e.getY() >= 65
				&& e.getY() <= 85) {
			state = 13;
			System.out.println("State: " + state);
		} else if (state == 13 && e.getX() >= 5 && e.getX() <= 460 && e.getY() >= 65 && e.getY() <= 85) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 13 && e.getX() >= 5 && e.getX() <= 175 && e.getY() >= 35 && e.getY() <= 60) {
			state = 15;
			System.out.println("State: " + state);
		} else if (state == 15 && e.getX() >= 5 && e.getX() <= 215 && e.getY() >= 40 && e.getY() <= 60) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 16 && magic.equals("LIGHTNING") && e.getX() >= 5 && e.getX() <= 210 && e.getY() >= 40
				&& e.getY() <= 60) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 16 && e.getX() >= 5 && e.getX() <= 210 && e.getY() >= 40 && e.getY() <= 60) {
			state = 18;
			System.out.println("State: " + state);
		} else if (state == 18 && e.getX() >= 5 && e.getX() <= 385 && e.getY() >= 40 && e.getY() <= 60) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 19 && e.getX() >= 5 && e.getX() <= 610 && e.getY() >= 40 && e.getY() <= 60) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 20 && e.getX() >= 5 && e.getX() <= 615 && e.getY() >= 35 && e.getY() <= 60) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 21 && e.getX() >= 5 && e.getX() <= 250 && e.getY() >= 40 && e.getY() <= 60) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 22 && e.getX() >= 5 && e.getX() <= 60 && e.getY() >= 40 && e.getY() <= 60) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 23 && magic.equals("LIFE") && e.getX() >= 5 && e.getX() <= 150 && e.getY() >= 65
				&& e.getY() <= 80) {
			state++;
			System.out.println("state: " + state);
		} else if (state == 23 && e.getX() >= 5 && e.getX() <= 260 && e.getY() >= 40 && e.getY() <= 60) {
			state = state + 2;
			System.out.println("State: " + state);
		} else if (state == 25 && e.getX() >= 5 && e.getX() <= 160 && e.getY() >= 40 && e.getY() <= 60) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 26 && e.getX() >= 5 && e.getX() <= 370 && e.getY() >= 60 && e.getY() <= 80) {
			state++;
			System.out.println("State: " + state);
		} else if (state == 27 && e.getX() >= 5 && e.getX() <= 990 && e.getY() >= 40 && e.getY() <= 60) {
			state++;
			System.out.println("State: " + state);
		}
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	public static void main(String[] args) {
		int width = 1920;
		int height = width / 16 * 9;
		JFrame frame = new JFrame(nameOfApp);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new YourAdventure());
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.decode("#FFFF00"));
	}

}