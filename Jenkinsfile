pipeline {
   agent any
  stages {
    stage("Build") {
       steps {
          
          echo "Hello, Pipeline!"
          
          bat """ 
javac CountSameCharinString.java
java CountSameCharinString 
 """ 
       }
   }
   
 } 
} 
