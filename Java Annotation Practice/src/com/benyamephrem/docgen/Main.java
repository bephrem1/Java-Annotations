package com.benyamephrem.docgen;

import com.benyamephrem.math.MathUtils;

//Reflection allows you to modify or analyze [called 'introspection'] classes' or objects' behaviour

public class Main {

    public static void main(String[] args) {
        // TODO: Process the MathUtils class's annotations
        DocProcessor.process(MathUtils.class);

    }

}