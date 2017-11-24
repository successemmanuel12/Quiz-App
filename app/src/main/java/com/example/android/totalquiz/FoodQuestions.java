package com.example.android.totalquiz;


public class FoodQuestions {

    public String[] mQuestion  = {
            "One of the following does not belong in this food group",
            "The food group that beef belongs to is?",
            "What food doesn't belong to this food group??",
            "what food group does kiwi belongs to?",
            "What food doesn't belong to this food group?",
            "The food group that apricot belongs to is?",
            "What food doesn't belong to this food group?",
            "The food group that salad dressing belongs to is?",
            "What food doesn't belong to this food group?",
            "The food group that cherries belongs to is?"

    };

    private    String mChoices[][] = {
            {"banana", "beef", " peach", "nectarine"},
            {"Meat, Poultry, Fish, Beans, Eggs, and Nuts Group", " Fats, Oils and Sweets Group", "  Fruit Group", "  Bread, Cereal, Rice and Pasta Group"},
            {"chicken", " steak", " crab", " kiwi"},
            {"Bread, Cereal, Rice and Pasta Group", "Meat, Poultry, Fish, Beans, Eggs, and Nuts Group", "Vegetable Group", " Milk, Yogurt, and Cheese Group"},
            {"apricot" ,"squash","zucchini","potato"},
            {"Meat, Poultry, Fish, Beans, Eggs, and Nuts Group","Fruit Group" ,"Vegetable Group" ,"Bread, Cereal, Rice and Pasta Group"},
            {"chocolate milk","cream cheese" ,"ice cream","salad dressing"},
            {"Fruit Group","Dairy Group", "Vegetable Group", "Meat, Poultry, Fish, Beans, Eggs, and Nuts Group"},
            {"cookies", "candy", "salad dressing", "cherries"},
            {"Dairy Group", "Vegetable Group", "Meat, Poultry, Fish, Beans, Eggs, and Nuts Group", "Fats, Oils and Sweets Group"}

    };
    private  String mCorrectAnswers[]={
            "beef", "Fruit Group", "kiwi", "Meat, Poultry, Fish, Beans, Eggs, and Nuts Group",
            "apricot", "Vegetable Group", "salad dressing",
            "Dairy Group", "cherries",  "Fats, Oils and Sweets Group"




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
