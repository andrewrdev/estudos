let person = {

    firstName: "Michael",
    lastName: "Jackson",
    age: 32,
    song: function(){
        return `${this.firstName} ${this.lastName} - Bad`
    }
    
}

console.log(person.firstName)
console.log(person.lastName)
console.log(person.age)
console.log(person.song())