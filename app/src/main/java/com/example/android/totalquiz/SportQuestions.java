package com.example.android.totalquiz;

public class SportQuestions {

     public String[] mQuestion  = {
            "What is the highest score a judge can award in Figure skating?",
            "In 1988 who became the first boxer to have won world championships in five different weight categories?",
            "Which piece of sporting equipment is 3 inches in diameter and weighs 6 ounces?",
            "In which city is the Maracana stadium?",
            "Who has played international football and cricket for Scotland?",
            "What sport is played by the Minnesota Twins?",
            "At what sport did Scotland become world champions in 2005?",
            "At which Test cricket ground could you bowl from the Radcliffe Road end?",
            "Which two teams compete in the Turin derby?",
            "From which club did Newcastle sign Jermaine Jenas?",
             "Which Geordie played for England and managed the Republic of Ireland?",
             "Which ground hosts the FA Cup Final?",
             "Which Joe managed Everton when they won the 1995 FA Cup?",
             "Which Lane do Sheffield United play at?",
             "Which London side did Ruud Gullit join in 1995?",
             "Which London striker has played for Arsenal, Crystal Palace, Queen's Park Rangers, Spurs, Chelsea, West Ham and Millwall?",
             "Who was England's manager for the 1990 World Cup in Italy?",
             "Who was Ian St John's partner on TV?",
             "Who was the England manager when the side failed to reach the 1994 World Cup finals?",
             "Who was the first Footballer of the Year in England and Scotland?",
             "Who was the first Scot to make 100 appearances for his country?",
             "Who was the first soccer manager to manage all three Birmingham clubs - Aston Villa, Birmingham and West Brom?",
             "Who was the manager when England won the 1966 World Cup?",
             "Who went to Newcastle from Man Utd in the Andy Cole transfer deal?",
             "Who were Asia's two representatives in the 1990 World Cup Finals?"

};

    private    String mChoices[][] = {
            {"five", "four", "Six", "two"},
            {"Mike Tyson", "Sugar Ray Leonard", "George Foreman", "Oscar De La Hoya"},
            {"An ice hockey puck", "Field Hockey", "Badminton", "Long Tennis"},
            {"London", "Milan", "Lisbon", "Rio de Janerio"},
            {"Andy Goram", "Frank Lampard", "Abraham Grant", "James Goram"},
            {"Handball", "football", "Baseball", "Hockey"},
            {"Elephant Polo", "Volley ball", "Badminton", "Long Jump"},
            {"South Ledge", "Trent Bridge", "Scoop Bridge", "Rio de Janerio"},
            {"Torino and AC Milan", "Juventus and Inter milan", "Acmilan and Inter milan", "Juventus and Torino"},
            {"Notts Forest", "Debby County", "Bolton", "wolverhampton"},
            {"Theo Walcolt","Jack Charlton","John Stones","Robert White"},
            {"Stadium of Light","Stanford Bridge","White Hart Lane","Wembley Stadium"},
            {"brad","Robinson","Royle","bobbe"},
            {"Bramall","White Hart","Lobby","Black"},
            {"Manchester United","Arsenal","Chelsea","Bolton"},
            {"Berbatov","Joe Cole","Anelka","Clive Allen"},
            {"Bobby Robson","Andy Gram","Abraham Stack ","Jimmy Greaves"},
            {"Ramires","Jimmy Greaves","Bobby Robson","Robben"},
            {"Graham Taylor","Glenn Hoddle","Terry Venables","Ron Greenwood"},
            {"Billy Wright","Kenny Sansom","David Beckham","Gordon Strachan"},
            {"Kenny Dalglish","Jim Leighton","Darren Fletcher","Paul McStay"},
            {"Jim Smith","Ron Saunders","Garry Pendrey","Terry Cooper"},
            {"Jimmy Greaves","Bobby Robson","Alf Ramsey","Ron Greenwood"},
            {"Danny Simpson","Michael Owen","Alan Smith","Keith Gillespie"},
            {"South Korea, United Arab Emirates","North Korea, Israel","Iran, Iraq","Kuwait, South Korea"}
    };
    private  String mCorrectAnswers[]={
            "Six", "Sugar Ray Leonard", "An ice hockey puck", "Rio de Janerio", "Andy Goram",
            "Baseball", "Elephant Polo", "Trent Bridge", "Juventus and Torino", "Notts Forest",
            "Jack Charlton", "Wembley Stadium", "Royle","Bramall", "Chelsea","Clive Allen",
            "Bobby Robson", "Jimmy Greaves", "Graham Taylor", "Gordon Strachan", "Kenny Dalglish",
            "Ron Saunders", "Alf Ramsey", "Keith Gillespie", "South Korea, United Arab Emirates"
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
