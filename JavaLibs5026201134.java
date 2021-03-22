import javax.swing.JOptionPane;

public class JavaLibs5026201134 {

    public static void main(String[] args) {
	// write your code here
        //Welcome Message
        JOptionPane.showMessageDialog(null,
                "Hello Contestant, and welcome to America's favorite dating show! before we send " +
                        "you on a a " +
                        "date, we'll need to ask you 10 love-compability questions. " +
                        "Is this OK?",
                "Welcome Contestant!",
                1,
                null);
        //NO Case

        //OK Case
        //Question1
        String name = (String)JOptionPane.showInputDialog(null,
                "What is your name?",
                "Question 1",
                3,
                null,
                null,
                "String");

        //Question2
        String Idea = (String)JOptionPane.showInputDialog(null,
                "Complete this sentence: My idea of a romantic evenening involves________",
                "Question 2",
                3,
                null,
                null,
                "String");

        //Question3
        String FavFood = (String)JOptionPane.showInputDialog(null,
                "What is your favorite food?",
                "Question 3",
                3,
                null,
                null,
                "String");

        //Question4
        String Animal = (String)JOptionPane.showInputDialog(null,
                "Name an animal.",
                "Question 4",
                3,
                null,

                null,
                "String");

        //Question5
        String AnimalDes = (String)JOptionPane.showInputDialog(null,
                "What word would you use to describe a " + Animal,
                "Question 5",
                3,
                null,
                null,
                "String");

        //Question6
        String BodyPart = (String)JOptionPane.showInputDialog(null,
                "name a body part",
                "Question 6",
                3,
                null,
                null,
                "String");

        //Question7
        String BodyPartDes = (String)JOptionPane.showInputDialog(null,
                "What word would you use to describe a " + BodyPart,
                "Question 7",
                3,
                null,
                null,
                "String");

        //Question8
        String Verb = (String)JOptionPane.showInputDialog(null,
                "Choose a verb in the past tense.",
                "Question 8",
                3,
                null,
                null,
                "String");

        //Question9
        String Budget = (String)(JOptionPane.showInputDialog(null,
                "How much would you spend on a dinner date?",
                "Question 9",
                3,
                null,
                null,
                "int"));
        int BudgetI = Integer.parseInt(Budget);

        //Question10
        String FavNumber = (String)JOptionPane.showInputDialog(null,
                "What is your favorit number between 0 and 1?",
                "Question 10",
                3,
                null,
                null,
                "Double");
        Double FavNumberD = Double.parseDouble(FavNumber);

        //Thank You Message
        JOptionPane.showMessageDialog(null,
                "Thank you " + name + ". Enjoy your date and we'll talk with you later in the show!",
                "Thank You!",
                1);

        //Welcome back message
        JOptionPane.showMessageDialog(null,
                "Welcome back " + name + "! Tell me, how do you think your date went? is it true that people " +
                        "generally happy after dating you?",
                "Welcome back!",
                1);

        //Surprise message
        JOptionPane.showMessageDialog(null,
                "Your date Alex has been listening back stage and might like to disagree with you." +
                        " Ladies and gentlemen, please welcome Alex!",
                "Surprise!",
                2);

        //Story
        JOptionPane.showMessageDialog(null,
                "i have a lot to tell you about my date with " + name + "! First we had dinner." +
                        " i convinced " + name + " that we \nshould share the roasted " + Animal + " " + BodyPart +
                ". " + name + " kept talking about " + Idea + " and the number " + FavNumber + " \nor something." +
                        " The meal was too " + BodyPartDes + " and I insisted on leaving a $" + FavNumber +
                " tip! " + name + " \nsaid that was only " + (FavNumberD*100/BudgetI) + "% on a " + Budget + " meal.\n \n" +
                "We ended the night with a movie called \"Attack of the " + FavFood + "\". I " + Verb + " with " + name +
                ", and that's \nwhen I really started to appreciate how " + AnimalDes + " " + name + " was." +
                        " I'm in love and want " + name + " to marry me!",
                "A Romantic Evening",
                1);

    }
}
