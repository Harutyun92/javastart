package pl.sda.javastart.day1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLOutput;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger bI = new BigInteger("464253524643354654744574"); //Fixme dlaczego uzylismy metody new i te same nazwy Big integer
        BigInteger newBI = new BigInteger("326453252364364");
        System.out.println(bI.add(newBI)); //Fixme czy mozna uzyc + zamiast add


        double x = 0.02;
        double y = 0.03;
        double z;                             //z double nie dokladnie liczy
        z = x - y;
        System.out.println(z);

        BigDecimal xx = new BigDecimal("0.02");
        BigDecimal yy = new BigDecimal("0.03"); // z bigdecimal dokladnie liczy
        BigDecimal zz = xx.subtract(yy);
        System.out.println(zz);

        BigDecimal xxx = new BigDecimal(x);                                //Fixme dlaczego "" liczy dokladnie  bez juz nie
        BigDecimal yyy = new BigDecimal(y);
        BigDecimal zzz = xxx.subtract(yyy);  // nie dokladnie wychodzi
        System.out.println(zzz);

        BigDecimal xxxx = BigDecimal.valueOf(0.02);                       //Fixme tu bez " " liczy dokladnie
        BigDecimal yyyy = BigDecimal.valueOf(0.03);
        BigDecimal zzzz = xxxx.subtract(yyyy);  // dla bigdecimal nie korzystac z konstruktora new tylko z valueOf
        System.out.println(zzzz);


    }
}
