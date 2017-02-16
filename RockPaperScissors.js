var userChoice = prompt("Choose one option - Rock, Paper, Scissors!!!");
var computerChoice = Math.random();     \\Just a random number to take value from computer.

if(computerChoice < 0.25)
    {
        computerChoice = "Rock";
    }
else if(computerChoice < 0.56)
    {
        computerChoice = "Paper";
    }
else
    {
        computerChoice = "Scissors";
    }
    
    
 var compare = function(userChoice,computerChoice){
        if(userChoice == computerChoice)
            {
                return "This is a tie";
            }
        if(userChoice == "Rock")
            {
                if(computerChoice == "Scissors")
                    {
                        return "Rock Wins!!!";
                    }
                else 
                    {
                        return "Paper Wins!!!";
                    }
            }
        if(userChoice == "Scissors")
            {
                if(computerChoice == "Rock")
                    {
                        return "Rock Wins!!!";
                    }
                else if(computerChoice == "Paper")
                    {
                        return "Scissors Wins!!!";
                    }
            }
            
        if(userChoice == "Paper")
            {
                if(computerChoice == "Rock")
                    {
                        return "Paper Wins!!!";
                    }
                else if (computerChoice == "Scissors")
                    {
                        return "Scissors Wins!!!";
                    }
            }
        
     };