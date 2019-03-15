import org.junit.Assert;
import org.junit.Test;

public class introductionTests {
    @Test
    public void testIntroduction() {
        RulesAndIntro intro = new RulesAndIntro();
        String printedIntroduction = intro.printIntroduction();
        Assert.assertEquals(printedIntroduction, "Welcome to Categorical Hangman!\n" +
                "------------------------------------------------\n" +
                "In this game you will choose a difficulty.\n" +
                "Then there will be a dropdown box of \ncategories " +
                "to choose from!\nClick the x in the upper corner to continue");
    }


    @Test
    public void testGameRules() {
        RulesAndIntro intro = new RulesAndIntro();
        String printedRules = intro.printRules();
        Assert.assertEquals(printedRules, "\t\t\t\tHow to play \n"+
                "------------------------------------------------\n" +
                "To play, you will guess a letter.\n" +
                "If it is in the word, it will be placed in the\n" +
                "correct location. Otherwise, if the letter is\n" +
                " not in the word,the hangman will receive a body\n" +
                "part. If your character has all of its body parts,\n" +
                "the game is over.");
    }
}
