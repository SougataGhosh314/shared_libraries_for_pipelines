#!/usr/bin/env groovy
package com.sougata

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.sougata.GlobalVars
   // println GlobalVars.foo
}
