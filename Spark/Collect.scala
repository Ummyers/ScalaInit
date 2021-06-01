package com.sparkTutorial.rdd.sumOfNumbers

import com.sparkTutorial.commons.Utils
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.spark.{SparkConf, SparkContext}

object SumOfNumbersProblem {

  def main(args: Array[String]) {
    Logger.getLogger("org").setLevel(Level.OFF)
    val conf = new SparkConf().setAppName("Class").setMaster("local[*]")
    val sc = new SparkContext(conf)

    val inputNumbers = List(3,5,7,11)
    val numberRdd = sc.parallelize(inputNumbers)

    val numbers = numberRdd.collect()
    val words = numbers.reduce((x,y) => x + y)
    println(words)

//
//    val inputNumber = sc.textFile("in/prime_nums.text")
//    val inter = inputNumber.collect()
//    val sum = inter.reduce((x,y) => x + y)
//    println("La suma es: " + sum)

  }
}
