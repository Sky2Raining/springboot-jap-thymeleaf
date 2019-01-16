package com.skyraining.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 计算工具类
 */
public class MathUtil {

    public static final int DEFAULT_SCALE = 5;
    public static final int DIV_SCALE = 10;

    public static final int DEFAULT_ROUND_MODE = BigDecimal.ROUND_DOWN;

    public static final int ROUND_HALF_UP = BigDecimal.ROUND_HALF_UP;
    public static final DecimalFormat DEFAULT_DF = new DecimalFormat("0.00000");
    public static final DecimalFormat SHORT_DF = new DecimalFormat("0.00");

    /**
     * 数值之间的精确相加
     *
     * @param v1
     * @param v2
     * @return double
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 字符数字之间的精确相加
     *
     * @param v1
     * @param v2
     * @return String
     */
    public static String add(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.add(b2).toString();
    }

    /**
     * 数值之间的精确相减
     *
     * @param v1
     * @param v2
     * @return double
     */
    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 字符数字之间精确相减
     *
     * @param v1
     * @param v2
     * @return String
     */
    public static String sub(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.subtract(b2).toString();
    }

    /**
     * 数值的精确相乘
     *
     * @param v1
     * @param v2
     * @return double
     */
    public static double mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 字符的数字精确相乘
     *
     * @param v1
     * @param v2
     * @return String
     */
    public static String mul(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.multiply(b2).toString();
    }

    /**
     * 数值的精确相除
     *
     * @param v1
     * @param v2
     * @return double
     */
    public static double div(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2).doubleValue();
    }

    /**
     * 字符的数值精确相除
     *
     * @param v1
     * @param v2
     * @return String
     */
    public static String div(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.divide(b2).toString();
    }

    /**
     * 两个数值之间的精确指数运算
     *
     * @param v1
     * @param v2
     * @return
     */
    public static double pow(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        return b1.pow((int) v2).doubleValue();
    }

    /**
     * 底数为字符，指数为数值的精确指数运算
     *
     * @param v1
     * @param v2
     * @return
     */
    public static String pow(String v1, int v2) {
        BigDecimal b1 = new BigDecimal(v1);
        return b1.pow(v2).toString();
    }

    /**
     * 两个都为字符的数字之间的精确指数运算
     *
     * @param v1
     * @param v2
     * @return
     */
    public static String pow(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        return b1.pow(Integer.parseInt(v2)).toString();
    }

}
