function calculer(operand01, operand02, operation){

    switch(operation){
        case "+" : return operand01 + operand02;
        case "-" : return operand01 - operand02;
        case "x" : return operand01 * operand02;
        default  : return operand01 / operand02;
    }

}