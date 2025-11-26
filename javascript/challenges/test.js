console.log("JavaScript challenges are ready!");

//test reversing of strings just to see how javascript works!
function reverseString(str) {
    const reversed = str.split('').reverse().join(''); //create a const variable for the reverse of the string
    return reversed; 
}

console.log(reverseString("hello"));