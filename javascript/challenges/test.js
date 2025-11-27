console.log("JavaScript challenges are ready!");

//test reversing of strings just to see how javascript works!
//this is how you create a function in javascript
function reverseString(str) {
    //instead of variable types like in Java, 
    //we use const for a variable that will not change and block scoped
    //let: Block scoped, cannot be re-declared within the same scope, but can be re-assigned.
    //var: Function-scoped or globally-scoped, can be redeclared or re-assigned
    const reversed = str.split('').reverse().join(''); //create a const variable for the reverse of the s
    return reversed; 
}

console.log(reverseString("hello"));