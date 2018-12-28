@Library("sharedlib@to-string")
import com.jenkins.CustomClass

println("without toString: " + new CustomClass())

println("with toString: " + new CustomClass().toString())