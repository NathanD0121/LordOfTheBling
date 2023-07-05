import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[]args) {
        //GameSections Game1 = new GameSections();
        Scanner choice = new Scanner(System.in);
        //Create instance of inventory
        Inventory playerInventory = new Inventory();
        Character playerCharacter = new Character();
        Companions companions = new Companions();

        //Start Screen
        System.out.println("---------------------\n|                   |\n| Lord of the Bling |\n|                   |\n---------------------");
        int i = 0;
        while (i == 0) {
            System.out.println("1. Start Game \n2. Help \n3. Quit Game");
            String menu = choice.nextLine();
            if (menu.equals("1")) {
                System.out.println("Are you ready to begin your adventure? (Y/N)");
                String start = choice.nextLine();
                if (start.equals("Y") || start.equals("y") || start.equals("Yes") || start.equals("yes")) {
                    System.out.println("Then lets begin...");
                    i = 1;
                } else {
                    System.out.println("Are you ready to begin your adventure? (Y/N)");
                }
            } else if (menu.equals("2")) {
                System.out.println("---- Help ---- \nWelcome to Lord of the Bling. This is a text based adventure game. Text will appear onscreen giving you the story and a list of options with corresponding numbers. \nType in the number of the choice you want and then press enter. \nSometimes you will be given a yes or no choice. In this case type either Y, y, Yes or yes to choose yes. Type any other value to choose no. Once you have made your decision press enter to confirm. \nEnjoy the game!");
            } else if (menu.equals("3")) {
                System.out.println("Goodbye");
                System.exit(0);
            }
        }

        //Game Starts
        boolean inGame = true;
        while(inGame) {
            //Chapter 1
            System.out.println("\n\n---- Chapter 1: A Journey Begins ----\n");
            System.out.println("Your journey begins in the small town of Rivlane. You are having a quiet day at home when suddenly you hear a knock on the door. What do you do?");
            i = 0;
            while (i == 0) {
                System.out.println("1. Answer the door \n2. Ask who it is \n3. Attack them \n4. Ignore it");
                //Chapter 1 choice 1 = c1_1, chapter 1 choice 2 = c1_2, chapter 2 choice 1 = c2_1, etc
                String c1_1 = choice.nextLine();
                //Maybe change this to a switch
                if (c1_1.equals("1")) {
                    System.out.println("You open the door and see a wizard. He is dressed in grey robes and tells you his name is Dumbledore the Grey and he has an important mission for you");
                    i = 1;
                } else if (c1_1.equals("2")) {
                    System.out.println("They tell you to open the door");
                } else if (c1_1.equals("3")) {
                    System.out.println("You open the door and see a wizard. You grab your sword and lift it above your head and prepare to strike. Before you even get a chance to hit them they cast a fire spell and burn down the whole town. \n ---- Game over ----");
                    i = 2;
                    inGame = false;
                    //TODO make this exit back to main menu
                } else if (c1_1.equals("4")) {
                    System.out.println("They keep knocking. It does not seem like they will go away");
                }
            }
            System.out.println("You invite the wizard inside so you can talk more. He tells you that the evil dark knight Lord Dannet has returned and he is looking for brave warriors to help defeat him");
            i = 0;
            while (i == 0) {
                System.out.println("1. Accept the quest \n2. Ask him for more information on the quest \n3. Ask him for more information on Lord Dannet \n4. Thank him for the offer but refuse the quest");
                String c1_2 = choice.nextLine();
                if (c1_2.equals("1")) {
                    System.out.println("Excellent he says. You should proceed to the town of Cheddar, go to the tavern and ask for an elf by the name of Armulas. He says he has a few more tasks to do and then he will meet you there where he will explain everything in more detail");
                    i = 1;
                } else if (c1_2.equals("2")) {
                    System.out.println("The wizard tell you that Lord Dannet is searching for a powerful item. If he gets this item he will become unstoppable and he will gain control over the entire continent, perhaps even more. He says he will tell you more if you accept the quest");
                } else if (c1_2.equals("3")) {
                    System.out.println("He explains that Lord Dannet was once a powerful knight that ruled over the kingdom of Lessdor. There he and his cohort of dark minions ruled over the native orcs and raised a massive army. He tried to conquer the kingdoms of Heredor, Lowhan and High Wood once before. \nThat was nearly 1000 years ago. He was only defeated through a coalition of the 3 kingdoms comprising of humans and elves. This is why he must be stopped before he becomes too powerful");
                } else if (c1_2.equals("4")) {
                    System.out.println("He says that he is saddened to hear you will not be a part of this quest but respects your decision. He leaves your house and you never hear from the Wizard again. \n ---- The End ----");
                    i = 2;
                    inGame = false;
                    //TODO make this exit back to main menu
                    //Maybe could do this by putting everything in the first while loop or by making the main menu a class/function and calling it
                }
            }
            System.out.println("The wizard gets up and leaves your house. You should gather some essential items and anything else you think will be necessary for the long journey ahead");
            i = 0;
            while (i == 0) {
                System.out.println("1. Leave the house and set off on your adventure \n2. Pack some clothes \n3. Pack some food \n4. Pack your book on 101 pop party dance moves for beginners");
                String c1_2 = choice.nextLine();
                if (c1_2.equals("1")) {
                    System.out.println("You close your bag, put it on your back and leave the house. It is time to set off on your adventure!");
                    i = 1;
                } else if (c1_2.equals("2")) {
                    System.out.println("You pack some spare clothes for the journey and also bring your cape. This might be useful to help keep warm");
                    playerInventory.setHasCape(true);
                } else if (c1_2.equals("3")) {
                    System.out.println("You pack enough food to last a week. That should be more than enough to reach the town of Cheddar");
                    playerInventory.setHasFood(true);
                } else if (c1_2.equals("4")) {
                    System.out.println("You question if you will really need this? While the book is no doubt an invigorating read, you wonder what purpose it will serve. Are you sure you want to bring it? (Y/N)");
                    String c1_2_1 = choice.nextLine();
                    if (c1_2_1.equals("Y") || c1_2_1.equals("y") || c1_2_1.equals("Yes") || c1_2_1.equals("yes")) {
                        System.out.println("It is a big book but with some perseverance and determination you pack your book on 101 pop party dance moves for beginners. Who knows, maybe it be useful");
                        playerInventory.setHasBook(true);
                    } else {
                        System.out.println("You decide not to pack your book on 101 pop party dance moves for beginners. It is big and would it really be useful for this quest?");
                    }
                }
            }
            //Chapter 2
            System.out.println("\n\n---- Chapter 2: The Journey to Cheddar ----\n");
            System.out.println("The road to Cheddar from Rivlane is a long windy road that goes through a dark forrest. It is a 3 day journey by foot.");
            if(!playerInventory.getHasFood()){
                System.out.println("You spend the whole first day walking. As night falls you make a fire and setup your bedroll. You are hungry. You open your bag but realise you forgot to pack any food. With nothing to eat you decide to go to sleep. You wake up in the morning but don't have the energy to go on. \nYou turn around to go back to Rivlane but half way you pass out. While you are unconscious somebody robs you. When you finally wake up you go home but are unable to finish the quest. \n ----Game Over ----");
                inGame = false;
            }
            System.out.println("You spend the whole first day walking. As night falls you make a fire and setup your bedroll. You are hungry. You open your bag and eat some of the food you packed.");
            System.out.println("As morning comes you wake up, pack up your makeshift camp and continue your journey. A few hours pass with no events then suddenly a man jumps out of the forrest! \nHe has a dagger and wants you to hand over all your belongings");
            i = 0;
            while (i == 0) {
                System.out.println("1. Refuse to give him anything \n2. Give him everything");
                String c2_1 = choice.nextLine();
                if (c2_1.equals("1")) {
                    System.out.println("He laughs and says you made a bad decision. It seems he is going to fight you!");
                    i = 1;
                } else if (c2_1.equals("2")) {
                    System.out.println("You hand over everything you own and he runs away. You decide it is best to turn around to go back to Rivlane and you are unable to complete your quest. \n ----Game Over ----");
                    i = 2;
                    inGame = false;
                }
            }
            if(playerInventory.getHasBook().equals(false)){
                i = 0;
                while (i == 0) {
                    System.out.println("1. Run at him. Aiming to catch him off guard and gain the advantage \n2. Run away");
                    String c2_2 = choice.nextLine();
                    if (c2_2.equals("1")) {
                        System.out.println("You run at him and knock him over. Seizing the advantage you steal his dagger. He quickly gets up and runs away. You are victorious");
                        playerInventory.setHasDagger(true);
                        i = 1;
                    } else if (c2_2.equals("2")) {
                        System.out.println("You waste no time and run away from him. He follows you but in the dark forrest you are quickly able to lose him. You are safe");
                        i = 1;
                    }
                }
            }
            else if(playerInventory.getHasBook().equals(true)){
                i = 0;
                while (i == 0) {
                    System.out.println("1. Run at him. Aiming to catch him off guard and gain the advantage \n2. Run away \n3. Challenge him to a dance off");
                    String c2_2 = choice.nextLine();
                    if (c2_2.equals("1")) {
                        System.out.println("You run at him and knock him over. Seizing the advantage you steal his dagger. He quickly gets up and runs away. You are victorious");
                        playerInventory.setHasDagger(true);
                        i = 1;
                    } else if (c2_2.equals("2")) {
                        System.out.println("You waste no time and run away from him. He follows you but in the dark forrest you are quickly able to lose him. You are safe");
                        i = 1;
                    } else if (c2_2.equals("3")){
                        System.out.println("You challenge the man to a dance off. Whoever wins gets all the others items. He accepts and performs an impressive routine. \nIts your turn. Luckily you decided to bring your book on 101 pop party dance moves for beginners. The man is in awe of your fiery dance moves. It is obvious you have won. \nAs promised he hands over his things including his dagger. You are victorious");
                        playerInventory.setHasDagger(true);
                        i = 1;
                    }
                }
            }
            System.out.println("You are now able to continue on your journey to Cheddar");
            System.out.println("The rest of the day passes without much event. The odd trader passes you and few people seem to be walking the path. War is looming among the great kingdoms and people are traveling less than they usually would. \nAs night falls you setup your camp, have something to eat and go to sleep. You wake up the next morning ready for the final part of your journey to Cheddar. \nYou continue walking through the forrest then around midday you reach the edge of the forrest and are greeted by the wooden palisades of Cheddar. \nYou approach the gate guard who welcomes you with a smile.'Long journey? What brings you to our fair town then?' he asks");
            i = 0;
            while (i == 0) {
                System.out.println("1. Tell him the truth. You are here to begin a grand adventure \n2. Be evasive. Say you are here on business \n3. Be rude. What business is it of his? \n4. Attack the guard!");
                String c2_3 = choice.nextLine();
                if (c2_3.equals("1")) {
                    System.out.println("'Sounds exciting!' He replies. 'I used to be an adventurer like you, then I took an arrow to the knee. Anyway go on through and enjoy your stay'");
                    i = 1;
                } else if (c2_3.equals("2")) {
                    System.out.println("'Fair enough I suppose' He replies. 'Well go on through and enjoy your stay'");
                    i = 1;
                } else if (c2_3.equals("3")) {
                    System.out.println("He gives you a stern look. 'I'm the gate guard. It's my job to make sure no reprobates or trouble makers get into town' He replies. 'So you can either tell me why you are here or I'm not letting you in!'");
                } else if (c2_3.equals("4")) {
                    System.out.println("You lunge at the guard trying to strike a blow but he is quicker. He raises his shield and calls for backup. Within seconds you are surrounded by 20 heavily armed soldiers. You have no choice but to surrender and you are thrown in jail. \n ---- Game over ----");
                    i = 2;
                    inGame = false;
                }
            }
            System.out.println("The gate guard shouts a command to open the gate and waves you in. 'Have a pleasant visit and stay out of trouble' he says. You walk into the town and down the wide main road that leads to the town square. \nYou cross a bridge over the river that flows through the town and after a few minutes you arrive at a big open square surrounded by shops and market stands. People hurry about their business. In the center of the square stands a large clock tower and underneath is the town crier. \nHe is informing the towns inhabitants about the risk of war coming \nand trying to encourage people to join the local lords army. At the far end of the square lies The Three Castles, the local tavern. This is where you are supposed to find your contact");
            i = 0;
            while (i == 0) {
                System.out.println("1. Go to the tavern \n2. Explore the market \n3. Listen to the town crier \n4. Explore a dodgy back street \n5. Talk to the locals");
                String c2_4 = choice.nextLine();
                if (c2_4.equals("1")) {
                    System.out.println("You walk across the square and enter the tavern");
                    i = 1;
                } else if (c2_4.equals("2")) {
                    System.out.println("You look around at the various stalls");
                } else if (c2_4.equals("3")) {
                    System.out.println("He says that war looms. The Orc armies are assembling in their kingdom of Lessdor at the south of the continent. If war comes the Humans, Elves and Dwarfs will have to work together to stop their overwhelming numbers from wreaking havoc on the land");
                } else if (c2_4.equals("4")) {
                    System.out.println("You look around and find the dodgy-ist looking street around. For some reason you think it would be a good idea to walk down it. As you walk down it the poor and downtrodden are all around you. This is where the towns forgotten live. \nAs you turn a corner into the darkest part of the street you feel a sharp pain in your back. Some guy has just stabbed you. You ask him why he just shrugs his shoulders and runs off \n ---- Game over ----");
                    i = 2;
                    inGame = false;
                } else if (c2_4.equals("5")) {
                    System.out.println("It seems nobody wants to talk to you. Maybe you smell? No you definitely do smell its been days since you last had a proper wash. That's probably why");
                }
            }
            System.out.println("You walk into the tavern and are met by a lively crowd full of cheer. At one side of the room there is a bard singing and at the other side is the bar. Somewhere in here you should find your contact");
            i = 0;
            while (i == 0) {
                System.out.println("1. Go to the bar and order a drink \n2. Go to the bar and ask the inn keeper about your contact \n3. Listen to the bard \n4. Walk around aimlessly shouting for the contact \n5. Start a bar fight!");
                String c2_5 = choice.nextLine();
                if (c2_5.equals("1")) {
                    System.out.println("You walk up to the bar and ask for... \n1. Beer \n2. Ale \n3. Wine \n4. A cosmopolitan shaken not stirred with a dash of ice on the size and a lemon and lime with one of those little umbrellas! \n5. Walk away from the bar");
                    String c2_5_1 = choice.nextLine();
                    if (c2_5_1.equals("1")) {
                        System.out.println("The inn keeper hands you a large tankard of beer");
                        playerInventory.setHasDrink(true);
                    } else if (c2_5_1.equals("2")){
                        System.out.println("The inn keeper hands you a large tankard of ale");
                        playerInventory.setHasDrink(true);
                    } else if (c2_5_1.equals("3")){
                        System.out.println("The inn keeper hands you a large glass of wine");
                        playerInventory.setHasDrink(true);
                    } else if (c2_5_1.equals("4")){
                        System.out.println("The inn keeper looks at you partly with confusion partly with disgust. 'We only serve real drinks here. Simple stuff but good.' He then pours you a beer and spits in it before handing it to you. You reluctantly take the drink");
                        playerInventory.setHasDrink(true);
                    } else {
                        System.out.println("You walk away from the bar");
                    }
                } else if (c2_5.equals("2")) {
                    if(playerInventory.getHasDrink().equals(true)){
                        System.out.println("You walk up to the bar and ask the inn keeper if he knows if there is an elf called Armulas here. 'Who's asking?' He grumbles. You tell him you have a mutual acquaintance and have been told to meet him here. \n'He's in the back room'. You thank the inn keeper and walk into the back room. As you walk into the room a tall elf scowls at you. You ask him if he is Armulas. He says 'I am Armulas. Now what do you want?'" );
                        i = 1;
                    }
                    else {
                        System.out.println("You walk up to the bar and ask the inn keeper if he knows if there is an elf called Armulas here. The inn keeper grunts at you 'either buy a drink or go away. I ain't got time for idle chit chat.' You walk away from the bar");
                    }
                } else if (c2_5.equals("3")) {
                    System.out.println("You walk over to where the bard is stood. The bard is of average height and has long dark hair. You recognise her as the famous bard Lohse. She is playing a lute and singing a beautiful song and you vaguely recognise the melody. \nAs the chorus comes in she beckons the crowd to join in. As she sings the first line of the chorus 'I'm sexy and I know it' then the whole crowd joins in 'wiggle, wiggle, wiggle, yeah!' as they sing they start twerking. You decide to join in. \nAs the song finishes everyone cheers. You had a great time. You walk away from the stage");
                } else if (c2_5.equals("4")) {
                    System.out.println("'Armulas, Armulas, ARMULAS!!!!!!' you shout as you walk around the crowd. You get lots of puzzled looks. 'Aaaarrrmulaaaasssss, Aaaarrrmulaaaassssssssssss, Aa... ' before you can finish your sentence someone grabs you by the scruff of your neck and drags you into the back room. \nHe is a tall elf and scowls at you. I am Armulas you idiot. Are you trying to give us away? Now what do you want?");
                    i = 1;
                } else if (c2_5.equals("5")) {
                    System.out.println("You walk over to the nearest person, tap them on their back and as they turn around you give them a swift right hook, then a left hook. As they fall to the ground you uppercut the person next to them. You sense someone is walking up behind you so in one swift movement you spin around and roundhouse kick them in the face! \nWithin moments the whole tavern is engaged in a bloody brawl. Are you happy with yourself? It isn't long before the town guard burst in and break up the fight. \nFor your role in all this you are thrown in jail for the night. In the morning you are released. You still have unfinished business in the tavern so you walk back to the tavern");
                }
            }
            System.out.println("You tell Armulas that you were sent by Dumbledore the Grey. 'Really? He sent you?' he says. 'Okay then, follow me.' Together you walk out the room and leave the tavern. \nYou cross the town square, walk down a street and then enter a small house. As you walk into the house you are greeted by 2 humans, a dwarf and another elf. Armulas turns to you and says 'Welcome to the fellowship of the bling'");

            //Chapter 3
            System.out.println("\n\n---- Chapter 3: The Fellowship of the Bling ----\n");
            System.out.println("You sit around in the house for a few hours. The others are drinking and playing games. Then the door opens, in walks Dumbledore the Grey. 'Greetings my friends. I am glad you could all make it' he says as he takes off his pointy wizards hat and takes a seat by the fire. \n'Now I assume Armulas hasn't told you much about the mission' the blank stares around the room give you the idea that most of the others are just as confused as you as to what your mission is. 'Well then are you sitting comfortably? I'll explain everything.'" +
                    "\n'1000 years ago a powerful dark knight called Lord Dannet and his armies took control of the kingdom of Lessdor. There he ruled over the native orcs and spent the next few years preparing a massive army. He then invaded the other kingdoms on the continent. \nThe Human kingdoms of Heredor and Lowhan worked together with the elves of High Wood. After years of fighting the armies of Lessdor were defeated and the continent knew peace again. Now Lord Dannet has returned and is once again building an army." +
                    "\nHe must be stopped before he gets too powerful. That is our mission.' There is silence around the room as people think. Dumbledore the Grey continues 'This will be a dangerous mission so if you want to back out now you can.' \nThe dwarf stands up and asks 'How are the 7 of us supposed to defeat Dannet and his armies?' 'A good question Varic. The secret the Lord Dannet's power is a magical artifact which I so happen to have got hold of. BEHOLD...' \nDumbledore reaches into his bag and pulls out a massive gold chain with a huge diamond encrusted $ sign on the front. 'The Ice of Power! This bling is so hot it makes Lord Dannet so powerful he is almost immortal... almost.'" +
                    "\nEveryone in the room gasps in astonishment. 'How did you get hold of that?' asks Varic. 'I didn't' Dumbledore says 'She did' he points to a woman in the corner of the room who until now you didn't realise was there. \n'This is Lydia a master theif. And with that I suppose introductions are in order.' The others around the room introduce themselves." +
                    "\nIn addition to the wizard Dumbledore the Grey, there is Armulas an elven ranger, Lydia a human rouge, Varic a dwarf melee fighter who carries an axe as big as him, Fengir an elf melee fighter who carries 2 swords and Cirilla a human melee fighter who has a sword and shield. \nNow, who are you?");
            System.out.println("Please enter a name for your character: ");
            i = 0;
            while (i == 0) {
                String playerName = choice.nextLine();
                playerCharacter.setPlayerName(playerName);
                System.out.println("Your name is: " + playerCharacter.getPlayerName() + ". Are you happy with this name? (Y/N)");
                String confirmName = choice.nextLine();
                if (confirmName.equals("Y") || confirmName.equals("y") || confirmName.equals("Yes") || confirmName.equals("yes")) {
                    i = 1;
                } else {
                    System.out.println("Please enter a name for your character: ");
                }
            }
            //TODO Find way to allow player to change class
            i = 0;
            while (i == 0) {
                System.out.println("Please select a class for your character: \n1. Melee - Sword and Shield \n2. Melee - Duel Swords \n3. Melee - Axe \n4. Melee - Spear \n5. Ranger - Bow \n6. Ranger - Crossbow \n7. Rouge - Duel Dagger \n8. Wizard - Magic");
                String playerClass = choice.nextLine();
                if (playerClass.equals("1")) {
                    playerCharacter.setPlayerClass("Melee - Sword and Shield");
                    playerCharacter.setIsMeleeDuelSword(true);
                    i = 1;
                } else if (playerClass.equals("2")) {
                    playerCharacter.setPlayerClass("Melee - Duel Swords");
                    playerCharacter.setIsMeleeDuelSword(true);
                    i = 1;
                } else if (playerClass.equals("3")) {
                    playerCharacter.setPlayerClass("Melee - Axe");
                    playerCharacter.setIsMeleeAxe(true);
                    i = 1;
                } else if (playerClass.equals("4")) {
                    playerCharacter.setPlayerClass("Melee - Spear");
                    playerCharacter.setIsMeleeSpear(true);
                    i = 1;
                } else if (playerClass.equals("5")) {
                    playerCharacter.setPlayerClass("Ranger - Bow");
                    playerCharacter.setIsRangerBow(true);
                    i = 1;
                } else if (playerClass.equals("6")) {
                    playerCharacter.setPlayerClass("Ranger - Crossbow");
                    playerCharacter.setIsRangerCrossbow(true);
                    i = 1;
                } else if (playerClass.equals("7")) {
                    playerCharacter.setPlayerClass("Rouge - Duel Dagger");
                    playerCharacter.setIsRouge(true);
                    i = 1;
                } else if (playerClass.equals("8")) {
                    playerCharacter.setPlayerClass("Wizard - Magic");
                    playerCharacter.setIsWizard(true);
                    i = 1;
                }
            }
            System.out.println("Name: " + playerCharacter.getPlayerName() + "\nClass: " + playerCharacter.getPlayerClass());
            System.out.println("Are you happy with your choice? (Y/N)");
            String confirm = choice.nextLine();
            if (confirm.equals("N") || confirm.equals("n") || confirm.equals("No") || confirm.equals("no")) {
                //TODO Add an option to change these
                i = 1;
            } else {
                i = 1;
            }
            System.out.println("'Excellent' Dumbledore says. 'Now we all know each other lets go over the plan'");
            System.out.println("The next several hours are spent making a plan to sneak into Lessdor to throw the Ice of Power into the fires of Red Mountain. \nThe plan is quite complex because as Fengir keeps pointing out 'one does not simply walk into Lessdor'" +
            "\nCirilla's suggestions that you try running into it instead was met by chuckles by most and scowls by Fengir. Finally the plan was agreed and the quest could begin." +
            "\n'Before we depart there is just one matter left to resolve' says Dumbledore. 'Who among us will carry the bling. It is an important task to keep it safe from our enemies and resist its corrupting influence.' The others look around the room reluctant for the task" +
            "\n'Don't worry I brought someone along just for this' says Dumbledore. He looks at you 'This task falls to " + playerCharacter.getPlayerName() + ". He hands you the bling and says look after it and be careful. If you feel it calling to you to resist and to let him know." +
            "\nYou take the bling and put it in your bag. 'Right' says Dumbledore 'let us set off at once. You all get up, get your things and leave the house. As you walk out of the town the guards wish you luck and you set off on your quest. The adventure begins.");
            playerInventory.setHasBling(true);

            //Chapter 4
            System.out.println("\n\n---- Chapter 4: The Adventures of the Fellowship of the Bling ----\n");
            System.out.println("You spend the next few hours walking a long road to the first destination which is an elven city called Galethnor. Most of your companions are walking in small groups. Maybe you should speak to someone to pass the time");
            i = 0;
            String speakTo = "";
            while (i == 0) {
                System.out.println("You speak to: \n1. Dumbledore the Grey \n2. Armulas \n3. Varic and Fengir \n4. Lydia \n5. Cirilla \n6. Speak to no one");
                String c4_1 = choice.nextLine();
                if (c4_1.equals("1")) {
                    System.out.println("You walk over to Dumbledore the Grey");
                    speakTo = "Dumbledore the Grey";
                    i = 1;
                } else if (c4_1.equals("2")) {
                    System.out.println("You walk over to Armulas");
                    speakTo = "Armulas";
                    i = 1;
                } else if (c4_1.equals("3")) {
                    System.out.println("You walk over to Varic and Fengir");
                    speakTo = "Varic and Fengir";
                    i = 1;
                } else if (c4_1.equals("4")) {
                    System.out.println("You walk over to Lydia");
                    speakTo = "Lydia";
                    i = 1;
                } else if (c4_1.equals("5")) {
                    System.out.println("You walk over to Cirilla");
                    speakTo = "Cirilla";
                    i = 1;
                } else if (c4_1.equals("6")) {
                    System.out.println("You keep walking by yourself");
                    i = 1;
                }
            }
            if(!speakTo.equals("")) {
                if (speakTo.equals("Dumbledore the Grey")) {
                    System.out.println("Dumbledore turns to you and says 'Why hello there'");
                    i = 0;
                    while (i == 0) {
                        System.out.println("1. Reply with General Kenobi \n2. Ask him how he is \n3. Flirt with him");
                        String c4_2 = choice.nextLine();
                        if (c4_2.equals("1")) {
                            System.out.println("He chuckles and says 'Ahh I see you are a fan of the ballard of Star Wars. Have you ever head the story of Darth Plagueis the wise? Well let me tell you.' \nHe then spends the next few hours going in depth on the lore and explaining how Anakin is the ultimate hero despite everything. 'We don't talk about the temple incident he says.' You both have a good time");
                            companions.setOpinionDumbledore(companions.getOpinionDumbledore() + 2);
                            i = 1;
                        } else if (c4_2.equals("2")) {
                            System.out.println("He says he is good. You make small talk for a while before continuing to walk in silence yet still enjoying each others company");
                            i = 1;
                        } else if (c4_2.equals("3")) {
                            System.out.println("You give him your best chat up line which is: (Type your best pickup line)");
                            String chatUpLine = choice.nextLine();
                            System.out.println("In your most seductive voice you say " + chatUpLine + ". Dumbledore looks at you and laughs. My friend is that really the best you've got. Come I will teach you the magic behind flirting. \nHe spends the next few hours giving you tips on the art of seduction");
                            companions.setOpinionDumbledore(companions.getOpinionDumbledore() + 1);
                            i = 1;
                        }
                    }
                } else if(speakTo.equals("Armulas")){
                    System.out.println("Armulas is very far in front of you scouting ahead. You cannot catch up to him so you continue to walk alone");
                } else if(speakTo.equals("Varic and Fengir")){
                    System.out.println("Varic and Fengir are having a heated discussion on what the better weapon is. Varic looks at you. 'Hey " + playerCharacter.getPlayerName() + ", what do you think is the better weapon? Axe or swords'");
                    while (i == 0) {
                        System.out.println("1. Swords - Duh \n2. Axe - all the way \n3. Bow - keep your distance \n4. Magic - unlimited power!!!!!");
                        String c4_2 = choice.nextLine();
                        if (c4_2.equals("1")) {
                            System.out.println("Fengir approves of your choice. Varic grumbles something you can't quite hear. You walk together talking for the next few hours");
                            companions.setOpinionFengir(companions.getOpinionFengir() + 2);
                            i = 1;
                        } else if (c4_2.equals("2")) {
                            System.out.println("Varic approves of your choice. Fengir calls you deluded. You walk together talking for the next few hours");
                            companions.setOpinionVaric(companions.getOpinionVaric() + 2);
                            i = 1;
                        } else if (c4_2.equals("3")) {
                            System.out.println("'What!!!' They both exclaim. 'Absolutely crazy you are' Varic says. You all laugh about it and continue walking together talking for the next few hours");
                            companions.setOpinionFengir(companions.getOpinionFengir() + 1);
                            companions.setOpinionVaric(companions.getOpinionVaric() + 1);
                            i = 1;
                        } else if (c4_2.equals("4")) {
                            System.out.println("'I see why the wizard chose you' Varic says. You continue walking together talking for the next few hours");
                            companions.setOpinionFengir(companions.getOpinionFengir() + 1);
                            companions.setOpinionVaric(companions.getOpinionVaric() + 1);
                            i = 1;
                        }
                    }
                } else if(speakTo.equals("Lydia")){
                    System.out.println("You walk up to Lydia to speak but she just ignores your presence. You get the idea she is not a people person. You walk in silence next to her");
                } else if(speakTo.equals("Cirilla")){
                    System.out.println("Cirilla turns to you and says 'Hey hows it going good looking' and winks at you. Her long black hair blowing gently in the wind");
                    i = 0;
                    while (i == 0) {
                        System.out.println("1. Ask more about her \n2. Ask her how she is \n3. Flirt with her");
                        String c4_2 = choice.nextLine();
                        if (c4_2.equals("1")) {
                            System.out.println("She tells you all about her");
                            companions.setOpinionCirilla(companions.getOpinionCirilla() + 1);
                            i = 1;
                        } else if (c4_2.equals("2")) {
                            System.out.println("She says she is good. You make small talk for a while before continuing to walk in silence yet still enjoying each others company");
                            i = 1;
                        } else if (c4_2.equals("3")) {
                            System.out.println("You give her your best chat up line which is: (Type your best pickup line)");
                            String chatUpLine = choice.nextLine();
                            System.out.println("In your most seductive voice you say " + chatUpLine + ". Cirilla looks at you and laughs. 'Wow that was cheesy, still I've heard a lot worse' You spend the next few hours talking and flirting");
                            companions.setOpinionCirilla(companions.getOpinionCirilla() + 2);
                            i = 1;
                        }
                    }
                }
            }

            System.out.println("After several hours of walking down the long road and a short journey through a small forrest you reach the edge of the forrest and are greeted by a group of bandits! 'Don't worry I've got this' says Dumbledore." +
                    "\nDumbledore walks up to the bandits. As he approaches what appears to be their leader steps forward. 'Halt! You shall not pass!' he shouts. 'Fine. I tried to sort this nicely' Dumbledore says. Suddenly he casts a fireball that incinerates" +
                    "\nthe bandit leader. Following his queue Armulas fires a quick succession of arrows into 2 of the bandits and Cirilla charges forward to engage a group of 5 bandits." );
            if(playerCharacter.getIsMeleeSwordAndShield() || playerCharacter.getIsMeleeDuelSword() || playerCharacter.getIsMeleeAxe() || playerCharacter.getIsMeleeSpear()){
                //Melee
                i = 0;
                while (i == 0) {
                    System.out.println("1. Charge into the fight and face them head on \n2. Flank them \n3. Sit and watch");
                    String c4_3 = choice.nextLine();
                    if (c4_3.equals("1")) {
                        System.out.println("You charge into the fight and fight side by side with Cirilla. You hack and slash and within no time at all you have defeated all the bandits");
                        companions.setOpinionCirilla(companions.getOpinionCirilla() + 1);
                        i = 1;
                    } else if (c4_3.equals("2")) {
                        System.out.println("Cirilla is fighting them off but surrounded. Just as it seems hopeless you tap the nearest bandit on the back. He turns around and in one quick movement you take out the nearest 2. Within no time at all you have defeated all the bandits");
                        companions.setOpinionCirilla(companions.getOpinionCirilla() + 1);
                        i = 1;
                    } else if (c4_3.equals("3")) {
                        System.out.println("You sit back and watch the fight. Cirilla is surrounded and in trouble. Varic and Lydia run forward to help her. It doesn't take long for all the bandits to be defeated. Afterwards you get a lot of angry looks. Its almost like they are annoyed with you. You wonder why.");
                        try {
                            companions.setOpinionCirilla(companions.getOpinionCirilla() - 2);
                        } catch (NullPointerException IndexOutOfBoundsException){
                            companions.setOpinionCirilla(0);
                        }
                        try {
                            companions.setOpinionVaric(companions.getOpinionVaric() - 1);
                        } catch (NullPointerException IndexOutOfBoundsException){
                            companions.setOpinionVaric(0);
                        }
                        try {
                            companions.setOpinionLydia(companions.getOpinionLydia() - 1);
                        } catch (NullPointerException IndexOutOfBoundsException){
                            companions.setOpinionLydia(0);
                        }
                        i = 1;
                    }
                }
            } else if (playerCharacter.getIsRangerBow() || playerCharacter.getIsRangerCrossbow()) {
                //Range
                i = 0;
                while (i == 0) {
                    System.out.println("1. Take out the bandits from range \n2. Find some high ground \n3. Sit and watch");
                    String c4_3 = choice.nextLine();
                    if (c4_3.equals("1")) {
                        System.out.println("You fire arrow after arrow at the bandits and within no time at all you have defeated all the bandits");
                        i = 1;
                    } else if (c4_3.equals("2")) {
                        System.out.println("You take a quick look around and find a slope which offers some juicy high ground. You shout to the bandits 'It's over bandits, I have the high ground!' and then proceed to shoot the bandits. Within no time at all you have defeated all the bandits");
                        companions.setOpinionDumbledore(companions.getOpinionDumbledore() + 1);
                        i = 1;
                    } else if (c4_3.equals("3")) {
                        System.out.println("You sit back and watch the fight. Cirilla is surrounded and in trouble. Varic and Lydia run forward to help her. It doesn't take long for all the bandits to be defeated. Afterwards you get a lot of angry looks. Its almost like they are annoyed with you. You wonder why.");
                        try {
                            companions.setOpinionCirilla(companions.getOpinionCirilla() - 2);
                        } catch (NullPointerException IndexOutOfBoundsException){
                            companions.setOpinionCirilla(0);
                        }
                        try {
                            companions.setOpinionVaric(companions.getOpinionVaric() - 1);
                        } catch (NullPointerException IndexOutOfBoundsException){
                            companions.setOpinionVaric(0);
                        }
                        try {
                            companions.setOpinionLydia(companions.getOpinionLydia() - 1);
                        } catch (NullPointerException IndexOutOfBoundsException){
                            companions.setOpinionLydia(0);
                        }
                        i = 1;
                    }
                }
            } else if (playerCharacter.getIsWizard()) {
                //Magic
                i = 0;
                while (i == 0) {
                    System.out.println("1. Fire a lighting bolt at the bandits \n2. Use the dark arts to summon an undead army \n3. Sit and watch");
                    String c4_3 = choice.nextLine();
                    if (c4_3.equals("1")) {
                        System.out.println("You fire a lighting bolt that hits the nearest bandit which then passes from bandit to bandit. Their agonising screams strike fear into the others who try to get away but its all in vain." +
                                "\nThere is no escaping your power. You have completely evaporated them! 'Unlimited power!!!!!' you shout while laughing to yourself. The rest of the group look at you partially in awe and partially in horror.");
                        i = 1;
                    } else if (c4_3.equals("2")) {
                        System.out.println("You open a portal an 5 skeletons jump out behind the bandits. 'On your left' one of the skeletons says to a bandit before stabbing him with his sword. The bandits are struck down before they even know what hit them. One of the skeletons gives you a quick salute before they disappear back into the void they came from.");
                        i = 1;
                    } else if (c4_3.equals("3")) {
                        System.out.println("You sit back and watch the fight. Cirilla is surrounded and in trouble. Varic and Lydia run forward to help her. It doesn't take long for all the bandits to be defeated. Afterwards you get a lot of angry looks. Its almost like they are annoyed with you. You wonder why.");
                        try {
                            companions.setOpinionCirilla(companions.getOpinionCirilla() - 2);
                        } catch (NullPointerException IndexOutOfBoundsException){
                            companions.setOpinionCirilla(0);
                        }
                        try {
                            companions.setOpinionVaric(companions.getOpinionVaric() - 1);
                        } catch (NullPointerException IndexOutOfBoundsException){
                            companions.setOpinionVaric(0);
                        }
                        try {
                            companions.setOpinionLydia(companions.getOpinionLydia() - 1);
                        } catch (NullPointerException IndexOutOfBoundsException){
                            companions.setOpinionLydia(0);
                        }
                        i = 1;
                    }
                }
            } else {
                //TODO Check if there is other option and remove this
                System.out.println("You sit back and watch the fight. It doesn't take long for all the bandits to be defeated.");
            }
            System.out.println("After the battle Lydia and Fengir look around the bandits camp for any useful items. Dumbledore and Armulas are talking about the next stage of the journey. The rest of you are stood around talking about the thrills of battle." +
                    "\nThen Dumbledore taps his staff on the ground twice and says 'Right, enough rest. It is time to continue our journey' and with that you all set off and continue the journey to Galethnor");

            //Chapter 5
            System.out.println("\n\n---- Chapter 5: The Council of Galethnor ----\n");
            System.out.println("The next few hours pass by without event. As you leave the latest forrest you come across a huge city with sparkling white walls and tall towers as far as you can see. 'My friends, welcome to Galethnor, the elven capital' Dumbledore says." +
                    "\nYou walk up to the huge gatehouse to the city. There is no less than a full company of heavily armed elven warriors guarding it all dressed in glistening silver armour. Dumbledore gives the guard captain a nod and they swiftly open the gates." +
                    "\nAs you walk through the city streets you are left in awe of the magnificent architecture. 'The elves sure know how to build a city' Cirilla says. 'Agh its too bright. Dwarven cities are better' Varic says. 'You are deluded. Elven cities are superior' Fengir says." +
                    "\n'I've not been here for ages' Armulus says 'I used to like living here'. After a short walk you reach the grand palace of the elven queen. As you approach the doors to the palace there is an honour guard. It is as if they have been expecting you." +
                    "\n You walk through the hallways of the palace before a butler called Alfred approaches you 'Please follow me' he beckons. He leads you into the throne room where the queen is in session. There is a heated debate going on about what type of wine" +
                    "\nto serve at the next banquet. As the debate reaches it pinnacle the two elves draw swords and it looks like there will be a fight! 'Ooo I never realised a royal court could actually be exciting' Lydia says. Before they can start their duel the " +
                    "\nqueen speaks 'Gentlemen please, we have guests'. The two elves step back from one another. 'Please come with me honoured guests' the queen leads you out to a balcony where there is a large table with several other elves sitting around it." +
                    "\n'This is the high council of Galethnor' the queen says to you 'and you must be the fellowship of the bling. Please take a seat'. as you all sit down she gives Dumbledore a hug. It is clear they are friends. A tall elf stand up and taps a" +
                    "\nstaff on the ground three times then says 'The council is now in session' and with that the guards leave the balcony and close the doors. Dumbledore tells the council about the quest and how he believes Lord Dannet has returned. The members of the council" +
                    "\nlook at each other in astonishment and there are audible gasps. 'This is most troubling news' the queen says 'We need to send reinforcements to Heredor at once as its in the most danger from Lord Dannets armies. We will also need the help" +
                    "\n of Lowhan. With the combined power of the three armies we can secure all three kingdoms and then attack Lessdor and defeat Lord Dannet once again' The council all nod in agreement. 'Members of the fellowship' the queen continues 'I ask" +
                    "\nthat you go to the riders of Lowhan to ask for their help. I will send messengers to Heredor and mobablies my own army. We will meet at the southern pass which marks the boundaries between Heredor and Lessdor in 1 weeks time' Dumbledore" +
                    "\nnods. The elf with the staff taps his staff on the ground three times again and declares the council session has ended. The guards open the doors and come back to the balcony. The queen turns to you all and says 'You are welcome to stay" +
                    "\nhere tonight and set off at dawn' Dumbledore thanks the queen and with that you all take your leave.");
            System.out.println("You reach the room that the queen has given you to sleep in. It is a grand room that is the size of most peoples houses. You have some free time to do with as you please. Some of your companions are in a sitting area drinking and telling tales" +
                    "\nwhile others are getting ready for the journey ahead.");
            System.out.println("What should you do:");
            i = 0;
            while (i == 0) {
                System.out.println("1. Join the others drinking and being merry \n2. Go speak to Dumbledore \n3. Go speak to Fengir \n4. Go speak to Lydia \n5. Go for a walk in the city \n6. Go to bed");
                String c5_1 = choice.nextLine();
                if (c5_1.equals("1")) {
                    System.out.println("You join Armulas, Varic and Cirilla round a table. Armulas gets you an ale and you spend the next few hours drinking an being merry Then you head back to your room and go to bed.");
                    companions.setOpinionCirilla(companions.getOpinionCirilla() + 1);
                    companions.setOpinionArmulas(companions.getOpinionArmulas() + 1);
                    companions.setOpinionVaric(companions.getOpinionVaric() + 1);
                    if(companions.getOpinionCirilla() > 2){
                        System.out.println("Just as you get into bed you hear a knock at the door. In walks Cirilla. She climbs into bed next to you. she turns to you and says 'Listen you are hella cute. What do you think of me?'");
                        i = 0;
                        while (i == 0) {
                            System.out.println("1. Say you think she is hella cute too \n2. Say you don't feel the same way");
                            String c5_2 = choice.nextLine();
                            if (c5_2.equals("1")) {
                                System.out.println("Her eyes light up at your response. She immediately jumps on you and you make out before taking all your clothes off and having really rough hard sex. You are pretty sure everyone else must have heard you." +
                                        "\nAfter Cirilla cuddles up to you and you both go to sleep.");
                                companions.setOpinionCirilla(companions.getOpinionCirilla() + 2);
                                i = 1;
                            } else if (c5_2.equals("2")) {
                                System.out.println("'Oh okay then. Sorry' she says and then she leaves your room. You then go back to bed.");
                                companions.setOpinionCirilla(companions.getOpinionCirilla() - 2);
                                i = 1;
                            }
                        }
                    }
                    i = 1;
                } else if (c5_1.equals("2")) {
                    System.out.println("You go to Dumbledore's room but he isn't there. Armulas says he went to see the queen. It would appear they are quite friendly. You decide to go back to your room and go to bed");
                    i = 1;
                } else if (c5_1.equals("3")) {
                    System.out.println("You knock on Fengir's door 'Come in' he says. You open the door and Fengir is stood at the window shirtless");
                    i = 0;
                    while (i == 0) {
                        System.out.println("1. Say you wanted to talk \n2. Ask how he is \n3. Stare at his chest \n4. Leave him alone");
                        String c5_2 = choice.nextLine();
                        if (c5_2.equals("1")) {
                            System.out.println("'Okay then' He puts a shirt on and you spend the next few hours talking. Then you get up go back to your room and go to bed");
                            companions.setOpinionFengir(companions.getOpinionFengir() + 1);
                            i = 1;
                        } else if (c5_2.equals("2")) {
                            System.out.println("He says he is okay. He puts a shirt on and you spend the next few hours talking. Then you get up go back to your room and go to bed");
                            companions.setOpinionFengir(companions.getOpinionFengir() + 1);
                            i = 1;
                        } else if (c5_2.equals("3")) {
                            if (companions.getOpinionFengir() > 1) {
                                System.out.println("'You like what you see?' He says 'Wanna make out?'");
                                i = 0;
                                while (i == 0) {
                                    System.out.println("1. Yes! \n2. No thanks!");
                                    String c5_3 = choice.nextLine();
                                    if (c5_3.equals("1")) {
                                        System.out.println("'Come here you' he says. You then spend the next hour making out and fondling each other. You spend the night with him");
                                        companions.setOpinionFengir(companions.getOpinionFengir() + 2);
                                        i = 1;
                                    } else if (c5_3.equals("2")) {
                                        System.out.println("You politely delcine and leave his room. Then you go back to your room and go to bed");
                                        i = 1;
                                    }
                                }
                            } else {
                                System.out.println("'Do you mind staring at me?' he says. You apologise and leave his room. Then you go back to your room and go to bed");
                                companions.setOpinionFengir(companions.getOpinionFengir() - 1);
                            }
                            i = 1;
                        } else if (c5_2.equals("4")) {
                            System.out.println("You leave him alone and go back to your room and go to bed.");
                            i = 1;
                        }
                    }
                    i = 1;
                } else if (c5_1.equals("4")) {
                    System.out.println("You knock on Lydia's door. She opens the door and stares at you 'What?' she says");
                    i = 0;
                    while (i == 0) {
                        System.out.println("1. Say you wanted to talk \n2. Ask how she is \n3. Leave her alone");
                        String c5_2 = choice.nextLine();
                        if (c5_2.equals("1") || c5_2.equals("2")) {
                            System.out.println("'Listen if you want a friend go to speak to someone else I'm not intrested. If you are looking to sleep with me then just say it. I can't be doing with games'");
                            i = 0;
                            while (i == 0) {
                                System.out.println("1. Say you are attracted to her \n2. Leave her alone");
                                String c5_3 = choice.nextLine();
                                if (c5_3.equals("1")) {
                                    System.out.println("'Okay then' She drags you into her room and rips both your clothes off. 'Now be quiet and do what I say' She is very bossy but you proceed to have mind blowing sex with Lydia. It last for ages. When you" +
                                            "\nare done Lydia turns to you 'Just so were clear, we are not together, there is no us. That said, you was better than I expected' and with that she ushers you out of her room and you go back to your room and go to bed.");
                                    companions.setOpinionLydia(companions.getOpinionLydia() + 2);
                                    i = 1;
                                } else if (c5_3.equals("2")) {
                                    System.out.println("You say sorry and leave her alone. Then you go back to your room and go to bed.");
                                    i = 1;
                                }
                            }
                            i = 1;
                        } else if (c5_2.equals("3")) {
                            System.out.println("You say sorry and leave her alone. Then you go back to your room and go to bed.");
                            i = 1;
                        }
                    }
                } else if (c5_1.equals("5")) {
                    System.out.println("You leave the castle and go for a walk in the city. It is an amazing sight with tall towers and amazing architecture with fountains and town squares everywhere. Even though it is night there are still people everywhere." +
                            "\nAfter a few hours of walking around you go back to the castle, go to your room and go to bed.");
                    i = 1;
                } else if (c5_1.equals("6")) {
                    System.out.println("You get into bed and go to sleep.");
                    i = 1;
                }
            }
            System.out.println("You wake up in the morning feeling rested and ready for the next part of your journey. You meet the others and have some breakfast when one of the guards approach. 'The queen has requested your presence in the throne room' he says" +
                    "\nYou all gather your things and head to the throne room. The queen is waiting for you along with several members of the council and enough weapons and armour to equip a small army. 'Friends, to help in your journey we are gifting you with new equipment. Take whatever you see fit'" +
                    "\nthe queen says");
            System.out.println("What armour do you choose?");
            i = 0;
            while (i == 0) {
                System.out.println("1. Light leather armour \n2. Medium sturdy chain mail armour \n3. Heavy plate armour");
                String c5_4 = choice.nextLine();
                if (c5_4.equals("1")) {
                    System.out.println("You pick up the light armour and put it on. You feel like you will be fast and nimble in battle with this");
                    playerInventory.setHasLightArmour(true);
                    i = 1;
                } else if (c5_4.equals("2")) {
                    System.out.println("You pick up the medium armour and put it on. You feel like you can still move well but are also more protected in battle");
                    playerInventory.setHasMediumArmour(true);
                    i = 1;
                } else if (c5_4.equals("3")) {
                    System.out.println("You pick up the heavy armour and put it on. You feel like you will be slower to move but very well protected in battle with this");
                    playerInventory.setHasHeavyArmour(true);
                    i = 1;
                }
            }
            if(playerCharacter.getIsMeleeSwordAndShield() || playerCharacter.getIsMeleeDuelSword()){
                System.out.println("Next you find a new shiny elven sword and give it a few swings. This is an improvement on your old rusty sword");
            } else if (playerCharacter.getIsMeleeAxe()) {
                System.out.println("Next you find a new sharp elven axe and give it a few swings. This is an improvement on your old rusty axe");
            } else if (playerCharacter.getIsMeleeSpear()) {
                System.out.println("Next you find a new sharp elven spear and give it a few thrusts. This is an improvement on your old rusty spear");
            } else if (playerCharacter.getIsRangerBow()) {
                System.out.println("Next you find a new master crafted elven bow and test its bow string. This is an improvement on your old bow");
            } else if (playerCharacter.getIsRangerCrossbow()) {
                System.out.println("Next you find a new elven crossbow. This is an improvement on your crossbow");
            } else if (playerCharacter.getIsRouge()) {
                System.out.println("Next you find a pair of new sharp elven daggers and give them a few swings. This is an improvement on your old rusty daggers");
            } else if (playerCharacter.getIsWizard()) {
                System.out.println("Next you find an ancient elven staff. You recognise the markings. This is the staff of destiny, fabled throughout the realm for its power. This is a massive improvement on your old staff. With this you can crush all your foes");
            } else {
                System.out.println("Next you find a new shiny elven sword and give it a few swings. This is an improvement on your old rusty sword");
            }
            System.out.println("Now that everyone has new equipment you gather the rest of your things and bid the queen goodbye. Dumbledore and the queen have a quiet moment together before you leave Galethnor and head to Lowhan");

            //Chapter 6
            System.out.println("\n\n---- Chapter 6: The Riders of Lowhan ----\n");

            //Ending: In the volcano someone could betray the group and you could say you were my brother... I have the high ground etc. Make it like Star Wars

            //The End
            inGame = false;

            //Characters
            //1 - Player (Human), 2 - Dumbledore the Grey (Human Wizard), 3 - Armulas (Elf Ranger), 4 - Varic (Dwarf Melee Axe), 5 - Lydia (Human Rouge), 6 - Fengir (Elf Melee 2 Swords), 7- Cirilla (Human Melee Sword + Shield)

            //Player name:
            //Player class choice:
            //Player romance option choice:

            //For romance, you have the option to romance characters but if Character.romanceCharacterName != null the other character says get lost or something
            //At one point in the story can do a check and if character opinion > a value (4) then there is an option to romance them
            //Maybe add more than one point this can happen
            //Increase opinion by 1
            //companions.setOpinionDumbledore(companions.getOpinionDumbledore()+1);

            //At the end player gets choice to destroy the bling or keep it
            //At the end player character and romance option (if any) go home happy then parents call for tea. Turns out it was a game of DnD all along

            //TODO Could make each chapter its own class - would allow individual chapters to be restarted and might help make exiting game easier
            //Game over could give option to restart whole game or just restart from the beginning of the chapter
            //Can exit to main menu by putting everything in a while loop and white inGame = true it says there but if inGame = false it shows main menu
            //TODO Could make a GUI with buttons to select options and display text in labels
            //TODO this is how to give items/check for items
            /*
            playerInventory.setHasSword(true);
            if (playerInventory.getHasSword()) {
                System.out.println("Player has the sword");
            } else {
                System.out.println("Player does not have the sword");
            }

             */

            //TODO Possible way to vary battle text
            //Does not work
            /*
            String attackText = "";
            Random random = new Random();
            if(playerCharacter.getPlayerClass().equals("Melee - Sword and Shield")){
                String attackText0 = "You use your sword and shield";
                String attackText1 = "You use your sword and shield a different way";
                int textNumber = random.nextInt(1);
                attackText = attackText+textNumber;
            }
            System.out.println(attackText);
             */
        }
    }
}
