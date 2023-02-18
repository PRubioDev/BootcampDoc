class User {
  String name
  int age
}

def users = [
  new User(name: "Bob", age: 20),
  new User(name: "Tom", age: 50),
  new User(name: "Bill", age: 45)
]

def null_value = users.find { it.age > 100 }    // no over-100 found. Null 

null_value?.name?.length()    // no NPE thrown
println null_value.name    // no NPE thrown

//  null ?. name  ?. length()
// (null ?. name) ?. length()
// (    null    ) ?. length()
// null

// null_value?.name.length()    // NPE thrown
//  null ?. name  . length()
// (null ?. name) . length()
// (    null    ) . length()  ===> NullPointerException