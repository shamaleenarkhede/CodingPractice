var friends = {};
friends.bill = {
    firstName: 'Bill',
    lastName: 'Jones',
    number: '652-585-5105',
    address: ['10005, Graduate Lane, Charlotte']
    };
    
friends.steve={
    firstName: 'Steve',
    lastName: 'Grey',
    number: '651-874-2178',
    address: ['Walnut Creek, California']
    };
    
var list = function(obj){
    for(var objFriend in obj)
    {
        console.log(objFriend);
        }
    };
    
var search = function(name){
    for(var objFriend in friends)
    {
        if(friends[objFriend].firstName == name)
        {
            console.log(friends[objFriend]);
            return friends[objFriend];
        }
    }
};

list(friends);
search("Bill");