package com.benyamephrem.docgen;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

//@Retention tells the compiler when and where to have the annotations avaliable (at compile time? at runtime?)
@Retention(RetentionPolicy.RUNTIME) //Shorthand for 'value = RetentionPolicy.RUNTIME' since only takes one value 'value'

//Tells compiler where we want the annotation to be used
@Target({ElementType.TYPE, ElementType.METHOD}) //Annotations can be used on classes and methods

//@interface tells compiler that this is going to be an annotation, not tradition implements interface
public @interface Doc {

    //These are all arguments for the Doc annotation

    /** Description of class or method */
    String desc() default "";

    /** Description of parameters, if annotated element is a method & has parameters */
    String[] params() default {};

    /** Description of return value, if annotated element is a method & isn't void */
    String returnVal() default "";
}