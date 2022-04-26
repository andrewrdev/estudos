let num = 0;
let num2 = 0;
let result = 0;

// Arithmetic ---------------------------------------------------------

console.log("==== Arithmetic ======================")

console.log("20 + 10 = " + (20 + 10))
console.log("20 - 10 = " + (20 - 10))
console.log("20 * 10 = " + (20 * 10))
console.log("20 / 10 = " + (20 / 10))
console.log("20 % 10 = " + (20 % 10))
console.log("2 ** 2  = " + (2 ** 2))

// Assignment Operators -----------------------------------------------

console.log("==== Assignment ======================")

console.log("20 += 10 = " + (num += 10))
console.log("20 -= 10 = " + (num -= 10))
console.log("20 *= 10 = " + (num *= 10))
console.log("20 /= 10 = " + (num /= 10))
console.log("20 %= 10 = " + (num %= 10))

// Comparison Operators -----------------------------------------------

console.log("==== Comparison ======================")

console.log("10 == 5 = " + (10 == 5))
console.log("10 === '10' = " + (10 === '10'))
console.log("10 != 5 = " + (10 != 5))
console.log("10 !== '10' = " + (10 !== '10'))
console.log("10 >= 5 = " + (10 >= 5))
console.log("10 <= 5 = " + (10 <= 5))
console.log("10 > 5  = " + (10 > 5))
console.log("10 < 5  = " + (10 < 5))

// Logical Operators --------------------------------------------------

console.log("==== Logical Operators ===============")

console.log("10 > 5 && 20 < 15 = " + (10 > 5 && 20 < 15))
console.log("10 > 5 || 20 < 15 = " + (10 > 5 || 20 < 15))

// Increment Decrement ------------------------------------------------

console.log("==== Increment Decrement =============")

console.log("++ = " + (num2++))
console.log("-- = " + (num2--))
console.log("++ = " + (++num2))
console.log("-- = " + (--num2))

// Ternary Operator ---------------------------------------------------

console.log("==== Ternary Operator ================")

result = (10 > 5) ? "Yes, true" : "No, false"

console.log("10 > 5 : " + result)