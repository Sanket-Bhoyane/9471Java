/*
variables :
let,const,var

*/
// let msg;
// msg="hey pratiksha, how are u?"
let msg="hey pratiksha, how are u?"
console.log(msg);

let a=12, 
b=23,
 c=5;
console.log(a)
console.log(b)
console.log(c)
msg="hey sanky, Im Fine!"
console.log(msg)

//creating contant 

const x= "anaya ur looking preety"
console.log(x);

if(5>2){
    console.log("Inside Block")
    let add="pune"
    console.log(add)
}

// creating var
//var has no block scope
// var is global
var my=56
if(5>2){
    console.log("Inside Block")
    let add="pune"
    console.log(add)
    var city="delhi"
}
console.log(city)
// var tolerate redeclarations
var f=56;
var f=85
console.log(f)
console.log(f)
g=56;
var g
console.log(g)

//naming rule
/*
1.it cannot start from digit
2.name must contain letters,digit,or symbol $ and _
3.keywords cannot be used as variable name
4.case sensetive 
*/
var Const=8585
console.log(Const)