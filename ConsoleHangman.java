package edu;

import java.util.Random;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class ConsoleHangman {
    final static String[] DICTIONARY = {"hangman", "hello", "world", "project"};
    final static String GUESS = "Guess a letter:";
    final static String MISTAKE = "Missed, mistake ";

    final static String OUT_OF = " out of 5";

    final static String WORD = "The word: ";
    final static String GIVE_UP = "I give up";
    final static String INCORRECT = "Incorrect input";
    final static String LOST = "You lost!";
    final static String WON = "You won!";
    final static String HIT = "Hit!";
    final static int NUMBER_OF_WORDS = 4;
    final static int MAX_MISTAKES = 5;
    static Logger logger = LogManager.getLogger();

    void hangman() {
        Scanner scanner = new Scanner(System.in);
        int index = new Random().nextInt(NUMBER_OF_WORDS);
        int mistakes = 0;
        int hits = 0;
        String word = DICTIONARY[index];
        int len = word.length();
        logger.info(GUESS);
        StringBuilder output = new StringBuilder();
        output.append("*".repeat(len));
        while (true) {
            String input = scanner.nextLine();
            if (input.equals(GIVE_UP)) {
                logger.info(LOST);
                break;
            } else if (input.length() != 1) {
                logger.info(INCORRECT);
            } else {
                char letter = input.charAt(0);
                if (!Character.isLetter(letter)) {
                    logger.info(INCORRECT);
                } else {
                    int currentHits = 0;
                    for (int i = 0; i < len; ++i) {
                        char c = word.charAt(i);
                        if (c == letter) {
                            output.setCharAt(i, letter);
                            ++hits;
                            ++currentHits;
                        }
                    }
                    if (currentHits >= 1) {
                        logger.info(HIT);
                    } else {
                        ++mistakes;
                        logger.info(MISTAKE + mistakes + OUT_OF);
                    }
                    logger.info(WORD + output);
                    if (hits == len) {
                        logger.info(WON);
                        break;
                    }
                    if (mistakes == MAX_MISTAKES) {
                        logger.info(LOST);
                        break;
                    }
                }
            }
            logger.info(GUESS);
        }
    }

    String[] hangmanForTest(
        String hiddenWord,
        String userInput,
        StringBuilder userOutput,
        int userHits,
        int userMistakes
    ) {
        String input = userInput;
        String word = hiddenWord;
        StringBuilder output = userOutput;
        int mistakes = userMistakes;
        int hits = userHits;
        int len = word.length();
        if (input.equals(GIVE_UP)) {
            return new String[] {LOST};
        } else if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            return new String[] {INCORRECT, GUESS};
        } else {
            char letter = input.charAt(0);
            int currentHits = 0;
            for (int i = 0; i < len; ++i) {
                char c = word.charAt(i);
                if (c == letter) {
                    output.setCharAt(i, letter);
                    ++hits;
                    ++currentHits;
                }
            }
            if (currentHits >= 1) {
                String str = hits == len ? WON : GUESS;
                return new String[] {HIT, WORD + output, str};

            } else {
                ++mistakes;
                String str = mistakes == MAX_MISTAKES ? LOST : GUESS;
                return new String[] {MISTAKE + mistakes + OUT_OF, WORD + output, str};
            }
        }
    }
}
