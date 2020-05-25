package lv.madara.Game;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //define questions with answers:
        String q1 = "Dažos mēnešos ir 30 dienas, citos 31. Cik mēnešos ir 28 dienas?\n"
                +"A: 1\nB: 12\nC: 2\nD: Nevienā\n"
                +"Ievadi pareizās atbildes burtu!";
        String q2 = "Istabā deg četras sveces. Vienu nopūta, cik sveču palika?\n"
                +"A: Neviena\nB: 3\nC: 4\nD: Atkarīgs, cik stipri pūta\n"
                +"Ievadi pareizās atbildes burtu!";
        String q3 = "NB (Nota bene!) jeb..\n"
                +"A: Iegaumē labi\nB: Skaldi un valdi\nC: Lasi ar apdomu\nD: Saki 'Bēē'\n"
                +"Ievadi pareizās atbildes burtu!";
        String q4 = "Kura dieva skulptūra atrodas VEF ēkas fasādē pret Brīvības ielu?\n"
                +"A: Marsa\nB: Dionīsa\nC: Zeva\nD: Apollona\n"
                +"Ievadi pareizās atbildes burtu!";
        String q5 = "FINĀLA JAUTĀJUMS!!!\n"
                +"Kurā Latvijas pilsētā nekursē tramvajs?\n"
                +"A: Liepājā\nB: Daugavpilī\nC: Rīgā\nD: Cēsīs\n"
                +"Ievadi pareizās atbildes burtu!";

        //store all questions in array for qame:
        Question [] questions = {
                new Question (q1,"B", 1000),
                new Question (q2, "C",2000),
                new Question (q3,"A", 3000),
                new Question (q4,"C",4000),
                new Question (q5, "D", 5000)
        };
        //game rules:
        System.out.println("Esiet sveicināts spēlē - Gribi būt Miljonārs?");
        System.out.println();

        //run method playGame:
        playGame(questions);
    }
    //create method playGame:
    public static void playGame(Question[]questions){

        Scanner userInput = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i].question);
            String answer = userInput.nextLine();
            System.out.println();
            if(!answer.equalsIgnoreCase(questions[i].answer)){
                System.out.println("Atbilde nav pareiza! Spēle beigusies!");
                break;
            }else{
                sum = sum + questions[i].money;
                System.out.println("Atbilde pareiza! +"+questions[i].money+" EUR");
                System.out.println();
            }
        }
        System.out.println("Jūsu kopējais laimests ir "+sum+" EUR. Paldies par spēli!");
    }
}
