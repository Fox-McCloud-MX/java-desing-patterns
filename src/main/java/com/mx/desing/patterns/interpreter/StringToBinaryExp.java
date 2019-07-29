package com.mx.desing.patterns.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StringToBinaryExp implements IExpression {

    private String str;

    @Override
    public void interpret(Context ic) {
        ic.getBinaryForm(str);
    }

}
