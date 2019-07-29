package com.mx.desing.patterns.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IntToWords implements IExpression {

    private String str;

    @Override
    public void interpret(Context ic) {
        ic.printInWords(str);
    }

}
