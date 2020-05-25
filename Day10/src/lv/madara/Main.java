package lv.madara;

import lv.madara.Figure.Box; //importē Main klasē izveidoto Box klasi

public class Main {
    public static void main(String[] args) {

        Box boxOne = new Box(); //Box klases instance
        boxOne.getDepth(); // ar . (dot) operatoru piekļūst Box klases mainīgajiem (width, depth, height)
        System.out.println(boxOne.getWidth()); //izprintē konsolē 

    }
}
