let number = 0;
let beatles = ["John", "Paul", "George", "Ringo"];
let ramones = ["Joey", "Johnny", "Dee Dee", "Tommy"]

// while --------------------------------------------------------------

console.log("==== while ==========");

while (number <= 10) {

    if (number == 5) {
        break;
    }

    console.log("Number: " + number);
    number++;
}

// do while -----------------------------------------------------------

console.log("==== do while =======");
number = 15;

do {
    console.log("Number: " + number);
    number++;
} while (number <= 10);

// for ----------------------------------------------------------------

console.log("==== for ============");

for (let i = 0; i <= 10; i++) {

    if (i == 5) {
        continue;
    }

    console.log("Number: " + i);
}

// foreach ------------------------------------------------------------

console.log("==== foreach ========");

beatles.forEach((member) => {
    console.log(member)
})

// for of -------------------------------------------------------------

for (ramone of ramones) {
    console.log(ramone)
}