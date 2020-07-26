package com.mycompany.octaldecimal;
import java_cup.runtime.*;
%%
%class LexicoOctal
%type java_cup.runtime.Symbol
%cupsym SintaxisOctalSym
%public
%cup
%full
%line
%column
cero=[0]
OneNine = [1-7]
%{
    StringBuffer string = new StringBuffer();

    private Symbol symbol(int type, Object value){
        System.out.println(value);
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        System.out.println(type);
        return new Symbol(type, yyline, yycolumn);
    }
%}

%state STRING

%%


<YYINITIAL> ({cero} | {OneNine}) {return new Symbol(SintaxisOctalSym.numero, yycolumn, yyline, Integer.parseInt(yytext()));}

<YYINITIAL> . {System.out.println("Error Lexico");/*No prestar atencion*/}