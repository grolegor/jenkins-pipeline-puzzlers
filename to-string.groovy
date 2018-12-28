@Library("sharedlib@to-string")
import com.jenkins.CustomClass

println("1")
println(new CustomClass())

println("2")
println("without toString: " + new CustomClass())

println("3")
println("with toString: " + new CustomClass().toString())