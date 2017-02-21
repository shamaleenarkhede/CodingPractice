var bob = {
    firstName: "Bob",
    lastName: "Jones",
    phoneNumber: "(650) 777-7777",
    email: "bob.jones@example.com"
};

var mary = {
    firstName: "Mary",
    lastName: "Johnson",
    phoneNumber: "(650) 888-8888",
    email: "mary.johnson@example.com"
};

var contacts = [bob, mary];

function printPerson(person) {
    console.log(person.firstName + " " + person.lastName);
}

function list() {
	var contactsLength = contacts.length;
	for (var i = 0; i < contactsLength; i++) {
		printPerson(contacts[i]);
	}
}

/*Create a search function
then call it passing "Jones"*/
function search(lastName){
    var contactsLength = contacts.length;
    for (var i = 0; i < contactsLength; i++) {
		if(contacts[i].lastName == lastName)
		{
            printPerson(contacts[i]);
		}
	}
    };
    
    search("Jones");
    
/* Create a add function
to add a new contact*/   
var shamalee = {
    firstName : "",
    lastName : "",
    email : "",
    phoneNumber : ""
    };
    
function add(firstName, lastName, email, phoneNumber){
    shamalee.firstName = firstName;
    shamalee.lastName = lastName;
    shamalee.email = email;
    shamalee.phoneNumber = phoneNumber;    
    };
  contacts[contacts.length] = shamalee; 
 
add("Shamalee", "Narkhede", "(980) 643-7110", "shamaleenarkhede@gmail.com");
list();
   

