#!/usr/bin/env groovy
package com.sougata

class GlobalVars {
   static String batman = "Bruce Wayne"

   // refer to this in a pipeline using:
   //
   // import com.sougata.GlobalVars
   // println GlobalVars.batman
}
