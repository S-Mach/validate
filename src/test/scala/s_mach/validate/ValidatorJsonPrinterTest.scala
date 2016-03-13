///*
//                    ,i::,
//               :;;;;;;;
//              ;:,,::;.
//            1ft1;::;1tL
//              t1;::;1,
//               :;::;               _____       __  ___              __
//          fCLff ;:: tfLLC         / ___/      /  |/  /____ _ _____ / /_
//         CLft11 :,, i1tffLi       \__ \ ____ / /|_/ // __ `// ___// __ \
//         1t1i   .;;   .1tf       ___/ //___// /  / // /_/ // /__ / / / /
//       CLt1i    :,:    .1tfL.   /____/     /_/  /_/ \__,_/ \___//_/ /_/
//       Lft1,:;:       , 1tfL:
//       ;it1i ,,,:::;;;::1tti      s_mach.validate
//         .t1i .,::;;; ;1tt        Copyright (c) 2015 S-Mach, Inc.
//         Lft11ii;::;ii1tfL:       Author: lance.gatlin@gmail.com
//          .L1 1tt1ttt,,Li
//            ...1LLLL...
//*/
//package s_mach.validate_play_json
//
//import org.scalatest.{FlatSpec, Matchers}
//import s_mach.validate._
//import s_mach.validate.play_json.example.ExampleUsage
//import s_mach.validate.MessageForRule.Implicits._
//import s_mach.validate.play_json.example.ExampleUsage2.WeightLb
//
//class ValidatorJsonPrinterTest extends FlatSpec with Matchers {
//  import ExampleUsage._
//
//  "JsonValidatorPrinter.print" should "correctly print JSON for a string validator" in {
//    validator[Name].rules.printJs.pretty should equal(
//"""[ "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ]"""
//    )
//  }
//
//  "JsonValidatorPrinter.print" should "correctly print JSON for a number validator" in {
//    validator[WeightLb].rules.printJs.pretty should equal(
//"""[ "must be greater than 0.0", "must be less than 1000.0" ]"""
//    )
//  }
//
//  "JsonValidatorPrinter.print" should "correctly print JSON for a single case class validator" in {
//    validator[Person].rules.printJs.pretty should equal(
//"""{
//  "this" : [ "age plus id must be less than 1000" ],
//  "name" : [ "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
//  "age" : [ "must be greater than or equal to 0", "must be less than or equal to 150" ]
//}"""
//    )
//  }
//
//  "JsonValidatorPrinter.print" should "correctly print JSON for a nested case class validator" in {
//    validator[Family].rules.printJs.pretty should equal(
//"""{
//  "this" : [ "father must be older than children", "mother must be older than children" ],
//  "father" : {
//    "this" : [ "age plus id must be less than 1000" ],
//    "name" : [ "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
//    "age" : [ "must be greater than or equal to 0", "must be less than or equal to 150" ]
//  },
//  "mother" : {
//    "this" : [ "age plus id must be less than 1000" ],
//    "name" : [ "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
//    "age" : [ "must be greater than or equal to 0", "must be less than or equal to 150" ]
//  },
//  "children" : {
//    "*" : {
//      "this" : [ "age plus id must be less than 1000" ],
//      "name" : [ "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
//      "age" : [ "must be greater than or equal to 0", "must be less than or equal to 150" ]
//    }
//  },
//  "grandMother" : {
//    "this" : [ "age plus id must be less than 1000" ],
//    "name" : [ "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
//    "age" : [ "must be greater than or equal to 0", "must be less than or equal to 150" ]
//  },
//  "grandFather" : {
//    "this" : [ "age plus id must be less than 1000" ],
//    "name" : [ "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
//    "age" : [ "must be greater than or equal to 0", "must be less than or equal to 150" ]
//  }
//}"""
//    )
//  }
//
//}
