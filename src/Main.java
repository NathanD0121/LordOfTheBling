import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        //GameSections Game1 = new GameSections();
        Scanner choice = new Scanner(System.in);
        //Create instance of inventory
        Inventory playerInventory = new Inventory();
        Character playerCharacter = new Character();

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
            System.out.println("---- Chapter 1: A Journey Begins ----");
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
                    System.out.println("You back some spare clothes for the journey and also bring your cape. This might be useful to help keep warm");
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
            System.out.println("---- Chapter 2: The Journey to Cheddar ----");
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
            System.out.println("The rest of the day passes without much event. The odd trader passes you and few people seem to be walking the path. War is looming among the great kingdoms and people are traveling less than they usually would. \nAs night falls you setup your camp, have something to eat and go to sleep. You wake up the next morning ready  for the final part of your journey to Cheddar. \nYou continue walking through the forrest then around midday you reach the edge of the forrest and are greeted by the wooden palisades of Cheddar. \nYou approach the gate guard who welcomes you with a smile.'Long journey? What brings you to our fair town then?' he asks");
            i = 0;
            while (i == 0) {
                System.out.println("1. Tell him the truth. You are here to begin a grand adventure \n2. Be evasive. Say you are here on business \n3. Be rude. What business is it of his? \n4. Attack the guard!");
                String c2_3 = choice.nextLine();
                if (c2_3.equals("1")) {
                    System.out.println("'Sounds exciting!' He replies. 'I wish I could go on an adventure but I'm stuck here guarding the gate. Anyway go on through and enjoy your stay'");
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
                    System.out.println("You walk over to where the bard is stood. The bard is of average height and has long dark hair. You recognise her as the famous bard Lohse. She is playing a lute and while singing a beautiful song and you vaguely recognise the melody. \nAs the chorus comes in she beckons the crowd to join in. As she sings the first line of the chorus 'I'm sexy and I know it' then the whole crowd joins in 'wiggle, wiggle, wiggle, yeah!' as they sing they start twerking. You decide to join in. \nAs the song finishes everyone cheers. You had a great time. You walk away from the stage");
                } else if (c2_5.equals("4")) {
                    System.out.println("'Armulas, Armulas, ARMULAS!!!!!!' you shout as you walk around the crowd. You get lots of puzzled looks. 'Aaaarrrmulaaaasssss, Aaaarrrmulaaaassssssssssss, Aa... ' before you can finish your sentence someone grabs you by the scruff of your neck and drags you into the back room. \nHe is a tall elf and scowls at you. I am Armulas you idiot. Are you trying to give us away? Now what do you want?");
                    i = 1;
                } else if (c2_5.equals("5")) {
                    System.out.println("You walk over to the nearest person, tap them on their back and as they turn around you give them a swift right hook, then a left hook. As they fall to the ground you uppercut the person next to them. You sense someone is walking up behind you so in one swift movement you spin around and roundhouse kick them in the face! \nWithin moments the whole tavern is engaged in a bloody brawl. Are you happy with yourself? It isn't long before the town guard burst in and break up the fight. \nFor your role in all this you are thrown in jail for the night. In the morning you are released. You still have unfinished business in the tavern so you walk back to the tavern");
                }
            }
            System.out.println("You tell Armulas that you were sent by Dumbledore the Grey. 'Really? He sent you?' he says. 'Okay then, follow me.' Together you walk out the room and leave the tavern. \nYou cross the town square, walk down a street and then enter a small house. As you walk into the house you are greeted by 2 humans, a dwarf and another elf. Armulas turns to you and says 'Welcome to the fellowship of the bling'");

            //Chapter 3
            System.out.println("---- Chapter 3: The Fellowship of the Bling ----");
            System.out.println("You sit around in the house for a few hours. The others are drinking and playing games. Then the door opens, in walks Dumbledore the Grey. 'Greetings my friends. I am glad you could all make it' he says as he takes off his pointy wizards hat and takes a seat by the fire. \n'Now I assume Armulas hasn't told you much about the mission' the blank stares around the room give you the idea that most of the others are just as confused as you as to what your mission is. 'Well then are you sitting comfortably? I'll explain everything.'" +
                    "\n'1000 years ago a powerful dark knight called Lord Dannet and his armies took control of the kingdom of Lessdor. There he ruled over the native orcs and spent the next few years preparing a massive army. He then invaded the other kingdoms on the continent. \nThe Human kingdoms of Heredor and Lowhan worked together with the elves of High Wood. After years of fighting the armies of Lessdor were defeated and the continent knew peace again. Now Lord Dannet has returned and is once again building an army. He must be stopped before he gets too powerful. That is our mission.'" +
                    "\nThere is silence around the room as people think. Dumbledore the Grey continues 'This will be a dangerous mission so if you want to back out now you can.' The dwarf stands up and asks 'How are the 7 of us supposed to defeat Dannet and his armies?' 'A good question Varic. The secret the Lord Dannet's power is a magical artifact which I so happen to have got hold of. BEHOLD...' \nDumbledore reaches into his bag and pulls out a massive gold chain with a huge golden $ sign on the front. 'The Ice of Power! This bling is so hot it makes Lord Dannet so powerful he is almost immortal... almost.'" +
                    "\nEveryone in the room gasps in astonishment. 'How did you get hold of that?' asks Varic. 'I didn't' Dumbledore says 'She did' he points to a woman in the corner of the room who until now you didn't realise was there. 'This is Lydia a master theif. And with that I suppose introductions are in order.' The others around the room introduce themselves." +
                    "\nIn addition to the wizard Dumbledore the Grey, there is Armulas an elven ranger, Lydia a human rouge, Varic a dwarf melee fighter who carries an axe as big as him, Fengir an elf melee fighter who carries 2 swords and Cirilla a human melee fighter who has a sword and shield. \nNow, who are you?");
            System.out.println("Please enter a name for your character: ");
            String playerName = choice.nextLine();
            playerCharacter.setPlayerName(playerName);
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
            //TODO Add an option to change these

            System.out.println("'Excellent' Dumbledore says. 'Now we all know each other lets go over the plan'");
            //In the plan mention you can't simply walk into Lessdor


            //The End
            inGame = false;

            //Characters
            //1 - Player (Human), 2 - Dumbledore the Grey (Human Wizard), 3 - Armulas (Elf Ranger), 4 - Varic (Dwarf Melee Axe), 5 - Lydia (Human Rouge), 6 - Fengir (Elf Melee 2 Swords), 7- Cirilla (Human Melee Sword + Shield)

            //Player name:
            //Player class choice:
            //Player romance option choice:

            //TODO Could make each chapter its own class - would allow individual chapters to be restarted and might help make exiting game easier
            //Game over could give option to restart whole game or just restart from the beginning of the chapter
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
        }
    }
}
