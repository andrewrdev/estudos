let numbers = [5, 10, 15, 20]
let letters = ["A", "B", "C"]
let multidimensionalArray = [
    [50, 54, 58],
    ["A", "B", "C"],
    ["Red", "Green", "Blue"]
]

console.log(numbers[2])
console.log(numbers[3])

numbers.push(25)

console.log(numbers)

numbers.pop()

console.log(numbers)

numbers.shift()

console.log(numbers)

numbers.unshift(30)

console.log(numbers)
console.log(numbers.concat(letters))
console.log(letters.includes("D"))

multidimensionalArray.forEach(function(item){
    console.log(item)
})