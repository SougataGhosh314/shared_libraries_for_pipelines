#!/usr/bin/env groovy

def call(Map config = [:]) {
  if(config.name && config.dayOfWeek && config.topic) {
	echo "Hello, ${config.name}. Today is ${config.dayOfWeek} and you're learning ${config.topic}."
  } else {
    echo "You didn't provide me all the variables!"
  }
}

