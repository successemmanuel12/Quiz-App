package com.example.android.totalquiz;


public class GeneralQuestions {
    public String[] mQuestion  = {
            "Grand Central Terminal, Park Avenue, New York is the world's",
            "Entomology is the science that studies",
            "Eritrea, which became the 182nd member of the UN in 1993, is in the continent of",
            "Garampani sanctuary is located at",
            "For which of the following disciplines is Nobel Prize awarded?",
            "Hitler party which came into power in 1933 is known as?",
            "FFC stands for?",
            "Fastest shorthand writer was?",
            " Epsom (England) is the place associated with?",
            "First human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in",

    };

    private    String mChoices[][] = {

    {"largest railway station", "highest railway station", "longest railway station","None of the above"},
            {"Behavior of human beings", "Insects", "The origin and history of technical and scientific terms", "The formation of rocks"},
            {"Asia", "Africa", "Europe", "Australia"},
            {"Junagarh, Gujarat", "Diphu, Assam", "Kohima, Nagaland", "Gangtok, Sikkim"},
            {"Physics and Chemistry", "Physiology or Medicine", "Literature, Peace and Economics", "All of the above"},
            {"Labour Party", "Nazi Party", "Ku-Klux-Klan", "Democratic Party"},
            {"Foreign Finance Corporation", "Film Finance Corporation", "Federation of Football Council", "None of the above"},
            {"Dr. G. D. Bist", "J.R.D. Tata", "J.M. Tagore", "Khudada Khan"},
            {"Horse racing","Polo", "Shooting","Snooker"},
            {"1967","1968","1958", "1922"}

    };
    private  String mCorrectAnswers[]={
            "largest railway station", "Insects", "Africa", "Diphu, Assam", "All of the above",
            "Nazi Party", "Film Finance Corporation", "Dr. G. D. Bist", "Horse racing", "1967"
    };

    public String getQuestions(int a){
        String questions = mQuestion[a];
        return questions;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return  answer;
    }
}
