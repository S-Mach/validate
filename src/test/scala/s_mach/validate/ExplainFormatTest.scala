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
//import s_mach.explain_json._
//import s_mach.explain_json.JsonWriter.Implicits._
//import s_mach.explain_play_json._
//import s_mach.validate.MessageForRule.Implicits._
//
//
//class ExplainFormatTest extends FlatSpec with Matchers {
//  import example.ExampleUsage._
//  import example.ExampleUsage2._
//
//  "JsonValidatorPrinter.print" should "correctly print JSON for a string validator" in {
//    explainPlayJson[Name].explain.toTypeRemarks.printJsonTypeRemarks should equal(
//"""[ "must be string", "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ]"""
//    )
//  }
//
////  "JsonValidatorPrinter.print" should "correctly print JSON for a number validator" in {
////    explainPlayJson[WeightLb].printJs.pretty should equal(
////"""[ "must be number", "must be greater than 0.0", "must be less than 1000.0" ]"""
////    )
////  }
////
////  "JsonValidatorPrinter.print" should "correctly print JSON for a single case class validator" in {
////    explainPlayJson[Person].printJs.pretty should equal(
////"""{
////  "this" : [ "age plus id must be less than 1000" ],
////  "id" : [ "must be integer" ],
////  "name" : [ "must be string", "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
////  "age" : [ "must be integer", "must be greater than or equal to 0", "must be less than or equal to 150" ]
////}"""
////    )
////  }
////
////  "ExplainFormat.builder" should "allow building an ExplainFormat type-class for a product" in {
////    val ef =
////      ExplainFormat
////        .builder[Person]
////        .field("id",_.id)()
////        .field("name",_.name)()
////        .field("age",_.age)()
////        .build()
////        .withValidator
////
////    ef.jsonSchema.printJs.pretty should equal(
////"""{
////  "this" : [ "age plus id must be less than 1000" ],
////  "id" : [ "must be integer" ],
////  "name" : [ "must be string", "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
////  "age" : [ "must be integer", "must be greater than or equal to 0", "must be less than or equal to 150" ]
////}"""
////
////    )
////  }
////
////  "JsonValidatorPrinter.print" should "correctly print JSON for a nested case class validator" in {
////    explainPlayJson[Family].printJs.pretty should equal(
////"""{
////  "this" : [ "father must be older than children", "mother must be older than children" ],
////  "father" : {
////    "this" : [ "age plus id must be less than 1000" ],
////    "id" : [ "must be integer" ],
////    "name" : [ "must be string", "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
////    "age" : [ "must be integer", "must be greater than or equal to 0", "must be less than or equal to 150" ]
////  },
////  "mother" : {
////    "this" : [ "age plus id must be less than 1000" ],
////    "id" : [ "must be integer" ],
////    "name" : [ "must be string", "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
////    "age" : [ "must be integer", "must be greater than or equal to 0", "must be less than or equal to 150" ]
////  },
////  "children" : {
////    "this" : [ "must be array" ],
////    "*" : {
////      "this" : [ "age plus id must be less than 1000" ],
////      "id" : [ "must be integer" ],
////      "name" : [ "must be string", "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
////      "age" : [ "must be integer", "must be greater than or equal to 0", "must be less than or equal to 150" ]
////    }
////  },
////  "grandMother" : {
////    "this" : [ "optional", "age plus id must be less than 1000" ],
////    "id" : [ "must be integer" ],
////    "name" : [ "must be string", "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
////    "age" : [ "must be integer", "must be greater than or equal to 0", "must be less than or equal to 150" ]
////  },
////  "grandFather" : {
////    "this" : [ "optional", "age plus id must be less than 1000" ],
////    "id" : [ "must be integer" ],
////    "name" : [ "must be string", "must not be empty", "must not be longer than 64 characters", "must contain only letters or spaces" ],
////    "age" : [ "must be integer", "must be greater than or equal to 0", "must be less than or equal to 150" ]
////  }
////}"""
////    )
////  }
//
//}
