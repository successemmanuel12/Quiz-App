package com.example.android.totalquiz;


public class BibleQuestions {
    public String[] mQuestion  = {
            "How many apostles did Jesus have?",
            "Which book tells about the visit of the Wise men to baby Jesus?",
            "Who wrote the book of Acts?",
            "How many Gospel books are there?",
            "Who wrote the book of Revelation?",
            "Who said, “Repent, for the Kingdom of Heaven is at hand”?",
            "How many times did Peter deny Jesus?",
            "Who was shipwrecked in the New Testament?",
            "Which New Testament book tells about Paul’s conversion?",
            "Where did Jesus grow up?",
            "Where was Paul when he went blind?",
            "How many wise and foolish girls were in Jesus’ story?",
            "Who wrote the most books in the New Testament?",
            "Name one book that tells of Jesus’ birth?",
            "Who was the governor who tried Jesus?"

};

    private    String mChoices[][] = {
            {"five", "Twelve", "Six", "Ten"},
            {"Matthew", "Mark", "Luke", "John"},
            {"St Mark", "Luke", "St John", "Paul the Apostle"},
            {"Five", "Six", "Ten", "Four"},
            {"John", "Peter", "Jesus Christ", "Mark"},
            {"John the Baptist", "Mary Magdalene", "Peter", "Paul the Apostle"},
            {"Four", "Three", "Six", "Two"},
            {"Andrew", "Jesus", "Paul", "James"},
            {"Jude", "Revelation", "Matthew", "Acts"},
            {"Jerusalem", "Nazareth", "Israel", "Egypt"},
            {"On the road to Damascus", "Egypt", "Canaan", "Sodom and Gomorrah"},
            {"Five", "Five of each or ten altogether", "Ten", "Twelve"},
            {"Mark", "Luke", "Paul", "Simon"},
            {"John", "Revelation", "Matthew or Luke", "Hebrew"},
            {"Batholomew ", "Judas", "Moses", "Pilate"}

    };
    private  String mCorrectAnswers[]={
            "Twelve", "Matthew", "Luke", "Four", "John", "John the Baptist", "Three",
            "Paul", "Acts", "Nazareth", "On the road to Damascus",
            "Five of each or ten altogether", "Paul", "Matthew or Luke", "Pilate"
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

