import java.util.*
import kotlin.system.exitProcess

/**
 * By Wesley lancaster
 * 9/26/22
 */
//idea for tracking # of brackets by this dude:
//https://codereview.stackexchange.com/questions/186719/given-a-string-of-brackets-return-the-count-of-brackets-that-are-properly-match

//I realize I misunderstood the assignment, and rendered a 1 / 0 for in order each bracket within a line input..
// instead of a 1 / 0 for the entire line of input...
//for what its worth, if there's a 0 in the output, then the entire line is wrong.

fun main() {
    println(" *\n" +
            " * By Wesley lancaster\n" +
            " * 9/26/22\n" +
            " *\n")
    var str: String = "(((a+c){bac}haha)"
    var strBracks: String = ""
    var check:String
    println(str)

    var brackets =  Stack<String>();

    for (i in 0..str.length-1) {
        if(str.get(i) == '('||str.get(i) == '['||str.get(i) == '{'||str.get(i) == '<'||
            str.get(i) == ')'||str.get(i) == ']'||str.get(i) == '}'||str.get(i) == '>')
        {
            strBracks = strBracks + str.get(i)
        }
    }

    println(strBracks)

    for (i in 0..strBracks.length-1) {
        if(strBracks.get(i) == '('){
            brackets.push('('.toString())
        }
        if(strBracks.get(i) == '['){
            brackets.push('['.toString())
        }
        if(strBracks.get(i) == '{'){
            brackets.push('{'.toString())
        }
        if(strBracks.get(i) == '<'){
            brackets.push('<'.toString())
        }

        if(strBracks.get(i) == ')'){
            check = brackets.peek()
            if(check.contains('(')){
                brackets.pop()
                print('1')
            }
            else{
                print('0')
            }
        }
        if(strBracks.get(i) == ']'){
            check = brackets.peek()
            if(check.contains('[')){
                brackets.pop()
                print('1')
            }
            else{
                print('0')
            }
        }
        if(strBracks.get(i) == '}'){
            check = brackets.peek()
            if(check.contains('{')){
                brackets.pop()
                print('1')
            }
            else{
                print('0')
            }
        }
        if(strBracks.get(i) == '>'){
            check = brackets.peek()
            if(check.contains('<')){
                brackets.pop()
                print('1')
            }
            else{
                print('0')
            }
        }
    }
    var remaining: String = brackets.toString()
    for (i in 0..remaining.length-3) {
        print("0")
    }

    exitProcess(1)
}