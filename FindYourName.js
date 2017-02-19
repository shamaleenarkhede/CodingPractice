/*jshint multistr:true */
var text = "Hey, how are you \
doing? My name is Shamalee. What does Shamalee means? \
Shamalee is a flower's name";

var myName = "Shamalee";
 var hits = [];
 
 for(var i=0; i < text.length; i++)
 {  
     if(text[i] === 'S')
     {
         for(var j=i; j < (myName.length + i); j++)
         {
             hits.push(text[j]);
         }
     }
 }
 
 if(hits.length === 0)
 {
     console.log("Your name wasn't found!");
 }
 else
 {
     console.log(hits);
 }
